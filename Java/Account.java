package CursoPOOUBER.Java;

public class Account {
    private Integer id;
    private String nombre;
    private String document;
    private String email;
    private String password;

    public Account(Integer id, String nombre, String document, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    

    public Account() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void leerDatos(){
        System.out.println("Los datos son: \n" + this.nombre + "\n" + this.id + "\n" + this.document + "\n" + this.password);
    }
    
    
}
