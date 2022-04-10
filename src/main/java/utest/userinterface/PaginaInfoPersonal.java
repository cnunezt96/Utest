package utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {
    public static final Target NOMBRE = Target.the("Nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("EMAIL")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Mes nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia nacimiento")
            .located(By.id("birthDay"));
    public static final Target ANO_NACIMIENTO = Target.the("Ano nacimiento")
            .located(By.id("birthYear"));
    public static final Target BOTON_DIRECCION = Target.the("Boton para ir a la seccion direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
