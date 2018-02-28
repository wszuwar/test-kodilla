package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Piekny text",(text) -> text.toUpperCase());
        poemBeautifier.beautify("Wspaniale",(text -> new StringBuilder("ABC ").append(text.concat(" ABC")).toString()));
        poemBeautifier.beautify("Jestes Boski",(text -> text.replace('e','3').replace('o','0').replace('a','@')));
        poemBeautifier.beautify("Browar",(text -> new  StringBuilder(text).reverse().toString()));






    }
}
