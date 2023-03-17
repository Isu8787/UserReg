package outdoor_cooking.user.backend.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import outdoor_cooking.user.backend.userDto.UserDTO;
import outdoor_cooking.user.backend.userService.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO){

        String id = userService.addUser(userDTO);
        return id;
    }
}
