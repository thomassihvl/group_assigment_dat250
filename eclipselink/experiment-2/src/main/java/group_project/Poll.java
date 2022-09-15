package group_project;

import org.apache.derby.catalog.UUID;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "poll")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Poll implements IPoll{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pollQuestion;

    private int yesCounter;
    private int noCounter;
    private int totalCount;
    /*
    private Status status;
    private Date startTime;
    private Date endTime;
    private boolean isPublic;                */
    @OneToMany
    private List<User> hasVoted;



    public void setPollQuestion(String pollQuestion){
        this.pollQuestion = pollQuestion;
    }

    @Override
    public void voteYes(UUID user) {

    }

    @Override
    public void voteNo(UUID user) {

    }

    @Override
    public void setStartTime(Date date) {

    }

    @Override
    public Date getStartTime() {
        return null;
    }

    @Override
    public void setStopTime(Date date) {

    }

    @Override
    public Date getStopTime() {
        return null;
    }

    @Override
    public int getTotalCount() {
        return 0;
    }
   /*
    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public void setStatus(Status status) {

    }
                          */
    @Override
    public String getQuestion() {
        return null;
    }

    @Override
    public void setQuestion(String question) {

    }

    @Override
    public void setPollId(UUID pollid) {

    }

    @Override
    public UUID getUserId() {
        return null;
    }

}
