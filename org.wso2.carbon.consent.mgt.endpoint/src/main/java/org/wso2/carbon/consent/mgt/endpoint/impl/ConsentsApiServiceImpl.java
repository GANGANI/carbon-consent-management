package org.wso2.carbon.consent.mgt.endpoint.impl;

import org.wso2.carbon.consent.mgt.core.exception.ConsentManagementException;
import org.wso2.carbon.consent.mgt.core.exception.ConsentManagementServerException;
import org.wso2.carbon.consent.mgt.core.model.Purpose;
import org.wso2.carbon.consent.mgt.endpoint.ApiResponseMessage;
import org.wso2.carbon.consent.mgt.endpoint.ConsentsApiService;
import org.wso2.carbon.consent.mgt.endpoint.dto.ConsentRequestDTO;
import org.wso2.carbon.consent.mgt.endpoint.dto.PIIcategoryRequestDTO;
import org.wso2.carbon.consent.mgt.endpoint.dto.PurposeCategoryRequestDTO;
import org.wso2.carbon.consent.mgt.endpoint.dto.PurposeRequestDTO;
import org.wso2.carbon.consent.mgt.endpoint.impl.util.ConsentEndpointUtils;

import javax.ws.rs.core.Response;

public class ConsentsApiServiceImpl extends ConsentsApiService {
    @Override
    public Response consentsGet(String limit, String offset, String piiPrincipalId, String spTenantDomain, String service, String state, String collectionMethod, String piiCategoryId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPiiCategoriesGet() {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPiiCategoriesPost(PIIcategoryRequestDTO piiCategory) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPiiCategoryPiiCategoryIdDelete(String piiCategoryId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPiiCategoryPiiCategoryIdGet(String piiCategoryId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPost(ConsentRequestDTO consent) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposeCategoriesGet() {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposeCategoriesPost(PurposeCategoryRequestDTO purposeCategory) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposeCategoriesPurposeCategoryIdDelete(String purposeCategoryId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposeCategoriesPurposeCategoryIdGet(String purposeCategoryId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposesGet() {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposesPost(PurposeRequestDTO purpose) {
        // do some magic!

        Purpose purpose1 = new Purpose(purpose.getPurpose(), purpose.getDescription());


        Purpose purpose2 = null;
        try {
            purpose2 = ConsentEndpointUtils.getConsentManager().addPurpose(purpose1);
        } catch (ConsentManagementException e) {
            e.printStackTrace();
        }

        return Response.ok().entity(purpose2).build();
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposesPurposeIdDelete(String purposeId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsPurposesPurposeIdGet(String purposeId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsReceiptsReceiptIdDelete(String receiptId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response consentsReceiptsReceiptIdGet(String receiptId) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
