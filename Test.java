package Inheritance;

public class Test {
   public static void main(String[]args){ 
       Student s01 = new Student(111,"Juliet");
       
       Student ss01 = new studentcouncil(122,"Maria","Academic Rep","Stc");
       
       studentcouncil sc01 = new studentcouncil(123, "Joy","President","Oval Building");
       
       s01.introduce();
       ss01.introduce();
       sc01.introduce();
}
}