class User extends Account{
    constructor(id, name, document, email, password){
        super(id,name,document,email,password);
    }

    printDataUser(){
        console.log("Nombre: " + this.name +
        "\nId: " + this.id +
        "\nDocument: " + this.document +
        "\nEmail: " + this.email + 
        "\npassword: " + this.password
        )
    }
}