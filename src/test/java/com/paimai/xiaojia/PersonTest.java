package com.paimai.xiaojia;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jialihan on 17/6/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=JialidemoApplication.class)
public class PersonTest {

    @Autowired
    private PersonRepository personRepository;


    @Test
    public void test() throws Exception {


            personRepository.save(new Person(1, "xiaojia", 23));
            personRepository.save(new Person(2, "jelly", 23));
            personRepository.save(new Person(3, "zihao", 22));

            // 测试findAll, 查询所有记录
            Assert.assertEquals(3, personRepository.findAll().size());
            // 测试findByName, 查询姓名为FFF的User
            Assert.assertEquals(23, personRepository.findByName("xiaojia").getAge());

            // 测试findByNameAndAge, 查询姓名为zihao并且年龄为22的User
            Assert.assertEquals("zihao", personRepository.findByNameAndAge("zihao", 22).getName());

            // 测试删除姓名为Jelly的User
            personRepository.delete(personRepository.findByName("jelly"));

            // 测试findAll, 查询所有记录, 验证上面的删除是否成功
            Assert.assertEquals(2, personRepository.findAll().size());


    }

}
