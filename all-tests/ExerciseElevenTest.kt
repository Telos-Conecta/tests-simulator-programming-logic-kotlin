import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseElevenTest {

    @Test
    fun `Testing if the three numbers are divisible`() {
        //Given
        val numberOne = 90
        val numberTwo = 9
        val numberThree = 3
        val result =  "Os três números $numberOne, $numberTwo, $numberThree são divisíveis entre si"

        //When
        val exerciseEleven = ExerciseEleven().logicExerciseEleven(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseEleven)
    }

    @Test
    fun `Testing if the three numbers are not divisible`() {
        //Given
        val numberOne = 9
        val numberTwo = 11
        val numberThree = 8
        val result = "Os três números $numberOne, $numberTwo, $numberThree não são divisíveis entre si"

        //When
        val exerciseEleven = ExerciseEleven().logicExerciseEleven(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseEleven)
    }

}