💬 Real-Time Chat Application

This project is a simple real-time chat application built with Spring Boot, WebSockets, SockJS, STOMP, and Bootstrap for frontend styling. It allows users to exchange messages instantly in a responsive web interface.

🔧 Technologies Used
Java 21

Spring Boot 3.5

Spring WebSocket & STOMP

Thymeleaf (template engine)

SockJS & STOMP.js (JavaScript libraries)

Bootstrap 5.3 (for UI design)

⚙️ Features
Real-time bi-directional chat functionality using WebSockets.

STOMP protocol support for subscribing and publishing messages.

Responsive chat interface with styled message bubbles.

Messages display sender’s name and timestamp.

Styled with Bootstrap for a clean, modern UI.

Cross-origin support for mobile testing.

Can be accessed via public tunneling services like Ngrok.

📁 Project Structure

bash
Copy
Edit

chatBox/

├── config/                 # WebSocket configuration class

│   └── WebSocke.java

├── controller/             # Spring controller for routing and messaging

│   └── ChatController.java

├── model/                  # Model class for messages

│   └── ChatMessage.java

├── resources/

│   ├── templates/

│   │   └── chat.html       # Frontend chat interface

│   └── application.properties

└── pom.xml                 # Maven configuration

🚀 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/chatBox.git
cd chatBox
Run the application:

bash
Copy
Edit
./mvnw spring-boot:run
Open your browser at:

bash
Copy
Edit
http://localhost:8080/chat
📱 To access from another device (mobile), make sure both are on the same network or use Ngrok to expose your localhost.

✅ Future Improvements
User authentication

Message persistence with database (e.g., MySQL, MongoDB)

Typing indicators and message status

Private chat (1:1 messaging)

