<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Computation</title>

<script type="text/javascript">

function validateForm()
{
  var x= document.forms["inputform"]["num1"].value;
	var nums=/^[0-9]/;
   if(isNaN(x))
  {
	alert("First Number should be filled");
	return false;
  }

  var y=document.forms["inputform"]["num2"].value;
  if(y==null || y=="")
  {
	alert("Second Number should be filled");
	return false;
  }

  var z=document.getElementById("o1").value;

  if(z==-1){

  alert("Please select a operation to be performed");

  return false;

  }
 
  if(x.match(nums) && y.match(nums))
  {
return true;
	  }
  else
  {
	  alert("input should be a number only");
  return false;
  }
  
  
  
}
</script>

</head>


<body>
<form name="inputform" action="ComputationServlet" onsubmit="return validateForm()">
Enter First Number <br>
<input type="text" name="num1"> <br>
<br>
Enter Second Number <br>
<input type="text" name="num2"> <br>
<br>
Select <br>

<select name="operation" id="o1">
<option value="-1"> ---Select operation-- </option>
<option value="addition" > Add </option>
<option value="subtract" > Subtract </option>
<option value="multiply" > Multiply </option>
</select>
<br>
<br>
<input type="submit"  >

</form>
</body>
</html>