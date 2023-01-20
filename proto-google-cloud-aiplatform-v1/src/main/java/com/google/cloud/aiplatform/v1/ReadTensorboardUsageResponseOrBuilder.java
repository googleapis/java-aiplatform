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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface ReadTensorboardUsageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ReadTensorboardUsageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Maps year-month (YYYYMM) string to per month usage data.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData&gt; monthly_usage_data = 1;
   * </code>
   */
  int getMonthlyUsageDataCount();
  /**
   *
   *
   * <pre>
   * Maps year-month (YYYYMM) string to per month usage data.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData&gt; monthly_usage_data = 1;
   * </code>
   */
  boolean containsMonthlyUsageData(java.lang.String key);
  /** Use {@link #getMonthlyUsageDataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData>
      getMonthlyUsageData();
  /**
   *
   *
   * <pre>
   * Maps year-month (YYYYMM) string to per month usage data.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData&gt; monthly_usage_data = 1;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData>
      getMonthlyUsageDataMap();
  /**
   *
   *
   * <pre>
   * Maps year-month (YYYYMM) string to per month usage data.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData&gt; monthly_usage_data = 1;
   * </code>
   */
  /* nullable */
  com.google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData
      getMonthlyUsageDataOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData
              defaultValue);
  /**
   *
   *
   * <pre>
   * Maps year-month (YYYYMM) string to per month usage data.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData&gt; monthly_usage_data = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.ReadTensorboardUsageResponse.PerMonthUsageData
      getMonthlyUsageDataOrThrow(java.lang.String key);
}
