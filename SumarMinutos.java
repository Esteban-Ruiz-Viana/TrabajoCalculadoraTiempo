public class SumarMinutos {

        // Esta es la función (método) equivalente en Java
        public static String sumarMinutos(String horaInicial, int minutosASumar) {
            // Separar los datos de la hora inicial ("14:30" -> ["14", "30"])
            String[] partes = horaInicial.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            // Calcular el total de minutos desde las 00:00
            int totalMinutos = horas * 60 + minutos + minutosASumar;

            // Calcular las nuevas horas y minutos
            int nuevasHoras = (totalMinutos / 60) % 24;
            int nuevosMinutos = totalMinutos % 60;

            // Retornar el resultado formateado con dos dígitos (ej. "09:05")
            return String.format("%02d:%02d", nuevasHoras, nuevosMinutos);
        }

    }