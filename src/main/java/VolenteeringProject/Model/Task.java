package VolenteeringProject.Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Task {

	@Id
	@GeneratedValue
	
	private int Task_Id;
	
	public Task(){
		
	}


@Temporal(TemporalType.DATE)
private Date start;


@Temporal(TemporalType.DATE)
private Date end;

	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name="Project_Id")
	
	Project project;
	
	@OneToMany(mappedBy="task")
List<Skill>skils=new ArrayList<Skill>();
	
}
