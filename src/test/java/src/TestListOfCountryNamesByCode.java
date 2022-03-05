package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;

public class TestListOfCountryNamesByCode {

    @Test
    public void ListCountryByCode() {
        CountryInfoServiceSoapType countryInfoServiceSoap = new CountryInfoService(CountryInfoService.WSDL_LOCATION).getCountryInfoServiceSoap();
        Integer quantity = countryInfoServiceSoap.listOfCountryNamesByCode().getTCountryCodeAndName().size();
        Assertions.assertEquals(246,quantity);
    }
}
