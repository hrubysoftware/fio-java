# Fio Bank Java Client

## Usage

The *Fio Bank Java Client* is available in Maven Central Repository, to use it from Maven add to `pom.xml`:

```xml
<dependency>
    <groupId>cz.geek</groupId>
    <artifactId>fio-java</artifactId>
    <version>${version}</version>
</dependency>
```

### Construct the FioClient
```java
FioClient fio = new FioClient("yourtoken");
```

### Get account statement

Get account statement with **the given number within the given year**:
```java
FioAccountStatement statement = fio.getStatement(2016, 1);
```

Get account statement within **the given period**:
```java
FioAccountStatement statement = fio.getStatement(new LocalDate(2016, 1, 1), new LocalDate(2016, 1, 31));
```

Get account statement from the **last download**:
```java
FioAccountStatement statement = fio.getStatement();
```

### Export account statement

Export account statement with **the given number within the given year**:
```java
fio.getStatement(2016, 1, ExportFormat.pdf, outputStream);
```

Export account statement within **the given period**:
```java
fio.getStatement(new LocalDate(2016, 1, 1), new LocalDate(2016, 1, 31), ExportFormat.pdf, outputStream);
```

Export account statement from the **last download**:
```java
fio.getStatement(ExportFormat.pdf, outputStream);
```

### Set last downloaded statement

Set last downloaded statement **by date**:
```java
fio.setLast(new LocalDate(2016, 1, 1));
```

Set last downloaded statement **by transaction id**:
```java
fio.setLast("1147608198");
```

## Documentation

* [original documentation](http://www.fio.cz/docs/cz/API_Bankovnictvi.pdf)
* [local copy](API_Bankovnictvi.pdf)

## XML Schemas

* [IBSchema.xsd](http://www.fio.cz/xsd/IBSchema.xsd)
* [importIB.xsd](http://www.fio.cz/schema/importIB.xsd)
* [responseImportIB.xsd](http://www.fio.cz/schema/responseImportIB.xsd)
* [type.xsd](http://www.fio.cz/schema/type.xsd)
* [local copies](src/main/resources)


## License
The *Fio Bank Java Client* is free and open-source software under [BSD License](LICENSE.txt).

