package tests;

import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.Test;

import static com.sun.java.util.jar.pack.Instruction.at;
import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.assertj.core.api.Assertions.assertThat;
import static sun.management.FileSystem.open;

public class AuthorizationTest {
    User user;

    @DataSupplier
    public User adminProvider() {
        return User.admin();
        open(LoginPage.class).loginWith(user);
    }

    @Test(dataProvider = "adminProvider")
    public void test(User user) {

        assertThat(at(DashBoardPage.class).username().isEqualTo(capitalize(user.getUsername())));
    }


}
