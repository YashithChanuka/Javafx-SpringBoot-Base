package demo.projects.business.businessImpl;


import demo.projects.business.HelloService;
import demo.projects.dto.HelloDto;
import demo.projects.entity.Hello;
import demo.projects.repo.HelloRepo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HelloServiceImpl implements HelloService, InitializingBean {

    @Autowired
    private HelloRepo helloRepo;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void addHello(HelloDto helloDto) {
        Hello hello = new Hello();
        hello.setDataFromHelloDto(helloDto);
        helloRepo.save(hello);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<HelloDto> getAllHellos() {
        return helloRepo.findAllBy().stream().map(Hello::getHelloDto).collect(Collectors.toList());
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<HelloDto> getHellosFromTest(Integer test) {
        return helloRepo.findByTest(test).stream().map(Hello::getHelloDto).collect(Collectors.toList());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void update(HelloDto helloDto) {
        Hello hello=helloRepo.findByHelloID(helloDto.getHelloID());
        hello.setTest(helloDto.getTest());
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hellp");
    }
}
