/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task3jelizavetasokolova;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task3JelizavetaSokolova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Ваше имя : ");
        String name1 = input.nextLine();
       
        System.out.println("Ваше Фамилия : ");
        String name2 = input.nextLine();
       
        System.out.println("Ваш год рождения : ");
        String year = input.nextLine();
       
       
        System.out.println("Ваш месяц рождения(словом) : ");
        String month = input.nextLine();
       
        System.out.println("Ваш день рождения : ");
        String day = input.nextLine();
       
        System.out.printf(name1 +" "+ name2 + " родился "+ day +" "+ month +" "+ year +" "+"года");
    }
    
}
        
