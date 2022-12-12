

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        Account cuenta1 = new Account();
        
        // Scanner scanner = new Scanner(System.in);
        
        // cuenta1.setNombre(scanner.nextLine());
        // cuenta1.setDocument(scanner.nextLine());
        // cuenta1.setId(scanner.nextInt());
        // cuenta1.setPassword(scanner.nextLine());
        // cuenta1.leerDatos();


        

        // User user1 = new User(1,"si", "no", "depende", "si");
        // user1.printDataUser();

        UberX uberX = new UberX(1, "SJDA9", new Account(1, "Carlos", "cchavarria", "edcenteno", "si"), "chevrolet", "Sparl"); 
        uberX.setPassenger(4);
        uberX.printDataCar();


        UberVan uberVan = new UberVan(10, "carlos", new Account(1, "Carlos", "cchavarria", "edcenteno", "si"), null, null);
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}
