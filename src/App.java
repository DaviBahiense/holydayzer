import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
      HashMap<String, String> listHoliday = Holiday.getHoliday();

      Scanner input = new Scanner(System.in);
      System.out.println("Coloque uma data para encontrar um feriado ex: 25/12/2023 ou escreva 'todos' para saber todos os feriados");
      String dataInput = input.nextLine();

      if ("todos".equals(dataInput)) {
        System.out.println(listHoliday);
      }

      String findedHoliday =listHoliday.get(dataInput);

       if (findedHoliday == null) {
        System.out.println("Não existe feriado com tal data"); 
      } else System.out.println(findedHoliday);
  }   
}

