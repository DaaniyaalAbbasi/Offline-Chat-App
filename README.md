# Offline-Chat-App

Overview

This program implements a simple chat application using Java. It allows communication between a client and a server over a network using sockets. The application is divided into two main components:

Server.java: Sets up a server to listen for incoming messages from a client.
Client.java: Connects to the server and sends messages.
The communication uses multi-threading for simultaneous reading and writing, though additional threading would need to be explicitly added for more advanced functionality.

Features

Server: Waits for connections and displays received messages.
Client: Connects to the server and sends user-inputted messages.
Uses port 2024 for communication.
Text-based interaction over a terminal or console.

How It Works

Server
The Server program listens on port 2024 using a ServerSocket.
When a client connects, the server accepts the connection (Socket).
Messages sent by the client are received via a BufferedReader and displayed in the console.
The server runs until the client disconnects or sends an empty message.

Client
The Client prompts the user to enter the server's IP address.
It establishes a connection to the server on port 2024 using a Socket.
The client reads user input via a BufferedReader and sends it to the server using a PrintStream.
The communication ends when the user sends null (indicating no input).
Usage Instructions

Prerequisites

Java Development Kit (JDK) installed.
Knowledge of the server's IP address (can be localhost for testing on the same machine).
Steps to Run
Start the Server:

Compile the Server.java file using javac Server.java.
Run the server using java Server.
The server will display "Server is Ready" and wait for a connection.
Start the Client:

Compile the Client.java file using javac Client.java.
Run the client using java Client.
Enter the server's IP address when prompted.
Send Messages:

Type a message in the client terminal and press Enter to send it.
The message will appear in the server terminal.
To end the communication, send an empty message.

Notes

Multi-threading: While the program hints at multi-threading, only the client or server can operate at a time. For simultaneous send/receive functionality, implement threading explicitly.
Port Configuration: The program uses port 2024. Ensure this port is open and not blocked by firewalls.
Error Handling: Add error handling for better user experience (e.g., invalid IPs, connection issues).
Security: This program is for learning purposes and does not include security features like encryption.
