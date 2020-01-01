package pub.ants.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.ants.miaosha.entity.UserEntity;
import pub.ants.miaosha.mapper.UserMapper;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/1 下午12:02
 * @description: No Description
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserEntity Sel(int id) {
        return userMapper.Sel(id);
    }
}
