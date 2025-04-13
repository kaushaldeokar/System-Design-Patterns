public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"This is error log");
//        logProcessor.log(LogProcessor.DEBUG,"Need to Debug");
//        logProcessor.log(LogProcessor.INFO,"Info log");
    }
}