public class MachineData extends DieselMachine{
	public MachineData() {
		System.out.println("machine started");
	}

	@Override
	void fillfuel() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	MachineData m = new MachineData();
		m.fillfuel();
		m.start();
	}
}
