package org.semiproject;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import java.time.LocalDate;

public class CustomDateConverter extends AbstractBeanField<String, LocalDate> {

    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException {
        if (value == null || value.isBlank()) {
            return null;
        }

        // 1. 불필요한 문자 제거 (정규식: '-', '[', ']' 제거)
        String cleanedDate = value.replaceAll("[\\[\\]-]", "");

        // 2. 날짜 구성요소 파싱 (연도만, 연월, 연월일 처리)
        // 2024 -> 2024-01-01 (기본값)
        // 202402 -> 2024-02-01 (기본값)
        // 20240101 -> 2024-01-01

        if (cleanedDate.length() == 4) { // 2024
            return LocalDate.of(Integer.parseInt(cleanedDate), 1, 1);
        } else if (cleanedDate.length() == 6) { // 202402
            return LocalDate.of(
                Integer.parseInt(cleanedDate.substring(0, 4)),
                Integer.parseInt(cleanedDate.substring(4, 6)),
                1
            );
        } else if (cleanedDate.length() == 8) { // 20240101
            return LocalDate.of(
                Integer.parseInt(cleanedDate.substring(0, 4)),
                Integer.parseInt(cleanedDate.substring(4, 6)),
                Integer.parseInt(cleanedDate.substring(6, 8))
            );
        }

        throw new CsvDataTypeMismatchException("Unexpected date format: " + value);
    }
}
