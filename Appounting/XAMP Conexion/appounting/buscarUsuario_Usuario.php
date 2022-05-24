<?php
include_once("conexion.php");

// 1. Crear conexión a la Base de Datos
$con=mysqli_connect($host,$usuario,$clave,$bd) or die('Fallo la conexion');
mysqli_set_charset($con,"utf8");

// 2. Tomar los campos provenientes de la tabla
$resultado1=NULL;

$usuario=$_GET['usuario'];
$password=$_GET['password'];
$pin=$_GET['pin'];

$consulta = "SELECT * FROM persona AS p INNER JOIN cuenta AS c ON p.usuario=c.persona_usuario WHERE p.usuario = '$usuario' AND p.password = '$password' OR p.pin = '$pin'";
echo $consulta;

?>