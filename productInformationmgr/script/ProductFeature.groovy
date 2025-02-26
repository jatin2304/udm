import org.moqui.entity.EntityFacade
EntityFacade ef=ec.entity
String id=context.productFeatureId
if(!id)
{
    ec.message.adError("Product Feature ID required")
    return
}
ef.find("ProductFeatureAppl").condition("productFeatureId",id).deleteAll()
ef.find("ProductFeature").condition("productFeatureId",id).deleteAll()

ec.message.addMessage("product feature deleted")
