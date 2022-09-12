package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeDatos {
    public static final Target Nombre= Target.the("Nombre de usuario").located(By.id("firstName"));
    public static final Target Apellido= Target.the("Apellido de usuario").located(By.id("lastName"));
    public static final Target Correo= Target.the("Correo usuario").located(By.id("email"));
    public static final Target Mes= Target.the("Mes usuario").located(By.id("birthMonth"));
    public static final Target Dia= Target.the("Dia usuario").located(By.id("birthDay"));
    public static final Target NaAno= Target.the("Año usuario").located(By.id("birthYear"));
    public static final Target Idioma =Target.the("Para elegir el idoma")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target Siguiente= Target.the("Siguiente")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
