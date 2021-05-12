package com.SpringExpression.SpringExpressionLang;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class App 
{
    public static void main( String[] args )
    {
        
    	ExpressionParser expressionParser = new SpelExpressionParser();

        Expression expression = expressionParser.parseExpression("'Hello'");
        String strVal = expression.getValue(String.class);
        System.out.println("Spring Expression Language SPEL" + strVal);
    	  

    	//System.out.println( "Hello World!" );
    }
}
