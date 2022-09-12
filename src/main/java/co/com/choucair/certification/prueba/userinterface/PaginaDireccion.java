package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {
    public static final Target Ciudad= Target.the("ciudad").located(By.id("city"));
    public static final Target CodigoPostal= Target.the("codigo postal").located(By.id("zip"));
    public static final Target Pais= Target.the("pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target Boton_Direccion= Target.the("Siguiente")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
