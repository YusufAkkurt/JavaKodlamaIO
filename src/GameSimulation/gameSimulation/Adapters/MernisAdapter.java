package GameSimulation.gameSimulation.Adapters;

import GameSimulation.gameSimulation.Entities.Gamer;
import GameSimulation.gameSimulation.Mernis.NCVKPSPublicSoap;

public class MernisAdapter {
    public boolean customerCheck(Gamer gamer) {
        boolean result;

        NCVKPSPublicSoap publicSoap = new NCVKPSPublicSoap();

        try {
            result = publicSoap.TCKimlikNoDogrula(
                    Long.parseLong(gamer.getNationalId()),
                    gamer.getFirstName().toUpperCase(),
                    gamer.getLastName().toUpperCase(),
                    gamer.getBirthOfYear()
            );

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
