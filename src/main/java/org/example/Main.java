package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//declarando variables

        String cedula;
        String nombreUsuario;
        String apellidoUsuario;
        byte edad;
        String ciudad;
       int costoBoleta=450000;
       int totalBoletas;



        //iniciando sccaner
        Scanner teclado = new Scanner(System.in);

        //iniciando variables
        System.out.println("*****Bienvenidos a Tuboleta****");
        System.out.println("*****Para seguir con el proceso digite ");
        System.out.print("Digita su nombre: ");
        nombreUsuario = teclado.nextLine();
        System.out.print("Digita tu apellido: ");
        apellidoUsuario = teclado.nextLine() ;
        System.out.print("Digite su edad: ");
        edad = teclado.nextByte();
        teclado.nextLine();
        System.out.print("introdusca su cedula: ");
        cedula = teclado.nextLine();
        System.out.print("Digite su ciudad: ");
        ciudad = teclado.nextLine();
        System.out.println("el costo de cada boleta es de: "+ costoBoleta);
        System.out.print(" cuantas boletas desea comprar");
        totalBoletas= teclado.nextInt();

        //proceso
        int Valortotal= totalBoletas*costoBoleta;

        if ( totalBoletas <= 4 && edad >=18) {
            System.out.println("señor "+nombreUsuario +"-"+ apellidoUsuario + " su compra ha sido realizada " + " en " + ciudad + " el valor de su compra es " + Valortotal) ;

        }else{
            System.out.println(" la compra no es posible " );
        }






        }}


