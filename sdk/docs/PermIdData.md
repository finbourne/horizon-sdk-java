# com.finbourne.horizon.model.PermIdData
PermId Data Structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**figi** | **String** | FIGI assigned to the instrument. | [default to String]
**ticker** | **String** | Ticker assigned to the instrument | [default to String]
**mic** | **String** | ISO market identification code(MIC) of the desired instrument(s) | [default to String]
**quotePermId** | **String** | QuotePermId of the instrument | [default to String]
**isPrimaryQuote** | **Boolean** | If the quote is primary | [default to Boolean]
**legalEntityIdentifier** | **String** | LEI assigned to the instrument | [optional] [default to String]

```java
import com.finbourne.horizon.model.PermIdData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Figi = "example Figi";
String Ticker = "example Ticker";
String Mic = "example Mic";
String QuotePermId = "example QuotePermId";
Boolean IsPrimaryQuote = true;
@jakarta.annotation.Nullable String LegalEntityIdentifier = "example LegalEntityIdentifier";


PermIdData permIdDataInstance = new PermIdData()
    .Figi(Figi)
    .Ticker(Ticker)
    .Mic(Mic)
    .QuotePermId(QuotePermId)
    .IsPrimaryQuote(IsPrimaryQuote)
    .LegalEntityIdentifier(LegalEntityIdentifier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
