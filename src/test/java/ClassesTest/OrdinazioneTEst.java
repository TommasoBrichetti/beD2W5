package ClassesTest;

import com.tommasobrichetti.bed1w5.BeD1W5Application;
import com.tommasobrichetti.bed1w5.Ordinazione;
import com.tommasobrichetti.bed1w5.products.Consumation;
import com.tommasobrichetti.bed1w5.products.ExtraMozzarella;
import com.tommasobrichetti.bed1w5.products.ExtraPomodoro;
import com.tommasobrichetti.bed1w5.products.Pizza;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;


public class OrdinazioneTEst {

    Ordinazione ord = new Ordinazione(BeD1W5Application.conf1());


    @Test
    public void testC(){
        assertEquals("somma conto = a 11 ? ", ord.getTotal(), 8.5);
    }

}
