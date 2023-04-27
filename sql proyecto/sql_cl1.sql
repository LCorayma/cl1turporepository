drop database CL1_Turpo;

CREATE DATABASE CL1_Turpo;

USE CL1_Turpo;

CREATE TABLE IF NOT EXISTS Doctores(
id_doctor int NOT NULL AUTO_INCREMENT COMMENT 'Id de Doctor',
nom_doctor varchar(80) NOT NULL COMMENT 'Nombre del Doctor',
especialidad_doctor varchar(50) NOT NULL COMMENT 'Especialidad del Doctor',
PRIMARY KEY (`id_doctor`)
);

CREATE TABLE IF NOT EXISTS Citas(
id_cita int COMMENT 'Id de Cita',
num_cita int COMMENT 'Numero de Cita',
fecha_cita int COMMENT 'Fecha de Cita',
nom_paciente_cita varchar(50) NOT NULL COMMENT 'Nombre de Paciente Citado',
ide_doctor int COMMENT 'Id del Doctor',
FOREIGN KEY (ide_doctor) REFERENCES Doctores(id_doctor),
PRIMARY KEY (`id_cita`)
);

select * from Citas;
select * from Doctores;