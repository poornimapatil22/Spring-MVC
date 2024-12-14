package com.xworkz.Servlet;

import com.xworkz.DTO.ProductDTO;
import com.xworkz.Impl.ProductImpl;
import com.xworkz.Interface.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1 ,urlPatterns = "/send")
public class ProductServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductDTO productDTO=new ProductDTO();
        productDTO.setProductName(req.getParameter("productName"));
        productDTO.setCompanyName(req.getParameter("companyName"));
        productDTO.setProductCost(Integer.parseInt(req.getParameter("productCost")));
        productDTO.setProductQuantity(Integer.parseInt(req.getParameter("productQuantity")));
        productDTO.setProductType(req.getParameter("productType"));
        Product product=new ProductImpl();
        boolean validationOfDTO=product.serve(productDTO);
        if(validationOfDTO){
            System.out.println("valid data");
            double totalAmount=calculateTotal(productDTO.getProductCost(),productDTO.getProductQuantity());
            System.out.println(totalAmount);
            RequestDispatcher  dispatcher=req.getRequestDispatcher("Success.jsp");
            req.setAttribute("productName",productDTO.getProductName());
            req.setAttribute("totalAmount",totalAmount);
            dispatcher.forward(req,resp);

        }
        else {
            System.out.println("invalid data");
            RequestDispatcher dispatcher=req.getRequestDispatcher("Product.jsp");
            req.setAttribute("validationError","Product Order Failed!!");
            dispatcher.forward(req,resp);

        }

    }
    private double calculateTotal(double productCost, int productQuantity) {
        return productCost * productQuantity;
    }
}
