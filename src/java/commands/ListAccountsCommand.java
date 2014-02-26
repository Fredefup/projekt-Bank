/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commands;

import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import controllers.Factory;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ahmed Sadiq
 */
public class ListAccountsCommand extends TargetCommand
{

    public ListAccountsCommand(String target)
    {
	super(target);
    }

    @Override
    public String execute(HttpServletRequest req)
    {
	BankManager manager = Factory.getInstance().getManager();
	CustomerIdentifier customer = CustomerIdentifier.fromString("121089-0987");
	Collection<AccountSummary> accounts = manager.listCustomerAccounts(customer);
	
	req.setAttribute("accounts", accounts);
	req.setAttribute("message", "This is a test");
	req.setAttribute("customer", customer);
	
	return super.execute(req); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
