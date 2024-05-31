package mx.uv.Inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xx.mx.uv.consumo.wsdl.ConsultarFacturaResponse;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
	public CommandLineRunner ejecutar(FacturaCliente cliente){
		return x -> {
			try{
				String nombre="-706751322";
				ConsultarFacturaResponse sr = cliente.consultarFactura(nombre);
				if (sr==null) {
					System.out.println("No se encontró la factura");
				}else{
					System.out.println(sr.getProductos().size());
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		};
	}


}