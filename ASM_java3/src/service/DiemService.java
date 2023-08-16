/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Diem;
import view.QuanLyDiemUI;


/**
 *
 * @author nguye
 */
public interface DiemService {
    public Boolean them(Diem diem);

    public Boolean xoa(String index);

    public ArrayList<Diem> timKiem(String tenSinhVien);

    public Boolean update(String index ,Diem diem);

    public ArrayList<Diem> getList();
    
    
}
