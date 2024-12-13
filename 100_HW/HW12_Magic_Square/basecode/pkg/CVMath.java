package pkg;

package pkg;

public class CVMath {        
    public static int findMid(int one, int two, int three);
    {
        return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
    }
    
    public static boolean perfectSquare(int input){
        
        int num = (int)Math.sqrt(input);
        
        if(num*num==input){
            return true;
        }
        
        return false;
        
    }
    
    public static boolean consecutiveNumber(int input){
        
        int sum = 0;
        
        for(int i = 1; sum<input; i++){
            
            sum=sum+i;
            
            if(sum==input){
                return true;
            }
            
        }
        
        return false;
        
    }
    
    public static void specialSquare(int input){
        
        int count = 0;
        
        for(int i = 1; count<input; i++){
            if(perfectSquare(i)==true && consecutiveNumber(i)==true){
                System.out.println(i);
                count++;
            }
        }
        
    }
    
}