
package com.portfolio.ap.Repository;

import com.portfolio.ap.Entity.About;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAbout extends JpaRepository<About, Integer>{
  public Optional <About> findByNombreA(String nombreA);
    public boolean existsByNombreA(String nombreA);
}
