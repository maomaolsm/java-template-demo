package com.demo.template.controller;

import com.demo.template.controller.domain.PersonDTO;
import com.demo.template.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maomao on 16/4/1.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController extends GenericController<PersonDTO, PersonService> {
}
