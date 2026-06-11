package CalculadoraTiempoCli;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SumarMinutos {

    public String sumarMinutosAHora(String horaInicial, int minutosASumar) {
        try {

            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime hora = LocalTime.parse(horaInicial, formateador);
            LocalTime nuevaHora = hora.plusMinutes(minutosASumar);

            return nuevaHora.format(formateador);

        } catch (DateTimeParseException e) {
            return "Error (Formato de hora incorrecto. Use HH:MM)";
        }
    }
}