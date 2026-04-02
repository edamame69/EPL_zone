# EPL Zone - Premier League Player Statistics API

A REST API for managing and searching Premier League player statistics built with Spring Boot and PostgreSQL.

## Technologies
- Java / Spring Boot
- PostgreSQL
- JPA / Hibernate
- Maven

## API Endpoints

### Get Players
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/v1/player | Get all players |
| GET | /api/v1/player/team?team= | Get players by team |
| GET | /api/v1/player/search?name= | Search players by name |
| GET | /api/v1/player/position?position= | Get players by position |
| GET | /api/v1/player/nation?nation= | Get players by nation |
| GET | /api/v1/player/filter?teamName=&position= | Filter by team and position |

### Manage Players
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/v1/player | Add new player |
| PUT | /api/v1/player | Update player |
| DELETE | /api/v1/player/{playerName} | Delete player |

## Setup
1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Run the application
