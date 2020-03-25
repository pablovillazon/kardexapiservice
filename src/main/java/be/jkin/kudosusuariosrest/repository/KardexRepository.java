package be.jkin.kudosusuariosrest.repository;


import be.jkin.kudosusuariosrest.model.Kardex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KardexRepository extends JpaRepository<Kardex, Long> {
}
