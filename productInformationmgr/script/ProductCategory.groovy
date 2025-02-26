import org.moqui.entity.EntityFacade
EntityFacade ef=ec.entity
String id=context.productCategoryId
if(!id)
{
    ec.message.adError("Product Category ID required")
    return
}
ef.find("ProductCategoryMember").condition("productCategoryId",id).deleteAll()
ef.find("ProductCategory").condition("productCategoryId",id).deleteAll()

ec.message.addMessage("product category deleted")
