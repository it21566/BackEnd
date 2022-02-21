package gr.hua.dit.MyApplication;

import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.RouteData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.List;
@EnableAsync
@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);

	}

}
