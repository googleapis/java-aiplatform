// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListModelDeploymentMonitoringJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListModelDeploymentMonitoringJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob> 
      getModelDeploymentMonitoringJobsList();
  /**
   * <pre>
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob getModelDeploymentMonitoringJobs(int index);
  /**
   * <pre>
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_jobs = 1;</code>
   */
  int getModelDeploymentMonitoringJobsCount();
  /**
   * <pre>
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder> 
      getModelDeploymentMonitoringJobsOrBuilderList();
  /**
   * <pre>
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob model_deployment_monitoring_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobOrBuilder getModelDeploymentMonitoringJobsOrBuilder(
      int index);

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
