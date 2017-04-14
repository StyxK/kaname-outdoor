package KanameException;
public class LocationNotMatchException extends Exception {
    public LocationNotMatchException() {
        super("ไม่มีสถานที่ที่คุณค้นหา");
    }
    public LocationNotMatchException(String s){
        super(s);
    }
}
