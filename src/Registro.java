public class Registro {
    private String base;
    private String target;
    private double cant;
    private double result;

    public Registro(Moneda moneda,  double cant) {
        this.base = moneda.base_code();
        this.target = moneda.target_code();
        this.cant = cant;
        this.result = moneda.conversion_result();
    }
}
