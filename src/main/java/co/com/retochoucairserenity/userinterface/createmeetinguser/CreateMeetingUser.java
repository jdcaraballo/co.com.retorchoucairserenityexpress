package co.com.retochoucairserenity.userinterface.createmeetinguser;

import net.serenitybdd.screenplay.targets.Target;

public class CreateMeetingUser {

    public static final Target MENU_MEETING=Target.the("MENU MEETING").locatedBy("(//*[@class='s-sidebar-link-text' and contains(.,'Meeting')])[1]");
    public static final Target OPC_MEETINGS=Target.the("OPTION MEETINGS").locatedBy("(//*[@class='s-sidebar-link-text' and contains(.,'Meeting')])[2]");
    public static final Target BTN_NEW_MEET=Target.the("BTN_NEW_MEET").locatedBy("//*[@class='button-inner' and contains(.,'New Meeting')]");

    public static final Target BOX_MEETING_NAME=Target.the("BTN_MEET_NAME").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");
    public static final Target BOX_EDIT_MEETING_TYPE=Target.the("BOX_EDIT_MEET_TYPE").locatedBy("//*[@class='inplace-button inplace-create edit']");
    public static final Target BOX_NAME_MEETING_TYPE=Target.the("BOX_NAME_MEET_TYPE").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingTypeDialog41_Name']");
    public static final Target BTN_SAVE_MEETING_TYPE=Target.the("BTN_SAVE_MEET_TYPE").locatedBy("(//*[@class='button-inner' and contains(.,'Save')])[2]");


    public static final Target BOX_MEETING_TYPE0=Target.the("BTN_MEET_TYPE0").locatedBy("//*[@id='select2-chosen-6' and contains(.,'General')]");
    public static final Target BOX_MEETING_TYPE=Target.the("BTN_MEET_TYPE").locatedBy("//*[@class='inplace-button inplace-create edit']");
    public static final Target ESLEC_CUSTOMER=Target.the("SELSC_CUSTOMER").locatedBy("//*[@id='select2-result-label-266' and contains(.,'Customer')]");

    public static final Target BOX_MEETING_NUMBER=Target.the("BTN_MEET_NUMBER").locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber' and (@name='MeetingNumber')]");
    public static final Target CALEN_STAR_DATE=Target.the("CALENDARIOS FECHA INCIIAL").locatedBy("(//*[@class='ui-datepicker-trigger'])[1]");



}
