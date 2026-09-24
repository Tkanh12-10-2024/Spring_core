package com.example.demo.opearation;
import com.example.demo.Operation;
import org.springframework.stereotype.Component;


@Component
public class Addition implements Operation {
    @Override
        public int apply(int lhs,int rhs) {
                return lhs + rhs;
    }
        public boolean handles(char op) {
        return '+' == op;
    }
}