package com.minimal

import akka.stream.alpakka.slick.scaladsl.{Slick, SlickSession}
import slick.jdbc.MySQLProfile.api._

import scala.util.Try
class MissingResultSetMetaData {

    implicit val slickSession = SlickSession.forConfig("mysql")

     def findCountryByIso3Code()  = {
        Try {
            Slick.source(sql"select 1".as[Int])
        }
    }
}
