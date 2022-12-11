public class Driver extends Account{

    public Driver(Integer id, String nombre, String document, String email, String password) {
        super(id, nombre, document, email, password);
    }

    public Driver() {
    }

    public void printDataDriver(){
        System.out.println("ID: " + this.getId() + "\nNombre: " + this.getNombre() + "\nDocumnent: " + this.getDocument() + "\nEmail: " + this.getEmail() + "\nPassword" + this.getPassword());
    }
    
}