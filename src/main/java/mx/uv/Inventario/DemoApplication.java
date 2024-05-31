package mx.uv.Inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xx.mx.uv.consumo.wsdl.ConsultarFacturaResponse;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    
	public CommandLineRunner ejecutar(FacturaCliente cliente){
		return x -> {
			String nombre="-706751322";
			System.out.println(nombre);
			System.out.println("Consultando factura");
			ConsultarFacturaResponse sr = cliente.consultarFactura(nombre);
            System.out.println(sr.getProductos().size());
		};
	}


}