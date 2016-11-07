package VolenteeringProject.Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity

public class Project {
@Id
@GeneratedValue

private int Project_id;

@Lob
private byte[] discription;

@Temporal(TemporalType.DATE)
private Date startDate;


@Temporal(TemporalType.DATE)
private Date endDate;



@OneToMany(mappedBy="project")
private List<Task>tasks=new ArrayList<Task>();

@Enumerated(EnumType.STRING)

private Status status;

@OneToMany(mappedBy="project")
List<Beneficiaries>benefit=new ArrayList<Beneficiaries>();

@ManyToOne
@JoinColumn(name="Volenteer_Id")

private Volenteer volenteer;


public Project(){
	
}

}
