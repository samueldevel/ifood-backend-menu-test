package samueldev.challenges.ifoodchallenge.menus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"samueldev.challenges.ifoodchallenge.core.domain"})
@EnableJpaRepositories({"samueldev.challenges.ifoodchallenge.core.repository"})
public class MenusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenusApplication.class, args);

    }

}
