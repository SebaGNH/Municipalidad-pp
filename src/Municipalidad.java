public class Municipalidad {
    Plan [] planes;
    
    public Municipalidad(int cantPlanes){
        planes = new Plan[cantPlanes];
    }
    
    public void agregarPlan(Plan p){
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]== null) {
                planes[i] = p;
                break;
            }
        }
    }
    
    
    //Cantidad de planes pagados en su totalidad (es decir, que tengan tantos pagos recibidos como la cantidad de cuotas pactadas)
    public int getCantPlanesTotalmentePagados(){
        int cantPlanesTotalmentePagados = 0;
        for (Plan p : planes) {
            if (p !=null && p.getCantidadPagosRealizados() == p.getCantCuots()) {
               cantPlanesTotalmentePagados ++;
            }
        }
        return cantPlanesTotalmentePagados;
    }
    
    
    // Sumatoria de las deudas registradas
    public float getSumatoriaDeudas(){
        float acumuladorDeudas = 0f;
        for (Plan p : planes) {
            acumuladorDeudas += p.getDeudaTotal();
        }
        return acumuladorDeudas;
    }
   
    
    //Listado de todos los pagos efectuados por un contribuyente en particular
    public String getListadoPagosPorUnContribuyente(String nombreContribuyente){
        String listadoPagos = "";
        for (Plan p : planes) {
            if (nombreContribuyente == p.getNombreContribuyente()) {
                listadoPagos = p.getPagoPorContribuyente();
            }
        }
        return listadoPagos;
    }
}
