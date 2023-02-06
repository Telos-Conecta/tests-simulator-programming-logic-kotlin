import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseSeventeenTest {

    @Test
    fun `Testing if the difference of the first two numbers is equals than the third`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 0
        val result =  "A diferença do primeiro $numberOne e o Segundo $numberTwo valor é igual que o Terceiro $numberThree"

        //When
        val exerciseSeventeen = ExerciseSeventeen().logicExerciseSeventeen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSeventeen)
    }

    @Test
    fun `Testing if the difference of the first two numbers is not equals than the third`() {
        //Given
        val numberOne = 20
        val numberTwo = 50
        val numberThree = 8
        val result = "A diferença do primeiro $numberOne e o Segundo $numberTwo valor não é igual que o Terceiro $numberThree"

        //When
        val exerciseSeventeen = ExerciseSeventeen().logicExerciseSeventeen(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseSeventeen)
    }

}