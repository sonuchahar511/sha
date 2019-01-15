package com.chahar.sha.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
@XmlAccessorType(XmlAccessType.NONE)
public class Student
{
    @XmlAttribute
    private int id;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private int age;
    public Student()
    {
        super();
    }
    public Student(int id, String name, int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}