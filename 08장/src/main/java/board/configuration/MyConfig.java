package board.configuration;

import board.board.entity.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    public Bar getBar() {
        System.out.println("이 함수도 호출 되는가?");
        return new Bar();
    }

    @Override
    public String toString() {
        return "MyConfig{" +
                "name='" + name + '\'' +
                '}';
    }
}
