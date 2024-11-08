public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public abstract double getBillableAmount();
}