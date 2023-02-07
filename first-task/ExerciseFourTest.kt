import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExerciseFourTest{

    @Test
    fun `Testing if the first number is greater`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 10
        val result = "$numberOne é o maior número"

        //When
        val exerciseFour = ExerciseFour().logicExerciseFour(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFour)
    }

    @Test
    fun `Testing if the second number is greater`() {
        //Given
        val numberOne = 10
        val numberTwo = 20
        val numberThree = 10
        val result = "$numberTwo é o maior número"

        //When
        val exerciseFour = ExerciseFour().logicExerciseFour(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFour)
    }

    @Test
    fun `Testing if the third number is greater`() {
        //Given
        val numberOne = 10
        val numberTwo = 10
        val numberThree = 30
        val result = "$numberThree é o maior número"

        //When
        val exerciseFour = ExerciseFour().logicExerciseFour(numberOne, numberTwo, numberThree)

        //Then
        assertEquals(result, exerciseFour)
    }

}