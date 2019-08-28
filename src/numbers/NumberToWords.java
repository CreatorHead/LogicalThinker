package numbers;

public class NumberToWords {
	public static void numToletter(int num) {
		if(num > 99) {
			System.out.println("Please enter a number from 0 to 99");
			return;
		}
		String[] zeroToTen = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		String[] twentyToHundred = new String[] {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(num >=0 && num <=10) {
			System.out.println(zeroToTen[num]);
			return;
		}
		else {
			if(num%10 == 0) {
				System.out.println(twentyToHundred[num/10]);
			}else {
				System.out.print(twentyToHundred[(num/10)] +"" + zeroToTen[num%10]);
			}
		}
	}
}
