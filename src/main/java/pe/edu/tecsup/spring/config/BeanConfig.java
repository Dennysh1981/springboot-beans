package pe.edu.tecsup.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pe.edu.tecsup.spring.model.Guitarra;
import pe.edu.tecsup.spring.model.Instrumento;
import pe.edu.tecsup.spring.model.Musico;

@Configuration
public class BeanConfig {

    @Bean
    public Musico george() {
        return new Musico("George");
    }

    @Bean
    public Guitarra fender() {
        return new Guitarra("fender", "fender");
    }

    @Bean
    public Musico paul(@Qualifier("fender") Guitarra guitarra) {
        return new Musico("Paul", guitarra);
    }

    @Bean
    @Primary
    public Guitarra gibson() {
        return new Guitarra("gibson", "gibson");
    }

    @Bean
    public Musico john(Guitarra gibson) {
        return new Musico("John", gibson);
    }

    @Bean
    public Musico ludwig(@Qualifier("piano") Instrumento piano) {
        return new Musico("Ludwig", piano);
    }

}
