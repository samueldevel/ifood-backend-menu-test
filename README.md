# iFood Backend Test - Menu

Create a micro-service able to accept HTTP requests receiving a restaurant id as a parameter and returning its menu(s).

Based on the requirements below, elaborate your own data model and create a database to store the data (you may populate the database manually).

Fork this repository and submit your code.

##  Requirements

* Restaurant is a entity that contains one or more Menus.
* Chain is an entity that contains Restaurants.
* Chain can contain Menus or not.
* Restaurant can be associated to a Chain or not.
* Restaurant associated to a Chain inherits its Menu, but can override any item.
* You don't need to model the entire Restaurant/Chain entity. 
Only the ids and their relation are enough.
* Menu is basically composed by 4 entities: Item, Item Group, Option and Option Group
(its relations and properties are up to you to decide).

##  Non functional requirements   

As this service will be a worldwide success, it must be prepared to be fault tolerant,
responsive and resilient.

Also, it can host thousands of restaurants' Menus, so it must be modeled to be easily
manipulated (create/update/delete operations that doesn't need to be implemented, 
but must be considered in the modeling). For example: if the restaurant runs out of "bacon" 
and need to set all Items/Options that contains "bacon" as unavailable, 
we should easily implement that operation.

This solution may be used in the integration with other systems/services.

You may consider how your micro-service will expose "Template Items" like Pizza
(an Item that contains sizes/base/crust/toppings/extras) and Combos
(an Item that contains a combinations of other Items at different prices). 
They can be modeled as regular Item/Item Group/Option/Option Group, but they may be
exposed differently.

Use whatever language, tools, frameworks and databases you feel comfortable to.

Also, briefly elaborate on your solution, architecture details, choice of patterns and frameworks.

##  Hints

You can check iFood's restaurants and its menus at https://www.ifood.com.br/delivery/campinas-sp/
(but remember: this may not be the best solution).

There's also public Menu API's on the web you can check for inspiration.
If you use any, please remember to mention.
    
## Examples

The "Pizza" entity should be offered in three different sizes (small, medium and large).

There may be as many toppings as the restaurant need (at least, for this example, "Muzzarela", "Calabrezza" and "Margherita").

A pizza may be ordered with one, two or three different toppings options. Each topping should be customizable (for instance, "additional onions" or "additional bacon").

Also, as an option a customer may choose "Cheddar Stuffed Crust" instead of our traditional crust.

It's important to notice that the total price for the pizza may vary according to the customers' choices. For instance, "Cheddar Stuffed Crust" on a small pizza is cheaper than the option on a large pizza.

When the restaurant runs out of "cheddar", pizzas cannot be ordered within this option.


Also, as example, it follows four Items sold by a fictional restaurant:

1. Chips (~$4)
    - Optionals (Pick any):
        - Bacon (+$1)
        
2. Double Cheese Burger (~$12)
    - Optionals (Pick any):
        - Salad (+0)
        - Extra burger (+$3)
        - Bacon (+$2)
3. Cola ($3)

4. Combo nº5 (~$17)
    - Double Cheese Burger
        - Pick at least two among:
            - Onions (+0)
            - Salad (+0)
            - Extra burger (+$3)
            - Bacon (+$2)
        - Side dish (pick one):
            - Onion rings (+$1)
            - Chips (+0)
                - Optionals (Pick any):
                    - Bacon (+$1)
        - Beverage (pick one):
            - Soda:
                - Cola
                - Dr Pepper
            - Juice (+$1):
                - Orange
                - Lemon


If the restaurant runs out of Bacon, items 1, 2 and 4 from the given example should display the Bacon garnish option as "SOLD OUT".
