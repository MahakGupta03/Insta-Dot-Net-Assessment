package com.flatmateFightResolver.flatmateFightResolver.dto;

import lombok.Data;

@Data
public class RegisterRequest {
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
	private String username;
    @Override
	public String toString() {
		return "RegisterRequest [username=" + username + ", email=" + email + ", password=" + password + ", flatCode="
				+ flatCode + "]";
	}
	private String email;
    private String password;
    private String flatCode;
}

