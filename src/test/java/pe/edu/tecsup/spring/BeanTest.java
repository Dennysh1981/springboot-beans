package pe.edu.tecsup.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.spring.model.Musico;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTest {

    @Autowired
    Musico george;

    @Autowired
    Musico paul;

    @Autowired
    Musico john;

    @Autowired
    Musico ludwig;

    @Test
    public void verifyGeorge() {
        System.out.println("Test George");
        Assert.assertTrue(george.getNombre().equals("George"));
    }

    @Test
    public void verifyPaul() {
        System.out.println("\nTest Paul");
        System.out.println(paul.getInstrumentoFavorito().getMarca());
        Assert.assertNotNull(paul.getInstrumentoFavorito());
    }

    @Test
    public void verifyJohn() {
        System.out.println("\nTest John");
        System.out.println(john.getInstrumentoFavorito().getMarca());
        Assert.assertNotNull(john.getInstrumentoFavorito());
    }

    @Test
    public void verifyLudwig() {
        System.out.println("\nTest Ludwig");
        ludwig.getInstrumentoFavorito().sonido();
        Assert.assertNotNull(ludwig.getInstrumentoFavorito());
    }

}
