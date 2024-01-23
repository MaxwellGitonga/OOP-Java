/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab.exaercise.pkg2;

/**
 *
 * @author giton
 */
public class MAINDRUGS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DRUGS2 s01=new DRUGS2();
        s01.setrestockcapacity("High");
        System.out.println(s01.getrestockcapacity());
        
        s01.setpharmacist("Maxwell");
        System.out.println(s01.getpharmacist());
        
        s01.setdrugstorecapacity("Medium");
        System.out.println(s01.getdrugstorecapacity());
        
        
        DRUGS2 s02=new DRUGS2();
        s02.setrestockcapacity("Medium");
        System.out.println(s02.getrestockcapacity());
        
        s02.setpharmacist("Ian");
        System.out.println(s02.getpharmacist());
        
        s02.setdrugstorecapacity("High");
        System.out.println(s02.getdrugstorecapacity());
        
        
        DRUGS2 s03=new DRUGS2();
        s03.setrestockcapacity("Low");
        System.out.println(s03.getrestockcapacity());
        
        s03.setpharmacist("Brenda");
        System.out.println(s03.getpharmacist());
        
        s03.setdrugstorecapacity("Low");
        System.out.println(s03.getdrugstorecapacity());
        
        
        DRUGS2 s04=new DRUGS2();
        s04.setrestockcapacity("Medium");
        System.out.println(s04.getrestockcapacity());
        
        s04.setpharmacist("Kabuga");
        System.out.println(s04.getpharmacist());
        
        s04.setdrugstorecapacity("High");
        System.out.println(s04.getdrugstorecapacity());
            
    }
    
}
