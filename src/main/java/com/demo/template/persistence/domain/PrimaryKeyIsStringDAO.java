package com.demo.template.persistence.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by maomao on 16/4/18.
 */
@Entity(name = "primary_key_is_string")
@Data
public class PrimaryKeyIsStringDAO {
    @Id
    private String id;
}
