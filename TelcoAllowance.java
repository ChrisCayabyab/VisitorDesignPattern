import java.util.*;

public class TelcoAllowance implements UsagePromo{

    private static Map<String, Integer> allowanceMap = new HashMap<>();

    static{
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
       
        Integer dataAllowance = allowanceMap.getOrDefault(telcoName, 0);

        return "Offers a data allowance of " + dataAllowance + " GB for Php." + String.format("%.2f", money) + " per month";
    }
}
