package net.xeill.elpuig;

import java.io.*;
import java.util.*;
//Aqui realizaremos las funciones para añadir,actualiza o eliminar un produto.
public class FuncionesMenu{

  public void ImprimirBienvenida(){
    System.out.println("Hola Bienvenido!!");
  }
  public void ImprimirMenu(){
    System.out.println("1.- Producto");
    System.out.println("2.- Listar");
    System.out.println("3.- Establecer Estado");
    System.out.println("4.- Ventas");
    System.out.println("5.- Exit");

    }
  public void ImprimirMenuProducto(){
      System.out.println("1.- Registrar");
      System.out.println("2.- Modificar");
      System.out.println("3.- Eliminar");
      System.out.println("4.- volver");

  }
  public void ImprimirMenuListar(){
      System.out.println("1.- Listar Todos");
      System.out.println("2.- Listar Por Marca");
      System.out.println("3.- Listar Stock");
      System.out.println("4.- Listar Productos Vendidos");
      System.out.println("4.- volver");
  }
  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
