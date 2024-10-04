package com.nt.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.OrderDetailsEntity;

public interface OrderRepo extends JpaRepository<OrderDetailsEntity, Integer> {

}
