package demo.projects.business;

import demo.projects.dto.HelloDto;

import java.util.List;

public interface HelloService {

    void addHello(HelloDto helloDto);

    List<HelloDto> getAllHellos();

    List<HelloDto> getHellosFromTest(Integer test);

    void update(HelloDto helloDto);

}
