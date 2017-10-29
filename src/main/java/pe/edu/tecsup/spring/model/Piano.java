package pe.edu.tecsup.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Piano extends Instrumento {

    public void sonido() {
        System.out.println("tin tin tan tun (piano)");
    }

}
