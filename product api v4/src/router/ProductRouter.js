import { Router } from "express";
import { getAllProduct, saveProduct, updateProduct, deleteProduct } from "../controller/ProductController.js";

const productRouter = Router();

productRouter.post("/save", saveProduct);
productRouter.get("/getAll", getAllProduct);
productRouter.put("/update/:id", updateProduct);
productRouter.delete("/delete/:id", deleteProduct);

export default productRouter;
