/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.stub.FeaturestoreServiceStub;
import com.google.cloud.aiplatform.v1beta1.stub.FeaturestoreServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The service that handles CRUD and List for resources for Featurestore.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
 *   FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
 *   Featurestore response = featurestoreServiceClient.getFeaturestore(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeaturestoreServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of FeaturestoreServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * FeaturestoreServiceSettings featurestoreServiceSettings =
 *     FeaturestoreServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeaturestoreServiceClient featurestoreServiceClient =
 *     FeaturestoreServiceClient.create(featurestoreServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * FeaturestoreServiceSettings featurestoreServiceSettings =
 *     FeaturestoreServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeaturestoreServiceClient featurestoreServiceClient =
 *     FeaturestoreServiceClient.create(featurestoreServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class FeaturestoreServiceClient implements BackgroundResource {
  private final FeaturestoreServiceSettings settings;
  private final FeaturestoreServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of FeaturestoreServiceClient with default settings. */
  public static final FeaturestoreServiceClient create() throws IOException {
    return create(FeaturestoreServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeaturestoreServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeaturestoreServiceClient create(FeaturestoreServiceSettings settings)
      throws IOException {
    return new FeaturestoreServiceClient(settings);
  }

  /**
   * Constructs an instance of FeaturestoreServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(FeaturestoreServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeaturestoreServiceClient create(FeaturestoreServiceStub stub) {
    return new FeaturestoreServiceClient(stub);
  }

  /**
   * Constructs an instance of FeaturestoreServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeaturestoreServiceClient(FeaturestoreServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeaturestoreServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeaturestoreServiceClient(FeaturestoreServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final FeaturestoreServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeaturestoreServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Featurestore in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Featurestore featurestore = Featurestore.newBuilder().build();
   *   Featurestore response =
   *       featurestoreServiceClient.createFeaturestoreAsync(parent, featurestore).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create Featurestores. Format:
   *     `projects/{project}/locations/{location}'`
   * @param featurestore Required. The Featurestore to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreAsync(LocationName parent, Featurestore featurestore) {
    CreateFeaturestoreRequest request =
        CreateFeaturestoreRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeaturestore(featurestore)
            .build();
    return createFeaturestoreAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Featurestore in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   Featurestore featurestore = Featurestore.newBuilder().build();
   *   Featurestore response =
   *       featurestoreServiceClient.createFeaturestoreAsync(parent, featurestore).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create Featurestores. Format:
   *     `projects/{project}/locations/{location}'`
   * @param featurestore Required. The Featurestore to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreAsync(String parent, Featurestore featurestore) {
    CreateFeaturestoreRequest request =
        CreateFeaturestoreRequest.newBuilder()
            .setParent(parent)
            .setFeaturestore(featurestore)
            .build();
    return createFeaturestoreAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Featurestore in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeaturestoreRequest request =
   *       CreateFeaturestoreRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setFeaturestoreId("featurestoreId-1315851738")
   *           .build();
   *   Featurestore response = featurestoreServiceClient.createFeaturestoreAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreAsync(CreateFeaturestoreRequest request) {
    return createFeaturestoreOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Featurestore in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeaturestoreRequest request =
   *       CreateFeaturestoreRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setFeaturestoreId("featurestoreId-1315851738")
   *           .build();
   *   OperationFuture<Featurestore, CreateFeaturestoreOperationMetadata> future =
   *       featurestoreServiceClient.createFeaturestoreOperationCallable().futureCall(request);
   *   // Do something.
   *   Featurestore response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateFeaturestoreRequest, Featurestore, CreateFeaturestoreOperationMetadata>
      createFeaturestoreOperationCallable() {
    return stub.createFeaturestoreOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Featurestore in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeaturestoreRequest request =
   *       CreateFeaturestoreRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setFeaturestoreId("featurestoreId-1315851738")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.createFeaturestoreCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeaturestoreRequest, Operation> createFeaturestoreCallable() {
    return stub.createFeaturestoreCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
   *   Featurestore response = featurestoreServiceClient.getFeaturestore(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Featurestore resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Featurestore getFeaturestore(FeaturestoreName name) {
    GetFeaturestoreRequest request =
        GetFeaturestoreRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getFeaturestore(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   Featurestore response = featurestoreServiceClient.getFeaturestore(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Featurestore resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Featurestore getFeaturestore(String name) {
    GetFeaturestoreRequest request = GetFeaturestoreRequest.newBuilder().setName(name).build();
    return getFeaturestore(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetFeaturestoreRequest request =
   *       GetFeaturestoreRequest.newBuilder()
   *           .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .build();
   *   Featurestore response = featurestoreServiceClient.getFeaturestore(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Featurestore getFeaturestore(GetFeaturestoreRequest request) {
    return getFeaturestoreCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetFeaturestoreRequest request =
   *       GetFeaturestoreRequest.newBuilder()
   *           .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .build();
   *   ApiFuture<Featurestore> future =
   *       featurestoreServiceClient.getFeaturestoreCallable().futureCall(request);
   *   // Do something.
   *   Featurestore response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeaturestoreRequest, Featurestore> getFeaturestoreCallable() {
    return stub.getFeaturestoreCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Featurestores in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Featurestore element :
   *       featurestoreServiceClient.listFeaturestores(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Featurestores. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturestoresPagedResponse listFeaturestores(LocationName parent) {
    ListFeaturestoresRequest request =
        ListFeaturestoresRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeaturestores(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Featurestores in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   for (Featurestore element :
   *       featurestoreServiceClient.listFeaturestores(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Featurestores. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturestoresPagedResponse listFeaturestores(String parent) {
    ListFeaturestoresRequest request =
        ListFeaturestoresRequest.newBuilder().setParent(parent).build();
    return listFeaturestores(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Featurestores in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturestoresRequest request =
   *       ListFeaturestoresRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (Featurestore element :
   *       featurestoreServiceClient.listFeaturestores(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturestoresPagedResponse listFeaturestores(ListFeaturestoresRequest request) {
    return listFeaturestoresPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Featurestores in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturestoresRequest request =
   *       ListFeaturestoresRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Featurestore> future =
   *       featurestoreServiceClient.listFeaturestoresPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Featurestore element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresPagedResponse>
      listFeaturestoresPagedCallable() {
    return stub.listFeaturestoresPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Featurestores in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturestoresRequest request =
   *       ListFeaturestoresRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListFeaturestoresResponse response =
   *         featurestoreServiceClient.listFeaturestoresCallable().call(request);
   *     for (Featurestore element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeaturestoresRequest, ListFeaturestoresResponse>
      listFeaturestoresCallable() {
    return stub.listFeaturestoresCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   Featurestore featurestore = Featurestore.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Featurestore response =
   *       featurestoreServiceClient.updateFeaturestoreAsync(featurestore, updateMask).get();
   * }
   * }</pre>
   *
   * @param featurestore Required. The Featurestore's `name` field is used to identify the
   *     Featurestore to be updated. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @param updateMask Field mask is used to specify the fields to be overwritten in the
   *     Featurestore resource by the update. The fields specified in the update_mask are relative
   *     to the resource, not the full request. A field will be overwritten if it is in the mask. If
   *     the user does not provide a mask then only the non-empty fields present in the request will
   *     be overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `display_name` &#42; `labels` &#42; `online_serving_config.fixed_node_count` &#42;
   *     `online_serving_config.max_online_serving_size`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Featurestore, UpdateFeaturestoreOperationMetadata>
      updateFeaturestoreAsync(Featurestore featurestore, FieldMask updateMask) {
    UpdateFeaturestoreRequest request =
        UpdateFeaturestoreRequest.newBuilder()
            .setFeaturestore(featurestore)
            .setUpdateMask(updateMask)
            .build();
    return updateFeaturestoreAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateFeaturestoreRequest request =
   *       UpdateFeaturestoreRequest.newBuilder()
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Featurestore response = featurestoreServiceClient.updateFeaturestoreAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Featurestore, UpdateFeaturestoreOperationMetadata>
      updateFeaturestoreAsync(UpdateFeaturestoreRequest request) {
    return updateFeaturestoreOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateFeaturestoreRequest request =
   *       UpdateFeaturestoreRequest.newBuilder()
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<Featurestore, UpdateFeaturestoreOperationMetadata> future =
   *       featurestoreServiceClient.updateFeaturestoreOperationCallable().futureCall(request);
   *   // Do something.
   *   Featurestore response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateFeaturestoreRequest, Featurestore, UpdateFeaturestoreOperationMetadata>
      updateFeaturestoreOperationCallable() {
    return stub.updateFeaturestoreOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateFeaturestoreRequest request =
   *       UpdateFeaturestoreRequest.newBuilder()
   *           .setFeaturestore(Featurestore.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.updateFeaturestoreCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFeaturestoreRequest, Operation> updateFeaturestoreCallable() {
    return stub.updateFeaturestoreCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force`
   * must be set to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeaturestoreName name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
   *   featurestoreServiceClient.deleteFeaturestoreAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Featurestore to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeaturestoreAsync(
      FeaturestoreName name) {
    DeleteFeaturestoreRequest request =
        DeleteFeaturestoreRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteFeaturestoreAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force`
   * must be set to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   featurestoreServiceClient.deleteFeaturestoreAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Featurestore to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeaturestoreAsync(
      String name) {
    DeleteFeaturestoreRequest request =
        DeleteFeaturestoreRequest.newBuilder().setName(name).build();
    return deleteFeaturestoreAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force`
   * must be set to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeaturestoreRequest request =
   *       DeleteFeaturestoreRequest.newBuilder()
   *           .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setForce(true)
   *           .build();
   *   featurestoreServiceClient.deleteFeaturestoreAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeaturestoreAsync(
      DeleteFeaturestoreRequest request) {
    return deleteFeaturestoreOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force`
   * must be set to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeaturestoreRequest request =
   *       DeleteFeaturestoreRequest.newBuilder()
   *           .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featurestoreServiceClient.deleteFeaturestoreOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFeaturestoreRequest, Empty, DeleteOperationMetadata>
      deleteFeaturestoreOperationCallable() {
    return stub.deleteFeaturestoreOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force`
   * must be set to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeaturestoreRequest request =
   *       DeleteFeaturestoreRequest.newBuilder()
   *           .setName(FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.deleteFeaturestoreCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFeaturestoreRequest, Operation> deleteFeaturestoreCallable() {
    return stub.deleteFeaturestoreCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new EntityType in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
   *   EntityType entityType = EntityType.newBuilder().build();
   *   EntityType response =
   *       featurestoreServiceClient.createEntityTypeAsync(parent, entityType).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Featurestore to create EntityTypes. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @param entityType The EntityType to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<EntityType, CreateEntityTypeOperationMetadata> createEntityTypeAsync(
      FeaturestoreName parent, EntityType entityType) {
    CreateEntityTypeRequest request =
        CreateEntityTypeRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setEntityType(entityType)
            .build();
    return createEntityTypeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new EntityType in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   EntityType entityType = EntityType.newBuilder().build();
   *   EntityType response =
   *       featurestoreServiceClient.createEntityTypeAsync(parent, entityType).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Featurestore to create EntityTypes. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @param entityType The EntityType to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<EntityType, CreateEntityTypeOperationMetadata> createEntityTypeAsync(
      String parent, EntityType entityType) {
    CreateEntityTypeRequest request =
        CreateEntityTypeRequest.newBuilder().setParent(parent).setEntityType(entityType).build();
    return createEntityTypeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new EntityType in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateEntityTypeRequest request =
   *       CreateEntityTypeRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setEntityTypeId("entityTypeId767740856")
   *           .build();
   *   EntityType response = featurestoreServiceClient.createEntityTypeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<EntityType, CreateEntityTypeOperationMetadata> createEntityTypeAsync(
      CreateEntityTypeRequest request) {
    return createEntityTypeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new EntityType in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateEntityTypeRequest request =
   *       CreateEntityTypeRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setEntityTypeId("entityTypeId767740856")
   *           .build();
   *   OperationFuture<EntityType, CreateEntityTypeOperationMetadata> future =
   *       featurestoreServiceClient.createEntityTypeOperationCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateEntityTypeRequest, EntityType, CreateEntityTypeOperationMetadata>
      createEntityTypeOperationCallable() {
    return stub.createEntityTypeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new EntityType in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateEntityTypeRequest request =
   *       CreateEntityTypeRequest.newBuilder()
   *           .setParent(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setEntityTypeId("entityTypeId767740856")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.createEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateEntityTypeRequest, Operation> createEntityTypeCallable() {
    return stub.createEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   EntityType response = featurestoreServiceClient.getEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityType resource. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(EntityTypeName name) {
    GetEntityTypeRequest request =
        GetEntityTypeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   EntityType response = featurestoreServiceClient.getEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityType resource. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(String name) {
    GetEntityTypeRequest request = GetEntityTypeRequest.newBuilder().setName(name).build();
    return getEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetEntityTypeRequest request =
   *       GetEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   EntityType response = featurestoreServiceClient.getEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(GetEntityTypeRequest request) {
    return getEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetEntityTypeRequest request =
   *       GetEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<EntityType> future =
   *       featurestoreServiceClient.getEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable() {
    return stub.getEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists EntityTypes in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeaturestoreName parent = FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
   *   for (EntityType element : featurestoreServiceClient.listEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Featurestore to list EntityTypes. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(FeaturestoreName parent) {
    ListEntityTypesRequest request =
        ListEntityTypesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists EntityTypes in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   for (EntityType element : featurestoreServiceClient.listEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Featurestore to list EntityTypes. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(String parent) {
    ListEntityTypesRequest request = ListEntityTypesRequest.newBuilder().setParent(parent).build();
    return listEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists EntityTypes in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (EntityType element : featurestoreServiceClient.listEntityTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(ListEntityTypesRequest request) {
    return listEntityTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists EntityTypes in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<EntityType> future =
   *       featurestoreServiceClient.listEntityTypesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (EntityType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable() {
    return stub.listEntityTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists EntityTypes in a given Featurestore.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListEntityTypesResponse response =
   *         featurestoreServiceClient.listEntityTypesCallable().call(request);
   *     for (EntityType element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse>
      listEntityTypesCallable() {
    return stub.listEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityType entityType = EntityType.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   EntityType response = featurestoreServiceClient.updateEntityType(entityType, updateMask);
   * }
   * }</pre>
   *
   * @param entityType Required. The EntityType's `name` field is used to identify the EntityType to
   *     be updated. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @param updateMask Field mask is used to specify the fields to be overwritten in the EntityType
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then only the non-empty fields present in the request will be
   *     overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `description` &#42; `labels` &#42; `monitoring_config.snapshot_analysis.disabled`
   *     &#42; `monitoring_config.snapshot_analysis.monitoring_interval`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType updateEntityType(EntityType entityType, FieldMask updateMask) {
    UpdateEntityTypeRequest request =
        UpdateEntityTypeRequest.newBuilder()
            .setEntityType(entityType)
            .setUpdateMask(updateMask)
            .build();
    return updateEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateEntityTypeRequest request =
   *       UpdateEntityTypeRequest.newBuilder()
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   EntityType response = featurestoreServiceClient.updateEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType updateEntityType(UpdateEntityTypeRequest request) {
    return updateEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateEntityTypeRequest request =
   *       UpdateEntityTypeRequest.newBuilder()
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<EntityType> future =
   *       featurestoreServiceClient.updateEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable() {
    return stub.updateEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single EntityType. The EntityType must not have any Features or `force` must be set
   * to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   featurestoreServiceClient.deleteEntityTypeAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityType to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteEntityTypeAsync(
      EntityTypeName name) {
    DeleteEntityTypeRequest request =
        DeleteEntityTypeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteEntityTypeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single EntityType. The EntityType must not have any Features or `force` must be set
   * to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   featurestoreServiceClient.deleteEntityTypeAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityType to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteEntityTypeAsync(String name) {
    DeleteEntityTypeRequest request = DeleteEntityTypeRequest.newBuilder().setName(name).build();
    return deleteEntityTypeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single EntityType. The EntityType must not have any Features or `force` must be set
   * to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteEntityTypeRequest request =
   *       DeleteEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setForce(true)
   *           .build();
   *   featurestoreServiceClient.deleteEntityTypeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteEntityTypeAsync(
      DeleteEntityTypeRequest request) {
    return deleteEntityTypeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single EntityType. The EntityType must not have any Features or `force` must be set
   * to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteEntityTypeRequest request =
   *       DeleteEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featurestoreServiceClient.deleteEntityTypeOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteEntityTypeRequest, Empty, DeleteOperationMetadata>
      deleteEntityTypeOperationCallable() {
    return stub.deleteEntityTypeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single EntityType. The EntityType must not have any Features or `force` must be set
   * to true for the request to succeed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteEntityTypeRequest request =
   *       DeleteEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.deleteEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteEntityTypeRequest, Operation> deleteEntityTypeCallable() {
    return stub.deleteEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   Feature feature = Feature.newBuilder().build();
   *   Feature response = featurestoreServiceClient.createFeatureAsync(parent, feature).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType to create a Feature. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @param feature Required. The Feature to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      EntityTypeName parent, Feature feature) {
    CreateFeatureRequest request =
        CreateFeatureRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeature(feature)
            .build();
    return createFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   Feature feature = Feature.newBuilder().build();
   *   Feature response = featurestoreServiceClient.createFeatureAsync(parent, feature).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType to create a Feature. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @param feature Required. The Feature to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      String parent, Feature feature) {
    CreateFeatureRequest request =
        CreateFeatureRequest.newBuilder().setParent(parent).setFeature(feature).build();
    return createFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   Feature response = featurestoreServiceClient.createFeatureAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      CreateFeatureRequest request) {
    return createFeatureOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   OperationFuture<Feature, CreateFeatureOperationMetadata> future =
   *       featurestoreServiceClient.createFeatureOperationCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateFeatureRequest, Feature, CreateFeatureOperationMetadata>
      createFeatureOperationCallable() {
    return stub.createFeatureOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.createFeatureCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeatureRequest, Operation> createFeatureCallable() {
    return stub.createFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   List<CreateFeatureRequest> requests = new ArrayList<>();
   *   BatchCreateFeaturesResponse response =
   *       featurestoreServiceClient.batchCreateFeaturesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType to create the batch of Features
   *     under. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @param requests Required. The request message specifying the Features to create. All Features
   *     must be created under the same parent EntityType. The `parent` field in each child request
   *     message can be omitted. If `parent` is set in a child request, then the value must match
   *     the `parent` value in this request message.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(EntityTypeName parent, List<CreateFeatureRequest> requests) {
    BatchCreateFeaturesRequest request =
        BatchCreateFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllRequests(requests)
            .build();
    return batchCreateFeaturesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   List<CreateFeatureRequest> requests = new ArrayList<>();
   *   BatchCreateFeaturesResponse response =
   *       featurestoreServiceClient.batchCreateFeaturesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType to create the batch of Features
   *     under. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @param requests Required. The request message specifying the Features to create. All Features
   *     must be created under the same parent EntityType. The `parent` field in each child request
   *     message can be omitted. If `parent` is set in a child request, then the value must match
   *     the `parent` value in this request message.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(String parent, List<CreateFeatureRequest> requests) {
    BatchCreateFeaturesRequest request =
        BatchCreateFeaturesRequest.newBuilder().setParent(parent).addAllRequests(requests).build();
    return batchCreateFeaturesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   BatchCreateFeaturesResponse response =
   *       featurestoreServiceClient.batchCreateFeaturesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(BatchCreateFeaturesRequest request) {
    return batchCreateFeaturesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata> future =
   *       featurestoreServiceClient.batchCreateFeaturesOperationCallable().futureCall(request);
   *   // Do something.
   *   BatchCreateFeaturesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          BatchCreateFeaturesRequest,
          BatchCreateFeaturesResponse,
          BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesOperationCallable() {
    return stub.batchCreateFeaturesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.batchCreateFeaturesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchCreateFeaturesRequest, Operation> batchCreateFeaturesCallable() {
    return stub.batchCreateFeaturesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeatureName name =
   *       FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");
   *   Feature response = featurestoreServiceClient.getFeature(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Feature resource. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(FeatureName name) {
    GetFeatureRequest request =
        GetFeatureRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getFeature(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name =
   *       FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *           .toString();
   *   Feature response = featurestoreServiceClient.getFeature(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Feature resource. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(String name) {
    GetFeatureRequest request = GetFeatureRequest.newBuilder().setName(name).build();
    return getFeature(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetFeatureRequest request =
   *       GetFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   Feature response = featurestoreServiceClient.getFeature(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(GetFeatureRequest request) {
    return getFeatureCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   GetFeatureRequest request =
   *       GetFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Feature> future =
   *       featurestoreServiceClient.getFeatureCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeatureRequest, Feature> getFeatureCallable() {
    return stub.getFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   for (Feature element : featurestoreServiceClient.listFeatures(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Features. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(EntityTypeName parent) {
    ListFeaturesRequest request =
        ListFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String parent =
   *       FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *           .toString();
   *   for (Feature element : featurestoreServiceClient.listFeatures(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Features. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(String parent) {
    ListFeaturesRequest request = ListFeaturesRequest.newBuilder().setParent(parent).build();
    return listFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   for (Feature element : featurestoreServiceClient.listFeatures(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(ListFeaturesRequest request) {
    return listFeaturesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   ApiFuture<Feature> future =
   *       featurestoreServiceClient.listFeaturesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Feature element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeaturesRequest, ListFeaturesPagedResponse>
      listFeaturesPagedCallable() {
    return stub.listFeaturesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   while (true) {
   *     ListFeaturesResponse response =
   *         featurestoreServiceClient.listFeaturesCallable().call(request);
   *     for (Feature element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeaturesRequest, ListFeaturesResponse> listFeaturesCallable() {
    return stub.listFeaturesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   Feature feature = Feature.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Feature response = featurestoreServiceClient.updateFeature(feature, updateMask);
   * }
   * }</pre>
   *
   * @param feature Required. The Feature's `name` field is used to identify the Feature to be
   *     updated. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   * @param updateMask Field mask is used to specify the fields to be overwritten in the Features
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then only the non-empty fields present in the request will be
   *     overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `description` &#42; `labels` &#42; `monitoring_config.snapshot_analysis.disabled`
   *     &#42; `monitoring_config.snapshot_analysis.monitoring_interval`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature updateFeature(Feature feature, FieldMask updateMask) {
    UpdateFeatureRequest request =
        UpdateFeatureRequest.newBuilder().setFeature(feature).setUpdateMask(updateMask).build();
    return updateFeature(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateFeatureRequest request =
   *       UpdateFeatureRequest.newBuilder()
   *           .setFeature(Feature.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Feature response = featurestoreServiceClient.updateFeature(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature updateFeature(UpdateFeatureRequest request) {
    return updateFeatureCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   UpdateFeatureRequest request =
   *       UpdateFeatureRequest.newBuilder()
   *           .setFeature(Feature.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Feature> future =
   *       featurestoreServiceClient.updateFeatureCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFeatureRequest, Feature> updateFeatureCallable() {
    return stub.updateFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeatureName name =
   *       FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]");
   *   featurestoreServiceClient.deleteFeatureAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Features to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(
      FeatureName name) {
    DeleteFeatureRequest request =
        DeleteFeatureRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String name =
   *       FeatureName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *           .toString();
   *   featurestoreServiceClient.deleteFeatureAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Features to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(String name) {
    DeleteFeatureRequest request = DeleteFeatureRequest.newBuilder().setName(name).build();
    return deleteFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   featurestoreServiceClient.deleteFeatureAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(
      DeleteFeatureRequest request) {
    return deleteFeatureOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featurestoreServiceClient.deleteFeatureOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFeatureRequest, Empty, DeleteOperationMetadata>
      deleteFeatureOperationCallable() {
    return stub.deleteFeatureOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.deleteFeatureCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFeatureRequest, Operation> deleteFeatureCallable() {
    return stub.deleteFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports Feature values into the Featurestore from a source storage.
   *
   * <p>The progress of the import is tracked by the returned operation. The imported features are
   * guaranteed to be visible to subsequent read operations after the operation is marked as
   * successfully done.
   *
   * <p>If an import operation fails, the Feature values returned from reads and exports may be
   * inconsistent. If consistency is required, the caller must retry the same import request again
   * and wait till the new operation returned is marked as successfully done.
   *
   * <p>There are also scenarios where the caller can cause inconsistency.
   *
   * <p>- Source data for import contains multiple distinct Feature values for the same entity ID
   * and timestamp. - Source is modified during an import. This includes adding, updating, or
   * removing source data and/or metadata. Examples of updating metadata include but are not limited
   * to changing storage location, storage class, or retention policy. - Online serving cluster is
   * under-provisioned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName entityType =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   ImportFeatureValuesResponse response =
   *       featurestoreServiceClient.importFeatureValuesAsync(entityType).get();
   * }
   * }</pre>
   *
   * @param entityType Required. The resource name of the EntityType grouping the Features for which
   *     values are being imported. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportFeatureValuesResponse, ImportFeatureValuesOperationMetadata>
      importFeatureValuesAsync(EntityTypeName entityType) {
    ImportFeatureValuesRequest request =
        ImportFeatureValuesRequest.newBuilder()
            .setEntityType(entityType == null ? null : entityType.toString())
            .build();
    return importFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports Feature values into the Featurestore from a source storage.
   *
   * <p>The progress of the import is tracked by the returned operation. The imported features are
   * guaranteed to be visible to subsequent read operations after the operation is marked as
   * successfully done.
   *
   * <p>If an import operation fails, the Feature values returned from reads and exports may be
   * inconsistent. If consistency is required, the caller must retry the same import request again
   * and wait till the new operation returned is marked as successfully done.
   *
   * <p>There are also scenarios where the caller can cause inconsistency.
   *
   * <p>- Source data for import contains multiple distinct Feature values for the same entity ID
   * and timestamp. - Source is modified during an import. This includes adding, updating, or
   * removing source data and/or metadata. Examples of updating metadata include but are not limited
   * to changing storage location, storage class, or retention policy. - Online serving cluster is
   * under-provisioned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String entityType =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   ImportFeatureValuesResponse response =
   *       featurestoreServiceClient.importFeatureValuesAsync(entityType).get();
   * }
   * }</pre>
   *
   * @param entityType Required. The resource name of the EntityType grouping the Features for which
   *     values are being imported. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportFeatureValuesResponse, ImportFeatureValuesOperationMetadata>
      importFeatureValuesAsync(String entityType) {
    ImportFeatureValuesRequest request =
        ImportFeatureValuesRequest.newBuilder().setEntityType(entityType).build();
    return importFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports Feature values into the Featurestore from a source storage.
   *
   * <p>The progress of the import is tracked by the returned operation. The imported features are
   * guaranteed to be visible to subsequent read operations after the operation is marked as
   * successfully done.
   *
   * <p>If an import operation fails, the Feature values returned from reads and exports may be
   * inconsistent. If consistency is required, the caller must retry the same import request again
   * and wait till the new operation returned is marked as successfully done.
   *
   * <p>There are also scenarios where the caller can cause inconsistency.
   *
   * <p>- Source data for import contains multiple distinct Feature values for the same entity ID
   * and timestamp. - Source is modified during an import. This includes adding, updating, or
   * removing source data and/or metadata. Examples of updating metadata include but are not limited
   * to changing storage location, storage class, or retention policy. - Online serving cluster is
   * under-provisioned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ImportFeatureValuesRequest request =
   *       ImportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setEntityIdField("entityIdField512670524")
   *           .addAllFeatureSpecs(new ArrayList<ImportFeatureValuesRequest.FeatureSpec>())
   *           .setDisableOnlineServing(true)
   *           .setWorkerCount(372044046)
   *           .build();
   *   ImportFeatureValuesResponse response =
   *       featurestoreServiceClient.importFeatureValuesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportFeatureValuesResponse, ImportFeatureValuesOperationMetadata>
      importFeatureValuesAsync(ImportFeatureValuesRequest request) {
    return importFeatureValuesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports Feature values into the Featurestore from a source storage.
   *
   * <p>The progress of the import is tracked by the returned operation. The imported features are
   * guaranteed to be visible to subsequent read operations after the operation is marked as
   * successfully done.
   *
   * <p>If an import operation fails, the Feature values returned from reads and exports may be
   * inconsistent. If consistency is required, the caller must retry the same import request again
   * and wait till the new operation returned is marked as successfully done.
   *
   * <p>There are also scenarios where the caller can cause inconsistency.
   *
   * <p>- Source data for import contains multiple distinct Feature values for the same entity ID
   * and timestamp. - Source is modified during an import. This includes adding, updating, or
   * removing source data and/or metadata. Examples of updating metadata include but are not limited
   * to changing storage location, storage class, or retention policy. - Online serving cluster is
   * under-provisioned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ImportFeatureValuesRequest request =
   *       ImportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setEntityIdField("entityIdField512670524")
   *           .addAllFeatureSpecs(new ArrayList<ImportFeatureValuesRequest.FeatureSpec>())
   *           .setDisableOnlineServing(true)
   *           .setWorkerCount(372044046)
   *           .build();
   *   OperationFuture<ImportFeatureValuesResponse, ImportFeatureValuesOperationMetadata> future =
   *       featurestoreServiceClient.importFeatureValuesOperationCallable().futureCall(request);
   *   // Do something.
   *   ImportFeatureValuesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ImportFeatureValuesRequest,
          ImportFeatureValuesResponse,
          ImportFeatureValuesOperationMetadata>
      importFeatureValuesOperationCallable() {
    return stub.importFeatureValuesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports Feature values into the Featurestore from a source storage.
   *
   * <p>The progress of the import is tracked by the returned operation. The imported features are
   * guaranteed to be visible to subsequent read operations after the operation is marked as
   * successfully done.
   *
   * <p>If an import operation fails, the Feature values returned from reads and exports may be
   * inconsistent. If consistency is required, the caller must retry the same import request again
   * and wait till the new operation returned is marked as successfully done.
   *
   * <p>There are also scenarios where the caller can cause inconsistency.
   *
   * <p>- Source data for import contains multiple distinct Feature values for the same entity ID
   * and timestamp. - Source is modified during an import. This includes adding, updating, or
   * removing source data and/or metadata. Examples of updating metadata include but are not limited
   * to changing storage location, storage class, or retention policy. - Online serving cluster is
   * under-provisioned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ImportFeatureValuesRequest request =
   *       ImportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setEntityIdField("entityIdField512670524")
   *           .addAllFeatureSpecs(new ArrayList<ImportFeatureValuesRequest.FeatureSpec>())
   *           .setDisableOnlineServing(true)
   *           .setWorkerCount(372044046)
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.importFeatureValuesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ImportFeatureValuesRequest, Operation> importFeatureValuesCallable() {
    return stub.importFeatureValuesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Batch reads Feature values from a Featurestore.
   *
   * <p>This API enables batch reading Feature values, where each read instance in the batch may
   * read Feature values of entities from one or more EntityTypes. Point-in-time correctness is
   * guaranteed for Feature values of each read instance as of each instance's read timestamp.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   FeaturestoreName featurestore =
   *       FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]");
   *   BatchReadFeatureValuesResponse response =
   *       featurestoreServiceClient.batchReadFeatureValuesAsync(featurestore).get();
   * }
   * }</pre>
   *
   * @param featurestore Required. The resource name of the Featurestore from which to query Feature
   *     values. Format: `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          BatchReadFeatureValuesResponse, BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesAsync(FeaturestoreName featurestore) {
    BatchReadFeatureValuesRequest request =
        BatchReadFeatureValuesRequest.newBuilder()
            .setFeaturestore(featurestore == null ? null : featurestore.toString())
            .build();
    return batchReadFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Batch reads Feature values from a Featurestore.
   *
   * <p>This API enables batch reading Feature values, where each read instance in the batch may
   * read Feature values of entities from one or more EntityTypes. Point-in-time correctness is
   * guaranteed for Feature values of each read instance as of each instance's read timestamp.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String featurestore =
   *       FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString();
   *   BatchReadFeatureValuesResponse response =
   *       featurestoreServiceClient.batchReadFeatureValuesAsync(featurestore).get();
   * }
   * }</pre>
   *
   * @param featurestore Required. The resource name of the Featurestore from which to query Feature
   *     values. Format: `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          BatchReadFeatureValuesResponse, BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesAsync(String featurestore) {
    BatchReadFeatureValuesRequest request =
        BatchReadFeatureValuesRequest.newBuilder().setFeaturestore(featurestore).build();
    return batchReadFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Batch reads Feature values from a Featurestore.
   *
   * <p>This API enables batch reading Feature values, where each read instance in the batch may
   * read Feature values of entities from one or more EntityTypes. Point-in-time correctness is
   * guaranteed for Feature values of each read instance as of each instance's read timestamp.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchReadFeatureValuesRequest request =
   *       BatchReadFeatureValuesRequest.newBuilder()
   *           .setFeaturestore(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .addAllEntityTypeSpecs(new ArrayList<BatchReadFeatureValuesRequest.EntityTypeSpec>())
   *           .build();
   *   BatchReadFeatureValuesResponse response =
   *       featurestoreServiceClient.batchReadFeatureValuesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          BatchReadFeatureValuesResponse, BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesAsync(BatchReadFeatureValuesRequest request) {
    return batchReadFeatureValuesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Batch reads Feature values from a Featurestore.
   *
   * <p>This API enables batch reading Feature values, where each read instance in the batch may
   * read Feature values of entities from one or more EntityTypes. Point-in-time correctness is
   * guaranteed for Feature values of each read instance as of each instance's read timestamp.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchReadFeatureValuesRequest request =
   *       BatchReadFeatureValuesRequest.newBuilder()
   *           .setFeaturestore(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .addAllEntityTypeSpecs(new ArrayList<BatchReadFeatureValuesRequest.EntityTypeSpec>())
   *           .build();
   *   OperationFuture<BatchReadFeatureValuesResponse, BatchReadFeatureValuesOperationMetadata>
   *       future =
   *           featurestoreServiceClient
   *               .batchReadFeatureValuesOperationCallable()
   *               .futureCall(request);
   *   // Do something.
   *   BatchReadFeatureValuesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          BatchReadFeatureValuesRequest,
          BatchReadFeatureValuesResponse,
          BatchReadFeatureValuesOperationMetadata>
      batchReadFeatureValuesOperationCallable() {
    return stub.batchReadFeatureValuesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Batch reads Feature values from a Featurestore.
   *
   * <p>This API enables batch reading Feature values, where each read instance in the batch may
   * read Feature values of entities from one or more EntityTypes. Point-in-time correctness is
   * guaranteed for Feature values of each read instance as of each instance's read timestamp.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   BatchReadFeatureValuesRequest request =
   *       BatchReadFeatureValuesRequest.newBuilder()
   *           .setFeaturestore(
   *               FeaturestoreName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]").toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .addAllEntityTypeSpecs(new ArrayList<BatchReadFeatureValuesRequest.EntityTypeSpec>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.batchReadFeatureValuesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchReadFeatureValuesRequest, Operation>
      batchReadFeatureValuesCallable() {
    return stub.batchReadFeatureValuesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports Feature values from all the entities of a target EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   EntityTypeName entityType =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   ExportFeatureValuesResponse response =
   *       featurestoreServiceClient.exportFeatureValuesAsync(entityType).get();
   * }
   * }</pre>
   *
   * @param entityType Required. The resource name of the EntityType from which to export Feature
   *     values. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ExportFeatureValuesResponse, ExportFeatureValuesOperationMetadata>
      exportFeatureValuesAsync(EntityTypeName entityType) {
    ExportFeatureValuesRequest request =
        ExportFeatureValuesRequest.newBuilder()
            .setEntityType(entityType == null ? null : entityType.toString())
            .build();
    return exportFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports Feature values from all the entities of a target EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String entityType =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   ExportFeatureValuesResponse response =
   *       featurestoreServiceClient.exportFeatureValuesAsync(entityType).get();
   * }
   * }</pre>
   *
   * @param entityType Required. The resource name of the EntityType from which to export Feature
   *     values. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ExportFeatureValuesResponse, ExportFeatureValuesOperationMetadata>
      exportFeatureValuesAsync(String entityType) {
    ExportFeatureValuesRequest request =
        ExportFeatureValuesRequest.newBuilder().setEntityType(entityType).build();
    return exportFeatureValuesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports Feature values from all the entities of a target EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ExportFeatureValuesRequest request =
   *       ExportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .setFeatureSelector(FeatureSelector.newBuilder().build())
   *           .addAllSettings(new ArrayList<DestinationFeatureSetting>())
   *           .build();
   *   ExportFeatureValuesResponse response =
   *       featurestoreServiceClient.exportFeatureValuesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ExportFeatureValuesResponse, ExportFeatureValuesOperationMetadata>
      exportFeatureValuesAsync(ExportFeatureValuesRequest request) {
    return exportFeatureValuesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports Feature values from all the entities of a target EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ExportFeatureValuesRequest request =
   *       ExportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .setFeatureSelector(FeatureSelector.newBuilder().build())
   *           .addAllSettings(new ArrayList<DestinationFeatureSetting>())
   *           .build();
   *   OperationFuture<ExportFeatureValuesResponse, ExportFeatureValuesOperationMetadata> future =
   *       featurestoreServiceClient.exportFeatureValuesOperationCallable().futureCall(request);
   *   // Do something.
   *   ExportFeatureValuesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ExportFeatureValuesRequest,
          ExportFeatureValuesResponse,
          ExportFeatureValuesOperationMetadata>
      exportFeatureValuesOperationCallable() {
    return stub.exportFeatureValuesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports Feature values from all the entities of a target EntityType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   ExportFeatureValuesRequest request =
   *       ExportFeatureValuesRequest.newBuilder()
   *           .setEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setDestination(FeatureValueDestination.newBuilder().build())
   *           .setFeatureSelector(FeatureSelector.newBuilder().build())
   *           .addAllSettings(new ArrayList<DestinationFeatureSetting>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featurestoreServiceClient.exportFeatureValuesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ExportFeatureValuesRequest, Operation> exportFeatureValuesCallable() {
    return stub.exportFeatureValuesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Features matching a query in a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Feature element : featurestoreServiceClient.searchFeatures(location).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param location Required. The resource name of the Location to search Features. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchFeaturesPagedResponse searchFeatures(LocationName location) {
    SearchFeaturesRequest request =
        SearchFeaturesRequest.newBuilder()
            .setLocation(location == null ? null : location.toString())
            .build();
    return searchFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Features matching a query in a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   String location = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Feature element : featurestoreServiceClient.searchFeatures(location).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param location Required. The resource name of the Location to search Features. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchFeaturesPagedResponse searchFeatures(String location) {
    SearchFeaturesRequest request =
        SearchFeaturesRequest.newBuilder().setLocation(location).build();
    return searchFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Features matching a query in a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   SearchFeaturesRequest request =
   *       SearchFeaturesRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Feature element : featurestoreServiceClient.searchFeatures(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchFeaturesPagedResponse searchFeatures(SearchFeaturesRequest request) {
    return searchFeaturesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Features matching a query in a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   SearchFeaturesRequest request =
   *       SearchFeaturesRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Feature> future =
   *       featurestoreServiceClient.searchFeaturesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Feature element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchFeaturesRequest, SearchFeaturesPagedResponse>
      searchFeaturesPagedCallable() {
    return stub.searchFeaturesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Features matching a query in a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
   *   SearchFeaturesRequest request =
   *       SearchFeaturesRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     SearchFeaturesResponse response =
   *         featurestoreServiceClient.searchFeaturesCallable().call(request);
   *     for (Feature element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchFeaturesRequest, SearchFeaturesResponse>
      searchFeaturesCallable() {
    return stub.searchFeaturesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListFeaturestoresPagedResponse
      extends AbstractPagedListResponse<
          ListFeaturestoresRequest,
          ListFeaturestoresResponse,
          Featurestore,
          ListFeaturestoresPage,
          ListFeaturestoresFixedSizeCollection> {

    public static ApiFuture<ListFeaturestoresPagedResponse> createAsync(
        PageContext<ListFeaturestoresRequest, ListFeaturestoresResponse, Featurestore> context,
        ApiFuture<ListFeaturestoresResponse> futureResponse) {
      ApiFuture<ListFeaturestoresPage> futurePage =
          ListFeaturestoresPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListFeaturestoresPage, ListFeaturestoresPagedResponse>() {
            @Override
            public ListFeaturestoresPagedResponse apply(ListFeaturestoresPage input) {
              return new ListFeaturestoresPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListFeaturestoresPagedResponse(ListFeaturestoresPage page) {
      super(page, ListFeaturestoresFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeaturestoresPage
      extends AbstractPage<
          ListFeaturestoresRequest,
          ListFeaturestoresResponse,
          Featurestore,
          ListFeaturestoresPage> {

    private ListFeaturestoresPage(
        PageContext<ListFeaturestoresRequest, ListFeaturestoresResponse, Featurestore> context,
        ListFeaturestoresResponse response) {
      super(context, response);
    }

    private static ListFeaturestoresPage createEmptyPage() {
      return new ListFeaturestoresPage(null, null);
    }

    @Override
    protected ListFeaturestoresPage createPage(
        PageContext<ListFeaturestoresRequest, ListFeaturestoresResponse, Featurestore> context,
        ListFeaturestoresResponse response) {
      return new ListFeaturestoresPage(context, response);
    }

    @Override
    public ApiFuture<ListFeaturestoresPage> createPageAsync(
        PageContext<ListFeaturestoresRequest, ListFeaturestoresResponse, Featurestore> context,
        ApiFuture<ListFeaturestoresResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeaturestoresFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeaturestoresRequest,
          ListFeaturestoresResponse,
          Featurestore,
          ListFeaturestoresPage,
          ListFeaturestoresFixedSizeCollection> {

    private ListFeaturestoresFixedSizeCollection(
        List<ListFeaturestoresPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeaturestoresFixedSizeCollection createEmptyCollection() {
      return new ListFeaturestoresFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeaturestoresFixedSizeCollection createCollection(
        List<ListFeaturestoresPage> pages, int collectionSize) {
      return new ListFeaturestoresFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListEntityTypesPagedResponse
      extends AbstractPagedListResponse<
          ListEntityTypesRequest,
          ListEntityTypesResponse,
          EntityType,
          ListEntityTypesPage,
          ListEntityTypesFixedSizeCollection> {

    public static ApiFuture<ListEntityTypesPagedResponse> createAsync(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ApiFuture<ListEntityTypesResponse> futureResponse) {
      ApiFuture<ListEntityTypesPage> futurePage =
          ListEntityTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListEntityTypesPage, ListEntityTypesPagedResponse>() {
            @Override
            public ListEntityTypesPagedResponse apply(ListEntityTypesPage input) {
              return new ListEntityTypesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListEntityTypesPagedResponse(ListEntityTypesPage page) {
      super(page, ListEntityTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListEntityTypesPage
      extends AbstractPage<
          ListEntityTypesRequest, ListEntityTypesResponse, EntityType, ListEntityTypesPage> {

    private ListEntityTypesPage(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ListEntityTypesResponse response) {
      super(context, response);
    }

    private static ListEntityTypesPage createEmptyPage() {
      return new ListEntityTypesPage(null, null);
    }

    @Override
    protected ListEntityTypesPage createPage(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ListEntityTypesResponse response) {
      return new ListEntityTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListEntityTypesPage> createPageAsync(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ApiFuture<ListEntityTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListEntityTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListEntityTypesRequest,
          ListEntityTypesResponse,
          EntityType,
          ListEntityTypesPage,
          ListEntityTypesFixedSizeCollection> {

    private ListEntityTypesFixedSizeCollection(
        List<ListEntityTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListEntityTypesFixedSizeCollection createEmptyCollection() {
      return new ListEntityTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListEntityTypesFixedSizeCollection createCollection(
        List<ListEntityTypesPage> pages, int collectionSize) {
      return new ListEntityTypesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFeaturesPagedResponse
      extends AbstractPagedListResponse<
          ListFeaturesRequest,
          ListFeaturesResponse,
          Feature,
          ListFeaturesPage,
          ListFeaturesFixedSizeCollection> {

    public static ApiFuture<ListFeaturesPagedResponse> createAsync(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ApiFuture<ListFeaturesResponse> futureResponse) {
      ApiFuture<ListFeaturesPage> futurePage =
          ListFeaturesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListFeaturesPage, ListFeaturesPagedResponse>() {
            @Override
            public ListFeaturesPagedResponse apply(ListFeaturesPage input) {
              return new ListFeaturesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListFeaturesPagedResponse(ListFeaturesPage page) {
      super(page, ListFeaturesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeaturesPage
      extends AbstractPage<ListFeaturesRequest, ListFeaturesResponse, Feature, ListFeaturesPage> {

    private ListFeaturesPage(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ListFeaturesResponse response) {
      super(context, response);
    }

    private static ListFeaturesPage createEmptyPage() {
      return new ListFeaturesPage(null, null);
    }

    @Override
    protected ListFeaturesPage createPage(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ListFeaturesResponse response) {
      return new ListFeaturesPage(context, response);
    }

    @Override
    public ApiFuture<ListFeaturesPage> createPageAsync(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ApiFuture<ListFeaturesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeaturesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeaturesRequest,
          ListFeaturesResponse,
          Feature,
          ListFeaturesPage,
          ListFeaturesFixedSizeCollection> {

    private ListFeaturesFixedSizeCollection(List<ListFeaturesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeaturesFixedSizeCollection createEmptyCollection() {
      return new ListFeaturesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeaturesFixedSizeCollection createCollection(
        List<ListFeaturesPage> pages, int collectionSize) {
      return new ListFeaturesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchFeaturesPagedResponse
      extends AbstractPagedListResponse<
          SearchFeaturesRequest,
          SearchFeaturesResponse,
          Feature,
          SearchFeaturesPage,
          SearchFeaturesFixedSizeCollection> {

    public static ApiFuture<SearchFeaturesPagedResponse> createAsync(
        PageContext<SearchFeaturesRequest, SearchFeaturesResponse, Feature> context,
        ApiFuture<SearchFeaturesResponse> futureResponse) {
      ApiFuture<SearchFeaturesPage> futurePage =
          SearchFeaturesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchFeaturesPage, SearchFeaturesPagedResponse>() {
            @Override
            public SearchFeaturesPagedResponse apply(SearchFeaturesPage input) {
              return new SearchFeaturesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private SearchFeaturesPagedResponse(SearchFeaturesPage page) {
      super(page, SearchFeaturesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchFeaturesPage
      extends AbstractPage<
          SearchFeaturesRequest, SearchFeaturesResponse, Feature, SearchFeaturesPage> {

    private SearchFeaturesPage(
        PageContext<SearchFeaturesRequest, SearchFeaturesResponse, Feature> context,
        SearchFeaturesResponse response) {
      super(context, response);
    }

    private static SearchFeaturesPage createEmptyPage() {
      return new SearchFeaturesPage(null, null);
    }

    @Override
    protected SearchFeaturesPage createPage(
        PageContext<SearchFeaturesRequest, SearchFeaturesResponse, Feature> context,
        SearchFeaturesResponse response) {
      return new SearchFeaturesPage(context, response);
    }

    @Override
    public ApiFuture<SearchFeaturesPage> createPageAsync(
        PageContext<SearchFeaturesRequest, SearchFeaturesResponse, Feature> context,
        ApiFuture<SearchFeaturesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchFeaturesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchFeaturesRequest,
          SearchFeaturesResponse,
          Feature,
          SearchFeaturesPage,
          SearchFeaturesFixedSizeCollection> {

    private SearchFeaturesFixedSizeCollection(List<SearchFeaturesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchFeaturesFixedSizeCollection createEmptyCollection() {
      return new SearchFeaturesFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchFeaturesFixedSizeCollection createCollection(
        List<SearchFeaturesPage> pages, int collectionSize) {
      return new SearchFeaturesFixedSizeCollection(pages, collectionSize);
    }
  }
}
