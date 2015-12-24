package com.avis.stream

object Foo {
  val onEvent = (topic: String, payload: Any) => Some(topic) collect {
    case "Purchase" => println("Foo received: Purchase = " + topic + ", payload = " + payload)
  }
}
