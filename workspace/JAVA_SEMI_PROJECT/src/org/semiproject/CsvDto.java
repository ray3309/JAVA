package org.semiproject;

import com.opencsv.bean.CsvCustomBindByName;
import java.time.LocalDate;

public class CsvDto {
    
    @CsvCustomBindByName(column = "발행년월일", converter = CustomDateConverter.class)
    private LocalDate dateField;

    // Getter, Setter
    public LocalDate getDateField() { return dateField; }
    public void setDateField(LocalDate dateField) { this.dateField = dateField; }
}