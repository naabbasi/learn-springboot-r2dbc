package edu.learn.r2jdbcdemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer implements Serializable {
	@Id
	private Long id;
	private String firstName;
	private String lastName;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, firstName='%s', lastName='%s']",
				id, firstName, lastName);
	}
}
