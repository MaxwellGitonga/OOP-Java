/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strathmore;

//This is a class where i create an object.
//An object is an instance of the class Student i defined.

/**
 *
 * @author giton
 */
public class Main {
    
    public static void main(String[] args){
        
        Student s001;
        Student s002;
        Student s003;
        
        //This is an object with the instance of a new Student.
        s001 = new Student();
        s002 = new Student();
        s003 = new Student();
        
        s001.student_name = "Maxwell";
        s001.student_course = "BBIT";
                
        s002.student_name = "Charles";
        s002.student_course = "ICS";      
        
        s003.student_name = "Ian";
        s003.student_course = "BCOM";
        
        System.out.println("Hello my name is "+s001.student_name+".I am studying "+s001.student_course);
        System.out.println("Hello my name is "+s002.student_name+".I am studying "+s002.student_course);
        System.out.println("Hello my name is "+s003.student_name+".I am studying "+s003.student_course);
    }
    
}
