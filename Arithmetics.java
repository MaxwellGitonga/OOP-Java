/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giton
 */
public class Arithmetics {
    public int first_number = 0;
    public int second_number = 0;
    
    public int sum(){
        int sum = 0;
        sum = first_number + second_number;
        return sum;
    }
    public int difference(){
        int difference = 0;
        difference = second_number - first_number;
        return difference;
    }
    public int product(){
        int product = 0;
        product = first_number * second_number;
        return product;
    }
    public float quotient(){
        float quotient = 0;
        quotient = second_number/first_number;
        return quotient;
    }

}
