/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aiplatform;

// [START aiplatform_get_model_evaluation_text_sentiment_analysis_sample]

import com.google.cloud.aiplatform.v1beta1.Attribution;
import com.google.cloud.aiplatform.v1beta1.ModelEvaluation;
import com.google.cloud.aiplatform.v1beta1.ModelEvaluationName;
import com.google.cloud.aiplatform.v1beta1.ModelExplanation;
import com.google.cloud.aiplatform.v1beta1.ModelServiceClient;
import com.google.cloud.aiplatform.v1beta1.ModelServiceSettings;
import java.io.IOException;

public class GetModelEvaluationTextSentimentAnalysisSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "YOUR_PROJECT_ID";
    String modelId = "YOUR_MODEL_ID";
    String evaluationId = "YOUR_EVALUATION_ID";

    getModelEvaluationTextSentimentAnalysisSample(project, modelId, evaluationId);
  }

  static void getModelEvaluationTextSentimentAnalysisSample(
      String project, String modelId, String evaluationId) throws IOException {
    ModelServiceSettings modelServiceSettings =
        ModelServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ModelServiceClient modelServiceClient = ModelServiceClient.create(modelServiceSettings)) {
      String location = "us-central1";

      ModelEvaluationName modelEvaluationName =
          ModelEvaluationName.of(project, location, modelId, evaluationId);
      ModelEvaluation modelEvaluation = modelServiceClient.getModelEvaluation(modelEvaluationName);

      System.out.println("Get Model Evaluation Text Sentiment Analysis Response");
      System.out.format("\tModel Name: %s\n", modelEvaluation.getName());
      System.out.format("\tMetrics Schema Uri: %s\n", modelEvaluation.getMetricsSchemaUri());
      System.out.format("\tMetrics: %s\n", modelEvaluation.getMetrics());
      System.out.format("\tCreate Time: %s\n", modelEvaluation.getCreateTime());
      System.out.format("\tSlice Dimensions: %s\n", modelEvaluation.getSliceDimensionsList());

      System.out.println("\tModel Explanation");
      ModelExplanation modelExplanation = modelEvaluation.getModelExplanation();
      for (Attribution attribution : modelExplanation.getMeanAttributionsList()) {

        System.out.println("\t\tMean Attribution");
        System.out.format(
            "\t\t\tBaseline Output Value: %s\n", attribution.getBaselineOutputValue());
        System.out.format(
            "\t\t\tInstance Output Value: %s\n", attribution.getInstanceOutputValue());
        System.out.format("\t\t\tFeature Attributions: %s\n", attribution.getFeatureAttributions());
        System.out.format("\t\t\tOutput Index: %s\n", attribution.getOutputIndexList());
        System.out.format("\t\t\tOutput Display Name: %s\n", attribution.getOutputDisplayName());
        System.out.format("\t\t\tApproximation Error: %s\n", attribution.getApproximationError());
      }
    }
  }
}
// [END aiplatform_get_model_evaluation_text_sentiment_analysis_sample]
