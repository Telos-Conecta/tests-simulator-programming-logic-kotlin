import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseEighteenTest {

    @Test
    fun `Testing if the sum of the first three numbers equals the fourth`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 10
        val numberFour = 30
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree é igual ao quarto $numberFour!"

        //When
        val exerciseEighteen = ExerciseEighteen().logicExerciseEighteen(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseEighteen)
    }

    @Test
    fun `Testing if the sum of the first three numbers is not equals the fourth`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val numberFour = 30
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree não é igual ao quarto $numberFour."

        //When
        val exerciseEighteen = ExerciseEighteen().logicExerciseEighteen(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseEighteen)
    }

}