
public class ATM1 {
	private int monny1;

	public ATM1() {
		
	}
	public int getMonny1() {
		return monny1;
	}
	public void setMonny1(int monny) {
		this.monny1 = monny;
	}
	public int Calnum1() {
		int sum;
		sum = monny1/1000;
		return sum;
	}
	public int Calnum2() {
		int sum;
		sum = (monny1/1000);
		sum = sum*1000;
		sum = monny1-sum;
		sum = sum/500;
		return sum;
	}
	public int Calnum3() {
		int sum;
		int sum1;
		sum = (monny1/1000);
		sum = sum*1000;
		sum = monny1-sum;
		sum1 = sum;
		sum = sum/500;
		sum = sum*500;
		sum = sum1 - sum;
		sum = sum /100;
		return sum;
	}
}
