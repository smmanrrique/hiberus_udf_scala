package udf.functions.SparkUDFLib

// import org.apache.hadoop.hive.ql.exec.UDF;
// import org.apache.spark.sql.api.java.UDF1;

// class SimpleUdf extends UDF1[Integer, Integer]  {

//     def evaluate(value: Int ): Int = {

//         return value + 10
//     }

// }

import org.apache.spark.sql.api.java.UDF1

class addOne extends UDF1[Integer, Integer] {
  def call(x: Integer) = x + 1
}