<?php
include('funciones.php');
$departamento_id=$_GET['departamento_id'];

if ($resultset = getSQLResultSet("SELECT nombre FROM `municipios` WHERE `departamento_id` = '$departamento_id'")) {
	
    while ($row = $resultset->fetch_array(MYSQLI_NUM)) {
    echo json_encode($row);
    }  
}
?>