/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalproblem1;

/**
 *
 * @author giton
 */
public class cars {
    
    public String bazzarnamee;
    public String location;
    public String agentname;
    
    private String shippingcompanyname;
    private String shippingdates;
    private String shippingdealsname;
    
    public String getshippingcompanyname(){
        return this.shippingcompanyname;
    }
    public String getshippingdates(){
        return this.shippingdates;
    }
    public String getshippingdealsname(){
        return this.shippingdealsname;
    }
    
    public void setshippincompanyname(String newshippincompanyname){
        shippingcompanyname=newshippincompanyname;
    }
    public void setshippngdates(String newshippingdates){
        shippingdates=newshippingdates;
    }
    public void setshippingdealsname(String newshippingdealsname){
        shippingdealsname=newshippingdealsname;
    }
    
}
