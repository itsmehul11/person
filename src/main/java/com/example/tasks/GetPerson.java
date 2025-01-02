package com.example.tasks;

import com.common.Person;
import org.platformlambda.core.annotations.PreLoad;
import org.platformlambda.core.models.TypedLambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@PreLoad(route = "person.pojo", instances = 100, isPrivate = false)
public class GetPerson implements TypedLambdaFunction<Map<String,Object>, List<Person>> {
    @Override
    public List<Person> handleEvent(Map<String, String> headers,Map<String,Object> input, int instance) throws Exception {

        Person person = new Person();
        Person p1 = new Person();
        person.setId(1234);
        person.setName("Amey");
        person.setAddress("123 Address");

        p1.setId(567);
        p1.setName("Abhay");
        p1.setAddress("567 Address");

        System.out.println(person.toString());

        return Arrays.asList(person,p1);
    }


//    @Override
//    public Object handleEvent(Map<String, String> headers, Object input, int instance) throws Exception {
//        Person person = new Person();
//        person.setId(1234);
//        person.setName("Amey");
//        person.setAddress("123 Address");
//        System.out.println(person.toString());
//        return person;
//    }
}
