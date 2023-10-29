package com.chappota.firstapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    /**
     * @return
     */
    @GetMapping("/getCustomer")
    public String getCustomer() {
        System.out.println("getCustomer()");
        return new String("Hello world!");
    }

    @PostMapping("/register")
    public String registerCustomer(@RequestBody Map<String, Object> customerMap) {
        // String id = (String) customerMap.get("id");
        // String firstName = (String) customerMap.get("firstname");
        // String lastName = (String) customerMap.get("lastname");
        // String address1 = (String) customerMap.get("address1");
        // String address2String = (String) customerMap.get("address2");
        // String city = (String) customerMap.get("city");
        // String state = (String) customerMap.get("state");
        // String zip = (String) customerMap.get("zip");
        // String country = (String) customerMap.get("country");
        return customerMap.toString();
    }

}
