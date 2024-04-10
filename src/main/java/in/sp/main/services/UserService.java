package in.sp.main.services;

import in.sp.main.payloads.UserDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user,Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteByUser(Integer userId);
}
