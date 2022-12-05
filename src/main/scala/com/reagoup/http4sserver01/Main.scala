package com.reagoup.http4sserver01

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    Http4sserver01Server.stream[IO].compile.drain.as(ExitCode.Success)
}
