package gr.hua.dit.MyApplication.repository;

import gr.hua.dit.MyApplication.Entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {

}
