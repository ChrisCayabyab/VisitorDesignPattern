import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{

    private static Map<String, String> packageMap = new HashMap<>();

    static{
        packageMap.put("Smart", "This plan does not offer any free calls or texts, and you will be charged per use.");
        packageMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        packageMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        
        if (unliCallText) {
            return packageMap.getOrDefault(telcoName,"");
            
        } else {
            return "Do not offer any free calls or texts, and you will be charged per use.";
        }
    }
}
