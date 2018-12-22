package test.sudo.sudoyers.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "freelancer")
public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private int success_jobs_percent;
    private int rate;
    private String location;
    private Double rating;
    private String skill;

    public Freelancer() {
    }

    public Freelancer(String firstname, String lastname, int success_jobs_percent, int rate, String location, Double rating, String skill) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.success_jobs_percent = success_jobs_percent;
        this.rate = rate;
        this.location = location;
        this.rating = rating;
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSuccess_jobs_percent() {
        return success_jobs_percent;
    }

    public void setSuccess_jobs_percent(int success_jobs_percent) {
        this.success_jobs_percent = success_jobs_percent;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
