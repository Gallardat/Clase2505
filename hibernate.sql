Select * from escuderias;

insert into escuderias(id_ecuderia,nombre,pais,id_pilodo)values(1,'aaa','España',1)
insert into escuderias(id_ecuderia,nombre,pais,id_pilodo)values(2,'bbb','Italia',2)

Select * from facturaciones;

insert into facturaciones(id_facturacion,publicidad,sueldo)values(1,23,1000)
insert into facturaciones(id_facturacion,publicidad,sueldo)values(2,14,2000)

select * from nif;

insert into nif (id_nif,letra,numero,id_pilodo)values(1,'a',123,1)
insert into nif (id_nif,letra,numero,id_pilodo)values(2,'b',124,2)

select * from pilotos;

insert into pilotos (id_piloto,edad,nombre_piloto,id_facturacion) values(1,23,'alfonso',2)
insert into pilotos (id_piloto,edad,nombre_piloto,id_facturacion) values(2,24,'adrian',1)

select * from telefonos;

insert into telefonos (id_telefono,numero,id_piloto) values(1,1234,1)
insert into telefonos (id_telefono,numero,id_piloto) values(1,123124,2)
insert into telefonos (id_telefono,numero,id_piloto) values(2,1544,2)

select * from temporadas;

insert into temporadas(id_temporada,fin,inicio) values(1,3,4)
insert into temporadas(id_temporada,fin,inicio) values(2,3,5)






