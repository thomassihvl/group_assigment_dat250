package group_project;

import org.apache.derby.catalog.UUID;

import java.util.Date;

public interface IPoll {

    public void voteYes(UUID user);

    public void voteNo(UUID user);

    public void setStartTime(Date date);

    public Date getStartTime();

    public void setStopTime(Date date);

    public Date getStopTime();

    public int getTotalCount();

    //public Status getStatus();

    //public void setStatus(Status status);

    public String getQuestion();

    public void setQuestion(String question);

    public void setPollId(UUID pollid);

    public UUID getUserId();

}
