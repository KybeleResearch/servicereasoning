<?xml version="1.0" encoding="ISO-8859-1"?>
<ASD:ServiceDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ASD="http://ASD" name="S1_SD1">
  <annotations key="isCompatible" value="false"/>
  <operations name="processOrderBoth" messagePattern="requestresponse">
    <annotations key="isCompatible" value="true"/>
    <contents name="POMessage" infoType="//@infotypes.0">
      <annotations key="isCompatible" value="true"/>
    </contents>
    <contents name="m2" role="output" subset="pro" infoType="//@infotypes.3">
      <annotations key="isCompatible" value="true"/>
    </contents>
  </operations>
  <infotypes name="PODocument" valueRange="N/A" infoType="//@infotypes.1 //@infotypes.2" message="//@operations.0/@contents.0">
    <annotations key="isCompatible" value="true"/>
  </infotypes>
  <infotypes name="OrderInfo" valueRange="N/A">
    <annotations key="isCompatible" value="true"/>
  </infotypes>
  <infotypes name="DeliveryInfo" valueRange="N/A">
    <annotations key="isCompatible" value="true"/>
  </infotypes>
  <infotypes name="it4" valueRange="N/A" message="//@operations.0/@contents.1">
    <annotations key="isCompatible" value="true"/>
  </infotypes>
  <profiles name="Profile1">
    <annotations key="isCompatible" value="false"/>
    <sets name="ASet1">
      <annotations key="isCompatible" value="true"/>
      <assertions name="Assert1" dimension="availability" minVal="80.0" maxVal="95.0">
        <annotations key="isCompatible" value="true"/>
      </assertions>
      <assertions name="Assert2" dimension="latency" dimensionType="antitonic" minVal="0.15" maxVal="0.3">
        <annotations key="isCompatible" value="true"/>
      </assertions>
      <assertions name="Assert3" dimension="performance" minVal="90.0" maxVal="100.0">
        <annotations key="isCompatible" value="true"/>
      </assertions>
    </sets>
    <sets name="ASet2">
      <annotations key="isCompatible" value="false"/>
      <annotations key="sourceModel" value="Cons"/>
      <assertions name="Assert4">
        <annotations key="isCompatible" value="false"/>
        <annotations key="sourceModel" value="Cons"/>
      </assertions>
    </sets>
  </profiles>
</ASD:ServiceDescription>
