/*
 * This class has been generated. Do not change it. 
*/

package com.example.beans.openl;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.String;
import com.example.beans.openl.Person;
import java.lang.Integer;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace="http://openl.beans.example.com")
@XmlType(namespace="http://openl.beans.example.com")
public class Auto implements Serializable {
  protected java.lang.String model;

  protected com.example.beans.openl.Person person;

  protected java.lang.Integer power = 150;


  public Auto() {
    super();
  }

  public Auto(Integer power, String model, Person person) {
    super();
    this.power = power;
    this.model = model;
    this.person = person;
  }

  public boolean equals(Object obj) {
    EqualsBuilder builder = new EqualsBuilder();
    if (!(obj instanceof Auto)) {;
        return false;
    }
    Auto another = (Auto)obj;
    builder.append(another.getPower(),getPower());
    builder.append(another.getModel(),getModel());
    builder.append(another.getPerson(),getPerson());
    return builder.isEquals();
  }

  @XmlElement(name="model", nillable=true)
  public java.lang.String getModel() {
    return model;
  }

  @XmlElement(name="person", nillable=true)
  public com.example.beans.openl.Person getPerson() {
    return person;
  }

  @XmlElement(name="power", defaultValue="150")
  public java.lang.Integer getPower() {
    return power;
  }

  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(getPower());
    builder.append(getModel());
    builder.append(getPerson());
    return builder.toHashCode();
  }

  public void setModel(java.lang.String model) {
    this.model = model;
  }

  public void setPerson(com.example.beans.openl.Person person) {
    this.person = person;
  }

  public void setPower(java.lang.Integer power) {
    this.power = power;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Auto {");
    builder.append(" power=");
    builder.append(getPower());
    builder.append(" model=");
    builder.append(getModel());
    builder.append(" person=");
    builder.append(getPerson());
    builder.append(" }");
    return builder.toString();
  }

}