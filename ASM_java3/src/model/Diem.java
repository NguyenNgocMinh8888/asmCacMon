/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Diem {
    private int id;
    private String MaSV;
    private float Tienganh;
    private float Tinhoc;
    private float GDTC;
    private SinhVien SV;

    public Diem() {
    }

    public Diem(int id, String MaSV, float Tienganh, float Tinhoc, float GDTC, SinhVien SV) {
        this.id = id;
        this.MaSV = MaSV;
        this.Tienganh = Tienganh;
        this.Tinhoc = Tinhoc;
        this.GDTC = GDTC;
        this.SV = SV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public float getTienganh() {
        return Tienganh;
    }

    public void setTienganh(float Tienganh) {
        this.Tienganh = Tienganh;
    }

    public float getTinhoc() {
        return Tinhoc;
    }

    public void setTinhoc(float Tinhoc) {
        this.Tinhoc = Tinhoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }

    public SinhVien getSV() {
        return SV;
    }

    public void setSV(SinhVien SV) {
        this.SV = SV;
    }
    public float diemTb() {
        return (Tienganh + Tinhoc + GDTC) / 3;
    }

    @Override
    public String toString() {
        return "Diem{" + "id=" + id + ", MaSV=" + MaSV + ", Tienganh=" + Tienganh + ", Tinhoc=" + Tinhoc + ", GDTC=" + GDTC + ", SV=" + SV + '}';
    }

    

   
    
}
