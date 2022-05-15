<?php

include 'conexion.php';

$cmonto=$_GET['monto'];
$cpersona_usuario=$_GET['persona_usuario'];


$consulta="INSERT INTO cuenta (monto, persona_usuario) values(".$cmonto.",".$cpersona_usuario.")";
echo $consulta;
mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close($conexion);

?>