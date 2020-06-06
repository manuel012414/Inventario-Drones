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

}
