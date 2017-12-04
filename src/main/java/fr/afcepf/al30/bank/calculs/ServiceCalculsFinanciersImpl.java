package fr.afcepf.al30.bank.calculs;

import javax.jws.WebService;

@WebService(endpointInterface="fr.afcepf.al30.bank.calculs.IServiceCalculsFinanciers")
public class ServiceCalculsFinanciersImpl implements IServiceCalculsFinanciers {

	@Override
	public double calculerMensualite(double montant, double nbMois, double tauxInteretAnnuel) {
		double tauxMensuel = (tauxInteretAnnuel / 12) / 100;
		return ( montant * tauxMensuel ) / (1 - Math.pow(1 + tauxMensuel, -nbMois));
	}

}
