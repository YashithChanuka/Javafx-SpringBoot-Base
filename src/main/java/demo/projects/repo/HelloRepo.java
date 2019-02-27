package demo.projects.repo;

import demo.projects.entity.Hello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloRepo extends CrudRepository<Hello, Integer> {

    List<Hello> findAllBy();

    Hello findByHelloID(Integer helloID);

    List<Hello> findByTest(Integer test);

    @Query(value = "select p from Hello p where p.test=?1")
    Hello retrieveFromTestID(Integer test);
}
