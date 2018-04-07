# gwt-i18n-cldr
GWT cldr classes generated from gwt-cldr-importer

### Dependencies

```xml
<dependency>
    <groupId>org.gwtproject.i18n</groupId>
    <artifactId>gwt-cldr</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>org.gwtproject.i18n</groupId>
    <artifactId>gwt-cldr</artifactId>
    <version>1.0-SNAPSHOT</version>
    <classifier>sources</classifier>
</dependency>
```

### Inherits

```xml
<inherits name="org.gwtproject.i18n.CLDR"/>
```

### Usage

- use the static factories to obtains localizable instance:

```
DateTimeFormatInfo dateTimeFormatInfo = DateTimeFormatInfo_factory.create();

LocalizedNames localizedNames = LocalizedNames_factory.create();
```
