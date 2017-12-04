package fr.afcepf.al30.bank.app;

import javax.xml.ws.Endpoint;

import fr.afcepf.al30.bank.calculs.ServiceCalculsFinanciersImpl;
import fr.afcepf.al30.bank.valeurs.ServiceTauxFraisImpl;

public class BankWsApp {

	public static void main(String[] args) {
		ServiceCalculsFinanciersImpl s1 = new ServiceCalculsFinanciersImpl();
		ServiceTauxFraisImpl s2 = new ServiceTauxFraisImpl();
		Endpoint.publish("http://localhost:8083/bank/service/calculFinancier", s1);
		Endpoint.publish("http://localhost:8083/bank/service/tauxFrais", s2);
		System.out.println("serveur bank en attente des requetes (8083)");
		try {
			Thread.sleep(15*60*1000); //arret automatique au bout de 15mn
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

}
