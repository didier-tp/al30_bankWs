package fr.afcepf.al30.bank.valeurs;

import javax.jws.WebService;

@WebService(endpointInterface="fr.afcepf.al30.bank.valeurs.IServiceTauxFrais")
public class ServiceTauxFraisImpl implements IServiceTauxFrais {

	@Override
	public double getTauxInteret(double nbMois) {
		if(nbMois>=48)
		     return 2.0;
		else 
			return 1.5; 
	}

	@Override
	public double getFraisDossier(double montant) {
		if(montant>=50000)
		     return 200;
		else 
			return 50; 
	}

}
