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
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public interface HotTabletOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.HotTablet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of the hot tablet. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/hotTablets/[a-zA-Z0-9_-]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique name of the hot tablet. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/hotTablets/[a-zA-Z0-9_-]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Name of the table that contains the tablet. Values are of the form
   * `projects/{project}/instances/{instance}/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   *
   *
   * <pre>
   * Name of the table that contains the tablet. Values are of the form
   * `projects/{project}/instances/{instance}/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString getTableNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The start time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The start time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The start time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The end time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The end time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The end time of the hot tablet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Tablet Start Key (inclusive).
   * </pre>
   *
   * <code>string start_key = 5;</code>
   *
   * @return The startKey.
   */
  java.lang.String getStartKey();
  /**
   *
   *
   * <pre>
   * Tablet Start Key (inclusive).
   * </pre>
   *
   * <code>string start_key = 5;</code>
   *
   * @return The bytes for startKey.
   */
  com.google.protobuf.ByteString getStartKeyBytes();

  /**
   *
   *
   * <pre>
   * Tablet End Key (inclusive).
   * </pre>
   *
   * <code>string end_key = 6;</code>
   *
   * @return The endKey.
   */
  java.lang.String getEndKey();
  /**
   *
   *
   * <pre>
   * Tablet End Key (inclusive).
   * </pre>
   *
   * <code>string end_key = 6;</code>
   *
   * @return The bytes for endKey.
   */
  com.google.protobuf.ByteString getEndKeyBytes();

  /**
   *
   *
   * <pre>
   * Output only. The average CPU usage spent by a node on this tablet over the start_time to
   * end_time time range. The percentage is the amount of CPU used by the node
   * to serve the tablet, from 0% (tablet was not interacted with) to 100% (the
   * node spent all cycles serving the hot tablet).
   * </pre>
   *
   * <code>float node_cpu_usage_percent = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nodeCpuUsagePercent.
   */
  float getNodeCpuUsagePercent();
}
