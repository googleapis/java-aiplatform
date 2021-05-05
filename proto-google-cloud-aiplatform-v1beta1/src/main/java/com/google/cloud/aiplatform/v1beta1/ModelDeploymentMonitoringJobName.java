/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ModelDeploymentMonitoringJobName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_MODEL_DEPLOYMENT_MONITORING_JOB =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String modelDeploymentMonitoringJob;

  @Deprecated
  protected ModelDeploymentMonitoringJobName() {
    project = null;
    location = null;
    modelDeploymentMonitoringJob = null;
  }

  private ModelDeploymentMonitoringJobName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    modelDeploymentMonitoringJob =
        Preconditions.checkNotNull(builder.getModelDeploymentMonitoringJob());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getModelDeploymentMonitoringJob() {
    return modelDeploymentMonitoringJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ModelDeploymentMonitoringJobName of(
      String project, String location, String modelDeploymentMonitoringJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
        .build();
  }

  public static String format(
      String project, String location, String modelDeploymentMonitoringJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
        .build()
        .toString();
  }

  public static ModelDeploymentMonitoringJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_MODEL_DEPLOYMENT_MONITORING_JOB.validatedMatch(
            formattedString,
            "ModelDeploymentMonitoringJobName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("model_deployment_monitoring_job"));
  }

  public static List<ModelDeploymentMonitoringJobName> parseList(List<String> formattedStrings) {
    List<ModelDeploymentMonitoringJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ModelDeploymentMonitoringJobName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ModelDeploymentMonitoringJobName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_MODEL_DEPLOYMENT_MONITORING_JOB.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (modelDeploymentMonitoringJob != null) {
            fieldMapBuilder.put("model_deployment_monitoring_job", modelDeploymentMonitoringJob);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_MODEL_DEPLOYMENT_MONITORING_JOB.instantiate(
        "project",
        project,
        "location",
        location,
        "model_deployment_monitoring_job",
        modelDeploymentMonitoringJob);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ModelDeploymentMonitoringJobName that = ((ModelDeploymentMonitoringJobName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.modelDeploymentMonitoringJob, that.modelDeploymentMonitoringJob);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(modelDeploymentMonitoringJob);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String modelDeploymentMonitoringJob;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getModelDeploymentMonitoringJob() {
      return modelDeploymentMonitoringJob;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setModelDeploymentMonitoringJob(String modelDeploymentMonitoringJob) {
      this.modelDeploymentMonitoringJob = modelDeploymentMonitoringJob;
      return this;
    }

    private Builder(ModelDeploymentMonitoringJobName modelDeploymentMonitoringJobName) {
      project = modelDeploymentMonitoringJobName.project;
      location = modelDeploymentMonitoringJobName.location;
      modelDeploymentMonitoringJob = modelDeploymentMonitoringJobName.modelDeploymentMonitoringJob;
    }

    public ModelDeploymentMonitoringJobName build() {
      return new ModelDeploymentMonitoringJobName(this);
    }
  }
}
