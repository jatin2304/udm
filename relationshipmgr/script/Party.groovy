import org.moqui.entity.EntityFacade
EntityFacade ef=ec.entity
String id=partyId //accessing in-parameters

if(!id)
{
    ec.message.addError("id required")
    return
}
ef.find("PartyContactMech").condition("partyId",id).deleteAll()
ef.find("PartyRole").condition("partyId",id).deleteAll()
ef.find("Person").condition("partyId",id).deleteAll()
ef.find("Organization").condition("partyId",id).deleteAll()

ef.find("Party").condition("partyId",id).deleteAll()
ec.message.addMessage("deleted successfully")
