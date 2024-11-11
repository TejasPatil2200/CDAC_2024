import { createConnectionObject } from "../config/DbConfig.js";

const connection = createConnectionObject();

export function saveProduct(request, response) {
    const { fname, email, phone, loc, skills } = request.body;
    const insertQuery = `INSERT INTO profile  VALUES (?, ?, ?, ?, ?)`;

    connection.query(insertQuery, [fname, email, phone, loc, skills], (error) => {
        if (error) {
            response.status(500).send({ message: "Error saving product" });
        } else {
            response.status(201).send({ message: "Product saved successfully" });
        }
    });
}

export function getAllProduct(request, response) {
    const fetchQuery = "SELECT * FROM profile";

    connection.query(fetchQuery, (error, result) => {
        if (error) {
            response.status(500).send({ message: "Error fetching products" });
        } else {
            response.status(200).send(result);
        }
    });
}

export function updateProduct(request, response) {
    const id = request.params.id; // Assuming 'id' is the unique identifier
    const { email, phone, loc, skills } = request.body;

    const updateQuery = 'UPDATE profile SET email = ?, phone = ?, loc = ?, skills = ? WHERE id = ?';

    connection.query(updateQuery, [email, phone, loc, skills, id], (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error updating profile' });
        } else if (result.affectedRows === 0) {
            response.status(404).send({ message: 'Profile not found' });
        } else {
            response.status(200).send({ message: 'Profile updated successfully' });
        }
    });
}

export function deleteProduct(request, response) {
    const id = request.params.id; // Assuming 'id' is the unique identifier

    const deleteQuery = 'DELETE FROM profile WHERE id = ?';

    connection.query(deleteQuery, [id], (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error deleting profile' });
        } else if (result.affectedRows === 0) {
            response.status(404).send({ message: 'Profile not found' });
        } else {
            response.status(200).send({ message: 'Profile deleted successfully' });
        }
    });
}