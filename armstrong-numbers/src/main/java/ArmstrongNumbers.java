import java.lang.Math;
class ArmstrongNumbers {


	boolean isArmstrongNumber(int numberToCheck) {
		int cube,num=numberToCheck,r;
		double sum=0;
		int len=String.valueOf(numberToCheck).length();
		while(num>0){
			r=num%10;
			sum=sum+Math.pow(r,len);
			num=num/10;
		}
		if(sum==numberToCheck)
			return true;
		else
			return false;

		
	}

}
