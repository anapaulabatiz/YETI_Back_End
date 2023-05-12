package mx.yetipersonalizado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.yetipersonalizado.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}// interface 



