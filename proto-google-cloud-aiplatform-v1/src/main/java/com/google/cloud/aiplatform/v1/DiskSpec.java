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
// source: google/cloud/aiplatform/v1/machine_resources.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Represents the spec of disk options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.DiskSpec}
 */
public final class DiskSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.DiskSpec)
    DiskSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiskSpec.newBuilder() to construct.
  private DiskSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiskSpec() {
    bootDiskType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiskSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DiskSpec(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              bootDiskType_ = s;
              break;
            }
          case 16:
            {
              bootDiskSizeGb_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1_DiskSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.DiskSpec.class,
            com.google.cloud.aiplatform.v1.DiskSpec.Builder.class);
  }

  public static final int BOOT_DISK_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object bootDiskType_;
  /**
   *
   *
   * <pre>
   * Type of the boot disk (default is "pd-ssd").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 1;</code>
   *
   * @return The bootDiskType.
   */
  @java.lang.Override
  public java.lang.String getBootDiskType() {
    java.lang.Object ref = bootDiskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bootDiskType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Type of the boot disk (default is "pd-ssd").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 1;</code>
   *
   * @return The bytes for bootDiskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBootDiskTypeBytes() {
    java.lang.Object ref = bootDiskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bootDiskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOT_DISK_SIZE_GB_FIELD_NUMBER = 2;
  private int bootDiskSizeGb_;
  /**
   *
   *
   * <pre>
   * Size in GB of the boot disk (default is 100GB).
   * </pre>
   *
   * <code>int32 boot_disk_size_gb = 2;</code>
   *
   * @return The bootDiskSizeGb.
   */
  @java.lang.Override
  public int getBootDiskSizeGb() {
    return bootDiskSizeGb_;
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
    if (!getBootDiskTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bootDiskType_);
    }
    if (bootDiskSizeGb_ != 0) {
      output.writeInt32(2, bootDiskSizeGb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBootDiskTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bootDiskType_);
    }
    if (bootDiskSizeGb_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, bootDiskSizeGb_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.DiskSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.DiskSpec other = (com.google.cloud.aiplatform.v1.DiskSpec) obj;

    if (!getBootDiskType().equals(other.getBootDiskType())) return false;
    if (getBootDiskSizeGb() != other.getBootDiskSizeGb()) return false;
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
    hash = (37 * hash) + BOOT_DISK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBootDiskType().hashCode();
    hash = (37 * hash) + BOOT_DISK_SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + getBootDiskSizeGb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.DiskSpec prototype) {
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
   * Represents the spec of disk options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.DiskSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.DiskSpec)
      com.google.cloud.aiplatform.v1.DiskSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_DiskSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.DiskSpec.class,
              com.google.cloud.aiplatform.v1.DiskSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.DiskSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bootDiskType_ = "";

      bootDiskSizeGb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DiskSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.DiskSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DiskSpec build() {
      com.google.cloud.aiplatform.v1.DiskSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DiskSpec buildPartial() {
      com.google.cloud.aiplatform.v1.DiskSpec result =
          new com.google.cloud.aiplatform.v1.DiskSpec(this);
      result.bootDiskType_ = bootDiskType_;
      result.bootDiskSizeGb_ = bootDiskSizeGb_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.aiplatform.v1.DiskSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1.DiskSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.DiskSpec other) {
      if (other == com.google.cloud.aiplatform.v1.DiskSpec.getDefaultInstance()) return this;
      if (!other.getBootDiskType().isEmpty()) {
        bootDiskType_ = other.bootDiskType_;
        onChanged();
      }
      if (other.getBootDiskSizeGb() != 0) {
        setBootDiskSizeGb(other.getBootDiskSizeGb());
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
      com.google.cloud.aiplatform.v1.DiskSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.DiskSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bootDiskType_ = "";
    /**
     *
     *
     * <pre>
     * Type of the boot disk (default is "pd-ssd").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
     * "pd-standard" (Persistent Disk Hard Disk Drive).
     * </pre>
     *
     * <code>string boot_disk_type = 1;</code>
     *
     * @return The bootDiskType.
     */
    public java.lang.String getBootDiskType() {
      java.lang.Object ref = bootDiskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bootDiskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the boot disk (default is "pd-ssd").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
     * "pd-standard" (Persistent Disk Hard Disk Drive).
     * </pre>
     *
     * <code>string boot_disk_type = 1;</code>
     *
     * @return The bytes for bootDiskType.
     */
    public com.google.protobuf.ByteString getBootDiskTypeBytes() {
      java.lang.Object ref = bootDiskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bootDiskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the boot disk (default is "pd-ssd").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
     * "pd-standard" (Persistent Disk Hard Disk Drive).
     * </pre>
     *
     * <code>string boot_disk_type = 1;</code>
     *
     * @param value The bootDiskType to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      bootDiskType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the boot disk (default is "pd-ssd").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
     * "pd-standard" (Persistent Disk Hard Disk Drive).
     * </pre>
     *
     * <code>string boot_disk_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBootDiskType() {

      bootDiskType_ = getDefaultInstance().getBootDiskType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the boot disk (default is "pd-ssd").
     * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
     * "pd-standard" (Persistent Disk Hard Disk Drive).
     * </pre>
     *
     * <code>string boot_disk_type = 1;</code>
     *
     * @param value The bytes for bootDiskType to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      bootDiskType_ = value;
      onChanged();
      return this;
    }

    private int bootDiskSizeGb_;
    /**
     *
     *
     * <pre>
     * Size in GB of the boot disk (default is 100GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 2;</code>
     *
     * @return The bootDiskSizeGb.
     */
    @java.lang.Override
    public int getBootDiskSizeGb() {
      return bootDiskSizeGb_;
    }
    /**
     *
     *
     * <pre>
     * Size in GB of the boot disk (default is 100GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 2;</code>
     *
     * @param value The bootDiskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskSizeGb(int value) {

      bootDiskSizeGb_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size in GB of the boot disk (default is 100GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBootDiskSizeGb() {

      bootDiskSizeGb_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.DiskSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.DiskSpec)
  private static final com.google.cloud.aiplatform.v1.DiskSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.DiskSpec();
  }

  public static com.google.cloud.aiplatform.v1.DiskSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskSpec> PARSER =
      new com.google.protobuf.AbstractParser<DiskSpec>() {
        @java.lang.Override
        public DiskSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DiskSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DiskSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DiskSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
