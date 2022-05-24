<?php
include('funciones.php');
if ($resultset = getSQLResultSet("SELECT nombre FROM `departamentos`")) {
	
    while ($row = $resultset->fetch_array(MYSQLI_NUM)) {
    echo json_encode($row);
    
    } 
}

?>