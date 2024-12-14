<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Passport Website</title>
  <style>

    html, body {
      height: 90%;
      margin: 50px;
      padding: 50;

      justify-content: center;
      align-items: center;
      background-color: white;
    }


    form {
      background-color: white;
      padding: 20px;

      width: 100%;
      max-width: 450px;
      border-radius: 8px;
      box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
      box-sizing: border-box;
    }

    h1 {
      text-align: center;
      margin-bottom: 20px;
      color: black;
         }


    .form-group {
      display: flex;
      justify-content: space-between;
      align-items: center;
      margin-bottom: 15px;
    }


    label {
      font-weight: normal;
      width: 30%;
    }


    input, select {
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
      font-size: 16px;
      width: 65%;
      box-sizing: border-box;
    }


    .radio-group {
      display: flex;
      flex-direction: column;
      gap: 10px;
    }


    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: green ;
      color: white;
      border: 1px solid #ccc;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<form action="save" method="post">
  <h1>Passport Application</h1>


  <div class="form-group">
    <label>Register To Apply At:</label>
    <div class="radio-group">
      <label for="registerToApplyAtCpvDelhi">CPV DELHI</label>
      <input type="radio" id="registerToApplyAtCpvDelhi" name="registerToApplyAt" value="CPV DELHI">
      <label for="registerToApplyAtPassportOffice">Passport Office</label>
      <input type="radio" id="registerToApplyAtPassportOffice" name="registerToApplyAt" value="Passport Office">
    </div>
  </div>


  <div class="form-group">
    <label for="givenName">Given Name:</label>
    <input type="text" id="givenName" name="givenName">
  </div>


  <div class="form-group">
    <label for="surName">SurName:</label>
    <input type="text" id="surName" name="surName">
  </div>


  <div class="form-group">
    <label for="passportOffice">Passport Office:</label>
    <select id="passportOffice" name="passportOffice">
    <option value="Select">---Select----</option>
      <option value="Bengaluru">Bengaluru</option>
      <option value="Mangaluru">Mangaluru</option>
      <option value="Hubli">Hubli</option>
      <option value="Belagavi">Belagavi</option>
      <option value="Mysuru">Mysuru</option>
      <option value="Dharwad">Dharwad</option>
      <option value="Kalaburagi">Kalaburagi</option>
      <option value="Shivamogga">Shivamogga</option>
    </select>
  </div>


  <div class="form-group">
    <label for="emailAdress">Email Address:</label>
    <input type="email" id="emailAdress" name="emailAdress">
  </div>


  <div class="form-group">
    <label>Login ID Same As Email ID:</label>
    <div class="radio-group">
      <label for="loginIdSameAsEmailIdYes">Yes</label>
      <input type="radio" id="loginIdSameAsEmailIdYes" name="loginIdSameAsEmailId" value="Yes">
      <label for="loginIdSameAsEmailIdNo">No</label>
      <input type="radio" id="loginIdSameAsEmailIdNo" name="loginIdSameAsEmailId" value="No">
    </div>
  </div>


  <div class="form-group">
    <label for="loginId">Login ID:</label>
    <input type="text" id="loginId" name="loginId">
  </div>


  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
  </div>


  <div class="form-group">
    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" id="confirmPassword" name="confirmPassword">
  </div>


  <div class="form-group">
    <label for="hintQuestion">Hint Question:</label>
    <select id="hintQuestion" name="hintQuestion">
    <option value="Select">---Select---</option>
      <option value="BirthCity">Birth City</option>
      <option value="FavFood">Favorite Food</option>
      <option value="FavColor">Favorite Color</option>
      <option value="FavCricketer">Favorite Cricketer</option>
      <option value="FirstSchool">First School</option>
      <option value="FirstCarMake">Make of First Car Owned</option>
      <option value="MothersMaidenName">Mother's Maiden Name</option>
    </select>
  </div>

  <div class="form-group">
    <label for="hintAnswer">Hint Answer:</label>
    <input type="text" id="hintAnswer" name="hintAnswer">
  </div>


  <div class="form-group">
    <label for="dateOfBirth">Date Of Birth:</label>
    <input type="date" id="dateOfBirth" name="dateOfBirth">
  </div>


  <input type="submit" value="Apply">
</form>
</body>
</html>
