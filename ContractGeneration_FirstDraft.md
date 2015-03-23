The first draft of contractGeneration can be found in [r102](https://code.google.com/p/servicereasoning/source/detail?r=102)

This transformation generates a target model whose elements fulfill the conditions described in [ContractGeneration](ContractGeneration.md). Such model does not collect the relationships between the different elements since they belong to both input models.

## Helpers ##

  * containsAnnotation(value:String) : Boolean : returns a boolean value if `self` contains an annotation whose value is equals to the string passed as parameter.
  * isFullfilledConditions() : Boolean : return a boolean value that indicates whether all the conditions are fullfilled. Namely:
    * element.Typing=SUB AND element.subset IS NOT 'off' equivalent in not pro.
    * element.Typing='N/A' AND element.subset='unset'.

## Rules ##

  * Service2Service -> just the ServiceDescription element from the Provider is mapped to the target model.
  * Operation2Operation -> maps those operation objects that fullfills the conditions to check independently of to which source model it belongs.
  * Message2Message -> maps the message elements that fullfills the conditions to check independently of to which source model it belongs.
  * InfoType2InfoType -> maps the InfoType ...
  * InfoTypeImported2InfoTypeImported? -> maps the InfoTypeImported objects that ...
  * Assertion2Assertion -> maps those Assertion objects thats
  * AssertionsSet2AssertionSet -> maps those AssertionSet objects that ...
  * Profile2Profile -> maps those Profile objects that ...