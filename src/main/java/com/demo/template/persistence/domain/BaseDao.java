package com.demo.template.persistence.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by maomao on 16/4/1.
 */
@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseDao {
    @Id
    @GeneratedValue
    private Long id;
}
