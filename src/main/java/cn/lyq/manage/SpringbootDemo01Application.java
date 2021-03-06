package cn.lyq.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lyq.manage.mapper")
public class SpringbootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo01Application.class, args);
	}

}
