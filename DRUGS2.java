
package oop.lab.exaercise.pkg2;

public class DRUGS2 {
    public String drugstorename;
    public String drugstorelocation;
    
    private String drugstorecapacity;
    private String pharmacist;
    private String restockcapacity;
    
    public String getdrugstorecapacity(){
        return this.drugstorecapacity;
    }
    public String getrestockcapacity(){
        return this.restockcapacity;
    }
    public String getpharmacist(){
        return this.pharmacist;
    }
    
    public void setrestockcapacity(String newrestockcapacity){
        restockcapacity=newrestockcapacity;
    }
    public void setdrugstorecapacity(String newdrugstorecapacity){
        drugstorecapacity=newdrugstorecapacity;
    }
    public void setpharmacist(String newpharmacist){
        pharmacist=newpharmacist;
    }
}

