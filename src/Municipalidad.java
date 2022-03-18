/*
-Se debe desarrollar un programa en Java que solicite por teclado los datos de los planes y de los pagos y luego de finalizada la carga informe:
    * Cantidad de planes pagados en su totalidad (es decir, que tengan tantos pagos recibidos como la cantidad de cuotas pactadas)
    * Sumatoria de las deudas registradas
    * Listado de todos los pagos efectuados por un contribuyente en particular
    * Promedio general de intereses adicionales cobrados
 */
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
    
    
    
    
    
}
