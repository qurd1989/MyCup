import axios from "axios";

// Define the backend API base URL
const API_BASE_URL = "http://localhost:8080";

// Axios instance with base URL and default settings
const api = axios.create({
    baseURL: API_BASE_URL,
    headers: {
        "Content-Type": "application/json",
    },
    withCredentials: true, // Required if using cookies or authentication
});

// Fetch expenses from backend
export const fetchExpenses = async () => {
    try {
        const response = await api.get("/api/expenses");
        return response.data;
    } catch (error) {
        console.error("Error fetching expenses:", error);
        throw error;
    }
};

// Add a new expense
export const addExpense = async (expenseData) => {
    try {
        const response = await api.post("/api/expenses", expenseData);
        return response.data;
    } catch (error) {
        console.error("Error adding expense:", error);
        throw error;
    }
};
