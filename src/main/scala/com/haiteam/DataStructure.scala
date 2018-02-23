package com.haiteam

import org.apache.spark.sql.SparkSession

object DataStructure {

  def main(args: Array[String]): Unit = {

    // spark 정의
    var spark = SparkSession.builder().appName("hkProject").
      config("spark.master","local").
        getOrCreate()

    val HOME = "c:/spark/bin/"
    val valData = spark.sparkContext.textFile(HOME+"./data/kopo_product_volume.csv")
    valData = spark.sparkContext.textFile(HOME+"./data/kopo_product_volume.csv")

    var varData = spark.sparkContext.textFile(HOME+"./data/kopo_product_volume.csv")
    varData = spark.sparkContext.textFile(HOME+"./data/kopo_product_volume.csv")

    var loadRdd = spark.sparkContext.textFile(HOME+"./data/kopo_product_volume.csv")
    loadRdd.collect.foreach(println)

    // 함수 생성
    def {함수명} (입력파라미터): 반환타입 = {
        ...함수구현
      결과변수
    }

    import org.apache.spark.sql.Row

    spark.sqlContext.pa


    val sampleData = Array(1,2,3,4,5,6,7)
    val rowRDD = spark.sparkContext.makeRDD(sampleData.map(value => Row(value)))

    import java.util.Calendar

    var calendar = Calendar.getInstance()
    var time = calendar.getTime
  }

}
