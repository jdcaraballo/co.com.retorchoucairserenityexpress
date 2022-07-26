package co.com.retochoucairserenity.userinterface.createmeetinguser;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationMeetingUser {
    public static final Target SELECT_BOX_LOCATION=Target.the("SELECT BOX LOCATION").locatedBy("//*[@id='select2-chosen-7' and contains(.,'select')]");
    public static final Target BOX_EDIT_LOCATION=Target.the("SELECT BOX EDIT LOCATION").locatedBy("//*[@id='s2id_autogen7_search']");
    public static final Target LIST_EDIT_LOCATION=Target.the("EDIT LOCATION").locatedBy("(//*[@class='inplace-button inplace-create edit'])[2]");
    public static final Target BOX_EDIT_NAME_LOCATION=Target.the("EDIT NAME_LOCATION").locatedBy("//*[@name='Name']");
    public static final Target BOX_ADDRESS=Target.the("BOX_ADDRESS").locatedBy("//*[@name='Address']");
    public static final Target BOX_LATITUDE=Target.the("BOX_LATITUDE").locatedBy("//*[@name='Latitude']");
    public static final Target BOX_LONGITUDE=Target.the("BOX_LONGITUDE").locatedBy("//*[@name='Longitude']");
    public static final Target BTN_SAVE_LOCATION=Target.the("BTN_SAVE_LOCATION").locatedBy("(//*[@class='fa fa-check-circle text-purple'])[2]");






}
