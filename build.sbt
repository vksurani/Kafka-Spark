name := "KafkaSparkStreaming"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion
)
