public class Factura {
    public String NombreTitular;
    public String ConceptoFactura;
    public double Precio;
    public double Iva;
    public double Total;

    // Función para calcular el IVA
    private double calcularIva() {
        return (this.Precio*21)/100;
    }
    // Función para calcular el total
    private double calcularTotal() {
        return this.Precio + this.Iva;
    }

    //constructor de factura
    public Factura(String nombreTitular, String conceptoFactura, double precio){
        this.NombreTitular = nombreTitular;
        this.ConceptoFactura = conceptoFactura;
        this.Precio = precio;
        this.Iva = calcularIva();
        this.Total = calcularTotal();
    }

    // Función para modificar los datos de la factura
    public void modificarFactura(String nuevoNombreTitular, String nuevoConcepto, double nuevoPrecio) {
        this.NombreTitular = nuevoNombreTitular;
        this.ConceptoFactura = nuevoConcepto;
        this.Precio = nuevoPrecio;
        this.Iva = calcularIva();
        this.Total = calcularTotal();
    }

    public static void main(String[] args) {
        Factura f1 = new Factura("Mikel Honores","Nintendo Switch",350);
        System.out.println("Datos de la factura N°1");
        System.out.println("Nombre del titular: " + f1.NombreTitular);
        System.out.println("Concepto Factura: " + f1.ConceptoFactura);
        System.out.println("Precio: " + f1.Precio);
        System.out.println("Iva: " + f1.Iva);
        System.out.println("Total: " + f1.Total);
        System.out.println("-------------------------");

        Factura f2 = new Factura("Verónica Agapito","Plancha para Pelo",100);
        System.out.println("Datos de la factura N°2");
        System.out.println("Nombre del titular: " + f2.NombreTitular);
        System.out.println("Concepto Factura: " + f2.ConceptoFactura);
        System.out.println("Precio: " + f2.Precio);
        System.out.println("Iva: " + f2.Iva);
        System.out.println("Total: " + f2.Total);
        System.out.println("-------------------------");

        f1.modificarFactura("Arturo Honores M.", "Móvil", 1000);
        // Mostrar los nuevos datos de la factura f1
        System.out.println("Nuevos datos de la factura N°1");
        System.out.println("Nombre del titular: " + f1.NombreTitular);
        System.out.println("Concepto Factura: " + f1.ConceptoFactura);
        System.out.println("Precio: " + f1.Precio);
        System.out.println("Iva: " + f1.Iva);
        System.out.println("Total: " + f1.Total);
        System.out.println("-------------------------");
    }

}