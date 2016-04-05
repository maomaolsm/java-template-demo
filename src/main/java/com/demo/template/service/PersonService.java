package com.demo.template.service;

import com.demo.template.controller.domain.PersonDTO;
import com.demo.template.persistence.PersonRepository;
import com.demo.template.persistence.domain.PersonDAO;
import org.springframework.stereotype.Service;

/**
 * Created by maomao on 16/3/22.
 */
@Service
public class PersonService extends GenericService<PersonDAO, PersonDTO, PersonRepository> {

    public PersonService() {
        super(PersonDTO.class, PersonDAO.class);
    }

}

