/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commands;

import controllers.Factory;
import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.bank.contract.dto.AccountDetail;
import dk.cphbusiness.bank.contract.dto.AccountIdentifier;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import dk.cphbusiness.bank.contract.dto.TransferSummary;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Frederik
 */
public class ViewAccountCommand extends TargetCommand 
{

    public ViewAccountCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest req) {
        String idAsStr = req.getParameter("account");
        
        BankManager manager = Factory.getInstance().getManager();
        AccountIdentifier account = AccountIdentifier.fromString(idAsStr);
        
        AccountDetail trans = manager.showAccountHistory(account);
        
         CustomerIdentifier customer = CustomerIdentifier.fromString(idAsStr);
	Collection<AccountSummary> accounts = manager.listCustomerAccounts(customer);
	
	req.setAttribute("accounts", accounts);
        
        req.setAttribute("transactions", trans);
        
        return super.execute(req); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
