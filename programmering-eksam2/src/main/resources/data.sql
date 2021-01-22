INSERT INTO Supervisors(id,supervisor_first_name,supervisor_last_name,supervisor_email)
VALUES (1,'Kim', 'Jensen','kj@kea.dk'),
       (2,'Marie', 'Mikkelsen','mm@kea.dk'),
       (3,'Hans', 'Hansen','hh@kea.dk'),
       (4,'Jens', 'Jensen','jj@kea.dk'),
       (5,'Mike', 'Tyson','mt@kea.dk'),
       (6,'Mads', 'Nielsen','mn@kea.dk'),
       (7,'Peter', 'Mikkelsen','pm@kea.dk'),
       (8,'Thomas', 'Sørensen','ts@kea.dk'),
       (9,'Jonas', 'Madsen','jm@kea.dk'),
       (10,'Jakob', 'Vester','jv@kea.dk'),
       (11,'Kevin', 'Hansen','kh@kea.dk');
INSERT INTO Students(id,student_first_name,student_last_name,student_email,supervisor_id)
VALUES (1,'Chris', 'brown','chri2014@stud.kea.dk',1),
       (2,'Jennifer','music','jenn0149@stud.kea.dk',2),
       (3,'Michael','vest','mich2345@stud.kea.dk',5),
       (4,'søren','sørensen','søre2058@stud.kea.dk',4),
       (5,'Jeniffer','aniston','jenni8859@stud.kea.dk',10),
       (6,'Cardi','Offset','card2049@stud.kea.dk',9),
       (7,'Nicki','Minaj','nicki4452@stud.kea.dk',9),
       (8,'Nicklas','hansen','Nick2090@stud.kea.dk',9);