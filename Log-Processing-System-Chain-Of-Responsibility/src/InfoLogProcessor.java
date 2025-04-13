public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==INFO){
            System.out.println("INFO:"+message);
        }else {
            System.out.println("passed from Info Log");
            super.log(logLevel,message);
        }
    }
}
