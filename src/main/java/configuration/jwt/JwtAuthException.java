package configuration.jwt;

import javax.naming.AuthenticationException;

public class JwtAuthException  extends AuthenticationException {
    public JwtAuthException(String msg) {
        super(msg);
    }
}
