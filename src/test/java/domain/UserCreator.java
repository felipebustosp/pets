package domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserCreator {

    public static User createUserFromFile(String path){
        try {
            User result = new User();
            String currentLine;
            BufferedReader buffer = new BufferedReader(new FileReader(path));
            
            while ((currentLine = buffer.readLine()) != null){
                System.out.println(currentLine);
                String[] parsed = currentLine.split("=");
                switch (parsed[0]){
                    case "externalId":
                        result.setExternalId(parsed[1]);
                    case "firstName":
                        result.setFirstName(parsed[1]);
                    case "lastName":
                        result.setLastName(parsed[1]);
                    case "address":
                        result.setAddresses(valueToList(parsed[1]));
                    case "phoneNumber":
                        result.setPhoneNumbers(valueToList(parsed[1]));
                    case "email":
                        result.setEmails(valueToList(parsed[1]));
                    default:
                }
            }
            buffer.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<String> valueToList(String string) {
        List<String> list = new ArrayList<String>();
        list.add(string);
        return list;
    }


}