package com.demo.template;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;

@SpringBootApplication
public class JavaTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTemplateApplication.class, args);
    }

    @Bean(name = "org.h2.tools.Server", initMethod = "start", destroyMethod = "stop")
    @Profile("default")
    public Server h2TcpServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9999");
    }
}
