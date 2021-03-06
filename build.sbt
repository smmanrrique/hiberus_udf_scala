name := "spark-udf-lib"
version := "0.1"
organization := "udf.functions"
scalaVersion := "2.11.8"
val sparkVersion = "2.4.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
