<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>测试系统</title>
		<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>  
    </head>
	<%@ include file="/WEB-INF/jsp/common/resource.jspf"%>
	<script type="text/javascript">
		test();
	</script>
    <body>
        ${demo}
        ${ctx}
    </body>
</html>

