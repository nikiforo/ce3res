package name.nikiforo.ce3res

import cats.effect.IO
import cats.effect.IOApp
import cats.effect.Resource
import cats.effect.implicits._
import cats.syntax.all._

import scala.concurrent.duration._

object Main extends IOApp.Simple {

  def run: IO[Unit] = {
    val res1: Resource[IO, Int] = Resource.pure(1)
    val res2 = res1.product(res1)
    val res3 = res1.timeout(1.second)
    IO.unit
  }
}
