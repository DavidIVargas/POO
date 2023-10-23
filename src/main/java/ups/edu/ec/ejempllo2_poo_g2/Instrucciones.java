/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejempllo2_poo_g2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Instrucciones {
     Scanner t = new Scanner(System.in);
    public void instruccionIf(){
        int nota;
        System.out.println("Ingrese un valor entero: ");
        nota =t.nextInt();
        if (nota >= 8 && nota <= 10){
            System.out.println("SB");
        }else{
            if(nota >0 && nota < 5){
                System.out.println("MB");
            }else{
                System.out.println("Error....");
            }
        }
    }
    public void instruccionSwitch(){
        byte dia;
        System.out.print("Ingrese un valor entero: ");
        dia = t.nextByte();
        switch(dia){
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Lunes");
                break;
            case 3:
                System.out.print("Martes");
                break;
            case 4:
                System.out.print("Miercoles");
                break;
            case 5:
                System.out.print("Jueves");
                break;
            case 6:
                System.out.print("Viernes");
                break;
            case 7:
                System.out.print("Sabado");
                break;
            default:
                System.out.print("Error.... no existe");
        }
    }
    public void instruccionWhile(){
        byte i;
        /*
        i=0;
        while(i <= 2){
            i +=1;
            System.out.print(i);
        }
        */
        i = 0;
        do{
            i += 1;
            System.out.println(i);
        }while(1 <= 2);
    }
}
