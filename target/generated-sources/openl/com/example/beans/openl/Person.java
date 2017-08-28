/*
 * This class has been generated. Do not change it. 
*/

package com.example.beans.openl;

import java.util.Date;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import com.example.beans.Address;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.Integer;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace="http://openl.beans.example.com")
@XmlType(namespace="http://openl.beans.example.com")
public class Person implements Serializable {
  protected com.example.beans.Address address = new com.example.beans.Address();

  protected java.lang.Integer age = 18;

  protected java.util.Date birthDay;


  public Person() {
    super();
  }

  public Person(Integer age, Date birthDay, Address address) {
    super();
    this.age = age;
    this.birthDay = birthDay;
    this.address = address;
  }

  public boolean equals(Object obj) {
    EqualsBuilder builder = new EqualsBuilder();
    if (!(obj instanceof Person)) {;
        return false;
    }
    Person another = (Person)obj;
    builder.append(another.getAge(),getAge());
    builder.append(another.getBirthDay(),getBirthDay());
    builder.append(another.getAddress(),getAddress());
    return builder.isEquals();
  }

  @XmlElement(name="address", nillable=false)
  public com.example.beans.Address getAddress() {
    return address;
  }

  @XmlElement(name="age", defaultValue="18")
  public java.lang.Integer getAge() {
    return age;
  }

  @XmlElement(name="birthDay", nillable=true)
  public java.util.Date getBirthDay() {
    return birthDay;
  }

  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getAge());
    builder.append(getBirthDay());
    builder.append(getAddress());
    return builder.toHashCode();
  }

  public void setAddress(com.example.beans.Address address) {
    this.address = address;
  }

  public void setAge(java.lang.Integer age) {
    this.age = age;
  }

  public void setBirthDay(java.util.Date birthDay) {
    this.birthDay = birthDay;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Person {");
    builder.append(" age=");
    builder.append(getAge());
    builder.append(" birthDay=");
    builder.append(getBirthDay());
    builder.append(" address=");
    builder.append(getAddress());
    builder.append(" }");
    return builder.toString();
  }

}