package ScreenPlay.Reto1.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://demo.automationtesting.in/Register.html")
public class IngresoFormulario extends PageObject{

	public static final Target PRIMER_NOMBRE = Target.the("Selecciona el campo de First Name")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	
	public static final Target PRIMER_APELLIDO = Target.the("Selecciona el campo de Last Name")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	
	public static final Target DIRECCION = Target.the("Selecciona el campo de Address")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	
	public static final Target CORREO = Target.the("Selecciona el campo de Email Address")
			.located(By.xpath("//*[@id=\"eid\"]/input"));
	
	public static final Target NUMERO = Target.the("Selecciona el campo de Phone")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	
	public static final Target GENERO = Target.the("Selecciona el campo de Gender")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
	
	public static final Target HOBBIES = Target.the("Selecciona el campo de Hobbies")
			.located(By.xpath("//*[@id=\"checkbox2\"]"));
	
	public static final Target LENGUAJES = Target.the("Abre el menu de Languages")
			.located(By.xpath("//*[@id=\"msdd\"]"));
	
	public static final Target LENGUAJES2 = Target.the("Selecciona el campo de Languages")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul"));
	
	public static final Target CLICK_VACIO = Target.the("Selecciona un campo vacio para salir de Languages")
			.located(By.xpath("//*[@id=\"section\"]/div/div"));
	
	public static final Target FORTALEZAS = Target.the("Selecciona el campo de Skills")
			.located(By.xpath("//*[@id=\"Skills\"]"));
	
	public static final Target PAIS = Target.the("Selecciona el campo de Country")
			.located(By.xpath("//*[@id=\"countries\"]"));
	
	public static final Target SELECCIONAR_PAIS = Target.the("Selecciona el campo Selecy Country")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
	
	public static final Target SELECCIONAR_PAIS2 = Target.the("Selecciona el Country")
			.located(By.xpath("/html/body/span/span"));
	
	public static final Target AÑO = Target.the("Selecciona el campo de Date of Birth year")
			.located(By.xpath("//*[@id=\"yearbox\"]"));
	
	public static final Target MES = Target.the("Selecciona el campo de campo de Date of Birth month")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	
	public static final Target DIA = Target.the("Selecciona el campo de campo de Date of Birth day")
			.located(By.xpath("//*[@id=\"daybox\"]"));
	
	public static final Target CONTRASEÑA = Target.the("Selecciona el campo de Password")
			.located(By.xpath("//*[@id=\"firstpassword\"]"));
	
	public static final Target CONFIRMAR_CONTRASEÑA = Target.the("Selecciona el campo de Confirm Password")
			.located(By.xpath("//*[@id=\"secondpassword\"]"));
	
	public static final Target BOTON_INGRESAR = Target.the("Boton de Ingresar")
			.located(By.xpath("//*[@id=\"submitbtn\"]"));
	
	public static final Target CONFIRMAR_VERIFICAR = Target.the("Observa Si Ingreso a la pagina")
			.located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}