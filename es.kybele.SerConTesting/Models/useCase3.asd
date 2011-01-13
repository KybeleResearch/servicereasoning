<?xml version="1.0" encoding="UTF-8"?>
<ASD:ServiceDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ASD="http://ASD" name="SD3">
  <operations name="processOrder" messagePattern="requestresponse">
    <contents name="POMessage" infoType="//@infotypes.0 //@infotypes.1"/>
    <contents name="m2" role="output" subset="pro" infoType="//@infotypes.3"/>
  </operations>
  <infotypes name="PODocument" valueRange="N/A" infoType="//@infotypes.1 //@infotypes.2" message="//@operations.0/@contents.0"/>
  <infotypes name="OrderInfo" valueRange="N/A" message="//@operations.0/@contents.0"/>
  <infotypes name="DeliveryInfo" valueRange="N/A"/>
  <infotypes name="it4" valueRange="N/A" subset="pro" message="//@operations.0/@contents.1"/>
  <infotypes name="OrderDate" valueType="date" valueRange="N/A" infoType="//@infotypes.0"/>
</ASD:ServiceDescription>
