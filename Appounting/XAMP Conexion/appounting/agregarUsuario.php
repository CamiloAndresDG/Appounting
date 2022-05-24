<?php

include 'conexion.php';

$cusuario=$_GET['usuario'];
$ccedula=$_GET['cedula'];
$cpassword=$_GET['password'];
$cpin=$_GET['pin'];
$cnombres=$_GET['nombres'];
$capellidos=$_GET['apellidos'];
$cemail=$_GET['email'];

$consulta="INSERT INTO persona (usuario, cedula ,password, pin, nombres, apellidos, email) values(".$cusuario.",".$ccedula.",".$cpassword.",".$cpin.",".$cnombres.",".$capellidos.",".$cemail.")";
echo $consulta;
mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close($conexion);

?>