package com.example

import app.cash.sqldelight.ColumnAdapter
import app.cash.sqldelight.core.integration.Shoots
import kotlin.Long
import kotlin.String

public data class Team(
  public val name: String,
  public val captain: Long,
  public val inner_type: Shoots.Type?,
  public val coach: String
) {
  public class Adapter(
    public val inner_typeAdapter: ColumnAdapter<Shoots.Type, String>
  )
}
