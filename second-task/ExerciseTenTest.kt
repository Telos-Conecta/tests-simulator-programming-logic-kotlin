import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTenTest {

    @Test
    fun `Testing if the first number is divisible by the second`() {
        //Given
        val numberOne = 9
        val numberTwo = 3
        val result =  "$numberOne é divisível por $numberTwo"

        //When
        val exerciseTen = ExerciseTen().logicExerciseTen(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseTen)
    }

    @Test
    fun `Testing if the first number is not divisible by the second`() {
        //Given
        val numberOne = 4
        val numberTwo = 9
        val result = "$numberOne não é divisível por $numberTwo"

        //When
        val exerciseTen = ExerciseTen().logicExerciseTen(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseTen)
    }

}