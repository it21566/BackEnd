package gr.hua.dit.MyApplication.repository;

import gr.hua.dit.MyApplication.Entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
