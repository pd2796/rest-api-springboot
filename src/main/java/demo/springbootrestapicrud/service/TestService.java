package demo.springbootrestapicrud.service;

import demo.springbootrestapicrud.model.TestData;

import java.util.List;

public interface TestService {
public List<TestData> getAllData();

public TestData getByid(Long id);

public void saveOrUpdate(TestData testData);

public void deleteTestdata(Long id);


}
