/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.GioHangMD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class GioHang {
    List<GioHangMD> listGH  = new ArrayList<>();
    
    public GioHang(){
        
        
    }
    public List<GioHangMD> getList2() {
        return listGH;
    }
    public void addGH(GioHangMD index) {
        listGH.add(index);
    }
    
    
}
