package org.semiproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

public class FileDownload {
    public static void main(String[] args) {
        String fileURL = "https://librarian.nl.go.kr/LI/contents/L10507010000.do"; // 대상 URL
        String saveDir = "src/org/semiproject/"; // 저장할 경로

        try {
            URL url = new URL(fileURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            int responseCode = httpConn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                String fileName = "";
                String disposition = httpConn.getHeaderField("Content-Disposition");
                String contentType = httpConn.getContentType();

                // 1. 헤더에서 파일명 추출 시도
                if (disposition != null) {
                    int index = disposition.indexOf("filename=");
                    if (index > 0) {
                        fileName = disposition.substring(index + 10, disposition.length() - 1);
                        // 인코딩된 파일명 처리 (예: UTF-8) 필요할 수 있음
                        fileName = URLDecoder.decode(fileName, "UTF-8");
                    }
                }

                // 2. 파일명이 없으면 URL이나 Content-Type으로 기본 이름 생성
                if (fileName.equals("")) {
                    fileName = "downloaded_file";
                    if (contentType.contains("pdf")) fileName += ".pdf";
                    else if (contentType.contains("zip")) fileName += ".zip";
                }

                System.out.println("파일명: " + fileName);

                // 실제 파일 저장 로직 (InputStream 읽기 및 FileOutputStream 쓰기)
                InputStream inputStream = httpConn.getInputStream();
                FileOutputStream outputStream = new FileOutputStream(saveDir + File.separator + fileName);

                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();
                inputStream.close();
                System.out.println("다운로드 완료");
            }
            httpConn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
