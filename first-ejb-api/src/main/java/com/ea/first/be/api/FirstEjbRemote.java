package com.ea.first.be.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.ea.first.be.api.reqres.AddNameRequest;
import com.ea.first.be.api.reqres.AddNameResponse;
import com.ea.first.be.api.reqres.GetAllNamesResponse;

@WebService(
        targetNamespace = APIParams.DEFINITION_NAMESPACE,
        name=APIParams.PORTTYPE_NAME_FIRST)
@SOAPBinding(style=Style.DOCUMENT, parameterStyle= SOAPBinding.ParameterStyle.BARE )
public interface FirstEjbRemote extends Remote {

	public GetAllNamesResponse getAllNames() throws RemoteException;
	
	public AddNameResponse addName(AddNameRequest request) throws RemoteException;
	
}
