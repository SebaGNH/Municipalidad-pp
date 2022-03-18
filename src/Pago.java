public class Pago {
    private int demora;
    private float importePagado;
    private float importeInteresesAdicionales;

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public float getImportePagado() {
        return importePagado;
    }

    public void setImportePagado(float importePagado) {
        this.importePagado = importePagado;
    }

    public float getImporteInteresesAdicionales() {
        return importeInteresesAdicionales;
    }

    public void setImporteInteresesAdicionales(float importeInteresesAdicionales) {
        this.importeInteresesAdicionales = importeInteresesAdicionales;
    }

    public Pago(int demora, float importePagado) {
        this.demora = demora;
        this.importePagado = importePagado;
        if(demora <= 0){
            importeInteresesAdicionales = 0f;
        }else{
            importeInteresesAdicionales = importeInteresesAdicionales * demora * 0.005f;
        }
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importePagado=" + importePagado + ", importeInteresesAdicionales=" + importeInteresesAdicionales + '}';
    }
}
