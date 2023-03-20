import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner factura = new Scanner(System.in);
        System.out.println("Ingrese tipo de factura");
        String tipoFactura = factura.nextLine();

        System.out.println("Ingrese el precio de su primer producto");
        double precioUno = factura.nextDouble();

        System.out.println("Ingrese el precio de su segundo producto");
        double precioDos = factura.nextDouble();

        double sumaTotal = precioUno + precioDos;
        double impuesto = sumaTotal * 0.19;
        double sumaTotalMasImpuesto = sumaTotal + impuesto;

        String detalle = "La factura " + tipoFactura + " tiene un total bruto de " + sumaTotal
                + ", con un impuesto de " + impuesto + " y el monto después de impuesto es " + sumaTotalMasImpuesto;
        System.out.println(detalle);


    }
}
