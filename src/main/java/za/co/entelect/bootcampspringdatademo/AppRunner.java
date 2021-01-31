package za.co.entelect.bootcampspringdatademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(ApplicationArguments args) {
        LOGGER.info("These are the classrooms you are looking for:");
        // TODO: Call your fancy new spring repository here
    }
}
