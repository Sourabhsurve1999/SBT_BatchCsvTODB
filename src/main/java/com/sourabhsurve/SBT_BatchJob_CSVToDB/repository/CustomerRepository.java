package com.sourabhsurve.SBT_BatchJob_CSVToDB.repository;

import com.sourabhsurve.SBT_BatchJob_CSVToDB.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
