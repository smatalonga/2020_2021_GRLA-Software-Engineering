/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenate;

import java.util.Scanner;


public class Concatenate {
    private static String firstWord;
    private static String secondWord;

    public void Concatenate(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getFirst() {
        return firstWord;
    }

    public String getSecond() {
        return secondWord;
    }
    
    
   
    public  String concatenate(String a, String b) {
        
        String firstWord = a;
        
        String secondWord =  b;
        return a+secondWord;
    }

    public static void main(String[] args) {
        
       System.out.println("Do Nothing");
    }

}


