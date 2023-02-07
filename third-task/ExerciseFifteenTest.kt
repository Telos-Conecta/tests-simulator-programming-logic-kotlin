import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseFifteenTest {

    @Test
    fun `Testing if the difference of the first two numbers is greater than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 5
        val numberThree = 6
        val result =  "A diferença do primeiro $numberOne e o Segundo $numberTwo valor é maior que o Terceiro $numberThree"

        //When
        val exerciseFifteen = ExerciseFifteen().logicExerciseFifteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFifteen)
    }

    @Test
    fun `Testing if the difference of the first two numbers is not greater than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 20
        val numberThree = 60
        val result = "A diferença do primeiro $numberOne e o Segundo $numberTwo valor não é maior que o Terceiro $numberThree"

        //When
        val exerciseFifteen = ExerciseFifteen().logicExerciseFifteen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFifteen)
    }

}