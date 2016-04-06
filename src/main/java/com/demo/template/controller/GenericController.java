package com.demo.template.controller;

import com.demo.template.controller.domain.BaseCommonDTO;
import com.demo.template.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maomao on 16/4/5.
 */
@SuppressWarnings("unchecked")
public abstract class GenericController<DTO extends BaseCommonDTO, U extends GenericService> {

    @Autowired
    protected U service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DTO findById(@PathVariable Long id) {
        return (DTO) service.findOne(id);
    }
}
