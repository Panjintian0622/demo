package com.ayeng.demo.repository;

import java.util.List;

import com.ayeng.demo.entity.Subway;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by panjintian.
 */
public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
