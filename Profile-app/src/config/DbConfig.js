import { createConnection } from "mysql2";

export function createConnectionObject() {
    return createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database: "db",
        port: "3307"
    });
}

export function establishConnection() {
    const connection = createConnectionObject();
    connection.connect((error) => {
        if (error) {
            console.log("Error connecting to the database:", error);
        } else {
            console.log("Connected to the database successfully.");
        }
    });
    return connection;
}
