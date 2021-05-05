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
public class TensorboardExperimentName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_TENSORBOARD_EXPERIMENT =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String tensorboard;
  private final String experiment;

  @Deprecated
  protected TensorboardExperimentName() {
    project = null;
    location = null;
    tensorboard = null;
    experiment = null;
  }

  private TensorboardExperimentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    tensorboard = Preconditions.checkNotNull(builder.getTensorboard());
    experiment = Preconditions.checkNotNull(builder.getExperiment());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getTensorboard() {
    return tensorboard;
  }

  public String getExperiment() {
    return experiment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static TensorboardExperimentName of(
      String project, String location, String tensorboard, String experiment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setTensorboard(tensorboard)
        .setExperiment(experiment)
        .build();
  }

  public static String format(
      String project, String location, String tensorboard, String experiment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setTensorboard(tensorboard)
        .setExperiment(experiment)
        .build()
        .toString();
  }

  public static TensorboardExperimentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_TENSORBOARD_EXPERIMENT.validatedMatch(
            formattedString,
            "TensorboardExperimentName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("tensorboard"),
        matchMap.get("experiment"));
  }

  public static List<TensorboardExperimentName> parseList(List<String> formattedStrings) {
    List<TensorboardExperimentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<TensorboardExperimentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (TensorboardExperimentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_TENSORBOARD_EXPERIMENT.matches(formattedString);
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
          if (tensorboard != null) {
            fieldMapBuilder.put("tensorboard", tensorboard);
          }
          if (experiment != null) {
            fieldMapBuilder.put("experiment", experiment);
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
    return PROJECT_LOCATION_TENSORBOARD_EXPERIMENT.instantiate(
        "project",
        project,
        "location",
        location,
        "tensorboard",
        tensorboard,
        "experiment",
        experiment);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      TensorboardExperimentName that = ((TensorboardExperimentName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.tensorboard, that.tensorboard)
          && Objects.equals(this.experiment, that.experiment);
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
    h ^= Objects.hashCode(tensorboard);
    h *= 1000003;
    h ^= Objects.hashCode(experiment);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String tensorboard;
    private String experiment;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getTensorboard() {
      return tensorboard;
    }

    public String getExperiment() {
      return experiment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setTensorboard(String tensorboard) {
      this.tensorboard = tensorboard;
      return this;
    }

    public Builder setExperiment(String experiment) {
      this.experiment = experiment;
      return this;
    }

    private Builder(TensorboardExperimentName tensorboardExperimentName) {
      project = tensorboardExperimentName.project;
      location = tensorboardExperimentName.location;
      tensorboard = tensorboardExperimentName.tensorboard;
      experiment = tensorboardExperimentName.experiment;
    }

    public TensorboardExperimentName build() {
      return new TensorboardExperimentName(this);
    }
  }
}
