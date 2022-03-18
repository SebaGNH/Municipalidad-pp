public class Plan {
    private String nombreContribuyente;
    private float deudaTotal;
    private int cantCuots;
    private Pago [] pagos;

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

    public Pago[] getPagos() {
        return pagos;
    }

    public void setPagos(Pago[] pago) {
        this.pagos = pagos;
    }

    public Plan(String nombreContribuyente, float deudaTotal, int cantCuots) {
        this.nombreContribuyente = nombreContribuyente;
        this.deudaTotal = deudaTotal;
        this.cantCuots = cantCuots;
        this.pagos = new Pago[cantCuots];
    }

    @Override
    public String toString() {
        return "Plan{" + "nombreContribuyente=" + nombreContribuyente + ", deudaTotal=" + deudaTotal + ", cantCuots=" + cantCuots + ", pago=" + pagos + '}';
    }

    public void agregarPago(Pago p){
        for (int i = 0; i < cantCuots; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }
        }
    }
    
    //cantidad de pagos realizados
    public int getCantidadPagosRealizados(){
        int contador = 0;
        for (Pago p : pagos) {
            if (p !=null) {
                contador ++;
            }
        }
        return contador;
    }
    
    
    //Pagos por contribuyente
    public String getPagoPorContribuyente(){
        String listaPagos = "";
        for (int i = 0; i < pagos.length; i++) {
            listaPagos += "\n"+(i+1) +"- "+ pagos[i].getImportePagado();
        }
        return listaPagos;
    }
}
