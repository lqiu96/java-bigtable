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
// source: google/bigtable/v2/request_stats.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * ReadIterationStats captures information about the iteration of rows or cells
 * over the course of a read, e.g. how many results were scanned in a read
 * operation versus the results returned.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.ReadIterationStats}
 */
public final class ReadIterationStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ReadIterationStats)
    ReadIterationStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadIterationStats.newBuilder() to construct.
  private ReadIterationStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadIterationStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadIterationStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.RequestStatsProto
        .internal_static_google_bigtable_v2_ReadIterationStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.RequestStatsProto
        .internal_static_google_bigtable_v2_ReadIterationStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ReadIterationStats.class,
            com.google.bigtable.v2.ReadIterationStats.Builder.class);
  }

  public static final int ROWS_SEEN_COUNT_FIELD_NUMBER = 1;
  private long rowsSeenCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The rows seen (scanned) as part of the request. This includes the count of
   * rows returned, as captured below.
   * </pre>
   *
   * <code>int64 rows_seen_count = 1;</code>
   *
   * @return The rowsSeenCount.
   */
  @java.lang.Override
  public long getRowsSeenCount() {
    return rowsSeenCount_;
  }

  public static final int ROWS_RETURNED_COUNT_FIELD_NUMBER = 2;
  private long rowsReturnedCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The rows returned as part of the request.
   * </pre>
   *
   * <code>int64 rows_returned_count = 2;</code>
   *
   * @return The rowsReturnedCount.
   */
  @java.lang.Override
  public long getRowsReturnedCount() {
    return rowsReturnedCount_;
  }

  public static final int CELLS_SEEN_COUNT_FIELD_NUMBER = 3;
  private long cellsSeenCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The cells seen (scanned) as part of the request. This includes the count of
   * cells returned, as captured below.
   * </pre>
   *
   * <code>int64 cells_seen_count = 3;</code>
   *
   * @return The cellsSeenCount.
   */
  @java.lang.Override
  public long getCellsSeenCount() {
    return cellsSeenCount_;
  }

  public static final int CELLS_RETURNED_COUNT_FIELD_NUMBER = 4;
  private long cellsReturnedCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The cells returned as part of the request.
   * </pre>
   *
   * <code>int64 cells_returned_count = 4;</code>
   *
   * @return The cellsReturnedCount.
   */
  @java.lang.Override
  public long getCellsReturnedCount() {
    return cellsReturnedCount_;
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
    if (rowsSeenCount_ != 0L) {
      output.writeInt64(1, rowsSeenCount_);
    }
    if (rowsReturnedCount_ != 0L) {
      output.writeInt64(2, rowsReturnedCount_);
    }
    if (cellsSeenCount_ != 0L) {
      output.writeInt64(3, cellsSeenCount_);
    }
    if (cellsReturnedCount_ != 0L) {
      output.writeInt64(4, cellsReturnedCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rowsSeenCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, rowsSeenCount_);
    }
    if (rowsReturnedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, rowsReturnedCount_);
    }
    if (cellsSeenCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, cellsSeenCount_);
    }
    if (cellsReturnedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, cellsReturnedCount_);
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
    if (!(obj instanceof com.google.bigtable.v2.ReadIterationStats)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.ReadIterationStats other =
        (com.google.bigtable.v2.ReadIterationStats) obj;

    if (getRowsSeenCount() != other.getRowsSeenCount()) return false;
    if (getRowsReturnedCount() != other.getRowsReturnedCount()) return false;
    if (getCellsSeenCount() != other.getCellsSeenCount()) return false;
    if (getCellsReturnedCount() != other.getCellsReturnedCount()) return false;
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
    hash = (37 * hash) + ROWS_SEEN_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getRowsSeenCount());
    hash = (37 * hash) + ROWS_RETURNED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getRowsReturnedCount());
    hash = (37 * hash) + CELLS_SEEN_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCellsSeenCount());
    hash = (37 * hash) + CELLS_RETURNED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCellsReturnedCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadIterationStats parseFrom(
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

  public static Builder newBuilder(com.google.bigtable.v2.ReadIterationStats prototype) {
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
   * ReadIterationStats captures information about the iteration of rows or cells
   * over the course of a read, e.g. how many results were scanned in a read
   * operation versus the results returned.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.ReadIterationStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ReadIterationStats)
      com.google.bigtable.v2.ReadIterationStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_ReadIterationStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_ReadIterationStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ReadIterationStats.class,
              com.google.bigtable.v2.ReadIterationStats.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ReadIterationStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rowsSeenCount_ = 0L;
      rowsReturnedCount_ = 0L;
      cellsSeenCount_ = 0L;
      cellsReturnedCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_ReadIterationStats_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadIterationStats getDefaultInstanceForType() {
      return com.google.bigtable.v2.ReadIterationStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadIterationStats build() {
      com.google.bigtable.v2.ReadIterationStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadIterationStats buildPartial() {
      com.google.bigtable.v2.ReadIterationStats result =
          new com.google.bigtable.v2.ReadIterationStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.v2.ReadIterationStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rowsSeenCount_ = rowsSeenCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rowsReturnedCount_ = rowsReturnedCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cellsSeenCount_ = cellsSeenCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.cellsReturnedCount_ = cellsReturnedCount_;
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
      if (other instanceof com.google.bigtable.v2.ReadIterationStats) {
        return mergeFrom((com.google.bigtable.v2.ReadIterationStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ReadIterationStats other) {
      if (other == com.google.bigtable.v2.ReadIterationStats.getDefaultInstance()) return this;
      if (other.getRowsSeenCount() != 0L) {
        setRowsSeenCount(other.getRowsSeenCount());
      }
      if (other.getRowsReturnedCount() != 0L) {
        setRowsReturnedCount(other.getRowsReturnedCount());
      }
      if (other.getCellsSeenCount() != 0L) {
        setCellsSeenCount(other.getCellsSeenCount());
      }
      if (other.getCellsReturnedCount() != 0L) {
        setCellsReturnedCount(other.getCellsReturnedCount());
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
            case 8:
              {
                rowsSeenCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                rowsReturnedCount_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                cellsSeenCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                cellsReturnedCount_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private long rowsSeenCount_;
    /**
     *
     *
     * <pre>
     * The rows seen (scanned) as part of the request. This includes the count of
     * rows returned, as captured below.
     * </pre>
     *
     * <code>int64 rows_seen_count = 1;</code>
     *
     * @return The rowsSeenCount.
     */
    @java.lang.Override
    public long getRowsSeenCount() {
      return rowsSeenCount_;
    }
    /**
     *
     *
     * <pre>
     * The rows seen (scanned) as part of the request. This includes the count of
     * rows returned, as captured below.
     * </pre>
     *
     * <code>int64 rows_seen_count = 1;</code>
     *
     * @param value The rowsSeenCount to set.
     * @return This builder for chaining.
     */
    public Builder setRowsSeenCount(long value) {

      rowsSeenCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The rows seen (scanned) as part of the request. This includes the count of
     * rows returned, as captured below.
     * </pre>
     *
     * <code>int64 rows_seen_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRowsSeenCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rowsSeenCount_ = 0L;
      onChanged();
      return this;
    }

    private long rowsReturnedCount_;
    /**
     *
     *
     * <pre>
     * The rows returned as part of the request.
     * </pre>
     *
     * <code>int64 rows_returned_count = 2;</code>
     *
     * @return The rowsReturnedCount.
     */
    @java.lang.Override
    public long getRowsReturnedCount() {
      return rowsReturnedCount_;
    }
    /**
     *
     *
     * <pre>
     * The rows returned as part of the request.
     * </pre>
     *
     * <code>int64 rows_returned_count = 2;</code>
     *
     * @param value The rowsReturnedCount to set.
     * @return This builder for chaining.
     */
    public Builder setRowsReturnedCount(long value) {

      rowsReturnedCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The rows returned as part of the request.
     * </pre>
     *
     * <code>int64 rows_returned_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRowsReturnedCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rowsReturnedCount_ = 0L;
      onChanged();
      return this;
    }

    private long cellsSeenCount_;
    /**
     *
     *
     * <pre>
     * The cells seen (scanned) as part of the request. This includes the count of
     * cells returned, as captured below.
     * </pre>
     *
     * <code>int64 cells_seen_count = 3;</code>
     *
     * @return The cellsSeenCount.
     */
    @java.lang.Override
    public long getCellsSeenCount() {
      return cellsSeenCount_;
    }
    /**
     *
     *
     * <pre>
     * The cells seen (scanned) as part of the request. This includes the count of
     * cells returned, as captured below.
     * </pre>
     *
     * <code>int64 cells_seen_count = 3;</code>
     *
     * @param value The cellsSeenCount to set.
     * @return This builder for chaining.
     */
    public Builder setCellsSeenCount(long value) {

      cellsSeenCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cells seen (scanned) as part of the request. This includes the count of
     * cells returned, as captured below.
     * </pre>
     *
     * <code>int64 cells_seen_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCellsSeenCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cellsSeenCount_ = 0L;
      onChanged();
      return this;
    }

    private long cellsReturnedCount_;
    /**
     *
     *
     * <pre>
     * The cells returned as part of the request.
     * </pre>
     *
     * <code>int64 cells_returned_count = 4;</code>
     *
     * @return The cellsReturnedCount.
     */
    @java.lang.Override
    public long getCellsReturnedCount() {
      return cellsReturnedCount_;
    }
    /**
     *
     *
     * <pre>
     * The cells returned as part of the request.
     * </pre>
     *
     * <code>int64 cells_returned_count = 4;</code>
     *
     * @param value The cellsReturnedCount to set.
     * @return This builder for chaining.
     */
    public Builder setCellsReturnedCount(long value) {

      cellsReturnedCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cells returned as part of the request.
     * </pre>
     *
     * <code>int64 cells_returned_count = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCellsReturnedCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      cellsReturnedCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ReadIterationStats)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ReadIterationStats)
  private static final com.google.bigtable.v2.ReadIterationStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ReadIterationStats();
  }

  public static com.google.bigtable.v2.ReadIterationStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadIterationStats> PARSER =
      new com.google.protobuf.AbstractParser<ReadIterationStats>() {
        @java.lang.Override
        public ReadIterationStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadIterationStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadIterationStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.ReadIterationStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
