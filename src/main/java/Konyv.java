/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Czuth Dominik
 */
public class Konyv {
    private String Szerzo;
    private String Cim;
    private int ID;
    private int Ar;
    private int KiadasEve;
    
    public Konyv (String Cim, String Szerzo) {
        this.Cim = Cim;
        this.Szerzo = Szerzo;
    }

    public String getSzerzo() {
        return Szerzo;
    }

    public void setSzerzo(String Szerzo) {
        this.Szerzo = Szerzo;
    }

    public String getCim() {
        return Cim;
    }

    public void setCim(String Cim) {
        this.Cim = Cim;
    }
    
    public Konyv (int Ar, int KiadasEve, int ID) {
        this.Ar = Ar;
        this.KiadasEve = KiadasEve;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAr() {
        return Ar;
    }
    
    public void setAr(int Ar) {
        this.Ar = Ar;
    }

    public int getKiadasEve() {
        return KiadasEve;
    }

    public void setKiadasEve(int KiadasEve) {
        this.KiadasEve = KiadasEve;
    }
    
    
    
    
         
    
}
