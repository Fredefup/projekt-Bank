/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commands;

import controllers.Factory;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import dk.cphbusiness.bank.contract.dto.CustomerSummary;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ahmed Sadiq
 */
public class ListCustomersCommand extends TargetCommand
{

    public ListCustomersCommand(String target)
    {
	super(target);
    }

    @Override
    public String execute(HttpServletRequest req)
    {
	BankManager manager = Factory.getInstance().getManager();
	Collection<CustomerSummary> customers = manager.listCustomers();
	
	req.setAttribute("customers", customers);
	req.setAttribute("message", "This is a test");
	
	return super.execute(req); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
