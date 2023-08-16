/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author nguye
 */
public interface SinhVienService {
    public Boolean them(SinhVien sinhVien);

    public Boolean xoa(String viTri);

    public Boolean update(String ma ,SinhVien sinhVien);

    public ArrayList<SinhVien> getList();

    
}
