package gr.hua.dit.MyApplication.service;


import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.fusion.Endpoint;
import com.vaadin.fusion.Nonnull;
import gr.hua.dit.MyApplication.Entities.Company;
import gr.hua.dit.MyApplication.Entities.Contact;
import gr.hua.dit.MyApplication.Entities.Status;
import gr.hua.dit.MyApplication.repository.CompanyRepository;
import gr.hua.dit.MyApplication.repository.ContactRepository;
import gr.hua.dit.MyApplication.repository.StatusRepository;
import org.springframework.stereotype.Service;

import javax.annotation.security.PermitAll;
import java.util.Collections;
import java.util.List;

@Endpoint
@Service
@AnonymousAllowed
public class CrmService {

    private final ContactRepository contactRepository;
    private final CompanyRepository companyRepository;
    private final StatusRepository statusRepository;

    public CrmService(ContactRepository contactRepository,
                      CompanyRepository companyRepository,
                      StatusRepository statusRepository) {
        this.contactRepository = contactRepository;
        this.companyRepository = companyRepository;
        this.statusRepository = statusRepository;
    }

    public List<Contact> findAllContacts(String stringFilter) {
        if (stringFilter == null || stringFilter.isEmpty()) {
            return contactRepository.findAll();
        } else {
            return contactRepository.search(stringFilter);
        }
    }
    public static class CrmData {
        @Nonnull
        public List<@Nonnull Contact> contacts = Collections.emptyList();
        @Nonnull
        public List<@Nonnull Company> companies = Collections.emptyList();;
        @Nonnull
        public List<@Nonnull Status> statuses = Collections.emptyList();;
    }

    @Nonnull
    @PermitAll
    public CrmData getCrmData() {
        CrmData crmData = new CrmData();
        crmData.contacts = contactRepository.findAll();
        crmData.companies = companyRepository.findAll();
        crmData.statuses = statusRepository.findAll();
        return crmData;
    }

    @Nonnull
    public Contact saveContact(Contact contact) {
        contact.setCompany(companyRepository.findById(contact.getCompany().getId())
                .orElseThrow(() -> new RuntimeException(
                        "Could not find Company with ID " + contact.getCompany().getId())));
        contact.setStatus(statusRepository.findById(contact.getStatus().getId())
                .orElseThrow(() -> new RuntimeException(
                        "Could not find Status with ID " + contact.getStatus().getId())));
        return contactRepository.save(contact);
    }

    public void deleteContact(Integer contactId) {
        contactRepository.deleteById(contactId);
    }
    public long countContacts() {
        return contactRepository.count();
    }

    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }

    /*public void saveContact(Contact contact) {
        if (contact == null) {
            System.err.println("Contact is null. Are you sure you have connected your form to the application?");
            return;
        }
        contactRepository.save(contact);
    }*/

    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    public List<Status> findAllStatuses(){
        return statusRepository.findAll();
    }
}
