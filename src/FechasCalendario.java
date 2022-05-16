import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechasCalendario {
    public static void main(String[] args) {
        
        Date miFecha = new Date(122,6,2);//Date
        System.out.println("miFecha = " + miFecha);
        SimpleDateFormat miFormato = new SimpleDateFormat("dd/MMMM/yyyy");//SimpleDateFormat
        String miFechaFormateada= miFormato.format(miFecha);//format()
        System.out.println("miFechaFormateada = " + miFechaFormateada);

        Date ahora = new Date();
        long milisegundosTranscurridos = ahora.getTime();
        System.out.println("milisegundosTranscurridos = " + milisegundosTranscurridos);


        Calendar miCalendario = Calendar.getInstance();
        Calendar calendario = new GregorianCalendar(2022,7,5);
    



    }
}
