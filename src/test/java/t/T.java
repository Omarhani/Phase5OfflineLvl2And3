package t;

import base.BaseTests;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T extends BaseTests {



    @Test
    public void t1() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(readDataFromJson.readJson().URL);
    }
    @Test
    public void t2() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(readDataFromJson.readJson().Login.ValidCredentials.Username);
        System.out.println(readDataFromJson.readJson().Login.ValidCredentials.Password);
    }
    @Test
    public void t3() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(readDataFromJson.readJson().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(readDataFromJson.readJson().Login.InvalidCredentials.InvalidUsername.Password);
    }
    @Test
    public void t4() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(readDataFromJson.readJson().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(readDataFromJson.readJson().Login.InvalidCredentials.InvalidPassword.Password);

    }
}
