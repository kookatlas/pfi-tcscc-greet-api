package in.koost.pfi_tcscc_greet_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PfiTcsccGreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfiTcsccGreetApiApplication.class, args);
	}

}
