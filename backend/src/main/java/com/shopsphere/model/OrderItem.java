package com.shopsphere.model;
import jakarta.persistence.Embeddable;
@Embeddable public class OrderItem { public Long productId; public String productName; public int quantity; public double price; public OrderItem(){} public OrderItem(Long id,String n,int q,double p){productId=id;productName=n;quantity=q;price=p;} }
