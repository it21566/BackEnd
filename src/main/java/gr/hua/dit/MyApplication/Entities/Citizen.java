package gr.hua.dit.MyApplication.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import gr.hua.dit.MyApplication.AbstractEntity;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name="Citizen")
public class Citizen extends AbstractEntity {
    @NotEmpty
    private String firstName = "";

    @NotEmpty
    private String lastName = "";

    @OneToMany(mappedBy = "citizen")
    private List<Animal> animals = new LinkedList<>();

    /*@NotNull
    @ManyToOne
    private Status status;*/

    @Email
    @NotEmpty
    private String email = "";

    @Formula("(select count(a.id) from Animal a where a.citizen_id = id)")
    private int animalCount;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
