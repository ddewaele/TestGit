package com.ecs.test.git;

/**
 * updated docs. added something on this line
 * 
 * @author Davy
 *
 */
public class ServiceOne {

	public void doSomethingHereAlso() {
		System.out.println("doing something here also..........");
	}
	
	public void andHereAlso() {
		System.out.println("and here also");
		System.out.println("this will cause a conflict....");
		System.out.println("cccccccccccccccccccccccccccmsg from dev_branch_v1");
	}
	
	public void newDevMethod() {
		System.out.println("new dev method");
	}
	
	public void newDevMethod3() {
		System.out.println("new dev method for dev_branch_v3");
	}
	
	public void newDevMethod4() {
		System.out.println("new dev method for dev_branch_v4 - removed v2");
	}
}
