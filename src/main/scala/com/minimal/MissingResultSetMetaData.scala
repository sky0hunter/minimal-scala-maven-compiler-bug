package com.minimal

import slick.jdbc.MySQLProfile.api._

import scala.util.Try
class MissingResultSetMetaData {

  def selectOne()  = {
    Try {
      sql"select 1".as[Int]
    }
  }
}
