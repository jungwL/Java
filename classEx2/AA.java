package javapro.classEx2;

public class AA {
	int filedAA1;
	
	public AA() {
		//로컬 클래스
		class BB {
			
		}
		
		BB bb=new BB();
	}
	
	void methodAA1() {
		//로컬 클래스
		class CC {
			
		}
		CC cc=new CC();
	}
}
