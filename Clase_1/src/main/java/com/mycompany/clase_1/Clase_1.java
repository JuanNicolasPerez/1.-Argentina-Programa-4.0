
package com.mycompany.clase_1;

import java.util.Scanner;

public class Clase_1 {

    public static void main(String[] args) {
        
        int numInicio = 14;
        int numFin = 5;
        int numPar = 0;
        int numImpar = 0;
        
        System.out.println("Punto 1. (A)");
        System.out.println("Esta comentado.");
//        while (numInicio <= numFin){
//    
//            System.out.println(numInicio + ", ");
//    
//            numInicio = numInicio + 1;
//        }

        System.out.println("Punto 1. (B)");
        System.out.println("Esta comentado.");       
//        while (numInicio <= numFin){
//    
//            if(numInicio % 2 == 0){
//                numPar = numInicio;
//                System.out.println(numPar + ", ");        
//                numInicio = numInicio + 1;
//            }else{
//                numInicio = numInicio + 1;
//            }
//        }

        System.out.println("Punto 1. (C)");
        System.out.println("Esta comentado.");       
        
//        Scanner Pedir = new Scanner(System.in);
//
//        System.out.println("¿Deseas ver numeros pares(P) o impares(I)?");
//        String Valor = Pedir.nextLine();
//        
//        if("p".equals(Valor)||"P".equals(Valor)){ 
//            System.out.println("Ingresaste Pares");
//            while (numInicio <= numFin){
//                if(numInicio % 2 == 0){
//                    numPar = numInicio;
//                    System.out.println(numPar + ", ");
//                    numInicio = numInicio + 1;
//                }else{
//                    numInicio = numInicio + 1;
//                }
//            }    
//        } 
//        
//        if("i".equals(Valor)||"I".equals(Valor)){
//            System.out.println("Ingresaste Impares");
//            while (numInicio <= numFin){
//                if(numInicio % 2 == 0){
//                    numInicio = numInicio + 1;
//                }else{
//                    numImpar = numInicio;
//                    System.out.println(numImpar + ", ");
//                    numInicio = numInicio + 1;
//                }
//            }    
//        }

        System.out.println("Punto 1. (D)");
        System.out.println("Esta comentado.");       
        
//        for(numInicio = 14; numInicio >= numFin; numInicio--){
//            if(numInicio % 2 == 0){
//                numPar = numInicio;
//                System.out.println(numPar + ", ");
//                numInicio = numInicio - 1;
//
//            }else{
//                numInicio = numInicio - 1;
//            }
//        }

        System.out.println("Punto 2. (A,B,C,D)");
        System.out.println("Esta comentado.");       
        
        float ingresos;
        int superficie;
        int energia;
        
        Scanner PedirIngresos = new Scanner(System.in);
        System.out.println("Declare los Ingresos");
        ingresos  = Float.parseFloat(PedirIngresos.nextLine());
        
        Scanner PedirSuperficie = new Scanner(System.in);
        System.out.println("Declare la superfie?");
        superficie  = PedirSuperficie.nextInt();

        Scanner PedirEnergia = new Scanner(System.in);
        System.out.println("Declares la energia");
        energia  = PedirSuperficie.nextInt();

        if((ingresos <= 748382.07)&& (superficie <= 30)&&(energia <= 3330)){
            System.out.println("Categoria A");
        
        }else if ((ingresos <= 1112459.83)&& (superficie <= 45)&&(energia <= 5000)){
            System.out.println("Categoria B");
        }

    }        
}
