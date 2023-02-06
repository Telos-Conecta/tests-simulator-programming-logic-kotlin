import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseEightTest {

    @Test
    fun `Testing the difference between two numbers is even`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val result = "A diferença entre os números $numberOne, $numberTwo é par"

        //When
        val exerciseEight = ExerciseEight().logicExerciseEight(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseEight)
    }

    @Test
    fun `Testing the difference between two numbers is odd`() {
        //Given
        val numberOne = 11
        val numberTwo = 10
        val result = "A diferença entre os números $numberOne, $numberTwo é ímpar"

        //When
        val exerciseEight = ExerciseEight().logicExerciseEight(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseEight)
    }

}