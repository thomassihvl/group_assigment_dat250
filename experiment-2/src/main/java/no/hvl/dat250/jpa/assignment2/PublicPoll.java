package no.hvl.dat250.jpa.assignment2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PUBLIC")
public class PublicPoll extends Poll {
}
