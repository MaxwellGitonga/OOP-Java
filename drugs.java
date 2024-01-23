/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugstore;

/**
 *
 * @author giton
 */
public class drugs {
     
   public String drugstorename; 
   public String drugstorecapacity;
   public String drugstorelocation;
   public String pharmacist;
   public boolean otherbranches;
   public String restockcapacity;


public void introduce(){
    System.out.println("Welcome do Maxi's Chemist.What can I do for you?");
}
public void restock(int quantity){
    System.out.println("Restocking "+quantity+"items");
}
public void hirephamarcist(String newpharmacist){
    System.out.println("Hire new pharmacist"+newpharmacist);
}
public void setrestockcapacity(String newrestockcapacity){
    System.out.println("Setting restock capacity to "+newrestockcapacity);
}
public void updategooglemaps(String otherbrancheslocation){
    System.out.println("the location of other branches is "+otherbrancheslocation);
}
public void drugstorecapacity(String newcapacity){
    System.out.println("Setting drugstore capacity to "+newcapacity);
}
public void getnewdeals(String newdeals){
    System.out.println("We acquire new deals that are "+newdeals);
}
}

