package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.model.UtestDatos;
import static utest.userinterface.PaginaFinal.*;

import java.util.List;

public class LlenarFinal implements Task {

    private List<UtestDatos> datos;

    public LlenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarFinal pagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarFinal.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(CLAVE),
                Enter.theValue(datos.get(0).getStrClave()).into(CONFIRMAR_CLAVE),
                Click.on(CHECBOX_01),
                Click.on(CHECBOX_02),
                Click.on(CHECBOX_03),
                Click.on(BOTON_COMPLETAR)

        );

    }
}
