package VolenteeringProject.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Admin extends Person {
	


public Admin(){
	
}


Project create_project(Date start,Date end,List<Task> task){

	return new Project(start,end,task);
	
}

void update_task(Task t,Status s){
	
t.setStatus(s);
	
	
}

void update_project(Project p,Status s){
	p.setStatus(s);
	
}
}
