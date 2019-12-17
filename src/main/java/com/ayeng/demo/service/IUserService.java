package com.ayeng.demo.service;

import com.ayeng.demo.dto.UserDTO;
import com.ayeng.demo.entity.User;

/**
 * 用户服务
 * Created by panjintian.
 */
public interface IUserService {
    User findUserByName(String userName);

    ServiceResult<UserDTO> findById(Long userId);

}
