package com.demo.template.persistence.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Created by maomao on 16/4/1.
 */
@Data
@Entity(name = "person")
@EqualsAndHashCode(callSuper = true)
public class PersonDAO extends BaseCommonDAO {
}
