public class ResidentialSite extends Site{
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * TAX_RATE * 0.2;
        return base + tax;
    }
}
