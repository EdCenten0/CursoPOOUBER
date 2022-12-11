public class User extends Account{

    public User(Integer id, String nombre, String document, String email, String password) {
        super(id, nombre, document, email, password);
    }

    public User() {
    }

    public void printDataUser(){
        System.out.println("ID: " + this.getId() + "\nNombre: " + this.getNombre() + "\nDocumnent: " + this.getDocument() + "\nEmail: " + this.getEmail() + "\nPassword" + this.getPassword());
    }
    
}