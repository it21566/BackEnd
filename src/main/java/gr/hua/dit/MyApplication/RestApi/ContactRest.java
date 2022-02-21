package gr.hua.dit.MyApplication.RestApi;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.fusion.Endpoint;
import gr.hua.dit.MyApplication.Entities.Contact;
import gr.hua.dit.MyApplication.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/contact")
@Endpoint
@AnonymousAllowed
public class ContactRest {

    @Autowired
    ContactRepository contactRepo ;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contact> findContact(@PathVariable Integer id) {
        Optional<Contact> optionalContact = contactRepo.findById(id);
        if(!optionalContact.isPresent()){
            throw new IllegalArgumentException("There is no Contact with id "+id);
        }
        return ResponseEntity.ok(optionalContact.get());
    }
    @RolesAllowed("ROLE_ADMIN")
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Contact>> findContacts() {
        List<Contact> optionalContact = contactRepo.findAll();
        if(optionalContact.isEmpty()){
            throw new IllegalArgumentException("There is no Contact ");
        }
        return ResponseEntity.ok(optionalContact);
    }
}
