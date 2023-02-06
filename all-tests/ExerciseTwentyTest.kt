import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwentyTest {

    @Test
    fun `Testing if the sum of the first three numbers less the fourth`() {
        //Given
        val numberOne = 6
        val numberTwo = 10
        val numberThree = 10
        val numberFour = 30
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree é menor que o quarto $numberFour!"

        //When
        val exerciseTwenty = ExerciseTwenty().logicExerciseTwenty(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseTwenty)
    }

    @Test
    fun `Testing if the sum of the first three numbers is not less the fourth`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val numberFour = 40
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree não é menor que o quarto $numberFour."

        //When
        val exerciseTwenty = ExerciseTwenty().logicExerciseTwenty(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseTwenty)
    }

}