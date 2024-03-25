package loggers;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message +" by FileLogger");
    }
}
