package com.ayeng.demo.repository;

import java.util.List;

import com.ayeng.demo.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by panjintian.
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}
