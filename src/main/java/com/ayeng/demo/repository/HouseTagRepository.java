package com.ayeng.demo.repository;

import java.util.List;

import com.ayeng.demo.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by panjintian.
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
