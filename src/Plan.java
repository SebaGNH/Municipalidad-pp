public class Plan {
    private String nombreContribuyente;
    private float deudaTotal;
    private int cantCuots;
    private Pago [] pago;

    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }

    public float getDeudaTotal() {
        return deudaTotal;
    }

    public void setDeudaTotal(float deudaTotal) {
        this.deudaTotal = deudaTotal;
    }

    public int getCantCuots() {
        return cantCuots;
    }

    public void setCantCuots(int cantCuots) {
        this.cantCuots = cantCuots;
    }

    public Pago[] getPago() {
        return pago;
    }

    public void setPago(Pago[] pago) {
        this.pago = pago;
    }

    public Plan(String nombreContribuyente, float deudaTotal, int cantCuots, Pago[] pago) {
        this.nombreContribuyente = nombreContribuyente;
        this.deudaTotal = deudaTotal;
        this.cantCuots = cantCuots;
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Plan{" + "nombreContribuyente=" + nombreContribuyente + ", deudaTotal=" + deudaTotal + ", cantCuots=" + cantCuots + ", pago=" + pago + '}';
    }

    
    
    
    
}
