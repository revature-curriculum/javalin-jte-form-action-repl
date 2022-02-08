<html lang="en">

<head>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
    <h2>Hello visitor!</h2>

    <form method="post" action="/wrongRoute">

        <h1>Please fill out the form based on the reimbursement details</h1>

        <label>Email</label>
        <input type="text" name="email" placeholder="daisy@gmail.com" required value="">

        <label>Reimbursement Item</label>
        <input type="text" name="item" placeholder="Laptop" required value="">

        <label>Amount</label>
        <input type="text" name="amount" placeholder="100" required value="">

        <input type="submit" value="Add">
    </form>

</body>
</html>