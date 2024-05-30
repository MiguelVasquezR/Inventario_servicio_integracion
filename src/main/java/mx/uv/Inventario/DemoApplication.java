package mx.uv.Inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import xx.mx.uv.consumo.wsdl.ConsultarFacturaResponse;

@SpringBootApplication
@ComponentScan({"mx.uv.Inventario.FacturaCliente.*", "mx.uv.Inventario.Modelo.*", "mx.uv.Inventario.ORM.*"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
	public CommandLineRunner ejecutar(FacturaCliente cliente){
		return x -> {
			String nombre="-706751322";
			ConsultarFacturaResponse sr = cliente.consultarFactura(nombre);
            System.out.println(sr.getProductos().size());
		};
	}


}