$(document).ready(function() {
    // Add product
    $('#productForm').submit(function(e) {
        e.preventDefault();
        const pdata = {
            fname: $('#fname').val(),
            email: $('#email').val(),
            phone: $('#phone').val(),
            loc: $('#location').val(),
            skills: $('#skills').val(),
        };

        $.ajax({
            url: 'http://localhost:9800/api/jobs/save', // Ensure this matches your server route
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(pdata),
            success: function(response) {
                $('#message').text('Profile added successfully!');
                $('#productForm')[0].reset();
            },
            error: function(xhr) {
                $('#message').text('Error adding product: ' + xhr.responseText); // Display error message
            }
        });
    });
});
// Function to fetch all job profiles and display them
function fetchJobProfiles() {
    $.ajax({
        url: 'http://localhost:9800/jobs/getAll',
        method: 'GET',
        success: function(profiles) {
            $('#profilesTable tbody').empty(); // Clear existing profiles
            profiles.forEach(profile => {
                $('#profilesTable tbody').append(`
                    <tr>
                        <td>${profile.full_name}</td>
                        <td>${profile.email}</td>
                        <td>${profile.phone}</td>
                        <td>${profile.location}</td>
                        <td>${JSON.parse(profile.skills).join(', ')}</td>
                        <td>
                            <button onclick="updateJobProfile(${profile.id})">Update</button>
                            <button onclick="deleteJobProfile(${profile.id})">Delete</button>
                        </td>
                    </tr>
                `);
            });
        },
        error: function(xhr) {
            alert('Error fetching job profiles');
        }
    });
}

// Function to update a job profile
function updateJobProfile(id) {
    const updatedProfile = {
        fname: prompt("Enter new full name:"),
        email: prompt("Enter new email:"),
        phone : prompt("Enter new phone:"),
        location: prompt("Enter new location:"),
        skills: prompt("Enter new skills (comma separated):").split(',')
    };

    $.ajax({
        url: `http://localhost:9800/jobs/update/${id}`,
        method: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(updatedProfile),
        success: function(response) {
            alert(response.message);
            fetchJobProfiles(); // Refresh the list after update
        },
        error: function(xhr) {
            alert('Error updating job profile');
        }
    });
}

// Function to delete a job profile
function deleteJobProfile(id) {
    if (confirm("Are you sure you want to delete this job profile?")) {
        $.ajax({
            url: `http://localhost:9800/jobs/delete/${id}`,
            method: 'DELETE',
            success: function(response) {
                alert(response.message);
                fetchJobProfiles(); // Refresh the list after deletion
            },
            error: function(xhr) {
                alert('Error deleting job profile');
            }
        });
    }
}