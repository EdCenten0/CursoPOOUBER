<?php
class Account
{
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    public function __construct($name, $doucument)
    {
        $this->name = $name;
        $this->document = $doucument;
    }


}

?>