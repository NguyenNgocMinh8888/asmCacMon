package com.example.demo.Controller;

import com.example.demo.Service.PhieuGiaoHangService;
import com.example.demo.dbo.PhieuGiaoHangRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("phieugiaohang")
public class PhieuGiaoHangController {
    @Autowired
    private PhieuGiaoHangService phieuGiaoHangService;

    @GetMapping()
    public ResponseEntity<?> getALL() {
        return ResponseEntity.ok(phieuGiaoHangService.getPGHAll());
    }

//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody PhieuGiaoHangRequest request) {
//        return ResponseEntity.ok(phieuGiaoHangService.add(request));
//    }

    @PutMapping("/update/{maPhieuGiaoHang}")
    public ResponseEntity<?> update(@RequestBody PhieuGiaoHangRequest request, @PathVariable UUID maPhieuGiaoHang) {
        return ResponseEntity.ok(phieuGiaoHangService.update(request, maPhieuGiaoHang));
    }

    @DeleteMapping("delete/{maPhieuGiaoHang}")
    public ResponseEntity<?> delete(@PathVariable UUID maPhieuGiaoHang) {
        return ResponseEntity.ok(phieuGiaoHangService.delete(maPhieuGiaoHang));

    }
}
