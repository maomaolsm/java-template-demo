package com.demo.template.persistence;

import com.demo.template.persistence.domain.PrimaryKeyIsStringDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maomao on 16/4/18.
 */
public interface PrimaryKeyIsStringRepository extends JpaRepository<PrimaryKeyIsStringDAO, String> {
}
