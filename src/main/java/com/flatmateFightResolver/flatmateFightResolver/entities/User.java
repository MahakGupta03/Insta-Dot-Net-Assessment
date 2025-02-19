package com.flatmateFightResolver.flatmateFightResolver.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFlatCode() {
		return flatCode;
	}
	public void setFlatCode(String flatCode) {
		this.flatCode = flatCode;
	}
	public int getKarmaPoints() {
		return karmaPoints;
	}
	public void setKarmaPoints(int karmaPoints) {
		this.karmaPoints = karmaPoints;
	}
	private String username;
    private String email;
    private String password;
    private String flatCode;
    private int karmaPoints = 0;

}
