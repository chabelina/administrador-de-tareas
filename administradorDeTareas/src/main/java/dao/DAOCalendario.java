package dao;

import java.time.LocalDate;

/*
  SABEMOS COMO OBTENER EL DÍA PARTIENDO DE UN NUMERO ANTES ESPECIFICANDO EL MES, ESTO LO 
  PODEMOS UTILIZAR PARA ITERAR DESDE EL DÍA 01 Y SABER QUE DÍA CAE EN 01, DE MODO QUE LA
  TABLA SE EMPEZARÁ A RELLENAR DESDE ESE DÍA Y ASÍ HASTA TERMINAR DE RELLENAR TODOS DÍAS
  DIAS DEL AÑO.
 
  String[] daysOfWeek = {
    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
  };
*/

public class DAOCalendario {
    private int dia_actual;
    private int mes_actual;
    private int anio_actual;
    LocalDate fechaActual = LocalDate.now();
    
    public DAOCalendario(){
      this.anio_actual = fechaActual.getYear();
      this.mes_actual = fechaActual.getMonthValue();
      this.dia_actual = fechaActual.getDayOfMonth();
    }
    
    public static int getAnioActual(){
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        return year;
    }
    
    public static int getMesActual(){
      LocalDate currentDate = LocalDate.now();
      int month = currentDate.getMonthValue();
      return month;
    } 
    
    public static int getDiaActual(){
      LocalDate currentDate = LocalDate.now();
      int day = currentDate.getDayOfMonth();
      return day;
    }
    
    public static String diaActualText(LocalDate date){
      String diaActualText;
      diaActualText = date.getDayOfWeek().name();
      return diaActualText;
    }
    
    public static void main(String args[]) {
      LocalDate fechaActual = LocalDate.of(DAOCalendario.getAnioActual(),DAOCalendario.getMesActual(), DAOCalendario.getDiaActual());
      
      System.out.println(DAOCalendario.diaActualText(fechaActual));
    }
}