package com.example.transactionmanagment;

import com.example.transactionmanagment.config.DataJpaConfig;
import com.example.transactionmanagment.config.ServiceConfig;
import com.example.transactionmanagment.entities.Singer;
import com.example.transactionmanagment.service.SingerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TxAnnotationDemo {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class, DataJpaConfig.class);
        SingerService singerService = ctx.getBean(SingerService.class);

        var singers = singerService.findAll();

        for (Singer singer:singers){
            System.out.println(singer.getFirstName()+" "+singer.getLastName());
        }
        ctx.close();
    }
}
