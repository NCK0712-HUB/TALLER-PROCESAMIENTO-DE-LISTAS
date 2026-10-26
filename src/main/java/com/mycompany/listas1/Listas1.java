/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listas1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicolas "NCK"
 */
public class Listas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Productos> productos = new ArrayList<>();

        productos.add(new Productos(101, "Portatil", "Tecnologia", 3200, 8));
        productos.add(new Productos(102, "Mouse", "Tecnologia", 80, 25));
        productos.add(new Productos(103, "Teclado", "Tecnologia", 120, 12));
        productos.add(new Productos(104, "Cuaderno", "Papeleria", 15, 50));
        productos.add(new Productos(105, "Marcadores", "Papeleria", 28, 30));
        productos.add(new Productos(106, "Impresora", "Tecnologia", 950, 4));
        productos.add(new Productos(107, "Escritorio", "Muebles", 680, 6));
        productos.add(new Productos(108, "Silla", "Muebles", 450, 10));
        productos.add(new Productos(109, "Monitor", "Tecnologia", 780, 9));
        productos.add(new Productos(110, "Disco SSD 1TB", "Tecnologia", 350, 15));
        productos.add(new Productos(111, "Memoria USB 64GB", "Tecnologia", 45, 40));
        productos.add(new Productos(112, "Router WiFi", "Tecnologia", 220, 11));
        productos.add(new Productos(113, "Cable HDMI", "Tecnologia", 35, 60));
        productos.add(new Productos(114, "Webcam", "Tecnologia", 160, 13));
        productos.add(new Productos(115, "Audifonos", "Tecnologia", 140, 20));
        productos.add(new Productos(116, "Microfono", "Tecnologia", 190, 7));
        productos.add(new Productos(117, "Calculadora Cientifica", "Papeleria", 65, 18));
        productos.add(new Productos(118, "Resaltadores", "Papeleria", 18, 35));
        productos.add(new Productos(119, "Carpeta", "Papeleria", 12, 80));
        productos.add(new Productos(120, "Lapiz", "Papeleria", 3, 200));
        productos.add(new Productos(121, "Boligrafo", "Papeleria", 5, 150));
        productos.add(new Productos(122, "Borrador", "Papeleria", 2, 120));
        productos.add(new Productos(123, "Regla", "Papeleria", 8, 45));
        productos.add(new Productos(124, "Archivador", "Papeleria", 25, 20));
        productos.add(new Productos(125, "Mesa de Reuniones", "Muebles", 1500, 3));
        productos.add(new Productos(126, "Biblioteca", "Muebles", 1200, 5));
        productos.add(new Productos(127, "Archivador Metalico", "Muebles", 890, 4));
        productos.add(new Productos(128, "Sofa de Oficina", "Muebles", 2100, 2));
        productos.add(new Productos(129, "Lampara de Escritorio", "Muebles", 95, 14));
        productos.add(new Productos(130, "Ventilador", "Electrodomesticos", 180, 8));
        productos.add(new Productos(131, "Cafetera", "Electrodomesticos", 320, 6));
        productos.add(new Productos(132, "Horno Microondas", "Electrodomesticos", 550, 4));
        productos.add(new Productos(133, "Nevera Ejecutiva", "Electrodomesticos", 980, 2));
        productos.add(new Productos(134, "Tablet", "Tecnologia", 1300, 7));
        productos.add(new Productos(135, "Smartphone", "Tecnologia", 2200, 5));

        punto1(productos);
        punto2(productos);

    
        int opcion = 0;
        do {
            System.out.println("\nMENU TIENDA DE TECNOLOGIA");
            System.out.println("1. Buscar producto por codigo");
            System.out.println("2. Actualizar precio");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Mostrar productos por categoria");
            System.out.println("0. Salir");
            System.out.print("\ningrese una opcion ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: {
                        System.out.print("Codigo: ");
                        int codigo = Integer.parseInt(sc.nextLine());
                        boolean encontrado = false;
                        for (Productos p : productos) {
                            if (p.getCodigo() == codigo) {
                                System.out.println(p.getCodigo() + " - " + p.getNombre() + " - " + p.getCategoria()
                                        + " - $" + p.getPrecio() + " - Stock: " + p.getStock());
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    }

                    case 2: {
                        System.out.print("Codigo: ");
                        int codigo = Integer.parseInt(sc.nextLine());
                        System.out.print("Nuevo precio: ");
                        double nuevoPrecio = Double.parseDouble(sc.nextLine());
                        boolean encontrado = false;
                        for (Productos p : productos) {
                            if (p.getCodigo() == codigo) {
                                p.setPrecio(nuevoPrecio);
                                System.out.println("Precio actualizado.");
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    }

                    case 3: {
                        System.out.print("Codigo: ");
                        int codigo = Integer.parseInt(sc.nextLine());
                        System.out.print("Nuevo stock: ");
                        int nuevoStock = Integer.parseInt(sc.nextLine());
                        boolean encontrado = false;
                        for (Productos p : productos) {
                            if (p.getCodigo() == codigo) {
                                p.setStock(nuevoStock);
                                System.out.println("Stock actualizado.");
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    }

                    case 4: {
                        System.out.print("Codigo: ");
                        int codigo = Integer.parseInt(sc.nextLine());
                        boolean encontrado = false;
                        for (int i = 0; i < productos.size(); i++) {
                            if (productos.get(i).getCodigo() == codigo) {
                                productos.remove(i);
                                System.out.println("Producto eliminado.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    }

                    case 5: {
                        for (Productos p : productos) {
                            System.out.println(p.getCodigo() + " - " + p.getNombre() + " - " + p.getCategoria()
                                    + " - $" + p.getPrecio() + " - Stock: " + p.getStock());
                        }
                        break;
                    }

                    case 6: {
                        System.out.print("Categoria (Tecnologia, Papeleria, Muebles, Electrodomesticos): ");
                        String categoria = sc.nextLine();
                        boolean encontrado = false;
                        for (Productos p : productos) {
                            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                                System.out.println(p.getCodigo() + " - " + p.getNombre() + " - $" + p.getPrecio()
                                        + " - Stock: " + p.getStock());
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No hay productos en esa categoría.");
                        }
                        break;
                    }

                    case 0:
                        System.out.println("GRACIAS POR UTILIZAR MI PROGRAMA:)");
                        break;

                    default:
                        System.out.println("Opcion no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.");
            }
        } while (opcion != 0);
    }

    public static void punto1(ArrayList<Productos> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            double suma = 0;
            int stockBajo = 0;
            Productos masCaro = productos.get(0);
            Productos masBarato = productos.get(0);

            for (Productos p : productos) {
                suma += p.getPrecio();
                if (p.getPrecio() > masCaro.getPrecio()) {
                    masCaro = p;
                }
                if (p.getPrecio() < masBarato.getPrecio()) {
                    masBarato = p;
                }
                if (p.getStock() < 10) {
                    stockBajo++;
                }
            }

            System.out.println("Cantidad total de productos: " + productos.size());
            System.out.printf("Valor promedio de los precios: %.1f%n", suma / productos.size());
            System.out.println("Producto mas costoso: " + masCaro.getNombre() + " ($" + masCaro.getPrecio() + ")");
            System.out.println("Producto con menor precio: " + masBarato.getNombre() + " ($" + masBarato.getPrecio() + ")");
            System.out.println("Productos con stock menor a 10: " + stockBajo);
        }
    }

    public static void punto2(ArrayList<Productos> productos) {
        ArrayList<Productos> productosTecnologia = new ArrayList<>();
        ArrayList<Productos> productosEconomicos = new ArrayList<>();

        for (Productos p : productos) {
            if (p.getCategoria().equals("Tecnologia")) {
                productosTecnologia.add(p);
            }
            if (p.getPrecio() < 200) {
                productosEconomicos.add(p);
            }
        }

        System.out.println("--- productosTecnologia ---");
        double valorTecnologia = 0;
        for (Productos p : productosTecnologia) {
            System.out.println(p.getCodigo() + " - " + p.getNombre() + " - $" + p.getPrecio() + " - Stock: " + p.getStock());
            valorTecnologia += p.getPrecio() * p.getStock();
        }
        System.out.println("Valor del inventario de tecnologia: $" + valorTecnologia);

        System.out.println("\n--- productosEconomicos ---");
        double valorEconomicos = 0;
        for (Productos p : productosEconomicos) {
            System.out.println(p.getCodigo() + " - " + p.getNombre() + " - $" + p.getPrecio() + " - Stock: " + p.getStock());
            valorEconomicos += p.getPrecio() * p.getStock();
        }
        System.out.println("Valor del inventario de economicos: $" + valorEconomicos);
    }

}
