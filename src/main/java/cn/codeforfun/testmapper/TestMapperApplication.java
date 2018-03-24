package cn.codeforfun.testmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangbin
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.codeforfun.**.mapper")
public class TestMapperApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestMapperApplication.class, args);
  }
}
