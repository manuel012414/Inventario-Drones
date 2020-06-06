package net.xeill.elpuig;

import java.io.*;
import java.util.*;

public class ListarProductos{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Producto> almacenamiento = new ArrayList<Producto>();

    public void ListarTodos(){
      try{
        FileReader entrada = new FileReader("net/xeill/elpuig/Almacenamiento.data");
        BufferedReader mibuffer = new BufferedReader(entrada);
        String linea="";

        while(linea != null){
          linea=mibuffer.readLine(); //Almacena la linea que contiene la variable mibuffer
          //System.out.println(linea);
           if(linea != null){
             String[] partes = linea.split(":");

             System.out.println("--------------------Producto------------------");
             System.out.println("ID: "+partes[0]);
             System.out.println("Nombre: "+partes[1]);
             System.out.println("Descripción: "+partes[2]);
             System.out.println("Marca: "+partes[3]);
             System.out.println("Cantidad: "+partes[4]);
             System.out.println("Precio: "+partes[5]);
             System.out.println("----------------------------------------------");
             System.out.println(" ");
           }

        }
      }catch(IOException e){
        System.out.println("No se ha encontrado el archivo");
      }
    }
    public void ListarMarca(){
      try{
        FileReader entrada = new FileReader("net/xeill/elpuig/Almacenamiento.data");
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
               System.out.println("Precio: "+partes[5]);
               System.out.println("----------------------------------------------");
               System.out.println(" ");
             }

           }

        }
      }catch(IOException e){
        System.out.println("No se ha encontrado el archivo");
      }
    }



}
