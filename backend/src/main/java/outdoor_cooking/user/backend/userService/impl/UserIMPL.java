package outdoor_cooking.user.backend.userService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import outdoor_cooking.user.backend.userDto.UserDTO;
import outdoor_cooking.user.backend.userEntity.User;
import outdoor_cooking.user.backend.userRepo.UserRepo;
import outdoor_cooking.user.backend.userService.UserService;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(

            userDTO.getUserid(),
            userDTO.getUsername(),
            userDTO.getEmail(),
            userDTO.getPassword(),
            userDTO.getMobile()
        );

        userRepo.save(user);


        return user.getUsername();
    }
}
