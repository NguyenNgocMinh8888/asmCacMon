package com.example.demo.Controler;

//import com.example.demo.DTO.KhachHangDto;
import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Enitity.KhachHang;
import com.example.demo.Services.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/KhachHang")
public class KhachHangController {
    public String Load(){
        return "khong duoc de trong";
    }
    @Autowired
    private KhachHangService khachHangService;

//    @Autowired
    private KhachHangDto khachHangDto;

    @GetMapping
    public ResponseEntity<?> getAll(){

        return ResponseEntity.ok(khachHangService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody KhachHang khachHang){
        if (khachHang.getTenKhachHang().equals("")){
            return ResponseEntity.ok(Load());
        }if (khachHang.getSoDienThoai().equals("")){
            return ResponseEntity.ok(Load());
        }if (khachHang.getGioiTinh().equals("")){
            return ResponseEntity.ok(Load());
        }if (khachHang.getHangKhachHang().equals("")){
            return ResponseEntity.ok(Load());
        }else
        return ResponseEntity.ok(khachHangService.add(khachHang));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody KhachHang kh){
        if (kh.getTenKhachHang().equals("")){
            return ResponseEntity.ok(Load());
        }if (kh.getSoDienThoai().equals("")){
            return ResponseEntity.ok(Load());
        }if (kh.getGioiTinh().equals("")){
            return ResponseEntity.ok(Load());
        }if (kh.getHangKhachHang().equals("")){
            return ResponseEntity.ok(Load());
        }else
        return ResponseEntity.ok(khachHangService.update(kh,ma));
    }

    @DeleteMapping("/delete/{ma}")
    public ResponseEntity<?> delete(@PathVariable Long ma){
        return ResponseEntity.ok(khachHangService.delete(ma));
    }
}
