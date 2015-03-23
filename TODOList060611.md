**#summary Updated TO-DO List - 10 June, 2011**

# Introduction #

Implementation tasks to address the modifications in the theoretical stuff.

# Details #

Create a new version of ServiceMatcher that does something much more simple than the current version:
  * Go through every element as it does now and generate the intermediate model.
  * Instead of checking (and annotating) for compatibility, it should add an annotation about.
    1. Whether the element is a subtype of the matching element (using the isSubtypeOf handlers we already have) or
    1. If it is a supertype of the matching element (matching.isSubtypeOf(this))
  * If no matching element exists then don't annotate it at all but add it to the model anyway and make sure that everything is connected properly. The idea here is to separate the merged model from the compatibility check since
    1. The new contract generation needs only subtyping information from the merged model (and it checks compatibility in a different way), and
    1. Compatibility checking can be done either as a separate transformation on this model or as an end-rule on the new matcher

# Planning for the new version of the merging  part #
To write down a refining transformation.
  * It consumes two ASD models (S1 and S2) and generates an annotated copy of one of them (S1').
  * The annotations will state whether there is a matching element in S2 for each element in S1
  * If so, it will state also whether there is a subtype/supertype/none relationship between those matching elements.
  * To that end, we add an annotation whose key is 'Typing' and whose value will be [SUB/SUPER/NONE]