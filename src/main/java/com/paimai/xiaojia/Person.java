package com.paimai.xiaojia;



import javax.persistence.*;

/**
 * Created by jialihan on 17/6/22.
 */

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue
    private long  id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    //constructor
    public Person ()
    {
        this.id = 1;

    }
    public Person (long id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getter  &  setter
    public long getId()
    {
        return this.id;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name =name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }





}

