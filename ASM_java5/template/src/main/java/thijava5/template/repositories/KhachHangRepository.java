package thijava5.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import thijava5.template.entity.KhachHang;

@Controller
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
}
