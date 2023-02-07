import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwentyThreeTest {

    @Test
    fun `Testing whether the sum of the first three numbers is less to the fourth plus fifth`() {
        //Given
        val numberOne = 8
        val numberTwo = 8
        val numberThree = 8
        val numberFour = 15
        val numberFive = 15
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberTwo é menor que à soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyThree = ExerciseTwentyThree().logicExerciseTwentyThree(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyThree)
    }

    @Test
    fun `Testing whether the sum of the first three numbers is not less to the fourth plus fifth`() {
        //Given
        val numberOne = 20
        val numberTwo = 70
        val numberThree = 20
        val numberFour = 40
        val numberFive = 60
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree não é menor que à soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyThree = ExerciseTwentyThree().logicExerciseTwentyThree(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyThree)
    }

}