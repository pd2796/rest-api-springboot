package demo.springbootrestapicrud.controller;


import demo.springbootrestapicrud.model.TestData;
import demo.springbootrestapicrud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class TestController {

@Autowired
    TestService service;

@PostMapping("/save")
    public TestData save(@RequestBody TestData testData){
    service.saveOrUpdate(testData);
    return testData;


}
@GetMapping("/list")
    public List<TestData> list(){
    return service.getAllData();
}

@GetMapping("/list/{id}")
public TestData getbyID(@PathVariable long id){
    return service.getByid(id);

}
@DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable long id){
     service.deleteTestdata(id);
     return "Deleted Success id ="+id;
}

}
