package clientMain;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import metier.enties.people.JUST;
import services.EtudiantServicesRemote;

public class MAIN {

	public static void main(String [] args) throws NamingException{
		Context context = new InitialContext();
		String jndi = "Bibliotheque_projet/EtudiantServices!services.EtudiantServicesRemote";
		EtudiantServicesRemote srv = (EtudiantServicesRemote) context.lookup(jndi);
	try{	
		JUST j=new JUST();
		j.setNom("emna");
		
		srv.addJust(j);}
	
		catch (Exception e) {
			System.out.println("erreur "+e.getCause());
		}
		
		System.out.print("djf");
	}
}
