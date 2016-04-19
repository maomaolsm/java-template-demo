package com.demo.template.service;

import com.demo.template.controller.domain.BaseCommonDTO;
import com.demo.template.persistence.GenericRepository;
import com.demo.template.persistence.domain.BaseCommonDAO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maomao on 12/16/2015.
 */
public abstract class GenericService<DAO extends BaseCommonDAO, DTO extends BaseCommonDTO, U extends GenericRepository<DAO>> {
    @Autowired
    protected U genericRepository;

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private Class<DTO> dtoClass;
    private Class<DAO> daoClass;

    public GenericService(Class<DTO> dtoClass, Class<DAO> daoClass) {
        this.dtoClass = dtoClass;
        this.daoClass = daoClass;
    }

    public DTO findOne(Long id) {
        DAO dao = genericRepository.findOne(id);
        DTO dto = mapperFactory.getMapperFacade().map(dao, dtoClass);
        return dto;
    }
}
