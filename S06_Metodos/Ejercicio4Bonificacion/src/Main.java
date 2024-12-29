public class Main {
    public static double bonificacionVenta (double venta){
        // Inicio variables
        double comision = 0;
        //Fin Variables

        //Inicio Programa
        if(venta < 20000){
            //Bonificación para ventas menores a 20.000
            comision = 7000 + (0.02 * venta);
            return comision;
        } else if (venta >= 20000 && venta <= 50000) {
            //Bonificación para ventas entre 20.000 y 50.000
            comision = 15000 + (0.03 * venta);
            return comision;
        }else {
            //Bonificación para ventas mayores a 50.000
            comision = 20000 + (0.12 * venta);
            return comision;
        }
        //Fin Programa
    }

    public static void main(String[] args) {
        System.out.println("La comisión por la venta que has hecho -> " + bonificacionVenta(51200.0));
    }
}