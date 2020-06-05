package net.xeill.elpuig;

import java.io.*;
import java.util.*;

//Este es el menu que vamos a usar.
//@autor: Juan Manuel Canaza

public class Main{
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);

      int opciones, opcion; //Variable que almacenara un valor de tipo entero.

      while(true){ //bucle para el menu.

        //Titulo de bienveida
        System.out.println("Bienvenido!!");
        System.out.println("Aqui ira una función que imprima el menu con las opciones que tengamos ");

        opcion = scanner.nextInt(); // Donde almacenamos el caracter introducido y dependerá del caracta la funcion a realizar

        switch(opcion) { //Los botones de las acciones.
          case 1: //Primera función
              //Aqui entramos en un submenu que esta dentro del menu principal
              System.out.println(" Aqui ira otro menu en relacion a los productos ya sea para registrar,actualizar o eliminar"); // Poner una funcion que imprima un menu
              opciones = scanner.nextInt(); //Pedira un valor y dependiendo del valor  introducido hara una accion
                    switch(opciones) {
                      case 1: //Primera funcio
                        System.out.println("Registrar producto nuevo");
                      break;

                      case 2: //Segunda funcion
                        System.out.println("Actualizar un producto");
                      break;

                      case 3: //Tercera funcion
                        System.out.println("Eliminar un producto");
                      break;

                      case 4: //Cuarta funcion
                        System.out.println("Salir o Volver al principio");

                      break;
                    }
              break;

          case 2: //Segunda funcion
              System.out.println(" opcion de listar");
            //char opcion = scanner.next().charAt(0);
            break;

          case 3: //Tercera funcion
              System.out.println("Poner los productos como vendido");
              //char opcion = scanner.next().charAt(0);
              break;

          case 4: //Cuarta funcion
              System.out.println("Opcion de salir");
              int salir = 6;
              //char opcion = scanner.next().charAt(0);
              break;
          default: System.out.println("Este numero no tiene ninguna funcion asignada");
        }
        if(opcion == 4){ //Cuando el valor de la variable opcion es igual a 4 sale del programa(bucle while true)
          break;
        }
      } //Llave donde acaba el bucle




    }
}
