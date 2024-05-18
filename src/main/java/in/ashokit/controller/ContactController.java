package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Contact;
import in.ashokit.service.ContactService;

@RestController
public class ContactController {
    
	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")
	public  String createContact(@RequestBody Contact contact) {
		String saveContact = service.saveContact(contact);
		return "saveContact";
	}
	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {
		 return service.getAllContacts();
	}
	@GetMapping("/contacts/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		 return service.getContactById(contactId);
	}
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return service.saveContact(contact);
	}
	@DeleteMapping("/contact/{id}")
	public Contact getContactByd(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
}

	