package javaStreamsAndSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {

    public void regular(){
        List<String> list = new ArrayList<>(Arrays.asList("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh"));
        int count = 0;
        for(String s : list){
            if(s.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);
    }


    public void streamFilter(){
        List<String> list = new ArrayList<>(Arrays.asList("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh"));
        System.out.println(list.stream().filter(s -> s.startsWith("A")).count());

        long d = Stream.of("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh").filter(s-> {

            return s.startsWith("A");
        }).count();
        System.out.println(d);
    }


    public void streamMap(){
        Stream.of("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh").filter(s -> s.endsWith("h"))
                .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));


        List<String> arr = Arrays.asList("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh");

        //print names which have first letter as 'a' with uppercase and sorted
        arr.stream().map(s-> s.toLowerCase()).filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).sorted()
                .forEach(s -> System.out.println(s));

        //Merging 2 different list
        List<String> nums = Arrays.asList("Khyati","Raj", "Pratham");

        Stream<String> stream = Stream.concat(arr.stream(), nums.stream());
        // stream.sorted().forEach(s -> System.out.println(s)); streams once modified are always modified

        Assert.assertTrue(stream.anyMatch(s -> s.equalsIgnoreCase("fnavnEEt")),
                "The name is not present");

    }

    @Test
    public void streamCollect(){
        List<String> list = Stream.of("Adarsh", "Navneet", "Takshay", "Aditya", "Aashutosh").filter(s -> s.endsWith("h"))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list.get(0));

        List<Integer> value = Arrays.asList(1, 2, 4,3,2 ,4,21, 13);
        //print unique number from this array
        value.stream().distinct().sorted().forEach(s -> System.out.println(s));


    }





}
