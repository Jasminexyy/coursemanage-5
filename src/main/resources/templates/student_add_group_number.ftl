<!DOCTYPE html>
<html>
	<head style="font-size:35px;">
  <meta name="viewport" content="width=device-width,user-scale=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">

	<link href="group.css" type="text/css" rel="stylesheet"/> 
		<title>Enter your title here</title>
		
	<script type="text/javascript">	
function del() { 
        if (!confirm("将${student.name}移出小组？")) { 
            window.event.returnValue = false; 
        }
    } 
</script>		
		
	</head>
	<body>
		<center>		
			<div id="header1" style="background-color:#ffffff;">
	            <span>
	                <b><</b>
	            </span>
	        OOAD 2016(1)
	            <span1>
	                <b><li class="dao li1">+
	                <ul class="sub sub1">
						<li class="main">代办</li>
						<li class="main">个人页</li>
						<li class="main">讨论课</li>
				    </ul>
					</li>               
					</b>
					</span1>	            
	        </div> 
			
			<div style="height:0.5rem;background-color:#e8e8e8"></div>
			
			<div class="sumbackgroudw">		
			<!--查看自己组的成员-->
				<font size="5" color="#9ACD32">1-1 HHHH</font>
				
				<div style="border-style:none">
				<table>
				<tr>
				<!--组长组员、学号、名字、课程名字-->
				<td class="fontgreen">组长：</td>
				<td>${myId}</td>
				<td class="fontred">我</td>

				</tr>
					<#list myTeam.students as student>
						<tr>
							<td class="fontgreen">组员：</td>
							<td>${student.account}</td>
							<td onclick="del()">${student.studentName}</td>

						</tr>
					</#list>

				</table>
				</div>
		
			</div>
		
			<div class="div1">
			<font style="float:left;margin-left:10%;" class="fontgreen">添加成员：</font>
			</div>
			<!--未分组的人学号、名字、课程名字-->
				<div>
				<table>
				<tr>
				<td><input name="stuname" type="checkbox" value="" />1111111111</td>
				<td>王二</td>

				</tr>
				
				<tr>
				<td><input name="stuname" type="checkbox" value="" />1111111111</td>
				<td>王二</td>

				</tr>
				</table>
				</div>
		
<div style="height:0.5rem;background-color:#e8e8e8"></div>		
		
		<div class="div1" style="background-color:#e8e8e8;">
		<font style="float:left;margin-left:10%;" class="fontgreen">搜索成员：</font>
		<input type="text" name="groupname" value="输入成员学号或姓名">
		</div>
		
<div style="height:3rem;background-color:#e8e8e8;border-style:none;"></div>			
		
			<input type="submit" value="解散小组" class="subr"/>
			<input type="submit" value="添加" class="sub3"/>
			
			<input type="submit" value="保存" class="subr" style="background-color:#9ACD32"/>
		</center>



	</body>
</html>
