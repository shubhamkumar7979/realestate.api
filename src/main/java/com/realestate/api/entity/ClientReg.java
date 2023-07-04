package com.realestate.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientReg")
public class ClientReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="client_id")
    private long clientId;

    @Column(unique = true)
    private String clientName;
    private String clientAddress;

    @Column(unique = true)
    private long phoneNumber;

    @Column(unique = true)
    private String email;
    private String gender;

    @Column(unique = true)
    private String userName;
    private String password;
}
