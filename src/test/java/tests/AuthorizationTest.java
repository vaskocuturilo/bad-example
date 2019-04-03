package tests;

import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.PageFactory.at;
import static tests.PageFactory.open;


import static org.apache.commons.lang3.StringUtils.capitalize;

public class AuthorizationTest {
    User user;
    private Object DashBoardPage;

    @DataSupplier
    public User adminProvider() {
        return User.admin();

    }

    @Test(dataProvider = "adminProvider")
    public void test(User user) {
        open(LoginPage.class).navigateTo();
        assertThat(at((Class<tests.DashBoardPage>) DashBoardPage).username()).isEqualTo(capitalize(user.getUsername()));
    }


}
