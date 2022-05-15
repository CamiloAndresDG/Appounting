<?php

include 'conexion.php';

$cfecha_inicioo=$_GET['fecha_inicio'];
$ccuenta_numero_cuenta=$_GET['cuenta_numero_cuenta'];


$consulta="INSERT INTO sesiones (fecha_inicio, cuenta_numero_cuenta) values(".$cfecha_inicioo.",".$ccuenta_numero_cuenta.")";
echo $consulta;
mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close($conexion);

?>