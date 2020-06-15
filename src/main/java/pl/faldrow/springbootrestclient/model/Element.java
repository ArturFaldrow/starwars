package pl.faldrow.springbootrestclient.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Artur on 10.06.2020.
 */
@Data
@Entity
@Table(name = "elements")
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idno;
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;

    @OneToOne
    private Homeworld homeworld;

    @OneToMany
    private Set<Starship> starshipSet;

    public void setHomeworld(Homeworld homeworld) {
        if (homeworld != null) {
           this.homeworld =homeworld;
           homeworld.setElement(this);   // wazne TODO
        }
    }
 /*   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Homeworld getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Homeworld homeworld) {
        this.homeworld = homeworld;
    }

    public Set<Starship> getStarshipSet() {
        return starshipSet;
    }

    public void setStarshipSet(Set<Starship> starshipSet) {
        this.starshipSet = starshipSet;
    }
    */
}
