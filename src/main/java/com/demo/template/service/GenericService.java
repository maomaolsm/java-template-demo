package com.demo.template.service;

import com.demo.template.controller.domain.BaseCommonDTO;
import com.demo.template.persistence.GenericRepository;
import com.demo.template.persistence.domain.BaseCommonDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by brook.xi on 12/16/2015.
 */
public abstract class GenericService<DAO extends BaseCommonDAO, DTO extends BaseCommonDTO, U extends GenericRepository<DAO>> {
    @Autowired
    protected U genericRepository;

//    MapperFacade mapper;

    private Class<DTO> dtoClass;
    private Class<DAO> daoClass;

    public GenericService(Class<DTO> dtoClass, Class<DAO> daoClass) {
        this.dtoClass = dtoClass;
        this.daoClass = daoClass;
    }

    public DAO findOne(Long id) {

        return genericRepository.findOne(id);
    }
}
