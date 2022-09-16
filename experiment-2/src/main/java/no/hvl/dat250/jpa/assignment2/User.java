package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    // Classes User and Admin aggregated through the Single Table Strategy
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private String username;
    // isAuthenticated shouldn't be persisted
    @OneToMany
    private Set<PrivatePoll> ownedPrivatePolls;

    @OneToMany
    private Set<PublicPoll> ownedPublicPolls;

    public Long getID() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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


    @Override
    public String toString() {
        String privatePolls = "";
        for (PrivatePoll privatePoll : ownedPrivatePolls) {
            privatePolls+="Poll ID:"+Long.toString(privatePoll.getId())+" "+privatePoll.getPollQuestion();
        }
        String publicPolls = "";
        for (PublicPoll publicPoll : ownedPublicPolls) {
            publicPolls+="Poll ID:"+Long.toString(publicPoll.getId())+" "+publicPoll.getPollQuestion();
        }
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", ownedPrivatePolls=" + privatePolls +
                ", ownedPublicPolls=" + publicPolls +
                '}';
    }
}

