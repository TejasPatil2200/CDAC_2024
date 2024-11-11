import express from 'express';
import bodyParser from 'body-parser';
import path from 'path'; // Import path module to resolve file paths
import { fileURLToPath } from 'url'; // Import fileURLToPath to get the file URL
import jobRouter from './router/JobRouter.js';

const app = express();
const PORT = 9800;

// Middleware to parse JSON bodies
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Get __dirname equivalent in ES modules
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// Serve static files from the frontend directory
app.use(express.static(path.join(__dirname, '../frontend'))); // Adjust the path to your frontend directory

// Use the job router
app.use('/api', jobRouter);

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});