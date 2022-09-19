package no.hvl.dat250.jpa.assignment2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin  extends Agent{

}
