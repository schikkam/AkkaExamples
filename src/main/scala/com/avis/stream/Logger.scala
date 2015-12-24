package com.avis.stream


import java.io._

object Logger {

  def onEvent(ps: PrintStream) = (topic: String, payload: Any) => Option[Unit] {
      try {
        println("Logger received: Available Stock = " + topic + ", payload = " + payload)
        ps.println("Logger [" + topic + "] [" + payload + "]")
      }
      catch {
        case ioe: IOException => println("IOException: " + ioe.toString)
        case e: IOException => println("Exception: " + e.toString)
      }
  }

  def stop(ps: PrintStream) = ps.close()
}

