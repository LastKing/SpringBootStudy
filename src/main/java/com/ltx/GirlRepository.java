package com.ltx;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Rain on 2017/1/4.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    public List<Girl> findByAge(Integer age);
}
