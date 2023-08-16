/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.Diem;
import repo.DiemRepository;
import service.DiemService;
import view.QuanLyDiemUI;

/**
 *
 * @author nguye
 */
public class DiemServiceIMPL implements DiemService{
    private DiemRepository diemRepository = new DiemRepository();

    @Override
    public Boolean them(Diem diem) {
        return diemRepository.them(diem);
    }

    @Override
    public Boolean xoa(String index) {
        return diemRepository.xoa(index);
    }

    @Override
    public ArrayList<Diem> timKiem(String index) {
        return diemRepository.timKiem(index);
    }

    @Override
    public Boolean update(String index, Diem diem) {
        return diemRepository.update(index, diem);
    }

    @Override
    public ArrayList<Diem> getList() {
        return diemRepository.getDiemFromDB();
    }

    
}
