package com.minimal

import slick.jdbc.MySQLProfile.api._

class MissingResultSetMetaData {

  def selectOne() = {
    sql"select 1".as[Int]
  }
}
