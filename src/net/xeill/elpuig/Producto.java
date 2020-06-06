package net.xeill.elpuig;

import java.io.*;
import java.util.*;

public class Producto{
  Scanner scanner = new Scanner(System.in);
  int id;
  String nombre;
  String descripcion;
  String marca;
  int cantidad;
  float precio;

  Producto(int id, String nombre, String descripcion, String marca, int cantidad, float precio){
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.marca = marca;
    this.cantidad = cantidad;
    this.precio = precio;
  }
  public void RegistrarProducto(Producto producto){
    // try{
    //   BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("Almacenamiento.data"), true));
    //
    //   outputStream.write(this.id+":"+this.nombre+":"+this.descripcion+":"+marca+":"+cantidad+":"+precio);
    //
    //   outputStream.close();
    // }
    //   catch(Exception e){
    //     System.out.println(e.getMessage());
    //   }
  }
  public void ModificarProducto(){

  }
  public void EliminarProducto(){

  }

}
