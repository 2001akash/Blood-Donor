<%@ page language= "java" content Type= "text/htmL; charset="ISO-8859-1 "
pageEncoding= "ISO-8859-1 "%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1 ">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    body{

        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;

    }
    .add-user{
        height: fit-content;
        width: fit-content;
        background: #efeded57;
        padding: 3rem;
        border-radius: 10px;
        box-shadow: 10px 10px 20px #22222273,
        -10px -10px 20px #22222273;
    }
    caption{
        font-weight: 700;
        font-size: 2rem;
        margin-bottom: 3rem;
        text-decoration: underline;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    }
</style>
<body>
    <div class="add-user">
        <form action="POST">
            <table cellpadding="10">
                <caption>Add Donor Details</caption>
                
               <tr>
                <td>Id :</td>
                <td><input type="number" name="id" id="u_id"></td>
               </tr>
               <tr>
                <td>Name :</td>
                <td><input type="text" name="name" id="u_name"></td>
               </tr>
               <tr>
                <td>City :</td>
                <td><input type="text" name="city" id="u_city"></td>
               </tr>
               <tr>
                <td>Blood Group :</td>
                <td><input type="text" name="bg" id="u_bg"></td>
               </tr>
               <tr>
                <td>State :</td>
                <td><input type="text" name="state" id="u_state"></td>
               </tr>
               <tr>
                <td>Mobile No :</td>
                <td><input type="tel" name="mobile" id="u_mobile"></td>
               </tr>
               <tr>
                <td></td>
                <td><input type="submit" value="Submit"></td>
               </tr>
            </table>
        </form>
    </div>
</body>
</html>