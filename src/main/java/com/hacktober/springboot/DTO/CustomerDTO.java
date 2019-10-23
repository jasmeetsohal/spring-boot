package com.hacktober.springboot.DTO;

public class CustomerDTO {


	private String username;
	private String password;
	private boolean accountNonExpired;
	private boolean enabled;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	
	public CustomerDTO(String username, String password, boolean accountNonExpired, boolean enabled,
			boolean accountNonLocked, boolean credentialsNonExpired) {
		super();
		this.username = username;
		this.password = password;
		this.accountNonExpired = accountNonExpired;
		this.enabled = enabled;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}
	
	

	
}
