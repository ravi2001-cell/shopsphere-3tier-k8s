package com.shopsphere.model;
import jakarta.persistence.*; import java.time.Instant; import java.util.*;
@Entity @Table(name="orders") public class Order { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @ManyToOne(optional=false) public User user; public double totalAmount; public String status="PLACED"; public Instant createdAt=Instant.now(); @ElementCollection @CollectionTable(name="order_items",joinColumns=@JoinColumn(name="order_id")) public List<OrderItem> items=new ArrayList<>(); }
