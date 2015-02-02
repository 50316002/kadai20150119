package mms;
import java.util. Scanner;

public class mms_lib {
	private double lambda,mu,rho,alpha;
	private int s,r;
	 public mms_lib(double lambda,double mu,int s,int r){
		 this.lambda=lambda;
		 this.mu=mu;
		 this.alpha=lambda/mu;
		 this.rho=this.alpha/s;
		 this.s=s;
		 this.r=r;
	 }
	 public int getFactorial(int s){
		  int f=1;
		  for(int i=s;i>=0;i--){
			   if(i==0){
				    f*=1;
			   }else{
				   f*=i;
			    }
		   }
		  return f;
	 }
public int getCombination(int s,int r){
 int g=1,h=1,j=i,k;
	if(s>r){
		  for(int i=s+r; i>=0;i--){
			  if(i==0){
				    g*=1;
			  }else{
				   g*=i;
			   }
		  }  
		   for(int i=r;i>=0,i--){
			   if(i==0){
				   h*=1;
			   }
			   else{
				   h*=i;
			   }
		    }   
		   for(int i=s,i>=0,i--){
			    if(i==0){
			    	j*=1;
			    }
			    else{
			    	j*=i;
			    }
	}
	k=g*/h*/j*;
		  return k;
		  
}
	 
	 
}		




