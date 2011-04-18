<?xml version="1.0" encoding="ISO-8859-1"?>
<ASD:ServiceDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ASD="http://ASD">
  <operations name="processOrderBoth" messagePattern="requestresponse">
    <contents name="m2" role="output" subset="pro" infoType="//@infotypes.3"/>
  </operations>
  <infotypes name="PODocument" valueRange="N/A" infoType="//@infotypes.1 //@infotypes.2"/>
  <infotypes name="OrderInfo" valueRange="N/A"/>
  <infotypes name="DeliveryInfo" valueRange="N/A"/>
  <infotypes name="it4" valueRange="N/A" message="//@operations.0/@contents.0"/>
  <profiles>
    <sets>
      <assertions/>
    </sets>
  </profiles>
</ASD:ServiceDescription>
