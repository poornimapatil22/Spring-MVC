<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>X-workz</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: 1111;
        }
        .registration-form {
            background-color: 2222;
            border-radius: 8px;
            padding: 50px;
            box-shadow: 0 0 10px rgba(1, 0, 1, 0);
        }
        h2 {
            color: 1111;
        }
        .btn-custom {
            background-color: #1111;
            color: #7777;
        }
        .form-group label {
            color: #1111111;
        }
        .form-control {
            border: 2px solid #007bff;
        }
        .form-control:focus {
            border-color: #11111;
            box-shadow: 0 0 500px rgba(1, 1, 1, 0);
        }
        .btn-custom {
            background-color: #111111;
            color:
        }

    </style>
</head>
<body>

<h2>${validationError}</h2>
<div class="container mt-50">
    <div class="registration-form">
        <h2>Product Form</h2>
        <form action="send" method="post">
            <div class="form-group">
                <label for="companyName">CompanyName:</label>
                <input type="text" class="form-control" id="companyName" name="companyName" required>
            </div>


            <div class="form-group">
                <label for="productName">ProductName:</label>
                <input type="text" class="form-control" id="productName" name="productName" required>
            </div>

            <div class="form-group">
                <label for="productQuantity">Product Quantity:</label>
                <input type="number" class="form-control" id="productQuantity" name="productQuantity" required>
                </div>

                <div class="form-group">
                                <label for="productCost">Product Cost:</label>
                                <input type="number" class="form-control" id="productCost" name="productCost" required>
                                </div>

                <div class="form-group">
                                <label for="productType">Product Type:</label>
                                <select id="productType" class="form-control" id="productType" name="productType" required>
                                <option>Select</option>
                                 <option>Smart Phones</option>
                                  <option>Ear Phones</option>
                                   <option>Laptops</option>
                                    <option>Computers</option>
                                     <option>Blow Dryer</option>
                                     </select>
                                </div>
<button type="submit" class="btn btn-info" >ENTER</button>
        </form>
    </div>

</div>
</body>
</html>
