<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Sparl");
$uberX->printDataCar();

$uberPool = new UberPool("TYU786", new Account("Carlos Eduardo", "JI2312"), "Toyota", "Hilux");
$uberPool->printDataCar();
?>