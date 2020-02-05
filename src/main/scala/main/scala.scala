package main

import java.io.File
import com.github.tototoshi.csv._
case class Cat(name : String, race : String, age: Int)
case class Person(firstName: String, lastName: String, salary: Int, numberOfChildren: Int)
case class Car(brand: String, countryOfBirth: String, maxSpeed: Int, speeds: Int)
case class Actor(name: String, filmsPlayed: Seq[String])

object scala {

  def Matching(list: Seq[String]): Unit ={

    var itera = 0
   while(list(list.length-1-itera).isEmpty){
     itera=itera+1
   }
    list.dropRight(itera).length match {
      case 3 =>  val caty= new Cat(list(0),list(1),list(2).toInt);
      case 4 =>  val car = new Car(list(0),list(1),list(2).toInt,list(3).toInt)
    }

  }
  def main(args: Array[String]): Unit = {

    val reader = CSVReader.open(new File("C:\\Users\\rskon\\Desktop\\sample.csv"))

    reader.foreach(fields => Matching(fields)


    )

    reader.close()
  }

}
