package gr.hua.dit.MyApplication.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import gr.hua.dit.MyApplication.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Animal")
public class Animal extends AbstractEntity {
    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "citizen_id")
    @NotNull
    //@JsonIgnoreProperties({"employees"})
    private Citizen citizen;

    @NotNull
    @ManyToOne
    private Status status;

    /*@Email
    @NotEmpty
    private String email = "";*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /*public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/
}
