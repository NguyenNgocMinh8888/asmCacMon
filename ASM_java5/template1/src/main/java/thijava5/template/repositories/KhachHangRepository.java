package thijava5.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thijava5.template.entity.KhachHang;

import java.util.UUID;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
}
