import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwentyTwoTest {

    @Test
    fun `Testing whether the sum of the first three numbers is greater to the fourth plus fifth`() {
        //Given
        val numberOne = 15
        val numberTwo = 15
        val numberThree = 15
        val numberFour = 15
        val numberFive = 15
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberTwo é maior que à soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyTwo = ExerciseTwentyTwo().logicExerciseTwentyTwo(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyTwo)
    }

    @Test
    fun `Testing whether the sum of the first three numbers is not greater to the fourth plus fifth`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val numberFour = 40
        val numberFive = 60
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree não é maior que à soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyTwo = ExerciseTwentyTwo().logicExerciseTwentyTwo(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyTwo)
    }

}