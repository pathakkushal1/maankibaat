package in.maankibaat.maankibaat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@EnableFeignClients
@SpringBootApplication
public class MaankibaatApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MaankibaatApplication.class, args);

	}

}
