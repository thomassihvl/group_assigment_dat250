package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="POLL_TYPE")
public class Poll {
    //
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(targetEntity = Consumer.class)
    private Consumer owner;
    private Integer yesCounter;
    private Integer noCounter;
    private Integer totalCount;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String pollQuestion;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Long getId() {
        return id;
    }

    public Consumer getConsumer() {
        return owner;
    }



    public void setConsumer(Consumer owner) {
        this.owner = owner;
    }

    public Integer getYesCounter() {
        return yesCounter;
    }

    public void setYesCounter(Integer yesCounter) {
        this.yesCounter = yesCounter;
    }

    public Integer getNoCounter() {
        return noCounter;
    }

    public void setNoCounter(Integer noCounter) {
        this.noCounter = noCounter;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPollQuestion() {
        return pollQuestion;
    }

    public void setPollQuestion(String pollQuestion) {
        this.pollQuestion = pollQuestion;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
/*
    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", agent=" + agent +
                ", yesCounter=" + yesCounter +
                ", noCounter=" + noCounter +
                ", totalCount=" + totalCount +
                ", status=" + status +
                ", pollQuestion='" + pollQuestion + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

 */
}

