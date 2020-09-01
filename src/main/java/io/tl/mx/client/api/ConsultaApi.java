package io.tl.mx.client.api;

import io.tl.mx.client.ApiClient;
import io.tl.mx.client.ApiException;
import io.tl.mx.client.ApiResponse;
import io.tl.mx.client.Configuration;
import io.tl.mx.client.Pair;
import io.tl.mx.client.ProgressRequestBody;
import io.tl.mx.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.tl.mx.client.model.Busqueda;
import io.tl.mx.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsultaApi {
    private ApiClient apiClient;
    public ConsultaApi() {
        this(Configuration.getDefaultApiClient());
    }
    public ConsultaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call consultarTrayectoriasCall(String xApiKey, Busqueda busqueda, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = busqueda;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] { "trayectoriasAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call consultarTrayectoriasValidateBeforeCall(String xApiKey, Busqueda busqueda, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling consultarTrayectorias(Async)");
        }
        if (busqueda == null) {
            throw new ApiException("Missing the required parameter 'busqueda' when calling consultarTrayectorias(Async)");
        }
        
        okhttp3.Call call = consultarTrayectoriasCall(xApiKey, busqueda, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta consultarTrayectorias(String xApiKey, String xSignature, Busqueda busqueda) throws ApiException {
        ApiResponse<Respuesta> resp = consultarTrayectoriasWithHttpInfo(xApiKey, busqueda);
        return resp.getData();
    }
    
    public ApiResponse<?> genericConsultarTrayectorias(String xApiKey, Busqueda busqueda) throws ApiException {
    	ApiResponse<?> resp = consultarTrayectoriasWithHttpInfo(xApiKey, busqueda);
        return resp;
    }
    
    public ApiResponse<Respuesta> consultarTrayectoriasWithHttpInfo(String xApiKey, Busqueda busqueda) throws ApiException {
        okhttp3.Call call = consultarTrayectoriasValidateBeforeCall(xApiKey, busqueda, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
}
