package com.springbootsecurity.secureapplication.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "role")
public class Role implements GrantedAuthority, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4385814057655413106L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private String role;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role", joinColumns = {
            @JoinColumn(name = "fk_role", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "fk_user",
                    nullable = false, updatable = false)})
    private List<User> users;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
