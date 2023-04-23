package com.ms.exception;

public class ResourceNotFound extends RuntimeException{

	public ResourceNotFound()
	{
		super("Rating not found...");
	}
	
	public ResourceNotFound(String id)
	{
		super("Rating not found for this id :"+id);
	}
	
}
