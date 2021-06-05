package com.example.onlyreciver.controller;

import com.example.onlyreciver.model.TestObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    int count;

    ArrayList<ArrayList<TestObject>> arrayList = new ArrayList<>();

    @RequestMapping(value = "/hello/{myparam}")
    public void rrt(@PathVariable String myparam) {


        arrayList.add(new ArrayList<>());
        System.out.println("777!!!777 : " + myparam);
    }

    @RequestMapping(value = "/test-init")
    public void rrtInit() {
        arrayList.add(new ArrayList<>());
    }

    @RequestMapping(value = "/test")
    public void rrt2() {

        count++;

        arrayList.get(0).add(new TestObject("Имя объекта : " + count));

        System.out.println("После добавления длинна массива " + arrayList.get(0).size());

        ArrayList<TestObject> arrayList2 = (ArrayList<TestObject>) arrayList.get(0).clone();

        System.out.println("После клонирования длинна массива " + arrayList2.size());

        if (arrayList2.size() > 4) {
            arrayList2.remove(arrayList2.remove(0));
            System.out.println("Было удаление " + arrayList2.size());
        }

        System.out.println(arrayList.get(0).size());
        System.out.println(arrayList2.size());

    }

    @RequestMapping(value = "/hi")
    public String rrtHi() {
        count++;
        return "Hello World !!! " + count;
    }

}
