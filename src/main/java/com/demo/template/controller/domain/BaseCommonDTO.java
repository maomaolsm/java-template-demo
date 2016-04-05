package com.demo.template.controller.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;

/**
 * Created by maomao on 16/3/27.
 */
@Data
@MappedSuperclass
public abstract class BaseCommonDTO {
    private Long id;
    private String name;
}
