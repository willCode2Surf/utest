package utest

/**
 * Created by haoyi on 2/5/14.
 */
object Main {
  def main(args: Array[String]): Unit = {
  }
}
import utest.ExecutionContext.RunNow
import utest.framework.{Result, TestSuite}
import scala.concurrent.ExecutionContext
import scala.util.Success




object MyTestSuite {
  val tests = TestSuite{
    "test2" - {
      val a = 1
      val b = 2
      assert(a == b)
    }
  }
}