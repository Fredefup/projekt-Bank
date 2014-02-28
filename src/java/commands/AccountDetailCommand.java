/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.bank.view;

import commands.Command;
import commands.TargetCommand;
import controllers.Factory;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Frederik
 */
public class AccountDetailCommand extends TargetCommand {

    public AccountDetailCommand(String target) {
        super(target);
    }
  
    @Override
    public String execute(HttpServletRequest req)
    {
	BankManager manager = Factory.getInstance().getManager();
        String idAsStr = req.getParameter("cpr");

        CustomerIdentifier customer = CustomerIdentifier.fromString(idAsStr);
	Collection<AccountSummary> accounts = manager.listCustomerAccounts(customer);
	
	req.setAttribute("accounts", accounts);
	req.setAttribute("customer", customer);
        return super.execute(req);

}
}
