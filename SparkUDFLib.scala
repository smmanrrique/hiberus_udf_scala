package udf.functions.SparkUDFLib

import org.apache.spark.sql.api.java.UDF1

class ParseGender extends UDF1[String, String] {
 def call(s: String): String = {
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
