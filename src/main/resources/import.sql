insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (4,'fairfield','6414556596','Iowa','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (5,'chicago','6414556596','IL','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (6,'chicago','6414556596','IL','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (7,'washngton','6414556596','DC','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (8,'washgton','6414556596','DC','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (9,'fairfield','6414556596','Iowa','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (11,'fairfield','6414556596','Iowa','525567','1992,06,16','mahilet','asfaw');
insert into Admin (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName) values (43'fairfield','6414556596','Iowa','525567','1992,06,16','mahilet','asfaw');


insert into Volenteer (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName,task_id) values (1'fairfield','6414556596','Iowa','525567','1992,06,16','aaa','bbb',3);
insert into Volenteer (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName,task_id) values (2'fairfield','6414556596','Iowa','525567','1992,06,16','ccc','ddd',4);
insert into Volenteer (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName,task_id) values (3'fairfield','6414556596','Iowa','525567','1992,06,16','eee','fff',3);
insert into Volenteer (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName,task_id) values (4'fairfield','6414556596','Iowa','525567','1992,06,16','ggg','hhh',3);
insert into Volenteer (person_id,city,phone,state,zip,dateOfBirth,firstName,lastName,task_id) values (5'fairfield','6414556596','Iowa','525567','1992,06,16','jjj','kkk'4);

insert into Task (Task_id,start,end,status,project_Id) values (3,'2016,06,01','2017,06,05','Started','11');
insert into Task (Task_id,start,end,status,project_Id) values (4,'2016,06,01','2018,06,05','Started','12');
insert into Task (Task_id,start,end,status,project_Id) values (5,'2016,06,01','2019,06,05','Started','11');
insert into Task (Task_id,start,end,status,project_Id) values (6,'2016,06,01','2016,06,05','Started','12');
insert into Task (Task_id,start,end,status,project_Id) values (7,'2016,06,01','2019,06,05','Started','11');
insert into Task (Task_id,start,end,status,project_Id) values (8,'2016,06,01','2017,06,05','Started','12');

insert into Skill (Skill_Id,name,Task_id) values (1,'PHP','5');
insert into Skill (Skill_Id,name,Task_id) values (2,'java','3');
insert into Skill (Skill_Id,name,Task_id) values (3,'c++','6');
insert into Skill (Skill_Id,name,Task_id) values (4,'java','4');

UPDATE hibernate_sequence SET next_val = 1000;

