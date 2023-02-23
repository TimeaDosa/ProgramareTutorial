package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTEST {

    @Test
    public void MetodaTest(){
//Facem primul obiect de tipul telefon;
        List<String>CaracterisiticiSamsung = Arrays.asList("ecran:2px", "ram:4gb", "procesor:exions");
        TELEFON Samsung = new TELEFON("Samsung","Galaxy S22", 2018, "Android", CaracterisiticiSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(20.0);

        List<String>CaracterisiticiIphone = Arrays.asList("ecran:2px", "ram:8gb", "procesor:A16", "spatiu de stocare:128gb");
        TELEFON Iphone = new TELEFON("Iphone","Iphone6", 2015, "IOS", CaracterisiticiIphone);
        Iphone.VechimeTelefon();
        Iphone.PretTelefon();

        List<String>CaracterisiticiHuawei = Arrays.asList("ecran:2px", "ram:8gb", "procesor:a16", "spatiul de stocare: 64gb");
        TELEFON Huawei = new TELEFON("Huawei","p20", 2016, "Android", CaracterisiticiHuawei, 2855.5);
        Huawei.VechimeTelefon();
        Huawei.PretTelefon();
        Huawei.DiscountTelefon(50.0);

    }
}
