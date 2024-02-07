package sprproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //스프링이 자동으로 자신이 포함한 패지키 하위 클래스를 다 스캔
public class SprApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprApplication.class, args);
	}

}
