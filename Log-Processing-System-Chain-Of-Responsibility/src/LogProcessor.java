public class LogProcessor {

    public LogProcessor nextLogProcessor;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

//    whever initialize give what is next log processor //
//    from compile time only next log processor is defined


    public LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor=logProcessor;
    }

    public void log(int loglevel , String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(loglevel, message);
        }
    }

}
