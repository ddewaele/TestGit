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
		System.out.println("aaaaaaaaaaaaaaaaaaaand here also");
		System.out.println("aaaaaaaaaaaaaaaaaaaathis will cause a conflict....");
		System.out.println("aaaaaaaaaaaaaaaaaaamsg from dev_branch_v1");
	}
	
	public void newDevMethod() {
		System.out.println("new dev method");
	}
	
	public void newDevMethodForBranch() {
		System.out.println("new dev method for dev_branch_v2");
	}
	
	public void newDevMethod3() {
		System.out.println("new dev method for dev_branch_v3");
	}
}
