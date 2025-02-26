import org.moqui.entity.EntityFacade
EntityFacade ef=ec.entity
String id=contactMechId

if(!id)
{
    ec.message.addError("id required")
    return
}
ef.find("PartyContactMech").condition("contactMechId",id).deleteAll()
ef.find("ContactMechPurpose").condition("contactMechId",id).deleteAll()
ef.find("PostalAddress").condition("contactMechId",id).deleteAll()
ef.find("TelecomNumber").condition("contactMechId",id).deleteAll()
ef.find("ContactMech").condition("contactMechId",id).deleteAll()

ec.message.addMessage("deleted successfully")