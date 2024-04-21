Parking Lot Management System
Overview
This project is a Parking Lot Management System designed to efficiently manage the parking spaces in a parking lot. It includes functionalities such as:

Allocating parking spots for vehicles
Generating tickets for vehicles entering the parking lot
Calculating bills for vehicles exiting the parking lot
Managing gates, parking floors, parking spots, vehicles, payments, and tickets
Features
Spot Allocation: Automatically assigns parking spots to vehicles based on availability and vehicle type.
Ticket Generation: Generates tickets for vehicles entering the parking lot, recording entry time and spot details.
Bill Calculation: Calculates parking bills for vehicles exiting the parking lot, based on the duration of parking.
Data Persistence: Utilizes in-memory repositories to store and manage parking lot data without the need for a database.
Flexibility: Supports multiple vehicle types and parking lot configurations.
Components
Model: Contains the domain model classes representing various entities in the parking lot system, such as vehicles, parking spots, gates, etc.
Repository: Provides repository classes to manage data access and storage for parking lot entities.
Service: Implements business logic and operations for managing parking lot functionalities, such as ticket generation, bill calculation, initialization, etc.
Controller: Handles user input and interaction, interfacing with the service layer to perform operations.
Main Class: Entry point of the application where user input is captured and processed.
