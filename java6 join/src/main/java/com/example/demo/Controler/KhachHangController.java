package com.example.demo.Controler;

import com.example.demo.Enitity.KhachHang;
import com.example.demo.Services.HangKhachHangService;
import com.example.demo.Services.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/KhachHang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;
    private HangKhachHangService hangKhachHangService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(khachHangService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody KhachHang kh){
        return ResponseEntity.ok(khachHangService.add(kh));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody KhachHang kh){
        return ResponseEntity.ok(khachHangService.update(kh,ma));
    }

    @DeleteMapping("/delete/{ma}")
    public ResponseEntity<?> delete(@PathVariable Long ma){
        return ResponseEntity.ok(khachHangService.delete(ma));
    }
}
