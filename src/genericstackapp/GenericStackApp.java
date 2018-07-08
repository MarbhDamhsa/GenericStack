package genericstackapp;

import java.util.Scanner;

public class GenericStackApp {

    public static void main(String[] args) {
        GenericStack stack = new GenericStack();
        
        //Scanner sc = new Scanner(System.in);
//        
//        for(;;){
//            
//        }
    String a = "Apples";
    String b = "Bananas";
    String c = "Oranges";
    
    stack.push(a);
    stack.push(b);
    stack.push(c);
    stack.size();
    
    stack.peek();
    stack.size();
    
    stack.pop();
    stack.pop();
    stack.pop();
    
    stack.size();
    
        
    }//main
    
}//GenericStackApp
