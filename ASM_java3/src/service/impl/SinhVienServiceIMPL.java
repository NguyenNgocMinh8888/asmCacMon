/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.SinhVien;
import repo.SinhVienRepository;
import service.SinhVienService;

/**
 *
 * @author nguye
 */
public class SinhVienServiceIMPL implements SinhVienService{
    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public Boolean them(SinhVien sinhVien) {
        return sinhVienRepository.them(sinhVien);
    }

    @Override
    public Boolean xoa(String viTri) {
        return sinhVienRepository.delete(viTri);
    }

    @Override
    public Boolean update(String ma, SinhVien sinhVien) {
        return sinhVienRepository.update(ma, sinhVien);
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return sinhVienRepository.getSinhVienFromDB();
    }

    

    
}
