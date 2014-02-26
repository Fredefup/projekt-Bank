/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.bank.view;

import controllers.Factory;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.CustomerSummary;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ahmed Sadiq
 */
@WebServlet(name = "ListCustomers", urlPatterns = {"/ListCustomers"})
public class ListCustomers extends HttpServlet
{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
	    BankManager manager = Factory.getInstance().getManager();
	    Collection<CustomerSummary> customers = manager.listCustomers();
	    req.setAttribute("customers", customers);
	    req.setAttribute("message", "This is a test");
	    RequestDispatcher dispt = req.getRequestDispatcher("customer-list.jsp");
	    dispt.forward(req, resp);

}
}
