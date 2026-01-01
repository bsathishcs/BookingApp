# BookingApp
Booking App is build on the springboot techstack

Frontend: React.js, Tailwind CSS (for styling), Axios (API calls).
Backend: Spring Boot, Spring Security (JWT), Spring Data JPA.
Database: PostgreSQL (Relational is best for transactional booking).

**REST API Endpoints**
**User Module**
POST /api/auth/register - Create a new account.
POST /api/auth/login - Authenticate and receive a JWT.
GET /api/users/profile - Get current user details (Requires Token).

**Tour Module**
GET /api/tours - Fetch all available tour packages. Done
GET /api/tours/{id} - Fetch specific tour details.Done
POST /api/admin/tours - (Admin Only) Create a new tour. Done
PUT /api/admin/tours/{id} - (Admin Only) Update tour info.
DELETE /api/admin/tours/{id} - (Admin Only) Remove a tour.

**Booking Module**
POST /api/bookings - Place a new booking request.
GET /api/bookings/my-bookings - User's personal booking history.
