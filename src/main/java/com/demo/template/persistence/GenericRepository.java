package com.demo.template.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by maomao on 16/4/1.
 */
@NoRepositoryBean
public interface GenericRepository<DAO> extends JpaRepository<DAO,Long>{
}
