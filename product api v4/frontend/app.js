$(document).ready(function() {
    // Add product
    $('#productForm').submit(function(e) {
        e.preventDefault();
        const pdata = {
            fname: $('#fname').val(),
            email: $('#ename').val(),
            phone: $('#phone').val(),
            loc: $('#loc').val(),
            skills: $('#skills').val(),
        };

        $.ajax({
            url: 'http://localhost:9800/products/save',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(pdata),
            success: function(response) {
                $('#message').text('Profile added successfully!');
                $('#productForm')[0].reset();
            },
            error: function(xhr) {
                $('#message').text('Error adding product');
            }
        });
    });

    // Fetch all products and display them in a table
    function fetchProducts() {
        $.ajax({
            url: 'http://localhost:9800/products/getAll',
            method: 'GET',
            success: function(pdata) {
                $('#productTable tbody').empty();
                pdata.forEach(pdata => {
                    $('#productTable tbody').append(`
                        <tr>
                            <td>${pdata.full_name}</td>
                            <td>${pdata.email}</td>
                            <td>${pdata.phone_no}</td>
                            <td>${pdata.location}</td>
                            <td>${pdata.skills}</td>
                            <td>
                                <button onclick="updateProduct(${pdata.id})">Update</button>
                                <button onclick="deleteProduct(${pdata .id})">Delete</button>
                            </td>
                        </tr>
                    `);
                });
            },
            error: function(xhr) {
                alert('Error fetching products');
            }
        });
    }

    // Call fetchProducts when the page loads
    fetchProducts();

    // Update product function
    window.updateProduct = function(full_name) {
        //const fullname = prompt("Enter new product name:");
        const email = prompt("Enter new product price:");
        const phone = prompt("Enter new quantity:");
        const location = prompt("Enter new description:");
        const skills = prompt("Add skills:");

        if ( email && phone && location && skills) {
            $.ajax({
                url: `http://localhost:9800/products/update/${full_name}`,
                method: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify({email, phone, location, skills}),
                success: function(response) {
                    alert(response.message);
                    fetchProducts();
                },
                error: function(xhr) {
                    alert('Error updating profile');
                }
            });
        }
    };

    // Delete product function
    window.deleteProduct = function(full_name) {
        if (confirm("Are you sure you want to delete this profile?")) {
            $.ajax({
                url: `http://localhost:9800/products/delete/${full_name}`,
                method: 'DELETE',
                success: function(response) {
                    alert(response.message);
                    fetchProducts();
                },
                error: function(xhr) {
                    alert('Error deleting profile');
                }
            });
        }
    };
});
