package test.com;

import org.springframework.beans.factory.annotation.Value;

public class HelloService {
    @Value("${test.name}")
    private String name;

    public String sayHello() {

        System.out.println("hello" + name);
        return name;
    }
}
