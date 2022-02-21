package gr.hua.dit.MyApplication.repository;

import gr.hua.dit.MyApplication.Entities.Animal;
import gr.hua.dit.MyApplication.Entities.Citizen;
import gr.hua.dit.MyApplication.Entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {


}
