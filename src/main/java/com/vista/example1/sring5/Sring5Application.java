package com.vista.example1.sring5;

import com.vista.example1.sring5.Controller.AuthorController;
import com.vista.example1.sring5.model.FakeDataSource;
import com.vista.example1.sring5.model.FakerJmsDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sring5Application {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(Sring5Application.class, args);
		FakerJmsDataSource fd = (FakerJmsDataSource) ctx.getBean(FakerJmsDataSource.class);
		System.out.println(fd.getUser());
	}

}
