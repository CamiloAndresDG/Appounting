<?php

// Datos de configuración de la conexión a la base de datos
$host = "localhost"; // Dirección del servidor (Local)
$usuario = "root"; // Nombre usuario de la base de datos
$clave = ""; // Contraseña de la base de datos
$bd = "appounting"; // Nombre de la base de datos
$conexion = new mysqli($host,$usuario,$clave,$bd);

if($conexion->connect_error){
    echo "Lo sentimos, el sitio web está experimentando problemas";
}

?>