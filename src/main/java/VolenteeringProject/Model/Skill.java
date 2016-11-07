package VolenteeringProject.Model;
import javax.persistence.*;

@Entity 
public class Skill {

	@Id
	@GeneratedValue
	
	private int Skill_Id;
	
public	Skill(){
		
	}
	

@ManyToOne
@JoinColumn(name="Task_Id")

private Task task;
}
