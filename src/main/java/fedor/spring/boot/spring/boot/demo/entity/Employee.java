package fedor.spring.boot.spring.boot.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
//@Table(name = "employees")
public class Employee {
    @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Column(name = "id")
 private String id;
//  @Column(name = "name")
  private String name;
//   @Column(name = "email")

  private String email;


    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
