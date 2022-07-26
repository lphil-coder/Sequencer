package sequencer;

import java.util.Scanner;

public class MsgHandlerImpl implements Group.MsgHandler {

    public String message;
    
    public MsgHandlerImpl() {
    }

    public String getMessage() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message to send: \n");
        String message = input.next();
        return message;
    }

    @Override
    public void handle(int count, byte[] msg) {
        
        String mg = new String(msg);
        String mgs[] = mg.split(" ");
        System.out.println("Message received is: " + mgs[0] + ", its unique ID is " + mgs[1] + " its sequence number is " + mgs[2]); 
    
    }
}

