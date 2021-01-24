package test.lombok.example;

import test.lombok.example.school.School;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
//        School school = new School(); // NoArgsConstructor
//        school.setId(1);
//        school.setName("ㅎㅇ");
//        school.setPwd("ㅂㅇ");
//        System.out.println(school);

//        List<Integer> arr = new ArrayList<Integer>();
//        arr.add(1);
//        School school = School.builder()
//                .id(1)
//                .name("ㅎㅇ")
//                .pwd("123")
//                .build();
//
//        System.out.println(school);

        get( new School(0, "name", "123", Arrays.asList(1, 2, 3))); // AllArgsConstructor
//        System.out.println("school = " + school2);
//
//        if(school2.getId() == null || school2.getId() == 0) {
//            throw new RuntimeException("숫자가 입력되지 않았습니다");
//        }
    }

    public static School get(@Valid School school){
        return school;
    }
}
