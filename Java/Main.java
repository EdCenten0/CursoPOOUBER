

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        Account cuenta1 = new Account();
        
        Scanner scanner = new Scanner(System.in);
        
        cuenta1.setNombre(scanner.nextLine());
        cuenta1.setDocument(scanner.nextLine());
        cuenta1.setId(scanner.nextInt());
        cuenta1.setPassword(scanner.nextLine());
        cuenta1.leerDatos();

        User user1 = new User(1,"si", "no", "depende", "si");
        user1.printDataUser();
    }
}
