package co.com.retochoucairserenity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateNewBusinessUser {

    public static final Target BOX_USER=Target.the("Caja para ingresar usuario").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Username']");
    public static final Target BOX_PASS=Target.the("Caja para ingresar PASS").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Password']");
    public static final Target BTN_SIGN_IN=Target.the("Caja para SIGN IN").locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_LoginButton']");




    public static final Target VALID_REGIST=Target.the("VALIDACIÓN SIGN IN").locatedBy("//*[@class='content-header']");



    public static final Target MEN_ORGANIZATION =  Target.the("MENU  ORGANIZACION").locatedBy("(//*[contains(text(),'Organization')])[2]");
    public static final Target MEN_BUSINESS_UNITS =  Target.the("MENU  BUSINESS UNITS").locatedBy("//*[@class='s-sidebar-link-text' and contains(.,'Business Units')]");
    public static final Target MEN_CREATE_BUSINESS_UNITS =  Target.the("MENU CREATE BUSINESS UNITS").locatedBy("//*[@class='button-inner' and contains(.,'New Business Unit')]");
    public static final Target BOX_NAME_BUSINESS =  Target.the("BOX  NAME BUSINESS UNITS").locatedBy("//*[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");
    public static final Target LIST_PARENT_UNITS =  Target.the("LIST PARENTS UNITS").locatedBy("//*[@id='select2-chosen-1']");
    public static final Target BTN_SAVE_BUSINESS =  Target.the("BOX  NAME BUSINESS UNITS").locatedBy("//*[@class='button-inner' and contains(.,' Save')]");

    public static final Target VALIDAR_CREATE_NEW_BUSEINESS =  Target.the("VALIDAR_CREATE_NEW_BUSEINESS").locatedBy("//*[@class='title-text' and contains(.,'Business Units')]");


}
