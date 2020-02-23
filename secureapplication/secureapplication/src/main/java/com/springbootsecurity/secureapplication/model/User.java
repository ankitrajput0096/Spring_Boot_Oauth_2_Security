package com.springbootsecurity.secureapplication.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8335848113528348806L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = {
            @JoinColumn(name = "fk_user", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "fk_role",
                    nullable = false, updatable = false)})
    private List<Role> roles;

    public User(String email, String password, List<Role> roles, boolean active) {
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.active = active;
    }
    
    public User() {};

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean isActive() {
        return active;
    }
}
