package utest.tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import utest.model.UtestDatos;
import utest.userinterface.PaginaDireccion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static utest.userinterface.PaginaDireccion.*;

import java.util.List;

public class LlenarDireccion implements Task {
    private List<UtestDatos>datos;

    public LlenarDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDireccion pagina(List<UtestDatos> datos) {
    return Tasks.instrumented(LlenarDireccion.class, datos);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                Click.on(ZIP),
                Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrZip()).into(ZIP),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS),
                Hit.the(Keys.DOWN).keyIn(PAIS),
                Hit.the(Keys.ENTER).keyIn(PAIS),
                Click.on(BOTON_DISPOSITIVOS)

        );

    }
}
