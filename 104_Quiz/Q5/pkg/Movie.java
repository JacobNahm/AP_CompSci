package pkg;

public class Movie{
    
private String name;
private double rating;
private int numRating;
private int revenue;

public Movie(){
    name = "Avengers";
    rating = 8.0;
    numRating = 33;
    revenue = 623357910;
}

public Movie(String name, double rating, int numRating, int revenue){
this.name = name;
this.rating = rating; 
this.numRating = numRating;
this.revenue = revenue; 
    }
    
public void movieToString(){
    System.out.println("Movie name; " + name);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Rating: " + numRating);
    System.out.println("Revenue: " + revenue);
}

public String getMovieName(){
    return name;
}
public int getRevenue(){
    return revenue;
}
double x = 0.0;



public void addRating(double a){
    a= x;
    numRating = numRating + 1;
    rating = rating * numRating;
    rating = rating + x;
    rating = rating / 2;
   
    }
}










