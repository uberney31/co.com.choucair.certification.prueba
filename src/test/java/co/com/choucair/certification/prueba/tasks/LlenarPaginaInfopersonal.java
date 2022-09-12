package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.Utest_Datos;
import co.com.choucair.certification.prueba.userinterface.PaginaDeDatos;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.prueba.userinterface.PaginaDeDatos.*;
import static co.com.choucair.certification.prueba.userinterface.PaginaDireccion.Ciudad;

public class LlenarPaginaInfopersonal implements Task {
    private List<Utest_Datos> datos;

    public LlenarPaginaInfopersonal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaInfopersonal laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenarPaginaInfopersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(Nombre),
            Enter.theValue(datos.get(0).getApellido()).into(Apellido),
            Enter.theValue(datos.get(0).getCorreo()).into(Correo),
            SelectFromOptions.byVisibleText(datos.get(0).getMes()).from(Mes),
            SelectFromOptions.byVisibleText(datos.get(0).getDia()).from(Dia),
            SelectFromOptions.byVisibleText(datos.get(0).getNaAno()).from(NaAno),
            SelectFromOptions.byVisibleText(datos.get(0).getIdioma()).from(Idioma),
            Click.on(Siguiente)
            );
    }
}
