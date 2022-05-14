INSERT INTO `appounting_db`.`cuenta` (usuario,nombres,apellidos,email,password,cantidad,pin) VALUES ("100","Juan","Contreras","juana@gmail.com","100",200.000,"1234");
INSERT INTO `appounting_db`.`historial_movimientos` (titulo,cantidad,fechaMovimiento,cuenta_id) VALUES ("Transaccion",100.000,"12/12/2000",1);
INSERT INTO `appounting_db`.`historial_movimientos` (titulo,cantidad,fechaMovimiento,cuenta_id) VALUES ("Comida",50.000,"12/12/2000",1);

INSERT INTO `appounting_db`.`prestamos` (nombrePersonaEntidad,telefono,tipo,valor,fechaPrestamo,cuenta_id) VALUES ("Camilo","321386","Prestamo solicitado",10.000,"14/04/2022",1);
INSERT INTO `appounting_db`.`prestamos` (nombrePersonaEntidad,telefono,tipo,valor,fechaPrestamo,cuenta_id) VALUES ("Jhonatan","321233","Prestamo solicitado",20.000,"15/04/2022",1);

INSERT INTO `appounting_db`.`ahorros` (cantidad,motivo,fecha_establecida,fecha_limite,cuenta_id) VALUES (20.000,"Cine","14/04/2022","20/04/2022",1);
INSERT INTO `appounting_db`.`ahorros` (cantidad,motivo,fecha_establecida,fecha_limite,cuenta_id) VALUES (20.000,"Gimnasio","14/04/2022","21/04/2022",1);

INSERT INTO `appounting_db`.`deudas` (titulo,valor,fechaPagoEsperado,detalles,estado,cantidadCuotas,cuenta_id) VALUEs ("Pago celualr", 50.000,"20/04/2022","Pago del Postpago","NO PAGO",1,1);
INSERT INTO `appounting_db`.`deudas` (titulo,valor,fechaPagoEsperado,detalles,estado,cantidadCuotas,cuenta_id) VALUEs ("Pago gimnasio", 80.000,"20/04/2022","Pago del gimnasio","PAGO",1,1);
