/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.bank.view;

import controllers.Factory;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
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
@WebServlet(name = "ListAccounts", urlPatterns = {"/ListAccounts"})
public class ListAccounts extends HttpServlet
{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
	BankManager manager = Factory.getInstance().getManager();
	CustomerIdentifier customer = CustomerIdentifier.fromString("121089-0987");
	Collection<AccountSummary> accounts = manager.listCustomerAccounts(customer);
	req.setAttribute("accounts", accounts);
	req.setAttribute("message", "This is a test");
	req.setAttribute("customer", customer);
	RequestDispatcher dispt = req.getRequestDispatcher("account-list.jsp");
	dispt.forward(req, resp);
	
    }

    
}
