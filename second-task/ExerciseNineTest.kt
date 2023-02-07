import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseNineTest {

    @Test
    fun `Testing if the number is divisible by three`() {
        //Given
        val numberOne = 9
        val result =  "$numberOne é divisível por 3"

        //When
        val exerciseNine = ExerciseNine().logicExerciseNine(numberOne)

        //Then
        assertEquals(result, exerciseNine)
    }

    @Test
    fun `Testing if the number is not divisible by three`() {
        //Given
        val numberOne = 11
        val result = "$numberOne não é divisível por 3"

        //When
        val exerciseNine = ExerciseNine().logicExerciseNine(numberOne)

        //Then
        assertEquals(result, exerciseNine)
    }

}