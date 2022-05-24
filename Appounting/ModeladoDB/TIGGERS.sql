-- Vista de registro
DROP TRIGGER IF EXISTS before_usuario_insert;

delimiter //
CREATE TRIGGER before_persona_insert
	BEFORE INSERT
    ON appounting.persona
    FOR EACH ROW
begin 
	INSERT INTO appounting.cuenta (monto,persona_usuario)VALUES(,NEW.usuario);
    `numero_cuenta` INT NOT NULL,
	`monto` DOUBLE(9,2) NOT NULL,
	`usuario_usuario` VARCHAR(80) NOT NULL,
end //