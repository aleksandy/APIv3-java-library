/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import sendinblue.ApiCallback;
import sendinblue.ApiClient;
import sendinblue.ApiException;
import sendinblue.ApiResponse;
import sendinblue.Configuration;
import sendinblue.Pair;
import sendinblue.ProgressRequestBody;
import sendinblue.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sibModel.ErrorModel;
import sibModel.GetProcess;
import sibModel.GetProcesses;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessApi {
    private ApiClient apiClient;

    public ProcessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProcessApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getProcess
     * @param processId Id of the process (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProcessCall(Long processId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/processes/{processId}"
            .replaceAll("\\{" + "processId" + "\\}", apiClient.escapeString(processId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProcessValidateBeforeCall(Long processId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling getProcess(Async)");
        }
        

        com.squareup.okhttp.Call call = getProcessCall(processId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return the informations for a process
     * 
     * @param processId Id of the process (required)
     * @return GetProcess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetProcess getProcess(Long processId) throws ApiException {
        ApiResponse<GetProcess> resp = getProcessWithHttpInfo(processId);
        return resp.getData();
    }

    /**
     * Return the informations for a process
     * 
     * @param processId Id of the process (required)
     * @return ApiResponse&lt;GetProcess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetProcess> getProcessWithHttpInfo(Long processId) throws ApiException {
        com.squareup.okhttp.Call call = getProcessValidateBeforeCall(processId, null, null);
        Type localVarReturnType = new TypeToken<GetProcess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return the informations for a process (asynchronously)
     * 
     * @param processId Id of the process (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProcessAsync(Long processId, final ApiCallback<GetProcess> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProcessValidateBeforeCall(processId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetProcess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProcesses
     * @param limit Number limitation for the result returned (optional, default to 10)
     * @param offset Beginning point in the list to retrieve from. (optional, default to 0)
     * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProcessesCall(Long limit, Long offset, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/processes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProcessesValidateBeforeCall(Long limit, Long offset, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getProcessesCall(limit, offset, sort, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return all the processes for your account
     * 
     * @param limit Number limitation for the result returned (optional, default to 10)
     * @param offset Beginning point in the list to retrieve from. (optional, default to 0)
     * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
     * @return GetProcesses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetProcesses getProcesses(Long limit, Long offset, String sort) throws ApiException {
        ApiResponse<GetProcesses> resp = getProcessesWithHttpInfo(limit, offset, sort);
        return resp.getData();
    }

    /**
     * Return all the processes for your account
     * 
     * @param limit Number limitation for the result returned (optional, default to 10)
     * @param offset Beginning point in the list to retrieve from. (optional, default to 0)
     * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
     * @return ApiResponse&lt;GetProcesses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetProcesses> getProcessesWithHttpInfo(Long limit, Long offset, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getProcessesValidateBeforeCall(limit, offset, sort, null, null);
        Type localVarReturnType = new TypeToken<GetProcesses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return all the processes for your account (asynchronously)
     * 
     * @param limit Number limitation for the result returned (optional, default to 10)
     * @param offset Beginning point in the list to retrieve from. (optional, default to 0)
     * @param sort Sort the results in the ascending/descending order of record creation. Default order is **descending** if &#x60;sort&#x60; is not passed (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProcessesAsync(Long limit, Long offset, String sort, final ApiCallback<GetProcesses> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProcessesValidateBeforeCall(limit, offset, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetProcesses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
