# Item Pricing Calculator

A Java application that calculates item prices based on size variations using dynamic pricing coefficients.

## Overview

This application manages clothing items with different sizes (XS, S, M, L, XL) and calculates final prices based on base cost and size-specific multipliers. It demonstrates object-oriented programming principles, input validation, and user interface design.

## Features

- **Dynamic Pricing**: Calculates item prices using size-based cost coefficients
- **Input Validation**: Robust error handling for user inputs
- **Size Management**: Enum-based size system with descriptive names
- **User-Friendly Interface**: GUI input dialogs for ease of use
- **Formatted Output**: Clean, tabular display of item information

## Technologies Used

- Java
- Swing (JOptionPane for GUI)
- Object-Oriented Programming
- Exception Handling

## Project Structure

```
├── App.java          # Main application class with user interface
├── Item.java         # Item class with pricing logic
├── Size.java         # Enum for size definitions and coefficients
└── README.md         # Project documentation
```

## How It Works

1. **Size Coefficients**: Each size has a multiplier (XS: 0.8, S: 0.9, M: 1.0, L: 1.1, XL: 1.2)
2. **Price Calculation**: Final Price = Base Cost × Size Coefficient
3. **Data Input**: Users enter size codes and base costs through dialog boxes
4. **Validation**: Application prevents invalid inputs and negative costs
5. **Display**: Results shown in formatted table

## Usage

1. Run the `App.java` file
2. Enter size code when prompted (XS, S, M, L, or XL)
3. Enter base cost for the item
4. Repeat for all 5 items
5. View the formatted results table

## Sample Output

```
==================================
Item Name   Base Cost  Item Price
==================================
Medium          10.00       10.00
Large           15.00       16.50
Small            8.00        7.20
Extra Large     12.00       14.40
Extra Small      5.00        4.00
```

## Key Programming Concepts Demonstrated

- **Object-Oriented Design**: Separate classes for different responsibilities
- **Enums**: Type-safe size constants with associated data
- **Exception Handling**: Try-catch blocks for robust input validation
- **Recursion**: Self-calling methods for input re-prompting
- **String Formatting**: Clean, aligned output display
- **Array Management**: Handling collections of objects

## Future Enhancements

- Add more item categories
- Implement file I/O for data persistence
- Create a full GUI interface
- Add inventory management features

## Author

Veronica Pankova  
Date: February 2025