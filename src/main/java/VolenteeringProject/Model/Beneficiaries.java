package VolenteeringProject.Model;
import javax.persistence.*;

@Entity
public class Beneficiaries {
@Id
@GeneratedValue
private int id;
@ManyToOne
@JoinColumn(name="project")

private Project project;
	
}
