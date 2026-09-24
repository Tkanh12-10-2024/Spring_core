package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class CalculationApplication {
    public static void main (String[] args) {
        SpringApplication.run(CalculationApplication.class, args);
    }
        @Bean
        public ApplicationRunner calculationRunner(Calculator calculator) {
            return args -> {
                calculator.calculator(137, 21, '+');
                calculator.calculator(137, 21, '*');
                calculator.calculator(137, 21, '-');
            };
        }
    }
