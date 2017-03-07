package demo

import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult


@GrailsCxfEndpoint
class SomeService {

    @WebMethod
    @WebResult
    boolean someMethod(String someParam) {
        true
    }
}
