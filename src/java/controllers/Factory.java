/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import dk.cphbusiness.bank.contract.BankManager;
import dk.cphbusiness.dummy.bank.control.DummyBankManager;

/**
 *
 * @author Ahmed Sadiq
 */
public class Factory
{
    private static Factory instance = null;
    private final BankManager manager;
    
    private Factory(){
	manager = new DummyBankManager();
    }
    
    public static Factory getInstance(){
	if(instance == null) instance = new Factory();
	return instance;
    }

    public BankManager getManager()
    {
	return manager;
    }
    
}
