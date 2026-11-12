<%@ page import="com.shopeasy.PriceService" %>
<html>
<body>
  <h1>ShopEasy - Version 1.0</h1>
  <p>Shoes: Rs 1000</p>
  <p>With 10% off: Rs <%= new PriceService().applyDiscount(1000, 10) %></p>
</body>
</html>
