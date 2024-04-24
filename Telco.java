public class Telco implements TelcoSubscription{

    String telcoName;
    double promoPrice;
    Integer dateAllowance;
    boolean unliCallText;

    public Telco(Integer dateAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDateAllowance(Integer dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public Integer getDataAllowance() {
        return dateAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}
