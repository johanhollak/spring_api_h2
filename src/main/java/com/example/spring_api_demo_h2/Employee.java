package com.example.spring_api_demo_h2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  public Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }

  public Employee() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (!(obj instanceof Employee))
      return false;

    Employee e = (Employee) obj;
    return Objects.equals(this.name, e.name) &&
        Objects.equals(this.id, e.id) &&
        Objects.equals(this.role, e.role);

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", role='" + role + '\'' +
        '}';
  }
}
