package in.nit.dto;

import java.util.Set;


import in.nit.model.Address;
import in.nit.model.Customer;
import in.nit.model.Order;
import in.nit.model.OrderItem;
import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}