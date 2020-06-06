package net.xeill.elpuig;

import java.io.*;
import java.util.*;

public class ListarProductos{
    Scanner scanner = new Scanner(System.in);


    public void ListarTodos(){

      try{
        //FileReader entrada = new FileReader(new File("Almacenamiento.data"));
        BufferedReader entrada = new BufferedReader(new FileReader(new File("net/xeill/elpuig/Almacenamiento.data")));
        String linea;

        while((linea = entrada.readLine()) != null){

          String[] partes = linea.split(":");
          System.out.println("--------------------Producto------------------");
          System.out.println("ID: "+partes[0]);
          System.out.println("Nombre: "+partes[1]);
          System.out.println("Descripción: "+partes[2]);
          System.out.println("Marca: "+partes[3]);
          System.out.println("Cantidad: "+partes[4]);
          System.out.println("Precio: "+partes[5]+"€");
          System.out.println("----------------------------------------------");
          System.out.println(" ");
        }

        entrada.close();
      }catch(IOException e){
        System.out.println("No se ha encontrado el archivo");
      }
    }
    public void ListarMarca(){
      File ruta = new File("net/xeill/elpuig/Almacenamiento.data");
      try{
        FileReader entrada = new FileReader(ruta);
        BufferedReader mibuffer = new BufferedReader(entrada);
        String linea="";

        System.out.print("Introducir la marca: ");
        String marca = scanner.nextLine();
        while(linea != null){
          linea=mibuffer.readLine(); //Almacena la linea que contiene la variable mibuffer
          //System.out.println(linea);
           if(linea != null){
             String[] partes = linea.split(":");
             if(marca.equals(partes[3])){
               System.out.println("--------------------Producto------------------");
               System.out.println("ID: "+partes[0]);
               System.out.println("Nombre: "+partes[1]);
               System.out.println("Descripción: "+partes[2]);
               System.out.println("Marca: "+partes[3]);
               System.out.println("Cantidad: "+partes[4]);
               System.out.println("Precio: "+partes[5]+"€");
               System.out.println("----------------------------------------------");
               System.out.println(" ");
             }

           }

        }
        mibuffer.close();
      }catch(IOException e){
        System.out.println("No se ha encontrado el archivo");
      }
    }



}
