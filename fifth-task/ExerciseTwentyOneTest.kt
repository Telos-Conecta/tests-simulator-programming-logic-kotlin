import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseTwentyOneTest {

    @Test
    fun `Testing whether the sum of the first three numbers is equal to the fourth plus fifth`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 10
        val numberFour = 15
        val numberFive = 15
        val result =  "A soma dos três primeiros números $numberOne, $numberTwo e $numberTwo é igual à soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyOne = ExerciseTwentyOne().logicExerciseTwentyOne(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyOne)
    }

    @Test
    fun `Testing whether the sum of the first three numbers is not equal to the fourth plus fifth`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val numberFour = 40
        val numberFive = 40
        val result = "A soma dos três primeiros números $numberOne, $numberTwo e $numberThree é diferente da soma dos dois últimos $numberFour, $numberFive!"

        //When
        val exerciseTwentyOne = ExerciseTwentyOne().logicExerciseTwentyOne(numberOne, numberTwo, numberThree, numberFour, numberFive)

        //Then
        assertEquals(result, exerciseTwentyOne)
    }

}