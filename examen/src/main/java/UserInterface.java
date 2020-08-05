
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chalosalvador
 */
public class UserInterface {
    
    Plane plane;
    Scanner scanner = new Scanner(System.in);
    
    public void start() {
        int rows, cols;
        while (true) {
            System.out.println("Ingrese la cantidad de filas: ");
            rows = Integer.valueOf(scanner.nextLine());
            System.out.println("Ingrese la cantidad de columnas: ");
            cols = Integer.valueOf(scanner.nextLine());
            
            if (rows <= 20 && cols <= 8) {
                break;
            }
        }
        
        this.plane = new Plane(rows, cols);
        
        while (true) {
            System.out.println("Este es el mapa del avión:");
            System.out.println(plane);
            
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Ingresar un pasajero");
            System.out.println("2. Consultar un asiento");
            System.out.println("3. Consultar un pasajero");
            
            System.out.print("Ingrese la opción: ");
            int option = Integer.valueOf(scanner.nextLine());
            
            switch (option) {
                case 1:
                    addPasssenger();
                    break;
                case 2:
                    queryBySeat();
                    break;
                case 3:
                    queryByPassenger();
                    break;
                
                default:
                    break;
            }
        }
    }
    
    private void addPasssenger() {
        System.out.println("Ingresar un pasajero: ");
        System.out.println("Ingrese el nombre del pasajero: ");
        String name = scanner.nextLine();
        
        System.out.println("Ingrese el apellido del pasajero: ");
        String lastname = scanner.nextLine();
        
        System.out.println("Ingrese la fila del asiento: ");
        int row = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Ingrese la columna del asiento: ");
        String col = scanner.nextLine();
        
        ArrayList<Seat> planeSeats = plane.getSeats();
        Seat seat = new Seat(row, col);
        int seatIndex = planeSeats.indexOf(seat);
        if (seatIndex != -1) {
            Seat planeSeat = planeSeats.get(seatIndex);
            
            if (planeSeat.isFree()) {
                planeSeat.setPassenger(new Passenger(name, lastname));
                System.out.println("¡Pasajero ingresado!");
            } else {
                System.out.println("El asiento ya está ocupado.");
            }
        } else {
            System.out.println("No existe el asiento especificado.");
        }
        
    }
    
    private void queryBySeat() {
        System.out.println("Consulta de asiento.");
        System.out.println("");
        
         System.out.println("Ingrese la fila del asiento: ");
        int row = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Ingrese la columna del asiento: ");
        String col = scanner.nextLine();
        
        ArrayList<Seat> planeSeats = plane.getSeats();
        Seat seat = new Seat(row, col);
        int seatIndex = planeSeats.indexOf(seat);
        if (seatIndex != -1) {
            Seat planeSeat = planeSeats.get(seatIndex);
            
            System.out.println(planeSeat);
        } else {
            System.out.println("No existe el asiento especificado.");
        }
        
    }
    
    private void queryByPassenger() {
        
    }
    
}
