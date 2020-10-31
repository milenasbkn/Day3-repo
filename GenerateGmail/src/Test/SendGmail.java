package Test;

import Library.Util;
 /*
            first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
 */
public class SendGmail {

    public static void main(String[] args) {
        String userName = "Cybertek.Batch@gmail.com";
        String passWord = "CybertekBatch20";

        // email:

        String[] receivers = {"Cybertek.Batch@gmail.com", "milenasbkn@gmail.com", "wakarjan@gmail.com"};
        String subject = "Muhtar";
        String text = "Hi, How are you? Why you are so...";

        int times=5; // how many times you want to send the email to specific email address
        int count=1;
        while(times>0){ // to send the email multiple times

        for (String each : receivers) {
            System.out.println("Sending to: " + each+" "+count++);
            Util.sendEmails(userName, passWord, each, subject, text);
        }
            System.out.println(count++);
            times--;
    }
        System.out.println("Completed");

    }
}
