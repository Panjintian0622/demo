package com.ayeng.demo.repository;

import java.util.List;

import com.ayeng.demo.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by panjintian.
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long>{
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
