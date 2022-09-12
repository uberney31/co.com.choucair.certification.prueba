package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.Utest_Datos;
import co.com.choucair.certification.prueba.userinterface.PaginaDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.prueba.userinterface.PaginaDireccion.*;

public class LlenarPaginaDireccion implements Task {

    private List<Utest_Datos> datos;
    public LlenarPaginaDireccion(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDireccion laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenarPaginaDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getCiudad()).into(Ciudad),
            Hit.the(Keys.ARROW_DOWN).into(Ciudad),
            Hit.the(Keys.ENTER).into(Ciudad),
            Enter.theValue(datos.get(0).getCodigoPostal()).into(CodigoPostal),
            Enter.theValue(datos.get(0).getPais()).into(Pais),
            Click.on(Boton_Direccion)
            );
    }
}
