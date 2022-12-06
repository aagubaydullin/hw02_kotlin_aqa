import io.kotest.core.annotation.AutoScan
import io.kotest.core.extensions.TestCaseExtension
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult


@AutoScan
class RepeatOnFailureExtension : TestCaseExtension {
    val maxTestRepeat = 3

    override suspend fun intercept (testCase: TestCase,execute: suspend (TestCase) -> TestResult):TestResult {
        var testResult:TestResult
        var countTest = 1

        do {

            testResult = execute.invoke(testCase)

        } while (maxTestRepeat>=++countTest&&testResult.isErrorOrFailure)

              return testResult
    }
}
