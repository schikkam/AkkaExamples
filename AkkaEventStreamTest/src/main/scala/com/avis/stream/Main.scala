package com.avis.stream

import java.io.{File, FileOutputStream, PrintStream}

object Main {

  val ps = new PrintStream(new FileOutputStream(new File("output.txt")))

  def main(args: Array[String]) {

    // setup subscriptions
    EventStream.subscribe(Foo.onEvent, "foo")
    EventStream.subscribe(Bar.onEvent, "bar")
    EventStream.subscribe(Logger.onEvent(ps), "logger")
    run
  }

  def run {
    EventStream.publish("Sales", "payload Sales")
    EventStream.publish("Purchase", "payload Purchase")
    stop
  }

  def stop = Logger.stop(ps)

}
