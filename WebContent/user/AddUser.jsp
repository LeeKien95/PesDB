<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form action="addUser" >
  <s:textfield name="userBean.username" label="User Name" />
  <s:textfield name="userBean.password" label="Password" />
  <s:textfield name="userBean.email" label="Email"/>
  <s:checkbox name="userBean.isAdmin" label="Is Admin?"/>
  <s:submit />
</s:form>

