package com.ketanbd.springbootangularfsapp.Dto;


import javax.persistence.*;


// DTO -> contains just data and access modifiers and no logic
// The database table

@Entity
@Table(name = "Users")
public class UserDTO {
    @Id
    @GeneratedValue

    @Column(name = "USER_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIl")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
