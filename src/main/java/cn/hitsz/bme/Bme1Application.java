package cn.hitsz.bme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan({"cn.hitsz.bme.mapper","cn.hitsz.bme.service","cn.hitsz.bme.control","cn.hitsz.bme.servicr.impl"})
public class Bme1Application {

	// 项目入口
	public static void main(String[] args) {
		SpringApplication.run(Bme1Application.class, args);
	}
}
