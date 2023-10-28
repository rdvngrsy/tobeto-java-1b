package org.example.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void addLog(String data) {
        System.out.println("Veritabanına loglandı: " + data);
    }
}
