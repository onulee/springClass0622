<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<title>Insert title here</title>
		<script>
		            
		
		        var object ={
		        		
				  // aMethod1
				  aMethod1: function() { 
					  console.log("aMethod1호출됨111");
				  },
				  // aMethod2
				  aMethod2: function() { 
					  console.log("aMethod2호출됨222");
				  },
				  // aMethod3
				  aMethod3: function() { 
					  console.log("aMethod3호출됨333");
				  }
				};
		        
		        function btn1(){
		        	object.aMethod1();
		        }
		        
		        function btn2(){
		        	object.aMethod3();
		        }
		        
		       
		
		</script>
	</head>
	<body>
	  <button onclick="btn1()" type="button">버튼1</button>
	  <br>
	  <button onclick="btn2()" type="button">버튼2</button>
	
	
	</body>
</html>