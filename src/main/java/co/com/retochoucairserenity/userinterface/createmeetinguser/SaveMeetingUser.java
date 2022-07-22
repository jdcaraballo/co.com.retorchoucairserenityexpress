package co.com.retochoucairserenity.userinterface.createmeetinguser;

import net.serenitybdd.screenplay.targets.Target;

public class SaveMeetingUser {

    public static final Target ORGANIZED_BY=Target.the("ORGANIZED_BY").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[8]/a");
    public static final Target BOX_TITLE=Target.the("BOX_TITLE").locatedBy("//*[@name='Title']");
    public static final Target BOX_FIRST_NAME=Target.the("BOX_FIRST_NAME").locatedBy("//*[@name='FirstName']");
    public static final Target BOX_LAST_NAME=Target.the("BOX_LAST_NAME").locatedBy("//*[@name='LastName']");
    public static final Target BOX_EMAIL=Target.the("BOX_EMAIL").locatedBy("//*[@name='Email']");
    public static final Target BOX_IDENTITY=Target.the("BOX_IDENTITY").locatedBy("//*[@name='IdentityNo']");
    public static final Target LIST_USERY=Target.the("LIST_USER").locatedBy("(//*[@class='select2-choice select2-default' and contains(.,'select')])[5]");
    public static final Target BTN_SAVE=Target.the("BTON SAVE").locatedBy("(//*[@class='button-inner' and contains(.,'Save')])[2]");

}
