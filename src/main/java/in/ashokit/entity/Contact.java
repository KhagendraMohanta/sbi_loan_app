package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="contacts")
@Data
public class Contact {
 
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String city;
	private String pNo;
	public Object getContactId() {
		return null;
	}
	
	
}
