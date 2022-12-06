import io.kotest.core.spec.style.ExpectSpec
import io.kotest.core.spec.style.Test
import io.kotest.matchers.shouldBe
import io.qameta.allure.Owner
import org.junit.jupiter.api.DisplayName

@Owner("OTUS Kotlin AQA, Aydar Gubaydullin")
@DisplayName("Тестовый прогон")
@Test
class MainTest:ExpectSpec({

       context("Home work 02 with Kotlin AQA") {
           expect("Позитивный тест") {
               2 + 2 shouldBe 4

           }
           expect("Негативный тест") {
               2 + 2 shouldBe 5
           }
       }

})
