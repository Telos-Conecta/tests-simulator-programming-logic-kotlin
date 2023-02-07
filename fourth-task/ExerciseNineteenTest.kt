import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseNineteenTest {

    @Test
    fun `Testing if the sum of the first three numbers greater the fourth`() {
        //Given
        val numberOne = 14
        val numberTwo = 10
        val numberThree = 10
        val numberFour = 30
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree é maior que o quarto $numberFour!"

        //When
        val exerciseNineteen = ExerciseNineteen().logicExerciseNineteen(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseNineteen)
    }

    @Test
    fun `Testing if the sum of the first three numbers is not greater the fourth`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val numberFour = 90
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree não é maior que o quarto $numberFour."

        //When
        val exerciseNineteen = ExerciseNineteen().logicExerciseNineteen(numberOne, numberTwo, numberThree, numberFour)

        //Then
        assertEquals(result, exerciseNineteen)
    }

}