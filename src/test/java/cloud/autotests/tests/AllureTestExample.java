package cloud.autotests.tests;


import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureTestExample  {

  @Test
  @AllureId("11799")
  @DisplayName("Авторизация через GitHub")
  @Tag("web")
  @Story("Авторизация через сторонние системы")
  @Owner("allure8")
  @Feature("Авторизация")
  public void testGoogleAuth() {
    step("Открываем главную страницу");
    step("Нажимаем кнопку авторизация");
    step("Выбираем способ авторизации через GitHub");
    step("Авторизуемся как пользователь", () -> {
      step("Вводим логин");
      step("Вводим пароль");
      step("Нажимаем кнопку войти");
    });
    step("Должны оказаться на главной страницы сайта");
    step("Профиль пользователя должен быть заполнен из GitHub", () -> {
      step("Имя");
      step("Логин");
      step("Аватарка");
    });
    step("Разлогиниваемся");
  }

}