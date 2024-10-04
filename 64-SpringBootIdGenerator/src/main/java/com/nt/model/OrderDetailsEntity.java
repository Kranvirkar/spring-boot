package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order_Entity")
public class OrderDetailsEntity {
	
	@Id
	@Column(name = "order_id")
	@GenericGenerator(name = "order_id_gen",
			strategy = "com.nt.generator.Mygenerator")
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;

	private String orderBy;
	
//	public String getOrderId() {
//		return this.orderId.toString();
//	}
	
//	public void setOrderId() {
//		this.orderId=1l;
//	}
	
}
