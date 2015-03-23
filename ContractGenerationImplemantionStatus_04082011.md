# Introduction #
  * The ContractGeneration consumes two annotated ASDs
  * The first one (P<sub>1</sub>') is the Provider whereas the second one (P<sub>1</sub>') acts as the Client, i.e. it represents the service that the client would like to find: its expectations.
  * It generates a contract (C) between them that will contain elemnts from both service descriptions.
  * In particular, for a given element of S<sub>1'</sub> OR  S<sub>2'</sub> to be inclluded in the contract generated the next consitions should be fullfilled:
    * ∀ e ∈(C<sub>1'</sub>), e ∈(C) if
      * e<sub>subset</sub> ∉ {∅, `exp`}
      * e<sub>Typing</sub> ∈ {SUB, EQUIV}
    * ∀ e ∈(P<sub>1'</sub>), e ∈(C) if
      * e<sub>subset</sub> ∉ {∅, `off`}
      * e<sub>Typing</sub> ∈ {SUPER, EQUIV}

<font color='red'>
<b>TO DISCUSS</b>
<ul><li>Given the fact that there could be matching elements (same name and type) in P<sub>1'</sub> and C<sub>1'</sub>, both fullfilling the conditions. Thus, we would be copying them both to the contract.<br>
<ul><li>Shall we eliminate duplicates from the contract like those above?<br>
</li><li>If so, Which would be the criteria to select the one that stays in the contract? We find two possibilities:<br>
<ol><li>A <i>light matching</i> that checks just the name without considering the properties. Which would be the element to include in the Contract, the one from P<sub>1'</sub> or the one from C<sub>1'</sub>?<br>
</li><li>A <i>deep matching</i> that checks name, type and properties.<br>
<ol><li>If there is complete coincidence (e ≡ e'), the one from P<sub>1'</sub> is copied to the contract<br>
</li><li>If there is any difference between their properties, both e and e' are copied to the contract.<br>
Currently, we perform a <i>deep matching</i>
</font></li></ol></li></ol></li></ul></li></ul>

  * Besides, the **ContractGeneration** adds an annotation to the root element of the contract (`ServiceDescription`).
  * Such annottaion is called `Proper` and serves to check whether the contract has been properly generated.
  * To that end, `Proper` ∈ {TRUE, FALSE} according to the following:
<table border='1'>
<tr>
<td>
C<sub>Proper</sub> = <code>True</code> <b>iff</b>
</td></li></ul>

<td>
∀ e ∈(P<sub>1'</sub>) / e<sub>subset</sub> ∉ {∅} ∧ e<sub>subset</sub> {<code>exp</code><code>, </code>req`} ⇒ e ∈(C)<br>
</td>

</tr>

<tr>
<td>
∀ e' ∈(C<sub>1'</sub>) / e'<sub>subset</sub> ∉ {∅} ∧ e'<sub>subset</sub> {<code>pro</code><code>, </code>off`} ⇒ e' ∈(C)<br>
</td>
</tr>
</table>

<font color='red'>
<b>TO DISCUSS</b>
<ul><li>According to the previous definitions of <i>light</i> and <i>deep</i> matching, Should we use a light or a deep matching to perform the checks that compute the value for the <code>Proper</code> annotation?<br>
</font>