package demo.springbootrestapicrud.repository;

import demo.springbootrestapicrud.model.TestData;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestData,Long> {





}
