# Real-Time Cryptocurrency Monitor

This project was developed by: **Amanda Cornelsen**

---

## About the Project

This project provides an Android application that consumes real-time data from the cryptocurrency market, allowing users to monitor prices, trends, and other essential information in a direct and intuitive way.

---

## Code Overview

### **MainActivity**
The `MainActivity` is the main activity of the app. Its responsibilities include:
- Setting up the user interface, including the toolbar.
- Managing the refresh button, allowing users to manually update data.
- Making API calls to Mercado Bitcoin to fetch real-time information.
- Displaying the last traded value of a cryptocurrency and the timestamp of the last update.
- Handling API communication errors and displaying appropriate messages to the user.

### **MercadoBitcoinService**
The `MercadoBitcoinService` interface defines the contract for API calls to Mercado Bitcoin. It uses Retrofit to perform:
- A GET request to the `/api/BTC/ticker/` endpoint, returning the latest Bitcoin data.

### **MercadoBitcoinServiceFactory**
The `MercadoBitcoinServiceFactory` class is responsible for configuring and instantiating the `MercadoBitcoinService`. Its responsibilities include:
- Setting the base API URL (`https://www.mercadobitcoin.net/`).
- Configuring Retrofit with the `GsonConverterFactory` for JSON conversion.
- Creating and returning a configured instance of `MercadoBitcoinService`.

### **TickerResponse and Ticker**
The `TickerResponse` and `Ticker` classes define the data model returned by the Mercado Bitcoin API. They map JSON data into Kotlin objects:
- `TickerResponse` encapsulates the `Ticker` object.
- `Ticker` contains the following fields:
  - **high**: Highest trade value in the period.
  - **low**: Lowest trade value in the period.
  - **vol**: Traded volume.
  - **last**: Last traded value.
  - **buy**: Buy price.
  - **sell**: Sell price.
  - **date**: Timestamp of the last update.

### **Coroutines Dependency**
In `build.gradle.kts`, the `kotlinx-coroutines-android` library is added. This dependency is essential for:
- Performing asynchronous tasks, such as API calls, without blocking the UI.
- Managing workflow using `Dispatchers.Main` for UI updates and `Dispatchers.IO` for input/output operations.

---

## Technologies Used

- **Language:** Kotlin (Android)
- **Frameworks & Libraries:** Retrofit, Coroutines, GsonConverterFactory
- **Market API:** Mercado Bitcoin
- **Design:** Material Design for a modern and responsive interface

---

## Contact

If you have any questions or suggestions, feel free to reach out:  
📧 **amandacornelsen.c@gmail.com**  
🌐 [GitHub](https://github.com/AmandaCornelsen)
