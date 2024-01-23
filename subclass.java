
import carbazzar.cars;


    public class subclass extends cars {
    public int speedlimit;
    public String bazzarlocation;
   
   
    public subclass(int cprice, String cName, String cdescription,int s,String loc){
        super(cprice,cName,cdescription);
        speedlimit = s;
        bazzarlocation=loc;
       
       }
    public void servicedate(String day){
        System.out.println(day);
    }
    @Override
    public void introduce(){
        System.out.println(carprice+ "Hello this cars name is"+ carName+ "worth");
    }
    }

