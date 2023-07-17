<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<title>모달창</title>
		<style>
		   #btn{width:300px; height:40px; margin:50px auto;}
		   #btn button{width:200px; height:38px; }
		   
		    #modal {
	            width: 100%;
	            height: 100%;
	            position: absolute;
	            z-index:100;
	            left: 0;
	            top: 0;
	            display: none; /* display: flex; */
	            flex-direction: column;
	            align-items: center; /* 가운데 정렬 */
	            justify-content: center; /* 가운데 정렬 */
	            background: rgba(0, 0, 0, 0.25);
	            backdrop-filter: blur(1.5px);
	            -webkit-backdrop-filter: blur(1.5px);
	            
	        }
	        #modal .modal-window {
	            background: rgba( 69, 139, 197, 0.70 );
	            box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
	            border-radius: 10px;
	            border: 1px solid rgba( 255, 255, 255, 0.18 );
	            width: 400px;
	            height: 500px;
	            position: relative;
	            top: -100px;
	            padding: 10px;
	        }
	        #modal .title {
	            padding-left: 10px;
	            display: inline;
	            text-shadow: 1px 1px 2px gray;
	            color: white;
	            
	        }
	        #modal .title h2 {
	            display: inline;
	        }
	        #modal .close-area {
	            display: inline;
	            float: right;
	            padding-right: 10px;
	            cursor: pointer;
	            text-shadow: 1px 1px 2px gray;
	            color: white;
	        }
	        
	        #modal .content {
	            margin-top: 20px;
	            padding: 0px 10px;
	            text-shadow: 1px 1px 2px gray;
	            color: white;
	        }
		</style>
		<script>
		   function modalBtn(){
	    	   alert("모달창 띄움");
	    	   $("#modal.modal-overlay").css({"display":"flex"});
	       }
	       
	       function closeBtn(){
	    	   $("#modal.modal-overlay").css({"display":"none"});
	       }
	      
		
		</script>
	</head>
	<body>
	   <!-- 모달창 -->
       <div id="modal" class="modal-overlay">
	        <div class="modal-window">
	            <div class="title">
	                <h2>모달</h2>
	            </div>
	            <div onclick="closeBtn()" class="close-area">X</div>
	            <div class="content">
	                <p>가나다라마바사 아자차카타파하</p>
	                <p>가나다라마바사 아자차카타파하</p>
	                <p>가나다라마바사 아자차카타파하</p>
	                <p>가나다라마바사 아자차카타파하</p>
	                
	            </div>
	        </div>
	  </div>
	  <!-- 모달창 끝 -->
	  
	  <div id="btn">
	    <button onclick="modalBtn()" type="button">모달창 띄우기</button>
	  </div>
	
	</body>
</html>