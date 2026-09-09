package com.shopsphere.model;
import jakarta.persistence.*;
import java.time.Instant;
@Entity @Table(name="users") public class User { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @Column(nullable=false) public String name; @Column(nullable=false,unique=true) public String email; public String phone; @Column(nullable=false) public String passwordHash; public Instant createdAt=Instant.now(); }
