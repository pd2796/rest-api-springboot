package demo.springbootrestapicrud.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="testdata")
public class TestData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name="id")
    private String id;
    @Column(name="title")
    private String title;
    @Column(name="address")
    private String address;

    public TestData(){

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "userId=" + userId +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
