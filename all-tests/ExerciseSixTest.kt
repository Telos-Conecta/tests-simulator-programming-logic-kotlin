import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseSixTest{

    @Test
    fun `Testing if the three numbers are equal`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 10
        val result = "Os números $numberOne, $numberTwo e $numberThree são iguais"

        //When
        val exerciseSix = ExerciseSix().logicExerciseSix(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSix)
    }

    @Test
    fun `Testing if the three numbers are not equal`() {
        //Given
        val numberOne = 11
        val numberTwo = 10
        val numberThree = 10
        val result = "Os números $numberOne, $numberTwo e $numberThree são diferentes"

        //When
        val exerciseSix = ExerciseSix().logicExerciseSix(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSix)
    }

}