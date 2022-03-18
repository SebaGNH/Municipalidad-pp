import java.util.Scanner;
public class AppConsola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenidos al Sistema Municipal");
        System.out.println("Ingrese la cantidad de planes que va a agregar");
        int cantPlanes = sc.nextInt();
        Municipalidad municipalidad = new Municipalidad(cantPlanes);
        Plan plan;
        
        
        
        //Carga de planes
        for (int i = 0; i < cantPlanes; i++) {
            System.out.println("Ingrese el nombre del contribuyente "+ (i+1));
            String nombreContribuyente = sc.next();
            
            System.out.println("Ingrese la deuda de "+nombreContribuyente);
            float deudaTotal = sc.nextFloat();
            
            System.out.println("Ingrese la cantidad de cuotas");
            int cantCuots = sc.nextInt();
            
            plan = new Plan(nombreContribuyente, deudaTotal, cantCuots);
            
            for (int j = 0; j < cantCuots; j++) {
                
                System.out.println("Ingrese la cantidad de dias de demora en el pago");
                int demora = sc.nextInt();
                
                System.out.println("Ingrese el importe pagado");
                float importePagado = sc.nextFloat();                
                
                
                Pago pago = new Pago(demora, importePagado);
                plan.agregarPago(pago);
                
            }
            municipalidad.agregarPlan(plan);            
        }
        
        //Salidas
        
        System.out.println("La cantidad de planes pagados en su totalidad es de "+ municipalidad.getCantPlanesTotalmentePagados());
        
        System.out.println("La sumatoria de las deudas registradas es de $"+ municipalidad.getSumatoriaDeudas());
        
        System.out.println("El promedio general de intereses acumulados es de "+ municipalidad.getPromedioInteresesAdicionales());

        System.out.println("Ingrese el nombre de un contribuyente para saber el listado de sus pagos");
        
        String nombreContribuyente = sc.next();
        municipalidad.getListadoPagosPorUnContribuyente(nombreContribuyente);
        

     sc.close();
    }
    
}
