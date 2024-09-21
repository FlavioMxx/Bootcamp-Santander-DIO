package br.edu.flaviomxx.spring_security_jwt_dio.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX = "Bearer";
    public static String KEY = "SECRET_KEY";
    public static Long EXPIRATION = 3600000L;

    public static String getPREFIX() {
        return PREFIX;
    }

    public static void setPREFIX(String PREFIX) {
        SecurityConfig.PREFIX = PREFIX;
    }

    public static String getKEY() {
        return KEY;
    }

    public static void setKEY(String KEY) {
        SecurityConfig.KEY = KEY;
    }

    public static Long getEXPIRATION() {
        return EXPIRATION;
    }

    public static void setEXPIRATION(Long EXPIRATION) {
        SecurityConfig.EXPIRATION = EXPIRATION;
    }
}
