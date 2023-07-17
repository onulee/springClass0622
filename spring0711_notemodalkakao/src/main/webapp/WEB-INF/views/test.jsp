<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	</head>
	<body>
	   <script>
	      $(function(){
	    	  $(".btn1").click(function(){
	    		  //alert("test");
	    		  alert("form1 값 : "+($(this).closest('form').attr('class')) );
	    		  let form = $(this).closest('form');
	    		  console.log(form);
	    		  console.log(form[0]);
	    		  console.log(( form[0].input[type=radio]).length  );
	    		  //alert("개수 : "+form.input);
	    	  });
	    	  $(".btn2").click(function(){
	    		  alert("test2");
	    		  alert("form2 값 : "+($(this).closest('form').attr('class')) );
	    	  });
	    	  
	    	  
	      });
	     
	   
	   </script>
	   <h2>폼1</h2>
	   <form action="" name="form1" class="class1">
	      <input type="radio" name="gender" value="1">
	      <label>1번</label>
	      <input type="radio" name="gender" value="2">
	      <label>2번</label>
	      <input type="radio" name="gender" value="2">
	      <label>3번</label>
	      <br>
	      <button type="button" class="btn1" >폼1 버튼</button><br>
	   </form>
	   <br>
	   <h2>폼1</h2>
	   <form action="" name="form2" class="class2">
	      <input type="radio" name="gender2" value="1">
	      <label>1번</label>
	      <input type="radio" name="gender2" value="2">
	      <label>2번</label>
	      <input type="radio" name="gender2" value="2">
	      <label>3번</label>
	      <br>
	      <button type="button" class="btn2" >폼1 버튼</button><br>
	   </form>
	   <br>
	   <h2>폼1</h2>
	   <form action="" name="form3" class="class3">
	      <input type="radio" name="gender3" value="1">
	      <label>1번</label>
	      <input type="radio" name="gender3" value="2">
	      <label>2번</label>
	      <input type="radio" name="gender3" value="2">
	      <label>3번</label>
	      <br>
	      <button type="button" onclick="btn3()">폼1 버튼</button><br>
	   </form>
	   <br>
	
	</body>
</html>