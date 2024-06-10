package mx.uv.Inventario.Factura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class FacturaConfig {
    @Bean
    public Jaxb2Marshaller marshallerFactura(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // revisar en el pom.xml <packageName>
        marshaller.setContextPath("xx.mx.uv.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public FacturaCliente clienteFactura(Jaxb2Marshaller marshallerFactura){
        FacturaCliente c = new FacturaCliente();
        // URI donde está el servicio
        c.setDefaultUri("https://facturas-production.up.railway.app/ws/facturas");
        c.setMarshaller(marshallerFactura);
        c.setUnmarshaller(marshallerFactura);
        return c;
    }
}