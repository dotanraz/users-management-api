package com.app.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private String postgresPath;
    private String postgresUser;
    private String postgresPassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getPostgresPath() {
        return postgresPath;
    }

    public void setPostgresPath(String postgresPath) {
        this.postgresPath = postgresPath;
    }

    public String getPostgresUser() {
        return postgresUser;
    }

    public void setPostgresUser(String postgresUser) {
        this.postgresUser = postgresUser;
    }

    public String getPostgresPassword() {
        return postgresPassword;
    }

    public void setPostgresPassword(String postgresPassword) {
        this.postgresPassword = postgresPassword;
    }
}