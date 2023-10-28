package org.example.core.logging;

public class MailLogger implements Logger{
    @Override
    public void addLog(String data) {
        System.out.println("Mail gönderildi: " + data);
    }
}
