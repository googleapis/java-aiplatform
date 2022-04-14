// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface BatchReadTensorboardTimeSeriesDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchReadTensorboardTimeSeriesDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TimeSeriesData> 
      getTimeSeriesDataList();
  /**
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TimeSeriesData getTimeSeriesData(int index);
  /**
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  int getTimeSeriesDataCount();
  /**
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder> 
      getTimeSeriesDataOrBuilderList();
  /**
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder getTimeSeriesDataOrBuilder(
      int index);
}
