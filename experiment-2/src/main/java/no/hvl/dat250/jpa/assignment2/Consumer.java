package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;



@Entity
@DiscriminatorValue("CONSUMER")
public class Consumer extends Agent{

    @OneToMany(mappedBy = "owner")
    private Set<PrivatePoll> ownedPrivatePolls;

    @OneToMany(mappedBy = "owner")
    private Set<PublicPoll> ownedPublicPolls;

    public Set<PrivatePoll> getOwnedPrivatePolls() {
        return ownedPrivatePolls;
    }

    public void setOwnedPrivatePolls(Set<PrivatePoll> ownedPrivatePolls) {
        this.ownedPrivatePolls = ownedPrivatePolls;
    }

    public Set<PublicPoll> getOwnedPublicPolls() {
        return ownedPublicPolls;
    }

    public void setOwnedPublicPolls(Set<PublicPoll> ownedPublicPolls) {
        this.ownedPublicPolls = ownedPublicPolls;
    }
/*
    @Override
    public String toString() {
        String privatePolls = "";
        if (ownedPrivatePolls != null ) {
            for (PrivatePoll privatePoll : ownedPrivatePolls) {
                privatePolls+="Poll ID:"+Long.toString(privatePoll.getId())+" "+privatePoll.getPollQuestion();
            }
        }
        String publicPolls = "";
        if (ownedPublicPolls != null ) {
            for (PublicPoll publicPoll : ownedPublicPolls) {
                publicPolls+="Poll ID:"+Long.toString(publicPoll.getId())+" "+publicPoll.getPollQuestion();
            }
        }
        return "Consumer{" +
                "id=" + this.getID() +
                ", consumername='" + this.getUsername() + '\'' +
                ", ownedPrivatePolls=" + privatePolls +
                ", ownedPublicPolls=" + publicPolls +
                '}';
    }

 */


}
