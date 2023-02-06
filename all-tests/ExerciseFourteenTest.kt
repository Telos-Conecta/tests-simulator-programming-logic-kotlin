import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseFourteenTest{

    @Test
    fun `Testing if the difference of the first two numbers is equals than the third`() {
        //Given
        val numberOne = 5
        val numberTwo = 5
        val numberThree = 10
        val result =  "A soma dos dois primeiros números $numberOne, $numberTwo é igual ao terceiro $numberThree."

        //When
        val exerciseFourteen = ExerciseFourteen().logicExerciseFourteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFourteen)
    }

    @Test
    fun `Testing if the difference of the first two numbers is not equals than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 20
        val numberThree = 30
        val result = "A soma dos dois primeiros números $numberOne, $numberTwo não é igual ao terceiro $numberThree."

        //When
        val exerciseFourteen = ExerciseFourteen().logicExerciseFourteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFourteen)
    }

}