<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Product Application</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 30;
      padding: 30;
      background-color: white;
    }
    h3{
      text-align: center;
      color: grey;
      padding: 0px;
      margin-bottom: 5px;
       margin-top: 10px;
    }
    .container {
      width: 50%;
      margin: 0 auto;
      background-color: pink;
      padding: 25px;
      border-radius: 8px;
      box-shadow: black;
      margin-top: 20px;
    }
    .form-group {
      margin-bottom: 5px;
    }
    label {
      display: block;
      font-weight:none;
      margin-bottom: 5px;
      color: blue;
    }
    input[type="text"], input[type="number"], input[type="date"] ,select{
      width: 100%;
      padding: 10px;
      margin: 5px 0;
      border: 1px solid black;
      border-radius: 4px;
      box-sizing: border-box;

    }
    input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      border: solid;
      padding: 10px 20px;
      cursor: pointer;
      border-radius: 4px;
      font-size: 16px;

    }
    input[type="submit"]:hover {
      background-color: green;
      }

    .msg {
      color: #d9534f;
      text-align: center;
      margin-bottom: 10px;
    }
    .button-container {
      display: flex;
      justify-content: center;
    }

  </style>
</head>
<body>

  <div class="container">
   <h3>Product Application&#128516</h3>

    <div class="msg">${msg}</div>

    <form action="order" method="post">
      <div class="form-group">
        <label for="name">Product Name</label>
        <input type="text" name="name" value="${message.name}">
    </div>

      <div class="form-group">
        <label for="type">Product Type</label>
        <select name="type">
          <option value="select">--select--</option>
          <option value="kitchen Appliances" ${"kitchen Appliances" == message.type ? 'selected' : ''}>Kitchen Appliences</option>
          <option value="electronic Devices" ${"electronic Devices" == message.type ? 'selected' : ''}>Electronic Devices</option>
          <option value="laboratory Devices" ${"laboratory Devices" == message.type ? 'selected' : ''}>Laboratory Devices</option>
        </select>
      </div>

      <div class="form-group">
        <label for="cost">Product Cost</label>
        <input type="number" name="cost" value="${message.cost}">
      </div>

      <div class="form-group">
        <label for="manufacturer">Product Manufacturer</label>
        <select name="manufacturer">
          <option value="select">--select--</option>
          <option value="punit" ${"punit" == message.manufacturer ? 'selected' : ''}>Punit Patil</option>
          <option value="sneha" ${"sneha" == message.manufacturer ? 'selected' : ''}>Sneha Patil</option>
          <option value="Srushti" ${"Srushti" == message.manufacturer ? 'selected' : ''}>Srushti Patil</option>
        </select>
      </div>

      <div class="form-group">
        <label for="date">Order Date</label>
        <input type="date" name="date" value="${message.date}">
      </div>

      <div class="form-group">
        <label for="warranty">Warranty</label>
        <input type="text" name="warranty" value="${message.warranty}">
      </div>

      <div class="form-group">
      <div class="button-container">
      <input type="submit" value="Order">
       </div>
      </div>
    </form>
  </div>

</body>
</html>
