import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwoTest {

    @Test
    fun `Testing if two numbers are equal`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val result = "Os números $numberOne, $numberTwo são iguais"

        //When
        val exerciseTwo = ExerciseTwo().logicExerciseTwo(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseTwo)
    }

    @Test
    fun `Testing if two numbers are not equal`() {
        //Given
        val numberOne = 11
        val numberTwo = 10
        val result = "Os números $numberOne, $numberTwo são diferentes"

        //When
        val exerciseTwo = ExerciseTwo().logicExerciseTwo(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseTwo)
    }

}