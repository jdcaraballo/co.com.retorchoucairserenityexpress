package co.com.retochoucairserenity.userinterface.createmeetinguser;

import net.serenitybdd.screenplay.targets.Target;

public class SaveUnitUser {

    public static final Target BOX_UNIT = Target.the("BOX_UNIT").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[7]/a");
    public static final Target BOX_UNIT_NAME = Target.the("BOX_UNIT_NAME").locatedBy("//*[@name='Name']");
    public static final Target BOX_PARENT_UNIT = Target.the("BOX_PARENT_UNIT").locatedBy("//*[@id='select2-chosen-1780']");
    public static final Target BTN_SAVE_UNIT = Target.the("BTN_SAVE").locatedBy("(//*[@class='button-inner' and contains(.,'Save')])[2]");



    public static final Target BTN_SAVE_WHOLE_MEET = Target.the("BTN_SAVE_WHOLE_MEET").locatedBy("(//*[@class='button-inner' and contains(.,'Save')])[1]");




    public static final Target VALIDAR_CREATE_NEW_MEETING = Target.the("BTN_SAVE").locatedBy("//*[@class='button-inner' and contains(.,'New Meeting')]");



}