package epicode.com;

import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {
		
		 Info info = new Info();
	        info.setNome("Mario");
	        info.setCognome("Rossi");
	        info.setDataDiNascita(LocalDate.of(1984, 9, 24));

	        DataSource adapter = new Adapter(info);

	        UserData userData = new UserData();
	        userData.getData(adapter);
	        userData.displayData();

	}

}
