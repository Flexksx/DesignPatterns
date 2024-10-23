The structure of the project is like this: 

Use a Singleton Menu class that will hold the name, prices and weights of different products
Products can be either spicy or not, but regardless of their spicyness they are the same in price and weight and name.

Then I want to build menus for users
The menus are built based on what the user desires.
For example a customer may ask for a menu that has

5 normal chicken wings
3 spicy chicken wings
4 spicy chicken strips
1 large cola
1 garlic sauce 


and this could be done by calling a OrderBuilder

order_builder.withWings(SpiceType.HOT,3).withWings(SpiceType.NORMAL,5).withStrips(SpiceType.HOT,4).withDrink(Drinks.COCA_COLA,DrinkSize.LARGE).withSauce(SauceTypes.GARLIC)

Since there are different wing types, I want to have a factory that will instantiate 3 wings using the prototype pattern from their according Menu items definitions. 
The wing factory would receive the nr of wings and their spice type, and it would call the prototype of the wing 3 times and instantiate 3 spicy wings 


