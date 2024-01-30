package java_20240130_2;

public class PhoneController {

	public static void main(String[] args) {

		//Phone phone = new Phone();
		//SmartPhone sp = new SmartPhone();
		//NewestPhone np = new NewestPhone();
		
		//Phone phone = new Phone("m1","black");
		
		//System.out.println(phone);
		
		//SmartPhone sp = new SmartPhone(true);
		//System.out.println(sp.toString());
		
		//SmartPhone sp = new SmartPhone("m2", "검정", true);
		//System.out.println(sp.toString());
		
		SmartPhone sp = new SmartPhone();
		sp.sendVoice("문자보내기");
	}

}
