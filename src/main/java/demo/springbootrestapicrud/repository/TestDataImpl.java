package demo.springbootrestapicrud.repository;

import demo.springbootrestapicrud.model.TestData;
import demo.springbootrestapicrud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class TestDataImpl implements TestService {
    @Autowired
    TestRepository repository;


    @Override
    public List<TestData> getAllData() {
        return (List<TestData>) repository.findAll();
    }

    @Override
    public TestData getByid(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(TestData testData) {
        repository.save(testData);
    }

    @Override
    public void deleteTestdata(Long id) {
            repository.deleteById(id);
    }
}
