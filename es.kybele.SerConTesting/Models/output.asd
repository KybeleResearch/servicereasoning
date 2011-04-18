<?xml version="1.0" encoding="ISO-8859-1"?>
<ASD:ServiceDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ASD="http://ASD" name="S1_SD1">
  <annotations key="isCompatible" value="false"/>
  <operations name="processOrderBoth" messagePattern="requestresponse">
    <annotations key="isCompatible" value="True"/>
    <contents name="POMessage" infoType="//@infotypes.0">
      <annotations key="isCompatible" value="False"/>
    </contents>
    <contents name="m2" role="output" subset="pro" infoType="//@infotypes.3">
      <annotations key="isCompatible" value="True"/>
    </contents>
  </operations>
  <operations name="NewOperationNon-Both">
    <annotations key="isCompatible" value="Unknown"/>
    <annotations key="sourceModel" value="Cons"/>
    <contents name="NewMessage" infoType="//@infotypes.5">
      <annotations key="isCompatible" value="Unknown"/>
      <annotations key="sourceModel" value="Cons"/>
      <annotations key="unknownByInheritance" value="Inherited from Operation NewOperationNon-Both"/>
    </contents>
  </operations>
  <infotypes name="PODocument" valueRange="N/A" infoType="//@infotypes.1 //@infotypes.2" message="//@operations.0/@contents.0">
    <annotations key="isCompatible" value="True"/>
  </infotypes>
  <infotypes name="OrderInfo" valueRange="N/A">
    <annotations key="isCompatible" value="True"/>
  </infotypes>
  <infotypes name="DeliveryInfo" valueRange="N/A">
    <annotations key="isCompatible" value="True"/>
  </infotypes>
  <infotypes name="it4" valueRange="N/A" message="//@operations.0/@contents.1">
    <annotations key="isCompatible" value="True"/>
  </infotypes>
  <infotypes name="OrderDate" valueType="date" valueRange="N/A" infoType="//@infotypes.0">
    <annotations key="isCompatible" value="False"/>
    <annotations key="sourceModel" value="Cons"/>
  </infotypes>
  <infotypes name="NewInfoType" message="//@operations.1/@contents.0">
    <annotations key="isCompatible" value="False"/>
    <annotations key="sourceModel" value="Cons"/>
    <annotations key="unknownByInheritance" value="Inherited from Operation NewOperationNon-Both"/>
    <annotations key="unknownByInheritance" value="Inherited from Message NewMessage"/>
  </infotypes>
</ASD:ServiceDescription>
