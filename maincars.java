/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalproblem1;

/**
 *
 * @author giton
 */
public class maincars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        cars s01=new cars();
        s01.setshippincompanyname("Maxy's");
        System.out.println(s01.getshippingcompanyname());
        
        s01.setshippingdealsname("Subaru");
        System.out.println(s01.getshippingdealsname());
        
        s01.setshippngdates("21st each month");
        System.out.println(s01.getshippingdates());
        
        cars s02=new cars();
        s02.setshippincompanyname("Kabuga's");
        System.out.println(s02.getshippingcompanyname());
        
        s02.setshippingdealsname("Volvo");
        System.out.println(s02.getshippingdealsname());
        
        s02.setshippngdates("22nd each month");
        System.out.println(s02.getshippingdates());
        
        cars s03=new cars();
        s03.setshippincompanyname("Kambo's");
        System.out.println(s03.getshippingcompanyname());
        
        s03.setshippingdealsname("Toyota");
        System.out.println(s03.getshippingdealsname());
        
        s03.setshippngdates("23rd each month");
        System.out.println(s03.getshippingdates());
        
        cars s04=new cars();
        s04.setshippincompanyname("Brenda's");
        System.out.println(s04.getshippingcompanyname());
        
        s04.setshippingdealsname("Jeep");
        System.out.println(s04.getshippingdealsname());
        
        s04.setshippngdates("24th each month");
        System.out.println(s04.getshippingdates());
    }
    
}
