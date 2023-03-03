// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for
 * [MetadataService.AddExecutionEvents][google.cloud.aiplatform.v1beta1.MetadataService.AddExecutionEvents].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest}
 */
public final class AddExecutionEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)
    AddExecutionEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddExecutionEventsRequest.newBuilder() to construct.
  private AddExecutionEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddExecutionEventsRequest() {
    execution_ = "";
    events_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddExecutionEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_AddExecutionEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_AddExecutionEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.class, com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.Builder.class);
  }

  public static final int EXECUTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object execution_ = "";
  /**
   * <pre>
   * Required. The resource name of the Execution that the Events connect
   * Artifacts with.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The execution.
   */
  @java.lang.Override
  public java.lang.String getExecution() {
    java.lang.Object ref = execution_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      execution_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the Execution that the Events connect
   * Artifacts with.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for execution.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExecutionBytes() {
    java.lang.Object ref = execution_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      execution_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Event> events_;
  /**
   * <pre>
   * The Events to create and add.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Event> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * The Events to create and add.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.EventOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * The Events to create and add.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * The Events to create and add.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Event getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * The Events to create and add.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.EventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(execution_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, execution_);
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(2, events_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(execution_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, execution_);
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, events_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest other = (com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest) obj;

    if (!getExecution()
        .equals(other.getExecution())) return false;
    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EXECUTION_FIELD_NUMBER;
    hash = (53 * hash) + getExecution().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for
   * [MetadataService.AddExecutionEvents][google.cloud.aiplatform.v1beta1.MetadataService.AddExecutionEvents].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)
      com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_AddExecutionEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_AddExecutionEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.class, com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      execution_ = "";
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_AddExecutionEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest build() {
      com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest result = new com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.execution_ = execution_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest.getDefaultInstance()) return this;
      if (!other.getExecution().isEmpty()) {
        execution_ = other.execution_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000002);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              execution_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.aiplatform.v1beta1.Event m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.Event.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object execution_ = "";
    /**
     * <pre>
     * Required. The resource name of the Execution that the Events connect
     * Artifacts with.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The execution.
     */
    public java.lang.String getExecution() {
      java.lang.Object ref = execution_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        execution_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Execution that the Events connect
     * Artifacts with.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for execution.
     */
    public com.google.protobuf.ByteString
        getExecutionBytes() {
      java.lang.Object ref = execution_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        execution_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Execution that the Events connect
     * Artifacts with.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The execution to set.
     * @return This builder for chaining.
     */
    public Builder setExecution(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      execution_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Execution that the Events connect
     * Artifacts with.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearExecution() {
      execution_ = getDefaultInstance().getExecution();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Execution that the Events connect
     * Artifacts with.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for execution to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      execution_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Event> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        events_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Event>(events_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Event, com.google.cloud.aiplatform.v1beta1.Event.Builder, com.google.cloud.aiplatform.v1beta1.EventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Event> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Event getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder setEvents(
        int index, com.google.cloud.aiplatform.v1beta1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder setEvents(
        int index, com.google.cloud.aiplatform.v1beta1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder addEvents(com.google.cloud.aiplatform.v1beta1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder addEvents(
        int index, com.google.cloud.aiplatform.v1beta1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder addEvents(
        com.google.cloud.aiplatform.v1beta1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder addEvents(
        int index, com.google.cloud.aiplatform.v1beta1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Event> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Event.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.EventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.EventOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Event.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.Event.getDefaultInstance());
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Event.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.Event.getDefaultInstance());
    }
    /**
     * <pre>
     * The Events to create and add.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 2;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Event.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.Event, com.google.cloud.aiplatform.v1beta1.Event.Builder, com.google.cloud.aiplatform.v1beta1.EventOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Event, com.google.cloud.aiplatform.v1beta1.Event.Builder, com.google.cloud.aiplatform.v1beta1.EventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest)
  private static final com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddExecutionEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddExecutionEventsRequest>() {
    @java.lang.Override
    public AddExecutionEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AddExecutionEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddExecutionEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.AddExecutionEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

