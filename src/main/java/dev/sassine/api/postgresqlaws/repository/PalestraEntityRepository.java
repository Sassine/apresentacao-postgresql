package dev.sassine.api.postgresqlaws.repository;

import dev.sassine.api.postgresqlaws.domain.PalestraEntity;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalestraEntityRepository extends JpaRepository<PalestraEntity, Integer> { 

}