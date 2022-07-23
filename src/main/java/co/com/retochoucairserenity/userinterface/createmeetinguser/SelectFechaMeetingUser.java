package co.com.retochoucairserenity.userinterface.createmeetinguser;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFechaMeetingUser {
    public static final Target INITIAL_DATE=Target.the("SET FECHA INICIAL").locatedBy("(//*[@class='ui-datepicker-trigger'])[1]");
    public static final Target SELECT_INITIAL_DAY=Target.the("SET DiA INICIAL").locatedBy("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]");
    public static final Target SELECT_INITIAL_DHOUR=Target.the("SET HORA INICIAL").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select");


    public static final Target FINAL_DATE=Target.the("SET FECHA FINAL").locatedBy("(//*[@class='ui-datepicker-trigger'])[2]");
    public static final Target SELECT_FINAL_DAY=Target.the("SET DiA FINAL").locatedBy("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]");
    public static final Target SELECT_FINAL_HOUR=Target.the("SET HORA FINAL").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select"));





}
