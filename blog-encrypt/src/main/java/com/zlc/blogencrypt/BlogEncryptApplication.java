package com.zlc.blogencrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableDiscoveryClient
public class BlogEncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogEncryptApplication.class, args);
//        System.out.println(Integer.toBinaryString(20));//二进制
//        Integer.valueOf("40");
//        Integer a=40;
//        a.intValue();
//        LinkedHashSet<Integer> integers = new LinkedHashSet<>();

        ArrayList<Integer> list = new ArrayList<>();
        int[] array={1,3,4,6,3,5};
        Arrays.stream(array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
//                value*10;
                System.out.println(value * 10);
            }
        });
//        Collectors.toList()



    }



}
