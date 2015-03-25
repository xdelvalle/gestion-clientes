package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static String DatetimeNow() {
        Calendar now = Calendar.getInstance();

        int day = now.get(Calendar.DAY_OF_MONTH);
        int mnt = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);

        String time = zero(day) + "/" + zero(mnt + 1) + "/" + year;

        return time;
    }

    public static String DatetimeNowBirthday() {
        Calendar now = Calendar.getInstance();

        int day = now.get(Calendar.DAY_OF_MONTH);
        int mnt = now.get(Calendar.MONTH);

        String time = zero(day) + "/" + zero(mnt + 1) + "/";

        return time;
    }

    private static String zero(int num) {
        String number = (num < 10) ? ("0" + num) : ("" + num);
        return number;
    }

    public static boolean comprobarFormatoFecha(String fecha) {
        if (fecha.length() != 10) {
            return false;
        }
        else {
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                formatoFecha.setLenient(false);
                formatoFecha.parse(fecha);
                return true;
            }
            catch (Exception e) {
                return false;
            }
        }
    }

    public static boolean isFormatoEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("[a-zA-Z0-9]+[.[a-zA-Z0-9_-]+]*@[a-z0-9][\\w\\.-]*[a-z0-9]\\.[a-z][a-z\\.]*[a-z]$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            //System.out.println("[" + mat.group() + "]");
            return true;
        }
        else {
            return false;
        }
    }

    public static String calcularEdad(String fechaNacimiento) {
        try {
            Calendar birth = new GregorianCalendar();
            Calendar today = new GregorianCalendar();
            int age = 0;
            int factor = 0;
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
            Date currentDate = new Date(); //current date
            birth.setTime(birthDate);
            today.setTime(currentDate);
            if (today.get(Calendar.MONTH) <= birth.get(Calendar.MONTH)) {
                if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)) {
                    if (today.get(Calendar.DATE) > birth.get(Calendar.DATE)) {
                        factor = -1; //Aun no celebra su cumpleaños
                    }
                }
                else {
                    factor = -1; //Aun no celebra su cumpleaños
                }
            }
            age = (today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)) + factor;
            return String.valueOf(age);
        }
        catch (ParseException e) {
            return "-1";
        }
    }
}
