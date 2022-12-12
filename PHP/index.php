<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");
require_once("user.php");
require_once("uberVan.php");

$uberX = new UberX("DSADS", new Account(1,"Eduardo Centeno", "900-922", "Ccenteno", "Freefire"), "Mitsu", "Bishi");
$uberX->setPassengers(4);
$uberX->printDataCar();

// $uberPool = new UberPool("TYU786", new Account("Carlos Eduardo", "JI2312"), "Toyota", "Hilux");
// $uberPool->printDataCar();

// $cliente = new User(1, "Carlos", "DSA123", "cchavarriacenteno8@gmail.com", "hola123");
// $cliente->printDataUser();

// $uberVan = new UberVan("CV324", new Account(1,"Carlos Centeno", "241-300", "cchavarria", "123Pass"), "Toyota", "Hilux");
// $uberVan->setPassengers(6);
// $uberVan->printDataCar();



?>