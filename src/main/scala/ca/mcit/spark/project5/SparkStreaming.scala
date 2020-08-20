package ca.mcit.spark.project5

import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkStreaming extends App {

  val spark = SparkSession.builder().appName("project 5").master("local[*]").getOrCreate()
  val tripsDf: DataFrame = spark.read.option("header","true").text("/user/winter2020/vasu/project5/trips/trips.txt")
  val frequenciesDf: DataFrame = spark.read.text("/user/winter2020/vasu/project5/trips/frequencies.txt")
  val calendarDatesDf: DataFrame = spark.read.text("/user/winter2020/vasu/project5/trips/calendar_dates.txt")
  tripsDf.show()
//  val tripsDf.join(frequenciesDf)
  spark.stop()
}
