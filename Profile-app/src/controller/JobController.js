import { createConnectionObject } from "../config/DbConfig.js";

const connection = createConnectionObject();

// Function to save job profile
export function saveJobProfile(request, response) {
    const { fname, email, phone, location, skills } = request.body;
    const insertQuery = `INSERT INTO job_profiles (full_name, email, phone, location, skills) VALUES (?, ?, ?, ?, ?)`;

    connection.query(insertQuery, [fname, email, phone, location, JSON.stringify(skills)], (error) => {
        if (error) {
            response.status(500).send({ message: "Error saving job profile" });
        } else {
            response.status(201).send({ message: "Job profile saved successfully" });
        }
    });
}

// Function to fetch all job profiles
export function getAllJobProfiles(request, response) {
    const fetchQuery = "SELECT * FROM job_profiles";

    connection.query(fetchQuery, (error, result) => {
        if (error) {
            response.status(500).send({ message: "Error fetching job profiles" });
        } else {
            response.status(200).send(result);
        }
    });
}

// Function to update job profile
export function updateJobProfile(request, response) {
    const id = request.params.id;
    const { fname, email, phone, location, skills } = request.body;

    const updateQuery = 'UPDATE job_profiles SET full_name = ?, email = ?, phone = ?, location = ?, skills = ? WHERE id = ?';

    connection.query(updateQuery, [fname, email, phone, location, JSON.stringify(skills), id], (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error updating job profile' });
        } else if (result.affectedRows === 0) {
            response.status(404).send({ message: 'Job profile not found' });
        } else {
            response.status(200).send({ message: 'Job profile updated successfully' });
        }
    });
}

// Function to delete job profile
export function deleteJobProfile(request, response) {
    const id = request.params.id;

    const deleteQuery = 'DELETE FROM job_profiles WHERE id = ?';

    connection.query(deleteQuery, [id], (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error deleting job profile' });
        } else if (result.affectedRows === 0) {
            response.status(404).send({ message: 'Job profile not found' });
        } else {
            response.status(200).send({ message: 'Job profile deleted successfully' });
        }
    });
}