package KanameException;
public class BlankSearchException extends Exception{
    public BlankSearchException(){
        super("กรุณาใส่ชื่อสถานที่");
    }
    public BlankSearchException(String s){
        super(s);
    }
}