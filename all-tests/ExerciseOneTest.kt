import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseOneTest {

    @Test
        fun `Testing if the sum of two numbers is even`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val result = "A soma de $numberOne + $numberTwo é par"

        //When
        val exerciseOne = ExerciseOne().logicExerciseOne(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseOne)
    }

    @Test
    fun `Testing if the sum of two numbers is odd`() {
        //Given
        val numberOne = 11
        val numberTwo = 10
        val result = "A soma de $numberOne + $numberTwo é ímpar"

        //When
        val exerciseOne = ExerciseOne().logicExerciseOne(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseOne)
    }
}