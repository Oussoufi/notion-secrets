package mr.mayatech.motionsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class MotionSecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotionSecretsApplication.class, args);
	}

}
