import React from "react";
import axios from "axios";

const api =axios.create({
    baseURL:"https://localhost:8080/lojas"
});
export default api;