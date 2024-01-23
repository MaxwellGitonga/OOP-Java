package INHERITANCE;

public class studentcouncil extends Student {
    public String role;
    public String officeLocation;
    

    public studentcouncil(int newstudent_id,String newstudentName,String newrole,String newofficeLocation){
        super(newstudent_id,newstudentName);
        
        role = newrole;
        officeLocation = newofficeLocation;
    }
    
    
    @Override
    public void introduce(){
        System.out.println("Hello, my name is "+ super.student_name +" I am studying  "+  super.student_course  +  role + " located in "+    officeLocation);
        System.out.println("I am the "+role);
    }
    
    public void communicate(String message){
        System.out.println(message);
    }
}
