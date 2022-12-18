package configuration.jwt;

import entity.Role;
import entity.Status;
import entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class GenerateJwtUser {
    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword(),
                user.getUserStatus().equals(Status.ACTIVE),
                mapToGrantedAuthorities(user.getRole()));
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(Role Role) {
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + Role);
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        grantedAuthorityList.add(grantedAuthority);
        return grantedAuthorityList;
    }
}
