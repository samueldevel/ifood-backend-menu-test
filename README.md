# iFood Backend Test - Menu

Create a micro-service able to accept HTTP requests receiving a restaurant id as parameter and returns its menu(s).
Based on the requirements below, elaborate your own data model and
create a database to store the data (you may populate the database manually).
Fork this repository and submit your code.

#  Requirements
     * Restaurant is a entity that contains menus.
     * Chain is an entity that contains Restaurants.
     * Chain can contain menus.
     * Restaurant can be associated to a Chain or not.
     * Restaurant associated to a Chain inherits its menu, but can override any item.
     * You don't need to model the entire Restaurant/Chain entity.
     Only the ids and their relation are enough.
     * Menu is basically composed by 4 entities: Item, Item Group, Option and Option Group
     (its relations and properties are up to you to decide).

#  Non functional requirements   

    As this service will be a worldwide success, it must be prepared to be fault tolerant,
    responsive and resilient.

    Also, it can host thousands of restaurants' menus, so it must be modeled to be easily
    manipulated (create/update/delete operations). For example: if the restaurant runs
    out of "bacon" and need to set all items/options that contains the word "bacon"
    as unavailable, we should easily implement that operation.

    This solution may be used in the integration with other systems/services.

    You may consider how this model will contemplate "template items" like Pizza
    (an item that contains sizes/base/crust/toppings/extras) and Combos
    (an item that contains a combinations of other items at different prices).

    Use whatever language, tools, frameworks and databases you feel comfortable to.

    Also, briefly elaborate on your solution, architecture details, choice of patterns and frameworks.

#  Hints
    You can check iFood's restaurants and its menus at https://www.ifood.com.br/delivery/campinas-sp/
    (but remember: this may not be the best solution).
    There's also public Menu API's on the web you can check for inspiration.
    If you use any, please remember to mention.
