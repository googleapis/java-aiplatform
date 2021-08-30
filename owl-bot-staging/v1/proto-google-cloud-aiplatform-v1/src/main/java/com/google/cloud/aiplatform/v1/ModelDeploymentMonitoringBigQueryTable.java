// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * ModelDeploymentMonitoringBigQueryTable specifies the BigQuery table name
 * as well as some information of the logs stored in this table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable}
 */
public final class ModelDeploymentMonitoringBigQueryTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)
    ModelDeploymentMonitoringBigQueryTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelDeploymentMonitoringBigQueryTable.newBuilder() to construct.
  private ModelDeploymentMonitoringBigQueryTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelDeploymentMonitoringBigQueryTable() {
    logSource_ = 0;
    logType_ = 0;
    bigqueryTablePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelDeploymentMonitoringBigQueryTable();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModelDeploymentMonitoringBigQueryTable(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            logSource_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            logType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bigqueryTablePath_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.class, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.Builder.class);
  }

  /**
   * <pre>
   * Indicates where does the log come from.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource}
   */
  public enum LogSource
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified source.
     * </pre>
     *
     * <code>LOG_SOURCE_UNSPECIFIED = 0;</code>
     */
    LOG_SOURCE_UNSPECIFIED(0),
    /**
     * <pre>
     * Logs coming from Training dataset.
     * </pre>
     *
     * <code>TRAINING = 1;</code>
     */
    TRAINING(1),
    /**
     * <pre>
     * Logs coming from Serving traffic.
     * </pre>
     *
     * <code>SERVING = 2;</code>
     */
    SERVING(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified source.
     * </pre>
     *
     * <code>LOG_SOURCE_UNSPECIFIED = 0;</code>
     */
    public static final int LOG_SOURCE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Logs coming from Training dataset.
     * </pre>
     *
     * <code>TRAINING = 1;</code>
     */
    public static final int TRAINING_VALUE = 1;
    /**
     * <pre>
     * Logs coming from Serving traffic.
     * </pre>
     *
     * <code>SERVING = 2;</code>
     */
    public static final int SERVING_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogSource forNumber(int value) {
      switch (value) {
        case 0: return LOG_SOURCE_UNSPECIFIED;
        case 1: return TRAINING;
        case 2: return SERVING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LogSource> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LogSource>() {
            public LogSource findValueByNumber(int number) {
              return LogSource.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.getDescriptor().getEnumTypes().get(0);
    }

    private static final LogSource[] VALUES = values();

    public static LogSource valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource)
  }

  /**
   * <pre>
   * Indicates what type of traffic does the log belong to.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType}
   */
  public enum LogType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified type.
     * </pre>
     *
     * <code>LOG_TYPE_UNSPECIFIED = 0;</code>
     */
    LOG_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Predict logs.
     * </pre>
     *
     * <code>PREDICT = 1;</code>
     */
    PREDICT(1),
    /**
     * <pre>
     * Explain logs.
     * </pre>
     *
     * <code>EXPLAIN = 2;</code>
     */
    EXPLAIN(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified type.
     * </pre>
     *
     * <code>LOG_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int LOG_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Predict logs.
     * </pre>
     *
     * <code>PREDICT = 1;</code>
     */
    public static final int PREDICT_VALUE = 1;
    /**
     * <pre>
     * Explain logs.
     * </pre>
     *
     * <code>EXPLAIN = 2;</code>
     */
    public static final int EXPLAIN_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogType forNumber(int value) {
      switch (value) {
        case 0: return LOG_TYPE_UNSPECIFIED;
        case 1: return PREDICT;
        case 2: return EXPLAIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LogType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LogType>() {
            public LogType findValueByNumber(int number) {
              return LogType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.getDescriptor().getEnumTypes().get(1);
    }

    private static final LogType[] VALUES = values();

    public static LogType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType)
  }

  public static final int LOG_SOURCE_FIELD_NUMBER = 1;
  private int logSource_;
  /**
   * <pre>
   * The source of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
   * @return The enum numeric value on the wire for logSource.
   */
  @java.lang.Override public int getLogSourceValue() {
    return logSource_;
  }
  /**
   * <pre>
   * The source of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
   * @return The logSource.
   */
  @java.lang.Override public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource getLogSource() {
    @SuppressWarnings("deprecation")
    com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource result = com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.valueOf(logSource_);
    return result == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.UNRECOGNIZED : result;
  }

  public static final int LOG_TYPE_FIELD_NUMBER = 2;
  private int logType_;
  /**
   * <pre>
   * The type of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
   * @return The enum numeric value on the wire for logType.
   */
  @java.lang.Override public int getLogTypeValue() {
    return logType_;
  }
  /**
   * <pre>
   * The type of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
   * @return The logType.
   */
  @java.lang.Override public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType getLogType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType result = com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.valueOf(logType_);
    return result == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.UNRECOGNIZED : result;
  }

  public static final int BIGQUERY_TABLE_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object bigqueryTablePath_;
  /**
   * <pre>
   * The created BigQuery table to store logs. Customer could do their own query
   * &amp; analysis. Format:
   * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
   * </pre>
   *
   * <code>string bigquery_table_path = 3;</code>
   * @return The bigqueryTablePath.
   */
  @java.lang.Override
  public java.lang.String getBigqueryTablePath() {
    java.lang.Object ref = bigqueryTablePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bigqueryTablePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The created BigQuery table to store logs. Customer could do their own query
   * &amp; analysis. Format:
   * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
   * </pre>
   *
   * <code>string bigquery_table_path = 3;</code>
   * @return The bytes for bigqueryTablePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBigqueryTablePathBytes() {
    java.lang.Object ref = bigqueryTablePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bigqueryTablePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (logSource_ != com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.LOG_SOURCE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, logSource_);
    }
    if (logType_ != com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.LOG_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, logType_);
    }
    if (!getBigqueryTablePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bigqueryTablePath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logSource_ != com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.LOG_SOURCE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, logSource_);
    }
    if (logType_ != com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.LOG_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, logType_);
    }
    if (!getBigqueryTablePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bigqueryTablePath_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable other = (com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable) obj;

    if (logSource_ != other.logSource_) return false;
    if (logType_ != other.logType_) return false;
    if (!getBigqueryTablePath()
        .equals(other.getBigqueryTablePath())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOG_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + logSource_;
    hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + logType_;
    hash = (37 * hash) + BIGQUERY_TABLE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getBigqueryTablePath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable prototype) {
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
   * ModelDeploymentMonitoringBigQueryTable specifies the BigQuery table name
   * as well as some information of the logs stored in this table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.class, com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logSource_ = 0;

      logType_ = 0;

      bigqueryTablePath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobProto.internal_static_google_cloud_aiplatform_v1_ModelDeploymentMonitoringBigQueryTable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable build() {
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable buildPartial() {
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable result = new com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable(this);
      result.logSource_ = logSource_;
      result.logType_ = logType_;
      result.bigqueryTablePath_ = bigqueryTablePath_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable other) {
      if (other == com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.getDefaultInstance()) return this;
      if (other.logSource_ != 0) {
        setLogSourceValue(other.getLogSourceValue());
      }
      if (other.logType_ != 0) {
        setLogTypeValue(other.getLogTypeValue());
      }
      if (!other.getBigqueryTablePath().isEmpty()) {
        bigqueryTablePath_ = other.bigqueryTablePath_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int logSource_ = 0;
    /**
     * <pre>
     * The source of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
     * @return The enum numeric value on the wire for logSource.
     */
    @java.lang.Override public int getLogSourceValue() {
      return logSource_;
    }
    /**
     * <pre>
     * The source of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
     * @param value The enum numeric value on the wire for logSource to set.
     * @return This builder for chaining.
     */
    public Builder setLogSourceValue(int value) {
      
      logSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
     * @return The logSource.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource getLogSource() {
      @SuppressWarnings("deprecation")
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource result = com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.valueOf(logSource_);
      return result == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The source of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
     * @param value The logSource to set.
     * @return This builder for chaining.
     */
    public Builder setLogSource(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      logSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogSource() {
      
      logSource_ = 0;
      onChanged();
      return this;
    }

    private int logType_ = 0;
    /**
     * <pre>
     * The type of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
     * @return The enum numeric value on the wire for logType.
     */
    @java.lang.Override public int getLogTypeValue() {
      return logType_;
    }
    /**
     * <pre>
     * The type of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
     * @param value The enum numeric value on the wire for logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogTypeValue(int value) {
      
      logType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
     * @return The logType.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType getLogType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType result = com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.valueOf(logType_);
      return result == null ? com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
     * @param value The logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogType(com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      logType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of log.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogType() {
      
      logType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bigqueryTablePath_ = "";
    /**
     * <pre>
     * The created BigQuery table to store logs. Customer could do their own query
     * &amp; analysis. Format:
     * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
     * </pre>
     *
     * <code>string bigquery_table_path = 3;</code>
     * @return The bigqueryTablePath.
     */
    public java.lang.String getBigqueryTablePath() {
      java.lang.Object ref = bigqueryTablePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bigqueryTablePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The created BigQuery table to store logs. Customer could do their own query
     * &amp; analysis. Format:
     * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
     * </pre>
     *
     * <code>string bigquery_table_path = 3;</code>
     * @return The bytes for bigqueryTablePath.
     */
    public com.google.protobuf.ByteString
        getBigqueryTablePathBytes() {
      java.lang.Object ref = bigqueryTablePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bigqueryTablePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The created BigQuery table to store logs. Customer could do their own query
     * &amp; analysis. Format:
     * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
     * </pre>
     *
     * <code>string bigquery_table_path = 3;</code>
     * @param value The bigqueryTablePath to set.
     * @return This builder for chaining.
     */
    public Builder setBigqueryTablePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bigqueryTablePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created BigQuery table to store logs. Customer could do their own query
     * &amp; analysis. Format:
     * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
     * </pre>
     *
     * <code>string bigquery_table_path = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBigqueryTablePath() {
      
      bigqueryTablePath_ = getDefaultInstance().getBigqueryTablePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created BigQuery table to store logs. Customer could do their own query
     * &amp; analysis. Format:
     * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
     * </pre>
     *
     * <code>string bigquery_table_path = 3;</code>
     * @param value The bytes for bigqueryTablePath to set.
     * @return This builder for chaining.
     */
    public Builder setBigqueryTablePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bigqueryTablePath_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable)
  private static final com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable();
  }

  public static com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelDeploymentMonitoringBigQueryTable>
      PARSER = new com.google.protobuf.AbstractParser<ModelDeploymentMonitoringBigQueryTable>() {
    @java.lang.Override
    public ModelDeploymentMonitoringBigQueryTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModelDeploymentMonitoringBigQueryTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModelDeploymentMonitoringBigQueryTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelDeploymentMonitoringBigQueryTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

