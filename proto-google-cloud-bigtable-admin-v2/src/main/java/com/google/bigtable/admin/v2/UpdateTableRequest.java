/*
 * Copyright 2023 Google LLC
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
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

/**
 *
 *
 * <pre>
 * The request for
 * [UpdateTable][google.bigtable.admin.v2.BigtableTableAdmin.UpdateTable].
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.UpdateTableRequest}
 */
public final class UpdateTableRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.UpdateTableRequest)
    UpdateTableRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTableRequest.newBuilder() to construct.
  private UpdateTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTableRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTableRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableTableAdminProto
        .internal_static_google_bigtable_admin_v2_UpdateTableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableTableAdminProto
        .internal_static_google_bigtable_admin_v2_UpdateTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.UpdateTableRequest.class,
            com.google.bigtable.admin.v2.UpdateTableRequest.Builder.class);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  private com.google.bigtable.admin.v2.Table table_;
  /**
   *
   *
   * <pre>
   * Required. The table to update.
   * The table's `name` field is used to identify the table to update.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return table_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The table to update.
   * The table's `name` field is used to identify the table to update.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The table.
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.Table getTable() {
    return table_ == null ? com.google.bigtable.admin.v2.Table.getDefaultInstance() : table_;
  }
  /**
   *
   *
   * <pre>
   * Required. The table to update.
   * The table's `name` field is used to identify the table to update.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.TableOrBuilder getTableOrBuilder() {
    return table_ == null ? com.google.bigtable.admin.v2.Table.getDefaultInstance() : table_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
   * field should be updated. This mask is relative to the `table` field, not to
   * the request message. The wildcard (*) path is currently not supported.
   * Currently UpdateTable is only supported for the following fields:
   *
   * * `change_stream_config`
   * * `change_stream_config.retention_period`
   * * `deletion_protection`
   *
   * If `column_families` is set in `update_mask`, it will return an
   * UNIMPLEMENTED error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
   * field should be updated. This mask is relative to the `table` field, not to
   * the request message. The wildcard (*) path is currently not supported.
   * Currently UpdateTable is only supported for the following fields:
   *
   * * `change_stream_config`
   * * `change_stream_config.retention_period`
   * * `deletion_protection`
   *
   * If `column_families` is set in `update_mask`, it will return an
   * UNIMPLEMENTED error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
   * field should be updated. This mask is relative to the `table` field, not to
   * the request message. The wildcard (*) path is currently not supported.
   * Currently UpdateTable is only supported for the following fields:
   *
   * * `change_stream_config`
   * * `change_stream_config.retention_period`
   * * `deletion_protection`
   *
   * If `column_families` is set in `update_mask`, it will return an
   * UNIMPLEMENTED error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (table_ != null) {
      output.writeMessage(1, getTable());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (table_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTable());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.bigtable.admin.v2.UpdateTableRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.UpdateTableRequest other =
        (com.google.bigtable.admin.v2.UpdateTableRequest) obj;

    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable().equals(other.getTable())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest parseFrom(
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

  public static Builder newBuilder(com.google.bigtable.admin.v2.UpdateTableRequest prototype) {
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
   * The request for
   * [UpdateTable][google.bigtable.admin.v2.BigtableTableAdmin.UpdateTable].
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.UpdateTableRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.UpdateTableRequest)
      com.google.bigtable.admin.v2.UpdateTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateTableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.UpdateTableRequest.class,
              com.google.bigtable.admin.v2.UpdateTableRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.UpdateTableRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateTableRequest_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateTableRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.UpdateTableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateTableRequest build() {
      com.google.bigtable.admin.v2.UpdateTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateTableRequest buildPartial() {
      com.google.bigtable.admin.v2.UpdateTableRequest result =
          new com.google.bigtable.admin.v2.UpdateTableRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.admin.v2.UpdateTableRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.table_ = tableBuilder_ == null ? table_ : tableBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.bigtable.admin.v2.UpdateTableRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.UpdateTableRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.UpdateTableRequest other) {
      if (other == com.google.bigtable.admin.v2.UpdateTableRequest.getDefaultInstance())
        return this;
      if (other.hasTable()) {
        mergeTable(other.getTable());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getTableFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.bigtable.admin.v2.Table table_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.Table,
            com.google.bigtable.admin.v2.Table.Builder,
            com.google.bigtable.admin.v2.TableOrBuilder>
        tableBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The table.
     */
    public com.google.bigtable.admin.v2.Table getTable() {
      if (tableBuilder_ == null) {
        return table_ == null ? com.google.bigtable.admin.v2.Table.getDefaultInstance() : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTable(com.google.bigtable.admin.v2.Table value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
      } else {
        tableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTable(com.google.bigtable.admin.v2.Table.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTable(com.google.bigtable.admin.v2.Table value) {
      if (tableBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && table_ != null
            && table_ != com.google.bigtable.admin.v2.Table.getDefaultInstance()) {
          getTableBuilder().mergeFrom(value);
        } else {
          table_ = value;
        }
      } else {
        tableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.bigtable.admin.v2.Table.Builder getTableBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.bigtable.admin.v2.TableOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null ? com.google.bigtable.admin.v2.Table.getDefaultInstance() : table_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The table to update.
     * The table's `name` field is used to identify the table to update.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Table table = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.Table,
            com.google.bigtable.admin.v2.Table.Builder,
            com.google.bigtable.admin.v2.TableOrBuilder>
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.bigtable.admin.v2.Table,
                com.google.bigtable.admin.v2.Table.Builder,
                com.google.bigtable.admin.v2.TableOrBuilder>(
                getTable(), getParentForChildren(), isClean());
        table_ = null;
      }
      return tableBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * A mask specifying which fields (e.g. `change_stream_config`) in the `table`
     * field should be updated. This mask is relative to the `table` field, not to
     * the request message. The wildcard (*) path is currently not supported.
     * Currently UpdateTable is only supported for the following fields:
     *
     * * `change_stream_config`
     * * `change_stream_config.retention_period`
     * * `deletion_protection`
     *
     * If `column_families` is set in `update_mask`, it will return an
     * UNIMPLEMENTED error.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.UpdateTableRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.UpdateTableRequest)
  private static final com.google.bigtable.admin.v2.UpdateTableRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.UpdateTableRequest();
  }

  public static com.google.bigtable.admin.v2.UpdateTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTableRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTableRequest>() {
        @java.lang.Override
        public UpdateTableRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.UpdateTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
