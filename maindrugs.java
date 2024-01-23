/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classe
s/Main.java to edit this template
 */
package drugstore;

/**
 *
 * @author giton
 */
public class maindrugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        drugs pharmacy=new drugs();
        
        
        pharmacy.introduce();
        
        pharmacy.drugstorename="Maxi's Chemist";
        pharmacy.drugstorecapacity="Medium";
        pharmacy.drugstorelocation="Siwaka";
        pharmacy.pharmacist="Ian Kambo" ;
        pharmacy.otherbranches=true;
        pharmacy.restockcapacity="High";
        
        
        System.out.println("Drugstore info");
        
        pharmacy.restock(100);
        pharmacy.hirepharmacist("Brenda Kekala");
        pharmacy.setrestockcapacity("high");
        pharmacy.updategooglemaps("various locations");
        pharmacy.drugstorecapacity("large");
        pharmacy.getnewdeals(discountonpainkillers);
    }
    
}

