package be.stijnhooft.portal.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PortalPortfolio {

    public static void main(String[] args) {
        SpringApplication.run(PortalPortfolio.class, args);
    }

}
