import express from "express";
import { establishConnection } from "./config/DbConfig.js";
import productRouter from "./router/ProductRouter.js";

const app = express();
const PORT = 9800;

app.use(express.static("frontend"));
app.use(express.json());
app.use("/products", productRouter);

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
    establishConnection();
});
