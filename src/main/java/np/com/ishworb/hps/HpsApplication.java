package np.com.ishworb.hps;

import np.com.ishworb.hps.model.AuditorAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class HpsApplication {
@Bean
public AuditorAware auditorAware(){
	return new AuditorAwareImpl();
}
	public static void main(String[] args) {
		SpringApplication.run(HpsApplication.class, args);
	}

}
