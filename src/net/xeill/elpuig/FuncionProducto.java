package net.xeill.elpuig;

import java.io.*;
import java.util.*;

public class FuncionProducto{
  Scanner scanner = new Scanner(System.in);
  ArrayList<Producto> ArrayProducto = new ArrayList<Producto>();

  public void CargarDatos(){
    try {

    BufferedReader entrada = new BufferedReader(new FileReader(new File("net/xeill/elpuig/Almacenamiento.data")));
    String linea;
    int i = 0;
    while((linea = entrada.readLine()) != null) {
          String[] valor = linea.split(":");

          // Creamos la Fruta
          Producto p = new Producto(Integer.parseInt(valor[0]),valor[1], valor[2], valor[3], Integer.parseInt(valor[4]), Float.parseFloat(valor[5]));
          ArrayProducto.add(p);
    }
    entrada.close();
  } catch(Exception e) {
    System.out.println(e.getMessage());
  }

  }
  public void RegistrarProducto(){

    System.out.println("--------------------Producto------------------");

    System.out.print("Introducir ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("\n");
    System.out.print("Introducir Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("\n");
    System.out.print("Introducir Descripción: ");
    String descripcion = scanner.nextLine();
    System.out.print("\n");
    System.out.print("Introducir Marca: ");
    String marca = scanner.nextLine();
    System.out.print("\n");
    System.out.print("Introducir Cantidad: ");
    int cantidad = scanner.nextInt();
    System.out.print("\n");
    System.out.print("Introducir Precio: ");
    float precio = scanner.nextFloat();
    System.out.print("\n");
    System.out.println("----------------------------------------------");
    System.out.println(" ");
    Producto p = new Producto(id,nombre,descripcion,marca,cantidad,precio);
    ArrayProducto.add(p);
    try {
      BufferedWriter registrar = new BufferedWriter(new FileWriter(new File("net/xeill/elpuig/Almacenamiento.data"),false));
      for( Producto f : ArrayProducto ){

        registrar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
      }
      registrar.close();

    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

  }
  public void ModificarProducto(){
    System.out.print("Introducir el ID del Producto a cambiar: ");
    int valorid = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Posibles datos a cambiar: nombre, descripcion, marca, cantidad, precio");
    System.out.print("Que dato vas a cambiar: ");
    String dato = scanner.nextLine();

        try {
          BufferedWriter modificar = new BufferedWriter(new FileWriter(new File("net/xeill/elpuig/Almacenamiento.data"),false));
          for( Producto f : ArrayProducto ){
            if(f.id == valorid){
              if(dato.equals("nombre")){
                System.out.print("Introducir el nuevo nombre: ");
                f.nombre = scanner.nextLine();
                modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }else if(dato.equals("descripcion")){
                System.out.print("Introducir la nueva descripcion: ");
                f.descripcion = scanner.nextLine();
                modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }else if(dato.equals("marca")){
                System.out.print("Introducir la nueva marca: ");
                f.marca = scanner.nextLine();
                modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }else if(dato.equals("cantidad")){
                System.out.print("Introducir la nueva cantidad: ");
                f.cantidad = scanner.nextInt();
                scanner.nextLine();
                modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }else if(dato.equals("precio")){
                System.out.print("Introducir el nuevo precio: ");
                f.precio = scanner.nextFloat();
                modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }

              //System.out.println(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
              }else{
              modificar.write(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");

              }
            }
            modificar.close();

          } catch(Exception e) {
            System.out.println(e.getMessage());
          }


  }
  public void EliminarProducto(){
    for(Producto f : ArrayProducto){
    System.out.println(f.id+":"+f.nombre+":"+f.descripcion+":"+f.marca+":"+f.cantidad+":"+f.precio+"\n");
    }
  }

}
