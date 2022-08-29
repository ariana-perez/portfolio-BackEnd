
package com.portfolio.ap.Controller;

import com.portfolio.ap.Dto.dtoAbout;
import com.portfolio.ap.Entity.About;
import com.portfolio.ap.Security.Controller.Mensaje;
import com.portfolio.ap.Service.SAbout;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "https://frontendaap.web.app")
public class CAbout {
     @Autowired
    SAbout servAbout;
     
   @GetMapping("/lista")
    public ResponseEntity<List<About>> list(){
        List<About> list = servAbout.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<About> getById(@PathVariable("id") int id){
        if(!servAbout.existsById(id))
            return new ResponseEntity(new Mensaje ("No Existe"), HttpStatus.NOT_FOUND);
        About about = servAbout.getOne(id).get();
        return new ResponseEntity(about, HttpStatus.OK);
    }
   
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!servAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        servAbout.delete(id);
        return new ResponseEntity(new Mensaje ("About Eliminado"), HttpStatus.OK);
    }
    
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAbout dtoab){
        if (StringUtils.isBlank(dtoab.getNombreA())) {
            return new ResponseEntity(new Mensaje ("Campo obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (servAbout.existsByNombreA(dtoab.getNombreA())){
            return new ResponseEntity(new Mensaje("Ya existente"), HttpStatus.BAD_REQUEST);
        }
        
        About about = new About(dtoab.getNombreA(), dtoab.getDescripcionA());
         servAbout.save(about);
         
        return new ResponseEntity(new Mensaje("About Creada"), HttpStatus.OK);
     }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAbout dtoab){
        if (!servAbout.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.NOT_FOUND);
        }
        if(servAbout.existsByNombreA(dtoab.getNombreA()) && servAbout.getByNombreA(dtoab.getNombreA()).get().getId() != id){
            return new ResponseEntity(new Mensaje("About existente"), HttpStatus.BAD_REQUEST); 
        }
        
        if(StringUtils.isBlank(dtoab.getNombreA())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"),HttpStatus.BAD_REQUEST);
        }
        About about = servAbout.getOne(id).get();
        about.setNombreA(dtoab.getNombreA());
        about.setDescripcionA((dtoab.getDescripcionA()));
        
        servAbout.save(about);
        return new ResponseEntity(new Mensaje ("Se actualizo correctamente"), HttpStatus.OK);
    }  
    
    
}
