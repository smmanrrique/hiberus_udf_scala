import org.apache.spark.sql.expressions.MutableAggregationBuffer
import org.apache.spark.sql.expressions.UserDefinedAggregateFunction
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._ extends UserDefinedAggregateFunction

class AccessHandler extends UserDefinedAggregateFunction, UDF1[String, String] {
 
 def Access(s: String): String = {
  if (List("cis female", "f", "female", "woman", "femake", "female ",
    "cis-female/femme", "female (cis)", "femail").contains(s.toLowerCase))
   "Female"
  else if (List("male", "m", "male-ish", "maile", "mal", "male (cis)",
    "make", "male ", "man", "msle", "mail", "malr", "cis man", "cis male").contains(s.toLowerCase))
   "Male"
  else
   "Transgender"
 }
}
