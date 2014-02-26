/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commands;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ahmed Sadiq
 */
public class TargetCommand implements Command
{
    private final String target;

    public TargetCommand(String target)
    {
	this.target = target;
    }

    @Override
    public String execute(HttpServletRequest req)
    {
	return target;
    }
    
}
