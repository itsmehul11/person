package com.example.tasks;

import com.example.models.Person;
import org.platformlambda.core.annotations.PreLoad;
import org.platformlambda.core.models.LambdaFunction;
import org.platformlambda.core.models.TypedLambdaFunction;

import java.util.Map;

@PreLoad(route = "person.pojo", instances = 100, isPrivate = false)
public class GetPerson implements TypedLambdaFunction<Map<String, Object>, Person> {
    @Override
    public Person handleEvent(Map<String, String> headers, Map<String, Object> input, int instance) throws Exception {
        Person person = new Person();
        person.setId(1234);
        person.setName("Amey");
        person.setAddress("123 Address");
        System.out.println(person.toString());
        return person;
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
