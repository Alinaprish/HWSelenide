package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


class AppOrderTest {
    @Test
    void shouldTest () {
        open("http://localhost:7777");
        $("[data-test-id='name'] input").setValue("Екатерина");
        $("[data-test-id='phone'] input").setValue("+79105465454");
        $("[data-test-id='agreement']").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
}
}
