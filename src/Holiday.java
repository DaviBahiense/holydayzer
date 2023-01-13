import java.util.*;

public class Holiday {

    public static HashMap<String, String> getHoliday(){
        return holidayList;
    }
    
    static final HashMap<String, String> holidayList = new HashMap<String, String>();
    static{
        holidayList.put("01/01/2023", "Confraternização Mundial");
        holidayList.put("21/02/2023", "Carnaval");
        holidayList.put("17/04/2023", "Páscoa");
        holidayList.put("21/04/2023", "Tiradentes");
        holidayList.put("01/05/2023", "Dia do Trabalho");
        holidayList.put("08/06/2023", "Corpus Christi");
        holidayList.put("07/09/2023", "Independência do Brasil");
        holidayList.put("12/10/2023", "Nossa Senhora Aparecida");
        holidayList.put("02/11/2023", "Finados");
        holidayList.put("15/11/2023", "Proclamação da República");
        holidayList.put("25/12/2023", "Natal");
    }
}
