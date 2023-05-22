package zadTomka.kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObliczeniaKalkulatoraTest {


    @Test
    public void shouldReturnProperReturnOfAdding(){
        //given
        ObliczeniaKalkulatora obliczeniaKalkulatora = new ObliczeniaKalkulatora(2,5);

        //when
        int result = obliczeniaKalkulatora.uruchomMetodyKalkulatora();

        //then
        assertEquals(result, 7);
    }

}