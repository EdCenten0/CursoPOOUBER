<?php
require_once('account.php');

class User extends Account{
    public function __construct($id, $name, $document, $email, $password)
    {
        parent::__construct($id, $name, $document, $email, $password);
    }


    public function printDataUser(){
        echo "ID:  $this->id \nNombre: 
        $this->name \nDocumento: $this->document 
        \nEmail: $this->email 
        \nPassword: $this->password ";

    }
}


?>