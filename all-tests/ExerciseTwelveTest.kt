import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwelveTest {

    @Test
    fun `Testing if the sum of the first two numbers is greater than the third`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 15
        val result =  "A soma dos dois primeiros $numberOne, $numberTwo é maior que o terceiro $numberThree."

        //When
        val exerciseTwelve = ExerciseTwelve().logicExerciseTwelve(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseTwelve)
    }

    @Test
    fun `Testing if the sum of the first two numbers is not greater than the third`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 30
        val result = "A soma dos dois primeiros $numberOne, $numberTwo não é maior que o terceiro $numberThree."

        //When
        val exerciseTwelve = ExerciseTwelve().logicExerciseTwelve(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseTwelve)
    }


}