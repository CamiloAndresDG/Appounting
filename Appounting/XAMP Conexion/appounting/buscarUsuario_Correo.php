<?php
include_once("conexion.php");

// 1. Crear conexión a la Base de Datos
$con=mysqli_connect($host,$usuario,$clave,$bd) or die('Fallo la conexion');
mysqli_set_charset($con,"utf8");

// 2. Tomar los campos provenientes de la tabla
$resultado1=NULL;

$email=$_GET['email'];
$contrasena=$_GET['contrasena'];
$pin=$_GET['pin'];

$consulta = "SELECT * FROM persona AS p INNER JOIN cuenta AS c ON p.usuario=c.persona_usuario WHERE p.usuario = '$email' AND p.contrasena = '$contrasena' OR p.pin = '$pin'";
$resultado = mysqli_query($con, $consulta);

while($fila = mysqli_fetch_array($resultado)){
 $resultado1[] = array_map('utf8_encode', $fila);
}

echo json_encode($resultado1);
mysqli_close($con);

?>