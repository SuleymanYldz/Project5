package code.Practice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class javaFaker2 {


    @Test
    public void TC1(){

        Faker faker=new Faker();

        System.out.println("name : "+ faker.name().fullName());
        System.out.println("first name : "+ faker.name().firstName());
        System.out.println("address "+ faker.address());
        System.out.println(faker.animal().name());
        System.out.println(faker.friends().character());
    }
}
