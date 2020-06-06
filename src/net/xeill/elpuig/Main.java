package net.xeill.elpuig;

import java.io.*;
import java.util.*;

//Este es el menu que vamos a usar.
//@autor: Juan Manuel Canaza

public class Main{
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      FuncionesMenu Main = new FuncionesMenu();
      ListarProductos Lista = new ListarProductos();

      FuncionProducto producto = new FuncionProducto();
      producto.CargarDatos();
      int Menu, MenuProducto, MenuListar; //Variable que almacenara un valor de tipo entero.
      String valor2;
      while(true){ //bucle para el menu.
        Main.ImprimirBienvenida(); //Titulo de bienveida
        Main.ImprimirMenu(); //Lista del menu principal
        Menu = scanner.nextInt(); //Variable donde almacenara el dato introducido.

        switch(Menu) { //Los botones de las acciones.
          case 1: //Opcion produto
              Main.ImprimirMenuProducto(); //Imprime el submenu de producto
              MenuProducto = scanner.nextInt(); //Pedira un valor y dependiendo del valor  introducido hara una accion
                    switch(MenuProducto) {
                      case 1: //Primera funcio
                        System.out.println("Registrar producto nuevo");
                        producto.RegistrarProducto();
                      break;

                      case 2: //Segunda funcion
                        System.out.println("Actualizar un producto");
                        producto.ModificarProducto();
                      break;

                      case 3: //Tercera funcion
                        System.out.println("Eliminar un producto");
                        producto.EliminarProducto();
                      break;

                      case 4: //Cuarta funcion
                        System.out.println("Volver al menu principal");
                      break;
                      default: System.out.println("No hay ninguna función para este número");
                    } //Cierre del segundo switch
                    Main.clearScreen();//Limpiar consola
              break;

          case 2: //Segunda funcion
                //Main.clearScreen();//Limpiar consola
                Main.ImprimirMenuListar();
                MenuListar = scanner.nextInt();
                switch (MenuListar) { // Menu para listar
                  case 1:
                    System.out.println("Lista de Todos los Productos");
                    Lista.ListarTodos();
                    break;

                  case 2:
                    Lista.ListarMarca();
                    break;

                  case 3:
                    System.out.println("Mostrar Stock");
                    break;

                  case 4:
                    System.out.println("Mostrar vendidos");
                    break;

                  default: System.out.println("No hay ninguna función para este número");
                }
                //Main.clearScreen();//Limpiar consola
              break;

          case 3: //Tercera funcion
              System.out.println("Establecer estado del producto");
              break;

          case 4: //Cuarta funcion
              System.out.println("Ventas");
              break;
          case 5:
              System.out.println("Saliendo del menu");
              break;
          default: System.out.println("Este numero no tiene ninguna funcion asignada");
        } // Cierre del primer switch
        //Main.clearScreen();//Limpiar consola

        if(Menu == 5){ //Cuando el valor de la variable opcion es igual a 4 sale del programa(bucle while true)
          break;
        }
      } //Llave donde acaba el bucle

    }
}
