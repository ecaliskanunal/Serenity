package EU9.bookit;

import net.serenitybdd.junit5.SerenityTest;
import org.junit.jupiter.api.Test;
import utilities.ConfigurationReader;

@SerenityTest
public class BookItEnvTest {

        @Test
         public void test1(){

            System.out.println(ConfigurationReader.getProperty("base.url"));
            System.out.println(ConfigurationReader.getProperty("teacher_email"));
            System.out.println(ConfigurationReader.getProperty("teacher_password"));
            System.out.println(ConfigurationReader.getProperty("base_path"));
            System.out.println(ConfigurationReader.getProperty("env"));

        }

}
