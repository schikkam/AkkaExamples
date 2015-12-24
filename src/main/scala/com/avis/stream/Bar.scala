package com.avis.stream


object Bar {
  val onEvent = (topic: String, payload: Any) => Some(topic) collect {
    case "Sales" =>
      println("Bar received: Sales Topic= " + topic + " payload = " + payload)
      EventStream.publish("topic C", "payload C")
  }
}
