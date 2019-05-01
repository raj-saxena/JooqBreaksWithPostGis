package com.example.JooqBreaksWithPostGis.jooq.converters

import org.jooq.Converter
import org.postgis.Point

public class PostgresPointJooqConverter : Converter<Any, Point> {
    override fun from(databaseObject: Any): Point = when (databaseObject) {
        is Point -> Point(databaseObject.x, databaseObject.y)
        else -> Point(0.0, 0.0)
    }

    override fun to(userObject: Point): Any = userObject

    override fun fromType(): Class<Any> = Any::class.java

    override fun toType(): Class<Point> = Point::class.java
}
