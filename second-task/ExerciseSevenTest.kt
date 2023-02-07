import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseSevenTest{

    @Test
    fun `Testing the sum of two numbers is equal to the third`() {
        //Given
        val numberOne = 5
        val numberTwo = 5
        val numberThree = 10
        val result = "A soma dos dois primeiros $numberOne, $numberTwo é igual ao terceiro $numberThree"

        //When
        val exerciseSeven = ExerciseSeven().logicExerciseSeven(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSeven)
    }

    @Test
    fun `Testing the sum of two numbers is not equal to the third`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 50
        val result = "A soma dos dois primeiros $numberOne, $numberTwo não é igual ao terceiro $numberThree"

        //When
        val exerciseSeven = ExerciseSeven().logicExerciseSeven(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSeven)
    }

}