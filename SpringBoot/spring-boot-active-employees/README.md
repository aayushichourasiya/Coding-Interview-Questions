# Spring Boot: Active Employees API

This is a simple Spring Boot app that exposes an endpoint to return all **active employees** whose **salary is greater than 10,000**. No database or JPA is used — all data is hardcoded for simplicity.

---

## ✅ Endpoint

**GET** `/employees/active`

Returns:
```json
[
  {
    "id": 1,
    "name": "Alice",
    "salary": 12000.0,
    "active": true
  },
  {
    "id": 4,
    "name": "David",
    "salary": 18000.0,
    "active": true
  }
]

