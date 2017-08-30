<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form action="addPlayer" >
  <s:textfield name="playerBean.name" label="Player Name" value="%{playerBean.name}"/>
  <s:textfield name="playerBean.nationality" label="Nation" value="%{playerBean.nationality}"/>
  <s:textfield name="playerBean.region" label="Region" value="%{playerBean.region}"/>
  <s:textfield name="playerBean.height" label="Height" value="%{playerBean.height}"/>
  <s:textfield name="playerBean.weight" label="Weight" value="%{playerBean.weight}"/>
  <s:select label="Strong Foot" name="playerBean.strongFoot" list="#{0: 'Right', 1: 'Left'}" value="%{'Right'}"/>
  <s:checkboxlist label="Skills" list="skillList" name="skills"/>
  <br>
  <s:checkboxlist listKey="position_id" listValue="name" label="Positions" list="positionList" name="positionIdList"/>
  <s:submit />
</s:form>

