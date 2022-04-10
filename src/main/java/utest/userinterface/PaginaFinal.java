package utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {
    public static final Target CLAVE = Target.the("Clave usuario")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("Confirmar clave usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECBOX_01 = Target.the("Checbox_01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECBOX_02 = Target.the("Checbox_02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECBOX_03 = Target.the("Checbox_03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETAR = Target.the("Boton finaliza registro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));


}
