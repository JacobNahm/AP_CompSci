/* 
    Lecture note example - Output, bash
*/

class LectureOutput{
    public static void main(String args[]) {
   
    printAnimal();
    
    greeting("Matthew");
    greeting("Amberdingus");
    greeting("Taqqurias#");
    
    double newSalary = raise(100000.62, 3);
    System.out.print(newSalary);
    
    newSalary = raise(newSalary, 6); 
    newSalary = raise(newSalary, 6); 
    newSalary = raise(newSalary, 6); 
    newSalary = raise(newSalary, 6); 
    } 
    
    public static double raise(double salary, int percent){
       double amount = salary + (salary * (percent/100.0));
       return amount;
    }
    
    public static void greeting(String name){
        System.out.println("Hello " + name);
    }

    public static void printAnimal(){
    System.out.println(" /\\/\\ ");
    System.out.println("((ovo))");
    System.out.println("():::()");
    System.out.println("  VVV  ");
    }
    
}