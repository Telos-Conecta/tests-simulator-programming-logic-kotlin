import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseThirteenTest {

    @Test
    fun `Testing if the sum of the first two numbers is less than the third`() {
        //Given
        val numberOne = 5
        val numberTwo = 5
        val numberThree = 15
        val result =  "A soma dos dois primeiros $numberOne, $numberTwo é menor que o terceiro $numberThree."

        //When
        val exerciseThirteen = ExerciseThirteen().logicExerciseThirteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseThirteen)
    }

    @Test
    fun `Testing if the sum of the first two numbers is not less than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 20
        val numberThree = 30
        val result = "A soma dos dois primeiros $numberOne, $numberTwo não é menor que o terceiro $numberThree."

        //When
        val exerciseThirteen = ExerciseThirteen().logicExerciseThirteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseThirteen)
    }

}