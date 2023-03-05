package ru.netology.test;

import com.codeborne.selenide.SelenideElement;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;

import javax.annotation.Nonnull;

import static com.codeborne.selenide.Selenide.;
//@Nonnull;
//@CanIgnoreReturnValue;

import java.nio.channels.ConnectionPendingException;


class AppOrderTest {
    @Test
    void shouldTest () {
        open("http://localhost:9999");
        SelenideElement form = $("[data-test-id=AppOrder-form]");
        form.$("[data-test-id=name]").setValue("Екатерина");
        form.$("[data-test-id=phone]").setValue("+79105465454");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));




}
}
