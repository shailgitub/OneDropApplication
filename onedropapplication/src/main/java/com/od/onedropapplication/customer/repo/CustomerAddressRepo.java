

package com.od.onedropapplication.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.onedropapplication.customer.entity.CustomerAddress;

public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, Integer> {

}
