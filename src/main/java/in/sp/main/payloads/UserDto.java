package in.sp.main.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;


    @NotEmpty
    @Size(min=4,message = "User must be min 4 character")
    private String name;

    @Email(message = "Email is not valid")
    private String email;

    @NotEmpty
    @Size(min = 3,max = 10,message = "Password must be min of 3 max of 10 !!")
    private String password;

    @NotEmpty
    private String about;

}
