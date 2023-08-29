package in.lakshmi;

import java.util.function.Supplier;

public class SupplierDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Supplier<String> s = () -> {
		  String otp = "";
		for(int i=1; i<= 4; i++) {
			otp = otp + (int) (Math.random() * 10);
		}
		return otp;
		};
		System.out.println(s.get());
		
		
		
		Supplier<Doctor> sp = Doctor::new;
		Doctor doctor = sp.get();
		System.out.println(doctor.hashCode());
	}
	
	

}
class Doctor{
	
	public Doctor() {
		System.out.println("doctor constructor");
	}
}