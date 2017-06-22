package com.paimai.xiaojia;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jialihan on 17/6/22.
 */

//JpaRepository<T,ID extends Serializable>
// JPA specific extension of Repository.

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);
    Person findByAge(int age);

    Person findByNameAndAge(String name, int age);



}
