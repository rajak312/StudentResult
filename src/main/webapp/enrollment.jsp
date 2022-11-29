<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enrollment</title>
<style>
   div{
     display:flex;
     justify-content:center;
    
   }
   form{
     border:2px solid gray;
     box-shadow:2px 5px 3px;
     padding:20px;
     border-radius:10px;
   }
   button{
      margin-top:20px;
      margin-left:10px;
      background-color:green;
      border-radius:5px;
      border:2px solid green;
      width:100px;
   }
</style>
</head>
<body>
   <div><form action=registration>
      <h2 style="text-align:center">Regisration Form</h2>
      <table>
         <tr>
           <td>Name</td>
           <td><input type="text" name="sname" ></td>
         </tr>
         <tr><td>Father's Name </td><td><input type="text" name="fname" ></td></tr>
         <tr><td>Mother's Name</td><td><input type="text" name="mname" ></td></tr>
         <tr><td>DOB</td><td><input type="date" name="dob" ></td></tr>
         <tr><td>Mobile</td><td><input type='number' name="mobile" maxlength=10 ></td></tr>
         <tr><td>Email</td><td><input type="email" name="email"></td></tr>
         <tr><td>Address</td><td><input type="text" name="address" ></td></tr>
         <tr><td>School</td><td><input type="text" name="school" ></td></tr>
      </table>
       <div>
                <button>Submit</button><button type="reset">Reset</button>
          
       </div>
   </form></div>
</body>
</html>