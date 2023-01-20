/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Specification of a single machine.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.MachineSpec}
 */
public final class MachineSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.MachineSpec)
    MachineSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MachineSpec.newBuilder() to construct.
  private MachineSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MachineSpec() {
    machineType_ = "";
    acceleratorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MachineSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.MachineSpec.class,
            com.google.cloud.aiplatform.v1beta1.MachineSpec.Builder.class);
  }

  public static final int MACHINE_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object machineType_ = "";
  /**
   *
   *
   * <pre>
   * Immutable. The type of the machine.
   * See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
   * See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
   * field is optional, and the default value is `n1-standard-2`. For
   * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
   * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
   * this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The machineType.
   */
  @java.lang.Override
  public java.lang.String getMachineType() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      machineType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. The type of the machine.
   * See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
   * See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
   * field is optional, and the default value is `n1-standard-2`. For
   * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
   * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
   * this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for machineType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMachineTypeBytes() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      machineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 2;
  private int acceleratorType_ = 0;
  /**
   *
   *
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine
   * as per
   * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for acceleratorType.
   */
  @java.lang.Override
  public int getAcceleratorTypeValue() {
    return acceleratorType_;
  }
  /**
   *
   *
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine
   * as per
   * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The acceleratorType.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.AcceleratorType getAcceleratorType() {
    com.google.cloud.aiplatform.v1beta1.AcceleratorType result =
        com.google.cloud.aiplatform.v1beta1.AcceleratorType.forNumber(acceleratorType_);
    return result == null
        ? com.google.cloud.aiplatform.v1beta1.AcceleratorType.UNRECOGNIZED
        : result;
  }

  public static final int ACCELERATOR_COUNT_FIELD_NUMBER = 3;
  private int acceleratorCount_ = 0;
  /**
   *
   *
   * <pre>
   * The number of accelerators to attach to the machine.
   * </pre>
   *
   * <code>int32 accelerator_count = 3;</code>
   *
   * @return The acceleratorCount.
   */
  @java.lang.Override
  public int getAcceleratorCount() {
    return acceleratorCount_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, machineType_);
    }
    if (acceleratorType_
        != com.google.cloud.aiplatform.v1beta1.AcceleratorType.ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, acceleratorType_);
    }
    if (acceleratorCount_ != 0) {
      output.writeInt32(3, acceleratorCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, machineType_);
    }
    if (acceleratorType_
        != com.google.cloud.aiplatform.v1beta1.AcceleratorType.ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, acceleratorType_);
    }
    if (acceleratorCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, acceleratorCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.MachineSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.MachineSpec other =
        (com.google.cloud.aiplatform.v1beta1.MachineSpec) obj;

    if (!getMachineType().equals(other.getMachineType())) return false;
    if (acceleratorType_ != other.acceleratorType_) return false;
    if (getAcceleratorCount() != other.getAcceleratorCount()) return false;
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
    hash = (37 * hash) + MACHINE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMachineType().hashCode();
    hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + acceleratorType_;
    hash = (37 * hash) + ACCELERATOR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.MachineSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Specification of a single machine.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.MachineSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.MachineSpec)
      com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.MachineSpec.class,
              com.google.cloud.aiplatform.v1beta1.MachineSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.MachineSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      machineType_ = "";
      acceleratorType_ = 0;
      acceleratorCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.MachineSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.MachineSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.MachineSpec build() {
      com.google.cloud.aiplatform.v1beta1.MachineSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.MachineSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.MachineSpec result =
          new com.google.cloud.aiplatform.v1beta1.MachineSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.MachineSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.machineType_ = machineType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.acceleratorType_ = acceleratorType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.acceleratorCount_ = acceleratorCount_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.MachineSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.MachineSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.MachineSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.MachineSpec.getDefaultInstance())
        return this;
      if (!other.getMachineType().isEmpty()) {
        machineType_ = other.machineType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.acceleratorType_ != 0) {
        setAcceleratorTypeValue(other.getAcceleratorTypeValue());
      }
      if (other.getAcceleratorCount() != 0) {
        setAcceleratorCount(other.getAcceleratorCount());
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
            case 10:
              {
                machineType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                acceleratorType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                acceleratorCount_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
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

    private java.lang.Object machineType_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. The type of the machine.
     * See the [list of machine types supported for
     * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
     * See the [list of machine types supported for custom
     * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
     * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
     * field is optional, and the default value is `n1-standard-2`. For
     * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
     * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
     * this field is required.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The machineType.
     */
    public java.lang.String getMachineType() {
      java.lang.Object ref = machineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        machineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of the machine.
     * See the [list of machine types supported for
     * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
     * See the [list of machine types supported for custom
     * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
     * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
     * field is optional, and the default value is `n1-standard-2`. For
     * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
     * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
     * this field is required.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for machineType.
     */
    public com.google.protobuf.ByteString getMachineTypeBytes() {
      java.lang.Object ref = machineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        machineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of the machine.
     * See the [list of machine types supported for
     * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
     * See the [list of machine types supported for custom
     * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
     * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
     * field is optional, and the default value is `n1-standard-2`. For
     * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
     * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
     * this field is required.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      machineType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of the machine.
     * See the [list of machine types supported for
     * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
     * See the [list of machine types supported for custom
     * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
     * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
     * field is optional, and the default value is `n1-standard-2`. For
     * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
     * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
     * this field is required.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMachineType() {
      machineType_ = getDefaultInstance().getMachineType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of the machine.
     * See the [list of machine types supported for
     * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
     * See the [list of machine types supported for custom
     * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
     * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this
     * field is optional, and the default value is `n1-standard-2`. For
     * [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or
     * as part of [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec]
     * this field is required.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      machineType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int acceleratorType_ = 0;
    /**
     *
     *
     * <pre>
     * Immutable. The type of accelerator(s) that may be attached to the machine
     * as per
     * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The enum numeric value on the wire for acceleratorType.
     */
    @java.lang.Override
    public int getAcceleratorTypeValue() {
      return acceleratorType_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of accelerator(s) that may be attached to the machine
     * as per
     * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The enum numeric value on the wire for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeValue(int value) {
      acceleratorType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of accelerator(s) that may be attached to the machine
     * as per
     * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The acceleratorType.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AcceleratorType getAcceleratorType() {
      com.google.cloud.aiplatform.v1beta1.AcceleratorType result =
          com.google.cloud.aiplatform.v1beta1.AcceleratorType.forNumber(acceleratorType_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.AcceleratorType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of accelerator(s) that may be attached to the machine
     * as per
     * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(com.google.cloud.aiplatform.v1beta1.AcceleratorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      acceleratorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The type of accelerator(s) that may be attached to the machine
     * as per
     * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      acceleratorType_ = 0;
      onChanged();
      return this;
    }

    private int acceleratorCount_;
    /**
     *
     *
     * <pre>
     * The number of accelerators to attach to the machine.
     * </pre>
     *
     * <code>int32 accelerator_count = 3;</code>
     *
     * @return The acceleratorCount.
     */
    @java.lang.Override
    public int getAcceleratorCount() {
      return acceleratorCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of accelerators to attach to the machine.
     * </pre>
     *
     * <code>int32 accelerator_count = 3;</code>
     *
     * @param value The acceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorCount(int value) {

      acceleratorCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of accelerators to attach to the machine.
     * </pre>
     *
     * <code>int32 accelerator_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      acceleratorCount_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.MachineSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.MachineSpec)
  private static final com.google.cloud.aiplatform.v1beta1.MachineSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.MachineSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.MachineSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MachineSpec> PARSER =
      new com.google.protobuf.AbstractParser<MachineSpec>() {
        @java.lang.Override
        public MachineSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<MachineSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MachineSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MachineSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
