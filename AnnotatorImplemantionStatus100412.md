# Introduction #
The idea is that we first annotate the two versions of the service in order to have annotated versions of them to produce the contract.

  * ServiceAnnotation(S<sub>1</sub>, S<sub>2</sub>) ⇒ S<sub>1</sub>' = S<sub>1</sub> + Annotations
  * ServiceAnnotation(S<sub>2</sub>, S<sub>1</sub>) ⇒ S<sub>2</sub>' = S<sub>2</sub> + Annotations
  * ContractGeneration(S<sub>1</sub> + Annotations, S<sub>2</sub> + Annotations) ⇒ ServiceContract

# Service Annotation #
Basically checks subtyping relationships annotating every element (X) from the source model of the transformation as follows:
  * If ∄​ (X ϵ S<sub>1</sub>, Y ϵ S<sub>2</sub>) / (X.name ≡ Y.name) ∧ (X<sub>isTypeOf</sub> ≡ Y<sub>isTypeOf</sub>) ⇒ **N/A**
  * If ∃ (X ϵ S<sub>1</sub>, Y ϵ S<sub>2</sub>) / (X<sub>name</sub> ≡ Y<sub>name</sub>) ∧ (X<sub>isTypeOf</sub> ≡ Y<sub>isTypeOf</sub>) then
    * If X < Y then (if _X is subtype of Y_) ⇒ **SUB**
    * If X > Y then (if _X is supertype of Y_)⇒ **SUPER**
    * ELSE ⇒ **NONE**
(Subtyping reasoning can be seen in [AnnotatorImplemantionStatus\_04082011](AnnotatorImplemantionStatus_04082011.md)

# Contract Generation #
  * The ContractGeneration consumes two annotated ASDs
    * The first one (P<sub>1</sub>') is the Provider whereas the second one (P<sub>2</sub>') acts as the Client, i.e. it represents the service that the client would like to find: its expectations.
    * It generates a contract (C) between them that will contain elemnts from both service descriptions.
    * Only those elements from (P<sub>1</sub>') and (P<sub>2</sub>') fullfilling the following conditions will be added/copied to the Contract:
      * Typing (annotation) = SUB ∧ subset <> pro
      * Typing (annotation) = SUB ∧ subset = OclUndefined (there is no subset)
      * Typing (annotation) = N/A ∧ subset = unset
      * Typing (annotation) = N/A ∧ subset = OclUndefined (there is no subset)