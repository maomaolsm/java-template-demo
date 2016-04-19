package com.demo.template.persistence;

import com.demo.template.persistence.domain.PersonDAO;

/**
 * Created by maomao on 16/4/1.
 * If you have special query, need to use the excuse, or directly use JpaRepository.
 */
public interface PersonRepository extends GenericRepository<PersonDAO> {

}
