<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");
require_once("user.php");

// $uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Sparl");
// $uberX->printDataCar();

// $uberPool = new UberPool("TYU786", new Account("Carlos Eduardo", "JI2312"), "Toyota", "Hilux");
// $uberPool->printDataCar();

$cliente = new User(1, "Carlos", "DSA123", "cchavarriacenteno8@gmail.com", "hola123");
$cliente->printDataUser();

?>