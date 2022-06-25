package domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UserTest {

    public static UserCreator userCreator = new UserCreator();
    User user = new User("166489229", "Felipe", "Bustos Ponce", createList("Cardenal Raul Silva Henriquez 409"), createList("56999010015"), createList("felipe.bustosp@gmail.com"));
    User userFromFile = UserCreator.createUserFromFile("/home/felipe/Projects/pets/pets-core/src/test/data/user_data");

    @Test
    public void testUserCreator(){
        assertNotNull(userFromFile);
    }

    @Test
    public void testFirstName() {
        assertNotNull(user.getFirstName());
    }

    @Test
    public void testAddresses(){
        assertNotNull(user.getAddresses());
        assertEquals("Cardenal Raul Silva Henriquez 409", user.getAddresses().get(0));
    }

    private List<String> createList (String input){
        List<String> list = new ArrayList<String>();
        list.add(input);
        return list;
    }
    

}
