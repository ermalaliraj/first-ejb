package com.ea.first.be.ejbimpl;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import com.ea.first.be.api.APIParams;
import com.ea.first.be.api.FirstEjbRemote;
import com.ea.first.be.api.dto.NameDTO;
import com.ea.first.be.api.dto.GetAllNamesOutputDTO;
import com.ea.first.be.api.reqres.AddNameRequest;
import com.ea.first.be.api.reqres.AddNameResponse;
import com.ea.first.be.api.reqres.GetAllNamesResponse;
import com.ea.first.be.bl.service.NameService;

@Stateless(name = APIParams.EJB_NAME_FIRST, mappedName = "ejb/", description = APIParams.EJB_DESC_FIRST)
@WebService(
		endpointInterface = "com.ea.first.be.api.FirstEjbRemote",
		serviceName= APIParams.SERVICE_NAME_FIRST, 
		targetNamespace = APIParams.DEFINITION_NAMESPACE,
		portName=APIParams.PORT_NAME_FIRST
)
@Remote(FirstEjbRemote.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class FirstEjbRemoteImpl implements FirstEjbRemote {

	protected static transient Log log = LogFactory.getLog(FirstEjbRemoteImpl.class);
			
	@Autowired
	NameService nameService;

	@Override
	public GetAllNamesResponse getAllNames() throws RemoteException{
		log.info("Inizio invocazione servizio getAllNames");
		try{	
			List<NameDTO> list = nameService.getAllNames();
			GetAllNamesOutputDTO out = new GetAllNamesOutputDTO(list);
			log.debug("list:"+list.size());			
				
			GetAllNamesResponse response = new GetAllNamesResponse();
			response.setResult(out);
			log.info("Fine invocazione servizio getAllNames");		
			return response;
		}catch(Exception e){
			log.error("Errore", e);
			throw new EJBException(e);
		}
	}

	@Override
	public AddNameResponse addName(AddNameRequest req) throws RemoteException {
		log.info("Inizio invocazione servizio addName");
		try{	
			nameService.addName(req.getInput());
			
			AddNameResponse response = new AddNameResponse();
			response.setResult(1);	
			log.info("Fine invocazione servizio addName");		
			return response;
		}catch(Exception e){
			log.error("Errore", e);
			throw new EJBException(e);
		}
	}
}
