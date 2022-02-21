package gr.hua.dit.MyApplication.Entities;


import gr.hua.dit.MyApplication.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Status")
public class Status extends AbstractEntity {
    private String name;

    public Status() { }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
