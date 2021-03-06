package utest

import scala.concurrent.ExecutionContext

object ExecutionContext{
  implicit object RunNow extends ExecutionContext {
    def execute(runnable: Runnable) =
      try   { runnable.run() }
      catch { case t: Throwable => reportFailure(t) }

    def reportFailure(t: Throwable) =
      Console.err.println("Failure in async execution: " + t)
  }
}
