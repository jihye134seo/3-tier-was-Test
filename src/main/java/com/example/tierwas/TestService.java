package com.example.tierwas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @Autowired
    Test2Repository rp;

    public String test() {

        return rp.test();
    }
}
