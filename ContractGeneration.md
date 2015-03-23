**Contract Generation**

_Input_: ASD!Provider, ASD!Client (both annotated)

_Output_: ASD!Contract


---

  1. Add to ASD!Contract every element in ASD!Provider, ASD!Client that (OR):
    * element IN ASD!Provider AND element.Typing=SUB AND element.subset IS NOT 'off'
    * element IN ASD!Client AND element.Typing=SUB AND element.subset IS NOT 'off'
    * element.Typing='N/A' (see comment on the wiki) AND element.subset='unset' AND has NOT be added already
  1. Connect the elements so that the result complies to the ASD meta-model - this may actually be a bit tricky.
  1. Next steps to follow after verification of the theoretical part...