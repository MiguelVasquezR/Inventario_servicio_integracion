package mx.uv.Inventario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class FacturaConfig {
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // revisar en el pom.xml <packageName>
        marshaller.setContextPath("xx.mx.uv.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public FacturaCliente cliente(Jaxb2Marshaller marshaller){
        FacturaCliente c = new FacturaCliente();
        c.setDefaultUri("https://serviciofactura-production.up.railway.app/ws/factura");
        c.setMarshaller(marshaller);
        c.setUnmarshaller(marshaller);
        return c;
    }
}
