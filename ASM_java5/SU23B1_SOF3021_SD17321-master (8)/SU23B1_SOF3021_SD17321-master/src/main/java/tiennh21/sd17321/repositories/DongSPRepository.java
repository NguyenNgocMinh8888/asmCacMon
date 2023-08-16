package tiennh21.sd17321.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiennh21.sd17321.entities.DongSP;

import java.util.UUID;

@Repository
public interface DongSPRepository
        extends JpaRepository<DongSP, UUID> {
}
