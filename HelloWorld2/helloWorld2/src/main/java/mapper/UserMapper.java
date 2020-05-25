package mapper;


import org.mapstruct.MapperConfig;
import org.mapstruct.factory.Mappers;

import entity.UserEntity;
import model.User;

@MapperConfig
public interface UserMapper {
	UserMapper INSTANCE=Mappers.getMapper(UserMapper.class);	
	UserEntity usertoUserEntity(User user);
	User userEntitytoUser(UserEntity userEntity);
	
}
