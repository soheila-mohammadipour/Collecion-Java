# Collecion-Java
training Collection in Java
> Soheila:


Object-Oriented Project:

A factory for producing food products includes 5 production lines as follows:
 1. Canned and ready meals (various canned goods, tomato paste, and sauces)
 2. Household hygiene products (surface cleaners, dishwashing detergents, laundry detergents)
 3. Dairy products (milk, cream, yogurt, buttermilk)
 4. Snacks (chips, puffs, cakes, biscuits)
 5. Protein products (meat, chicken, fish, etc.)

Each production line operates separately in a dedicated building. The factory’s central warehouse is located within the premises and includes five storage halls. None of these warehouses are refrigerated for storing perishable goods, so these products must be transported using refrigerated trucks immediately after production.
Non-perishable products must have a maximum storage period defined for them. Perishable products must be stored within a specified minimum and maximum temperature range.

The workflow of the factory is as follows:
Initially, a team consisting of marketing, sales, and financial management collaboratively evaluates market needs and registers their packaging and order (request) requirements.

The technical supervisor of each production line is responsible for ensuring the products required by the factory are produced by the deadlines specified by the marketing team.
These produced products must then be transported to the warehouse by forklifts and the logistics team. The warehouse supervisor is responsible for recording the received goods in the warehouse management system.

After multiple meetings and discussions with the employer, we have gathered additional details about the factory’s processes, explained below. Please read these details carefully to model the requirements based on your current knowledge.

Details:

Sales Team:

Based on market analysis and customer demand, the sales team estimates the quantity and type of products needed.
They must be able to register their orders in one of the program menus. The production line order status, managed by the technical supervisor, is divided into three categories:
 1. Queue (Pending Production): Orders waiting to be produced.
 2. In Progress: Orders currently being produced on the production line.
 3. Completed: Orders that have been finished and delivered to the warehouse.

Technical Supervisor:

The technical supervisor, considering the raw materials available in the factory and the registered orders from the sales team, must manage the production line.
Based on the sales team’s registered orders, the supervisor starts the workday on the production line and issues production orders in the system.

Every day at 2 PM, with the shift change, the technical supervisor of each production line must transfer the production output of that shift to the logistics supervisor using a transfer receipt. The logistics supervisor then transports the produced goods to the warehouse.
The technical supervisor must update the system to inform the sales and marketing teams of the order status (order status update functionality).

Logistics Supervisor:

Based on the transfer receipt issued by the technical supervisor, and after receiving the specified goods, the logistics supervisor checks if the receipt details match the actual goods. If they match, the supervisor confirms the receipt in the system, and the goods are transported to the warehouse.

Warehouse Supervisor:

The warehouse supervisor receives the goods and records them in the system.

Each product has the following attributes:
 • Name
 • Technical Number (Product ID)
 • Price
 • Storage Conditions
 • Address (unique for each product)

Products are packaged in sets of 24.

Transportation:

External transportation from the factory is done in two main ways:
 1. Dairy Products (Perishable): These must be transported using 5-ton refrigerated trucks.
 2. Other Products: These are transported using 10-ton non-refrigerated trucks.


Internally, after production, products are transported from the production line to the central warehouse using forklifts. Dairy products must be stored in internal warehouses equipped with refrigeration facilities.












# Food Product Factory Management System

## Project Description
This project models the workflow of a food product factory with various production lines and storage systems. The factory produces and manages five types of products:

1. Canned and Ready Meals (various canned goods, tomato paste, sauces)
2. Household Hygiene Products (surface cleaners, dishwashing detergents, laundry detergents)
3. Dairy Products (milk, cream, yogurt, buttermilk)
4. Snacks (chips, puffs, cakes, biscuits)
5. Protein Products (meat, chicken, fish, etc.)

The factory has a central warehouse consisting of five storage halls. The warehouse handles both perishable and non-perishable products with specific storage and transportation requirements. The products are transported by forklifts to the warehouse and externally via refrigerated or non-refrigerated trucks based on their category.

### Key Features of the System:
- Sales Team: 
  - Estimates product demand and registers orders.
  - Can track the production status of their orders.
  
- Technical Supervisor:
  - Oversees production, manages order statuses, and transfers goods to logistics.
  
- Logistics Supervisor:
  - Confirms the transfer of goods to the warehouse based on receipts from the production line.
  
- Warehouse Supervisor:
  - Receives the goods and records them in the warehouse management system.
  
- Product Details: 
  - Each product has attributes such as name, technical number, price, storage conditions, and address.
  - Products are packaged in sets of 24.
  
- Transportation:
  - Dairy products are transported using 5-ton refrigerated trucks.
  - Other products are transported using 10-ton non-refrigerated trucks.
  - Internal transportation between production lines and the warehouse is done using forklifts.

## Workflow and Interaction:
1. Sales Team: Registers product orders and tracks the production status (Queue, In Progress, Completed).
2. Technical Supervisor: 
   - Starts production based on the sales orders.
   - Transfers the produced goods to logistics every day at 2 PM using transfer receipts.
3. Logistics Supervisor: 
   - Confirms the transfer receipt and ensures the goods match the details.
   - Transports the goods to the warehouse.
4. Warehouse Supervisor: 
   - Receives the goods and records them in the warehouse management system.

## Data Model
Each product includes the following attributes:
- Name: Name of the product.
- Technical Number: Unique product ID.
- Price: Cost of the product.
- Storage Conditions: Conditions like temperature range or humidity.
- Address: Unique storage location for the product.
  
### Example Product:
- Name: Milk
- Technical Number: 001
- Price: $1.50
- Storage Conditions: Refrigerated (2-4°C)
- Address: Warehouse A, Section 1

## System Requirements
- Programming Language: Java
- Libraries/Technologies: 
  - Java Collections (List, Map, etc.)
  - Java I/O for file handling (for storing production and inventory records)
  - Java Date and Time API for shift management and timestamps
  - Basic GUI or Command-Line Interface for user interaction
