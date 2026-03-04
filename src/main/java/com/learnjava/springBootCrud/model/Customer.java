package com.learnjava.springBootCrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity(name= "Customer")
@Table(name= "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
 private Long id;
    @NotEmpty(message = "First name is required")
    @Size(min=3, message = "First name should be at least three characters")
    @Column(name = "full name")
    private String fullName;
    @NotEmpty(message = "Last name is required")
    @Size(min=3, message = "Last name should be at least three characters")
    @Column(name="last name")
    private String lastName;
    @NotEmpty(message = "Email is required")
    @Email(message = "Must enter a valid email address")
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
