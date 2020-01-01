package pub.ants.miaosha.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pub.ants.miaosha.entity.UserEntity;

@Mapper
public interface UserMapper {

    UserEntity Sel(int id);
}
