import org.moqui.entity.EntityFacade
EntityFacade ef=ec.entity
String id=context.productId
if(!id)
{
    ec.message.adError("Product ID required")
    return
}
ef.find("ProductCategoryMember").condition("productId",id).deleteAll()
ef.find("ProductFeatureAppl").condition("productId",id).deleteAll()
ef.find("ProductAssoc").condition("productId",id).deleteAll()
ef.find("ProductPrice").condition("productId",id).deleteAll()
ef.find("ProductDimension").condition("productId",id).deleteAll()
ef.find("ProductContent").condition("productId",id).deleteAll()
ef.find("Product").condition("productId",id).deleteAll()

ec.message.addMessage("product deleted")
