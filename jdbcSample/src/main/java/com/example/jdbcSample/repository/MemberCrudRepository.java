package com.example.jdbcSample.repository;

import com.example.jdbcSample.entity.Member;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.CrudRepository;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
