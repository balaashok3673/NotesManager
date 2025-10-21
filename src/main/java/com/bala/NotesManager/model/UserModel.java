package com.bala.NotesManager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name="user_name" , nullable = false)
    @Getter
    @Setter
    private String username;

    @Column(name = "user_passWord" , nullable = false)
    @Getter
    @Setter
    private String userpass;

    @Enumerated (EnumType.STRING)
    @Column(nullable = false)
    @Getter
    @Setter
    private  Role role;

   public UserModel(String username , String userpass){
       this.username=username;
       this.userpass=userpass;
   }

    public UserModel(){
        // default constructor
    }

}
