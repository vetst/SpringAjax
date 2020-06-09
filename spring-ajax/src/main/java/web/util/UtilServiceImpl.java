package web.util;

import org.springframework.stereotype.Component;
import web.model.Role;
import web.service.UserService;

import java.util.HashSet;
import java.util.Set;

@Component
public class UtilServiceImpl implements UtilService {

    @Override
    public Set<Role> getRoleForUser(String role) {
        Set<Role> roles = new HashSet<>();
        try {
            String[] splitRoles = role.split(",");
            roles.add(new Role(splitRoles[1]));
            roles.add(new Role(splitRoles[0]));
            return roles;
        } catch (Exception e) {

        }
        roles.add(new Role(role));
        return roles;
    }
}
