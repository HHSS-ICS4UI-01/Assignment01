/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class Methods {
    
    public double cicleArea(double radius) {
        double answer = Math.PI * radius * radius;
        return answer;
    }
    
    public int fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n - 1);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Methods test = new Methods();
        double area = test.cicleArea(3);
        System.out.println("Area: " + area);
        System.out.println(test.fact(5));
        
        
    }
}
