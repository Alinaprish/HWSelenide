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
        SelenideElement form = $("[.form]");
        form.$("[.input data-test-id=name]").setValue("Екатерина");
        form.$("[.input data-test-id=phone]").setValue("+79105465454");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $("[paragraph data-test-id=order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));



}
}
