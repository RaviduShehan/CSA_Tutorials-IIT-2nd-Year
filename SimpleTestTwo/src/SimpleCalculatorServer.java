/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected(){
        System.out.println("[Server] - Connection is being tested....");
        return true;
    }
    
    public int addIntegerNumbers(int a, int b){
        System.out.println("[Server] - Adding " +a+ " and " +b+ "...");
        return a+b;
    }
    public int divideIntegerNumbers(int a, int b) throws SimpleCalculatorServerException  {
        
        if(b==0){
            throw new SimpleCalculatorServerException("Cannot divide a number to Zero");
        }else {
            if((a==0)&&(b==0)){
                throw new SimpleCalculatorServerException("Zero divided by zero is undertermined");
            }
        }
        
        
        
        System.out.println(" [Server] - Dividing " +a+ " and " +b +"...");
        
        return a/b;
    }
    
     public int SubtractIntegerNumbers(int a, int b)
    {
        return a-b;
    }
    
     public int multiplyIntegerNumbers(int a, int b)
    {
        return a*b;
}
}
