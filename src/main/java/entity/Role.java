package entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    ENGINEER,
    AUDITOR;

    @Override
    public String getAuthority() {
        return null;
    }
}
