package th.ac.utcc.cpe.u1810711102002.copy;

public class RegistrationRecord {
	
	private Student student;
	private Subject [] subject;
	private int count;
	public RegistrationRecord() {
		student = new Student();
		subject = new Subject[10];
		for(int i=0; i < 10; i++) {
			subject[i] = new Subject();
			
		}
	}
	
	public RegistrationRecord(int n) {
		student = new Student();
		subject = new Subject[n];
		for(int i=0; i < n; i++) {
			subject[i] = new Subject();
			
		}
	}
	
	public void addSubject(Subject s) {
		if(count < subject.length - 1) {
			subject[count] = s;
			count++;
			
		}
	}

}
