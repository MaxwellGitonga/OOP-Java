/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strathmore;
//This is a class where I define a student

/**
 *
 * @author giton
 */
public class Student {
    //variables or attributes
    
    // Class variable
    public String student_course;
    
    //instance variable
    public String student_name;
    
// Constructor
    //Default constructor
   public Student(){
       student_course="BBIT";
   }    
   //parameterized constructor
    
//Methods
 
    //general methods
    public void introduce(){
        System.out.println("Hello my name is "+student_name+".I am studying "+student_course);
        
    }
    
    
    
}
