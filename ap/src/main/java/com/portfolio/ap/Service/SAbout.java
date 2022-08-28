
package com.portfolio.ap.Service;

import com.portfolio.ap.Entity.About;
import com.portfolio.ap.Repository.RAbout;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAbout {
    @Autowired
    RAbout rAbout;
    
    
    public List<About> list(){
        return rAbout.findAll();
    }
    
    
    public Optional<About> getOne (int id){
        return rAbout.findById(id);
    
    }
    
    public Optional<About> getByNombreA(String nombreA) {
        return rAbout.findByNombreA(nombreA);
    
    }
    
    public void save(About about){
        rAbout.save(about);
    
    }
    
    public void delete(int id){
        rAbout.deleteById(id);    
    }
    
    public boolean existsById(int id){
        return rAbout.existsById(id);
    }
    
     public boolean existsByNombreA(String nombreA) {
        return rAbout.existsByNombreA(nombreA);
    }
    
}
