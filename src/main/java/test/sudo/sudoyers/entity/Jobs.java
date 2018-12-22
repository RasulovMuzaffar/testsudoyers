package test.sudo.sudoyers.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String part_time;
    private String company;
    private String specialty;
    private boolean heart;
    private String city;
    private String location;
    private String direction;
    private String calendar_date;
    private String item_text;
    private String cost;
    private String cost_uz;

    @JsonBackReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
    private Set<Tags> tags = new HashSet<>(0);

    public Jobs() {
    }

    public Jobs(String title, String part_time, String company, String specialty, boolean heart, String city, String location, String direction, String calendar_date, String item_text, String cost, String cost_uz, Set<Tags> tags) {
        this.title = title;
        this.part_time = part_time;
        this.company = company;
        this.specialty = specialty;
        this.heart = heart;
        this.city = city;
        this.location = location;
        this.direction = direction;
        this.calendar_date = calendar_date;
        this.item_text = item_text;
        this.cost = cost;
        this.cost_uz = cost_uz;
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPart_time() {
        return part_time;
    }

    public void setPart_time(String part_time) {
        this.part_time = part_time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isHeart() {
        return heart;
    }

    public void setHeart(boolean heart) {
        this.heart = heart;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCalendar_date() {
        return calendar_date;
    }

    public void setCalendar_date(String calendar_date) {
        this.calendar_date = calendar_date;
    }

    public String getItem_text() {
        return item_text;
    }

    public void setItem_text(String item_text) {
        this.item_text = item_text;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCost_uz() {
        return cost_uz;
    }

    public void setCost_uz(String cost_uz) {
        this.cost_uz = cost_uz;
    }

    public Set<Tags> getTags() {
        return tags;
    }

    public void setTags(Set<Tags> tags) {
        this.tags = tags;
    }
}
