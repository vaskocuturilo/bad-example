package tests;

import org.assertj.core.api.AbstractBigDecimalAssert;

import static jdk.nashorn.internal.objects.NativeString.substring;
import static tests.BaseConfig.BASE_CONFIG;

public interface Page {

    default Page navigateTo() {
        return navigateTo(url());
    }

    Page navigateTo(String url);

    default String url() {
        return BASE_CONFIG.url();
    }

    default String username() {
        return null;
    }


}
