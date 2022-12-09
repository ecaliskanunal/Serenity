package EU9.spartan;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utilities.ConfigurationReader;
@Disabled
public class ConfigDemoTest {

    @Test
    public void test1(){
        System.out.println(ConfigurationReader.getProperty("serenity.project.name"));
        System.out.println(ConfigurationReader.getProperty("spartan.editor.username"));

    }
}
