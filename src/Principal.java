import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        ConsultarConversor convertir = new ConsultarConversor();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("registroConversiones.json");
        while(true){
            System.out.println("***** Conversor de Moneda *****");
            System.out.println("1. Euro a Peso (Mexico)");
            System.out.println("2. Dolar (EEUU) a Euro");
            System.out.println("3. Rupia Indonesia a Peso (Filipinas)");
            System.out.println("4. Peso (Uruguay) a Rial yemení");
            System.out.println("5. Dolar (Belice) a Dolar (Tuvalu)");
            System.out.println("6. Real de Brasil a Real Iraní");
            System.out.println("7. Quetzal a Rublo ruso");
            System.out.println("8. Libra siria a Peso (Republica Domincana)");
            System.out.println("9. Dolar (Jamaica) a Peso (Mexicano)");
            System.out.println("10. Peso (Argentino) a Real de Brasil");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");

            var opc = lectura.nextInt();

            if(opc == 0){ break;}

            System.out.println("Ingrese la cantidad a convertir: ");
            try {
                var cant = lectura.nextDouble();

                Moneda moneda = null;
                Registro registro = null;

                switch (opc) {
                    case 1:
                        moneda = convertir.convertirMoneda("EUR", "MXN", cant);
                        System.out.println(cant + " EUR ==> " + moneda.conversion_result() + " MXN");
                        registro = new Registro(moneda, cant);
                        break;
                    case 2:
                        moneda = convertir.convertirMoneda("USD", "EUR", cant);
                        System.out.println(cant + " USD ==> " + moneda.conversion_result() + " EUR");
                        registro = new Registro(moneda, cant);
                        break;
                    case 3:
                        moneda = convertir.convertirMoneda("IDR", "PHP", cant);
                        System.out.println(cant + " IDR ==> " + moneda.conversion_result() + " PHP");
                        registro = new Registro(moneda, cant);
                        break;
                    case 4:
                        moneda = convertir.convertirMoneda("UYU", "YER", cant);
                        System.out.println(cant + " UYU ==> " + moneda.conversion_result() + " YER");
                        registro = new Registro(moneda, cant);
                        break;
                    case 5:
                        moneda = convertir.convertirMoneda("BZD", "TVD", cant);
                        System.out.println(cant + " BZD ==> " + moneda.conversion_result() + " TVD");
                        registro = new Registro(moneda, cant);
                        break;
                    case 6:
                        moneda = convertir.convertirMoneda("BRL", "IRR", cant);
                        System.out.println(cant + " BRL ==> " + moneda.conversion_result() + " IRR");
                        registro = new Registro(moneda, cant);
                        break;
                    case 7:
                        moneda = convertir.convertirMoneda("GTQ", "RUB", cant);
                        System.out.println(cant + " GTQ ==> " + moneda.conversion_result() + " RUB");
                        registro = new Registro(moneda, cant);
                        break;
                    case 8:
                        moneda = convertir.convertirMoneda("SYP", "DOP", cant);
                        System.out.println(cant + " SYP ==> " + moneda.conversion_result() + " DOP");
                        registro = new Registro(moneda, cant);
                        break;
                    case 9:
                        moneda = convertir.convertirMoneda("JMD", "MXN", cant);
                        System.out.println(cant + " JMD ==> " + moneda.conversion_result() + " MXN");
                        registro = new Registro(moneda, cant);
                        break;
                    case 10:
                        moneda = convertir.convertirMoneda("ARS", "BRL", cant);
                        System.out.println(cant + " ARS ==> " + moneda.conversion_result() + " BRL");
                        registro = new Registro(moneda, cant);
                        break;
                }
                escritura.write(gson.toJson(registro));
            }catch(Exception e){
                System.out.println("Ingrese una cantidad valida");
            }
        }
        escritura.close();
    }
}
