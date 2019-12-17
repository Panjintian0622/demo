package com.ayeng.demo.repository;

import java.util.List;

import com.ayeng.demo.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by panjintian.
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
