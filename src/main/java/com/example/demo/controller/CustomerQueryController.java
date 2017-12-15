package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerQueryController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/query")
    public ModelAndView loadCustomerQuery(@RequestParam(value = "page",defaultValue = "1")int page, @RequestParam(value = "size",defaultValue = "3") int size, Map<String,Object> map){
        PageRequest request = new PageRequest(page-1,size);
        Page<Customer> customerPage = customerService.getCustomersByCardType("身份证",request);
        map.put("customerPage",customerPage);
        map.put("currentPage",page);
        map.put("size",size);
        return new ModelAndView("query",map);
    }
}
