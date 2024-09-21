package br.edu.flaviomxx.spring_security_jwt_dio.security;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class JWTObject {
    private String subject;
    private Date issuedAt;     // Criação do token
    private Date expiration;   // Expiração do tokem
    private List<String> roles;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
