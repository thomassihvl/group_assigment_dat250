package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "pincode_id")
    private String pincode;
    private Integer count;

    public Long getId() {
        return id;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode){
        this.pincode = pincode;
    }
    public int getCount() {
        return count;
    }
    public void setCount(Integer count){
        this.count = count;
    }
}
