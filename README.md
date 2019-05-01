# Trying Jooq code-generation with PostGis

#### Context
I am trying out Postgres' Geographic Information System extension [PostGis](https://postgis.net/) that enables stories latitude and longitudes as [Point](https://postgis.net/docs/ST_Point.html) and operations on it.

[If I understand correctly](https://www.jooq.org/doc/latest/manual/code-generation/codegen-advanced/codegen-config-database/codegen-database-forced-types/) then I need to add a custom converter that can convert the `point` between JOOQ and PostGis and add it to the [gradle](./build.gradle) file.
 

#### Problem 
When I generate the jooq-code, few files are generated incorrectly and have the fields defined twice which fail compilation. These are:
```
<configured-generation-dir>/tables/StValuecount.java
<configured-generation-dir>/tables/records/StValuecountRecord.java
<configured-generation-dir>/tables/records/StValuepercentRecord.java
<configured-generation-dir>/tables/_StValuecount.java
<configured-generation-dir>/tables/records/_StValuecountRecord.java
<configured-generation-dir>/tables/_StHistogram.java
<configured-generation-dir>/tables/records/_StHistogramRecord.java
<configured-generation-dir>/tables/_StQuantile.java
```

### Steps to reproduce
* Checkout project
```bash
git clone https://github.com/raj-saxena/JooqBreaksWithPostGis
```

* Go to the project directory and start postgis docker container with
```bash
docker-compose up
```

* Similarly, to remove postgis docker container run
```bash
docker-compose down 
```

* Run migrations that add a simple `City` table containing `Point` type with 
```bash
./gradlew flywayMigrate
```

* I have added few rows in a second migration to verify if the DB structure was working. Details to connect to Postgres instance in the build.gradle file.

* Generate jooq files with 
```bash
./gradlew generateMyAwesomeAppJooqSchemaSource
```

* Verify that the files are generated in the configured `src/main/java/generated` directory.

* Verify that the files mentioned above fail to compile. 
