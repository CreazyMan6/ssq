<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${ pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>省市区</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${ctx }/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"GET",
			url:"${ctx}/ssqProvince?fatherId=0",
			success: function(msg){
				    console.log(msg);
				    $.each(msg,function(i,n){
				    	$("#province").append("<option value="+n.provinceID+">"+n.provinceName+"</option>");
				    });    
		    }
		});
	});
	function getcity(_this) {
		var fatherId = _this.value;
		$.ajax({
			type:"GET",
			url:"${ctx}/ssqCity?fatherId="+fatherId,
			success: function(msg){
				    console.log(msg);
				    $("#city option:gt(0)").remove();
				    $("#area option:gt(0)").remove();
				    $.each(msg,function(i,n){
				    	$("#city").append("<option value="+n.cityID+">"+n.cityName+"</option>");
				    });    
		    }
		});
	}
	function getarea(_this) {
		var fatherId = _this.value;
		$.ajax({
			type:"GET",
			url:"${ctx}/ssqArea?fatherId="+fatherId,
			success: function(msg){
				    console.log(msg);
				    $("#area option:gt(0)").remove();
				    $.each(msg,function(i,n){
				    	$("#area").append("<option value="+n.areaID+">"+n.areaName+"</option>");
				    });    
		    }
		});
	}
</script>

<body>

	<select id="province" onchange="getcity(this)">
		<option>--请选择省--</option>
	</select>

	<select id="city" onchange="getarea(this)">
		<option>--请选择市--</option>
	</select>
	
	<select id="area" >
		<option>--请选择区--</option>
	</select>


</body>


</html>