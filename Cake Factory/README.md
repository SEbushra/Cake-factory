# Factory Design Pattern
## Intent of Factory Design Pattern:


### Imagine that I have multiple parts of my code where I need to create objects of type `Cake`. Each part creates a specific type of cake based on what the user requests.

### If I have, for example, 10 different places in my code where I create these cake objects, then adding or removing a cake type would require me to modify all 10 places.
![Screenshot](images/Screenshot 2026-10-05 144518.png)
### This makes the code harder to maintain and less clean. It also increases the chance of making mistakes while updating the code.

### With the Factory Pattern, I can have one centralized place responsible for creating the objects. If I need to add, remove, or modify a cake type, I only need to make the change inside the Factory instead of searching through the entire codebase.

### This makes the code cleaner, easier to maintain, and less error-prone.

![Screenshot](images/Screenshot 2026-10-05 145441.png)

## Resources
[YouTube Tutorial](https://www.youtube.com/watch?v=FyOcp3_F4T0)
