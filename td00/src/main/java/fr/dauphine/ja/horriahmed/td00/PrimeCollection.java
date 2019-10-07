package fr.dauphine.ja.horriahmed.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection 
{
    ArrayList<Integer> numbers;
    
    public PrimeCollection() {
		numbers =new ArrayList<Integer>();	}
    
    public void initRandom(int n,int m){
    	Random random = new Random();
    	
    	for( int i=0;i<n;i++) {
    		int randomInt =random.nextInt(m);
    		numbers.add(randomInt);
    	}
    }
    
    public boolean isPrime(int p) {
    	
    	if(p==1 || p==0)
    		return false;
    	
    	else {
    	for(int i=2; i<Math.sqrt(p); i++) {
    		if(p%i==0) return false;
    	}
    	
    	return true;
    	}
 }
    
    public void printPrime() {
    	for( int i=0;i<numbers.size();i++) {
    		if(isPrime(i))
    			System.out.println(i);
    	}
    }
    
    public static void main(String[] args) {
		
    	PrimeCollection p =new PrimeCollection();
    	p.initRandom(10, 20000);
    	p.printPrime();

    
    }
}


