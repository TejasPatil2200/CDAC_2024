import express from 'express';
import { saveJobProfile, getAllJobProfiles, updateJobProfile, deleteJobProfile } from '../controller/JobController.js';

const router = express.Router();

// Route to save a job profile
router.post('/save', saveJobProfile);

// Route to fetch all job profiles
router.get('/getAll', getAllJobProfiles);

// Route to update a job profile
router.put('/update/:id', updateJobProfile);

// Route to delete a job profile
router.delete('/delete/:id', deleteJobProfile);

export default router;