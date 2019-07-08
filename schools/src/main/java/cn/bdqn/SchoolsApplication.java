package cn.bdqn;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.bdqn.dao")
public class SchoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolsApplication.class, args);
    }

}
