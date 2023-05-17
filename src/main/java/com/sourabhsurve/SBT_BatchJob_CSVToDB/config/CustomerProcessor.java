package com.sourabhsurve.SBT_BatchJob_CSVToDB.config;

import com.sourabhsurve.SBT_BatchJob_CSVToDB.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
