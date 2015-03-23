# Functionality #
  * Takes as input the ASD of two given services (S<sub>1</sub> and S<sub>2</sub>).
  * Produces an annotated version of the first one.
  * Annotation objects are called `Typing`
  * Its values range between {SUB, SUPER, NONE, EQUIV}
  * Each annotation states whether the annotated element from S<sub>1</sub> is a subtype/supertype for any other element in in S<sub>2</sub>

## Assesing the value of **Typing** annotations ##
The typing relationships stated by the Typing objects corresponds to the following pseudo-algorithm:
  * If ∃ (X ϵ S<sub>1</sub>, Y ϵ S<sub>2</sub>) / (X<sub>name</sub> ≡ Y<sub>name</sub>) ∧ (X<sub>isTypeOf</sub> ≡ Y<sub>isTypeOf</sub>) then
    * If X < Y then (if _X is subtype of Y_)
      * If Y < X ⇒ **EQUIV** (_X and Y are Equivalent_)
      * If Y ≮ X ⇒ **SUB** (_X is subtype of Y_)
    * If X > Y then (if _X is supertype of Y_)
      * If Y < X ⇒ **EQUIV** (_X and Y are Equivalent_)
      * If Y ≯ X ⇒ **SUPER** (_X is supertype of Y_)
  * If ∄​ (X ϵ S<sub>1</sub>, Y ϵ S<sub>2</sub>) / (X.name ≡ Y.name) ∧ (X.isTypeOf ≡ Y.isTypeOf) ⇒ **NONE**(_there is no matching element for X)_

## Definition of sub/supertyping relationships ##
In the following we summarize how to check whether there is a sub/supertype relationship between two given objects depending in the nature of the objects

### Operations ###
For a given operation X being subtype of another operation Y the following conditions must be fullfilled:
  * X<sub>name</sub> = Y<sub>name</sub>
  * X<sub>messagePattern</sub> ≤ Y<sub>messagePattern</sub>
    * Notice that (`one-way` ≤ `request-response`) ∧ (`notification` ≤ `solicit-response`)
  * Y<sub>|messages|</sub> ≤ X<sub>|messages|</sub>

### Messages ###
For a given message X being **subtype** of another message Y the following conditions must be fullfilled:
  * X<sub>name</sub> ≡ Y<sub>name</sub>
  * X<sub>role</sub> ≡ Y<sub>role</sub>
  * X<sub>subset</sub> ≡ Y<sub>subset</sub>
  * Y<sub>|infoTypes|</sub> ≤ X<sub>|infoTypes|</sub>

For a given message X being **supertype** of another message Y, the following conditions must be fullfilled:
  * X<sub>name</sub> ≡ Y<sub>name</sub>
  * X<sub>role</sub> ≡ Y<sub>role</sub>
  * X<sub>subset</sub> ≡ Y<sub>subset</sub>
  * Y<sub>|infoTypes|</sub> ≤ X<sub>|infoTypes|</sub>

### InfoType and InfoTypeImported ###
For a given InfoType X being **subtype** of another infoType Y the following conditions must be fullfilled:
  * X<sub>name</sub> ≡ Y<sub>name</sub>
  * X<sub>valueType</sub> ≤ Y<sub>valueType</sub>
    * Note that `date ≤ int ≤ float ≤ double ≤ string ≤ document`
  * X<sub>subset</sub> ≡ Y<sub>subset</sub>
  * Y<sub>|infoType|</sub> ≤ X<sub>|infoType|</sub>
  * Y<sub>|ref_infoType|</sub> ≤ X<sub>|ref_infoType|</sub>
<font color='red'>
<b>TO DISCUSS</b>
<ul><li>Do we need to consider the <code>valueRange</code> attribute in some way???<br>
</font></li></ul>

### Assertion ###
For a given Assertion X being **subtype** of another Assertion Y the following conditions must be fullfilled:
  * X<sub>name</sub> ≡ Y<sub>name</sub>
  * X<sub>dimension</sub> ≡ Y<sub>dimension</sub>
  * X<sub>dimensionType</sub> ≡ Y<sub>dimensionType</sub>
  * X<sub>intention</sub> ≡ Y<sub>intention</sub>
  * If `dimension = monotonic`
    * X<sub>minVal</sub> ≤ Y<sub>minVal</sub>
    * X<sub>maxVal</sub> ≤ Y<sub>maxVal</sub>
  * If `dimension = antitonic`
    * X<sub>minVal</sub> ≥ Y<sub>minVal</sub>
    * X<sub>maxVal</sub> ≥ Y<sub>maxVal</sub>
<font color='red'>
<b>TO DISCUSS</b>
</li></ul><ul><li>Do we need to consider the <code>lType</code> and <code>subset</code> attributes in some way???<br>
</font>

### AssertionSet ###
When comparing the AssertionSet X with the AssertionSet Y the following values will be obtaied in presence of the following conditions:

  * X,,Typing = **SUB** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * Y<sub>|assertion|</sub> ≤ X<sub>|assertion|</sub>
    * a<sub>Typing</sub> = SUB ∀ a ∈ X<sub>{assertion}</sub>

  * X,,Typing = **SUPER** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * X<sub>|assertion|</sub> ≤ Y<sub>|assertion|</sub>
    * a<sub>Typing</sub> = SUPER ∀ a ∈ X<sub>{assertion}</sub>

  * X,,Typing = **NONE** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * X<sub>|assertion|</sub> ≤ Y<sub>|assertion|</sub>
    * ∃ a ∈ X<sub>{assertion}</sub> / a<sub>Typing</sub> = NONE

  * X,,Typing = **EQUIV** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * Rest of scenarios

<font color='red'>
<b>TO DISCUSS</b>
</li><li>Do we need to consider the <code>lType</code> attribute in some way???<br>
</li><li>(With Jenifer) The EQUIV computation seems to be a little bit strange ...<br>
</font>

### Profiles ###
When comparing the Profile X with the Profile Y the following values will be obtained in presence of the following conditions:
  * X,,Typing = **SUB** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * Y<sub>|assertionSet|</sub> ≤ X<sub>|assertionSet|</sub>
    * as<sub>Typing</sub> = SUB ∀ as ∈ X<sub>{assertionSet}</sub>
  * X,,Typing = **SUPER** ⇔
    * X<sub>name</sub> ≡ Y<sub>name</sub>
    * Y<sub>|assertionSet|</sub> ≥ X<sub>|assertionSet|</sub>
    * as<sub>Typing</sub> = SUPER ∀ as ∈ X<sub>{assertionSet}</sub>
  * X,,Typing = **NONE** ⇔
    * ∃ as ∈ X<sub>{assertionSet}</sub> / a<sub>Typing</sub> = NONE
<font color='red'>
<b>TO DISCUSS</b>
</li></ul><ul><li>(With Jenifer) The same here: the EQUIV computation seems to be a little bit strange ...<br>
</font>