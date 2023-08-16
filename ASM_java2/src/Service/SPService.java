/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class SPService {
    List<SP> list  = new ArrayList<>();
    
    public SPService(){
        SP sp1 = new SP("IP14", "IPHONE14", "Apple", "Deep purple", 32, 0, true,0);
        SP sp2 = new SP("SSZFL4", "Z Flip 4", "SamSung", "Black", 21, 0, true,0);
        SP sp3 = new SP("IP11", "Iphone 11", "Apple", "White", 8, 1, true,0);
        SP sp4 = new SP("VvV20", "Vivo V20", "Vivo", "Pink", 7, 1, true,0);
        SP sp5 = new SP("VSARPR", "Vsmart Aris Pro", "Vsmart", "Black", 3, 0, true,0);
        
        list.add(sp1);
        list.add(sp2);
        list.add(sp3);
        list.add(sp4);
        list.add(sp5);
    }
    public List<SP> getList() {
        return list;
    }
    public void addSP(SP item) {
        list.add(item);
    }
    public void updateSP(SP item, int index) {
        list.set(index, item);
    }
    
    public void deleteSP(int index) {
        list.remove(index);
    }
    public void setList(ArrayList<SP> list) {
       this.list= list;
    }
    public SP getById(int vitri) {
        return this.getById(vitri);
    }
    }

