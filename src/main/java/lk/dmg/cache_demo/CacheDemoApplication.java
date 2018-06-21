package lk.dmg.cache_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "lk.dmg")
@ComponentScan(basePackages = "lk.dmg")
@EnableCaching
public class CacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheDemoApplication.class, args);
    }
}
