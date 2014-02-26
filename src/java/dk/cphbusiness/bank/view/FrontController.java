/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.bank.view;

import commands.ListAccountsCommand;
import commands.TargetCommand;
import commands.Command;
import commands.ListCustomersCommand;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
@WebServlet(name = "FrontController", urlPatterns = {"/Controller"})
public class FrontController extends HttpServlet
{
    private final Map<String,Command> commands = new HashMap<>();

    public FrontController()
    {
	commands.put("list-accounts",new ListAccountsCommand("account-list.jsp"));
	commands.put("list-customers",new ListCustomersCommand("customer-list.jsp"));
	commands.put("back",new TargetCommand("main.jsp"));
	commands.put("main", new TargetCommand("main.jsp"));
    }
    

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
	
	String key = req.getParameter("command");
	if(key==null) key = "main";
	Command command = commands.get(key);
	String target = command.execute(req);
	RequestDispatcher dispt = req.getRequestDispatcher(target);
	dispt.forward(req, resp);
    }
    
}
