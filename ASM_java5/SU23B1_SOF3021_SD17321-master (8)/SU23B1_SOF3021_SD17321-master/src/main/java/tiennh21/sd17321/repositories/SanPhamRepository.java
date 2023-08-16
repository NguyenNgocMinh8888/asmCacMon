package tiennh21.sd17321.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiennh21.sd17321.entities.SanPham;

import java.util.UUID;

@Repository
public interface SanPhamRepository
        extends JpaRepository<SanPham, UUID> {
}
