import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseThreeTest {

    @Test
    fun `Testing if the first number is greater`() {
        //Given
        val numberOne = 120
        val numberTwo = 10
        val result = "O primeiro número é o maior: $numberOne"

        //When
        val exerciseThree = ExerciseThree().logicExerciseThree(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseThree)
    }

    @Test
    fun `Testing if second number is greater`() {
        //Given
        val numberOne = 10
        val numberTwo = 120
        val result = "O segundo número é o maior: $numberTwo"

        //When
        val exerciseThree = ExerciseThree().logicExerciseThree(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseThree)
    }

    @Test
    fun `Testing if two numbers are equal`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val result = "Os números $numberOne, $numberTwo são iguais"

        //When
        val exerciseThree = ExerciseThree().logicExerciseThree(numberOne, numberTwo)

        //Then
        assertEquals(result, exerciseThree)
    }

}