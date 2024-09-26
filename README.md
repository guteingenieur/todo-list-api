# To-Do List API
A simple To-Do List API built using Spring Boot and MySQL to manage tasks efficiently. The API allows users to create, read, update, and delete tasks, providing a basic foundation for task management applications.

## Features
- **Create a new task**: Add a new task with a title and description.
- **View all tasks**: Retrieve a list of all tasks.
- **Update a task**: Modify an existing task’s title or description.
- **Delete a task**: Remove a task from the list.
- **Mark task as completed**: Track the status of tasks.

## Technologies Used
- **Spring Boot**: For building the RESTful API.
- **MySQL**: As the database to store task data.
- **Hibernate (JPA)**: For object-relational mapping with the database.
- **Maven**: For project management and build.

## API Endpoints

| Method | Endpoint           | Description               |
|--------|--------------------|---------------------------|
| GET    | `/api/tasks`        | Get all tasks             |
| POST   | `/api/tasks`        | Create a new task         |
| GET    | `/api/tasks/{id}`   | Get a specific task by ID |
| PUT    | `/api/tasks/{id}`   | Update a task by ID       |
| DELETE | `/api/tasks/{id}`   | Delete a task by ID       |

## How to Run

1. **Clone the repository**:
```bash
git clone https://github.com/guteingenieur/todo-list-api.git
cd todo-list-api
```

2. **Set up MySQL database**:

- Create a database called `todo_list`.

- Configure your MySQL credentials in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_list
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. **Run the application**:
```bash
mvn spring-boot:run
```
The API will be available at `http://localhost:8080/api/tasks`.


## Future Improvements
- Add user authentication and authorization.
- Implement task prioritization and due dates.
- Add filtering and sorting options for tasks.

## License
- This project is licensed under the MIT License.

