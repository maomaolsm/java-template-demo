package com.demo.template.controller;

import com.demo.template.persistence.domain.PersonDAO;
import com.demo.template.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maomao on 16/4/1.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PersonDAO findById(@PathVariable Long id) {
        return personService.findOne(id);
    }
}
