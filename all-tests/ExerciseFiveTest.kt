import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseFiveTest{

    @Test
    fun `Testing if the first number is smaller`() {
        //Given
        val numberOne = 4
        val numberTwo = 10
        val numberThree = 10
        val result = "O menor número é: $numberOne"

        //When
        val exerciseFive = ExerciseFive().logicExerciseFive(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFive)
    }

    @Test
    fun `Testing if the second number is smaller`() {
        //Given
        val numberOne = 10
        val numberTwo = 5
        val numberThree = 10
        val result = "O menor número é: $numberTwo"

        //When
        val exerciseFive = ExerciseFive().logicExerciseFive(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFive)
    }

    @Test
    fun `Testing if the third number is smaller`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 2
        val result = "O menor número é: $numberThree"

        //When
        val exerciseFive = ExerciseFive().logicExerciseFive(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFive)
    }

}