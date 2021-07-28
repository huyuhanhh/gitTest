package life.majiang.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("life.majiang.community.mapper")
@EnableScheduling
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
		System.out.print("fail");
        System.out.print("sussgess");
		System.out.print("sussgess01-demo");
		System.out.print("sussgess02-demo");
		System.out.print("sussgess03-demo");
		System.out.print("sussgess04-demo");
		System.out.print("sussgess05-demo");
    }

}
