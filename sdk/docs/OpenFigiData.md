# com.finbourne.horizon.model.OpenFigiData
OpenFIGI data structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**figi** | **String** | FIGI assigned to the instrument. | [default to String]
**name** | **String** | Various attributes of the instrument | [optional] [default to String]
**ticker** | **String** | Various attributes of the instrument | [optional] [default to String]
**exchangeCode** | **String** | Exchange code of the desired instrument(s) | [optional] [default to String]
**mic** | **String** | ISO market identification code(MIC) of the desired instrument(s) | [optional] [default to String]
**exchangeName** | **String** | Exchange name of the desired instrument(s) | [optional] [default to String]
**marketSector** | **String** | Market sector description of the desired instrument(s) | [optional] [default to String]
**generalSecurityType** | **String** | Enum-like attributes of the instrument | [optional] [default to String]
**securityType** | **String** | Enum-like attributes of the instrument | [optional] [default to String]
**securityDescription** | **String** | Various attributes of the instrument | [optional] [default to String]
**compositeFigi** | **String** | Various attributes of the instrument | [optional] [default to String]
**shareClassFigi** | **String** | Various attributes of the instrument | [optional] [default to String]
**matchType** | **String** | Type that the instrument matched against | [optional] [default to String]
**searchInput** | **String** | Search input used to generate this response | [optional] [default to String]
**lusidInstrumentId** | **String** | If an instrument with this FIGI exists, the LUID of that instrument in LUSID | [optional] [default to String]
**lusidInstrumentScope** | **String** | If an instrument with this FIGI exists, the Scope of that instrument in LUSID | [optional] [default to String]

```java
import com.finbourne.horizon.model.OpenFigiData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Figi = "example Figi";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Ticker = "example Ticker";
@jakarta.annotation.Nullable String ExchangeCode = "example ExchangeCode";
@jakarta.annotation.Nullable String Mic = "example Mic";
@jakarta.annotation.Nullable String ExchangeName = "example ExchangeName";
@jakarta.annotation.Nullable String MarketSector = "example MarketSector";
@jakarta.annotation.Nullable String GeneralSecurityType = "example GeneralSecurityType";
@jakarta.annotation.Nullable String SecurityType = "example SecurityType";
@jakarta.annotation.Nullable String SecurityDescription = "example SecurityDescription";
@jakarta.annotation.Nullable String CompositeFigi = "example CompositeFigi";
@jakarta.annotation.Nullable String ShareClassFigi = "example ShareClassFigi";
@jakarta.annotation.Nullable String MatchType = "example MatchType";
@jakarta.annotation.Nullable String SearchInput = "example SearchInput";
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String LusidInstrumentScope = "example LusidInstrumentScope";


OpenFigiData openFigiDataInstance = new OpenFigiData()
    .Figi(Figi)
    .Name(Name)
    .Ticker(Ticker)
    .ExchangeCode(ExchangeCode)
    .Mic(Mic)
    .ExchangeName(ExchangeName)
    .MarketSector(MarketSector)
    .GeneralSecurityType(GeneralSecurityType)
    .SecurityType(SecurityType)
    .SecurityDescription(SecurityDescription)
    .CompositeFigi(CompositeFigi)
    .ShareClassFigi(ShareClassFigi)
    .MatchType(MatchType)
    .SearchInput(SearchInput)
    .LusidInstrumentId(LusidInstrumentId)
    .LusidInstrumentScope(LusidInstrumentScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
