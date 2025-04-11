import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main1{
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting:" + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting:" + formattedDate);
    }
}
