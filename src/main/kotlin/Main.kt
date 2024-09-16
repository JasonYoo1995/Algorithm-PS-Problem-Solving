fun main() {
    solveProblem(1152)
}

fun solveProblem(number: Int) {
    // 오답 노트 실행
    val methodName = "solution" // 모든 문제의 해결 함수 이름을 'solution'으로 가정
    try {
        // 문제 번호에 따라 코틀린 파일 클래스 이름을 동적으로 생성
        val clazz = Class.forName("BJ.Problem${number}Kt")
        clazz.getDeclaredMethod(methodName).invoke(null)
    } catch (e: ClassNotFoundException) {
        println("Problem class for number $number not found.")
    } catch (e: NoSuchMethodException) {
        println("Method $methodName for problem $number not found.")
    } catch (e: Exception) {
        println("Failed to execute problem $number: ${e.message}")
    }
}