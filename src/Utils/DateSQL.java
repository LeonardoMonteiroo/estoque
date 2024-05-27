package Utils;

import java.time.LocalDate;
import java.sql.Date;

public class DateSQL {

    public static Date getDataAtual() {
        LocalDate dataAtual = LocalDate.now();
        return java.sql.Date.valueOf(dataAtual);
    }
}
