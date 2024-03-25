package loggers;

public class ElasticSearchLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message +"by ElasticSearchLogger ");
    }
}
