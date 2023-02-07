import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseSixteenTest {

    @Test
    fun `Testing if the difference of the first two numbers is less than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 5
        val numberThree = 30
        val result =  "A diferença do primeiro $numberOne e o Segundo $numberTwo valor é menor que o Terceiro $numberThree"

        //When
        val exerciseSixteen = ExerciseSixteen().logicExerciseSixteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSixteen)
    }

    @Test
    fun `Testing if the difference of the first two numbers is not less than the third`() {
        //Given
        val numberOne = 60
        val numberTwo = 20
        val numberThree = 8
        val result = "A diferença do primeiro $numberOne e o Segundo $numberTwo valor não é menor que o Terceiro $numberThree"

        //When
        val exerciseSixteen = ExerciseSixteen().logicExerciseSixteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSixteen)
    }

}