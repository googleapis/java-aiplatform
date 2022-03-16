// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExplanationParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;</code>
   * @return Whether the sampledShapleyAttribution field is set.
   */
  boolean hasSampledShapleyAttribution();
  /**
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;</code>
   * @return The sampledShapleyAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.SampledShapleyAttribution getSampledShapleyAttribution();
  /**
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SampledShapleyAttributionOrBuilder getSampledShapleyAttributionOrBuilder();

  /**
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;</code>
   * @return Whether the integratedGradientsAttribution field is set.
   */
  boolean hasIntegratedGradientsAttribution();
  /**
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;</code>
   * @return The integratedGradientsAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution getIntegratedGradientsAttribution();
  /**
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttributionOrBuilder getIntegratedGradientsAttributionOrBuilder();

  /**
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   * @return Whether the xraiAttribution field is set.
   */
  boolean hasXraiAttribution();
  /**
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   * @return The xraiAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.XraiAttribution getXraiAttribution();
  /**
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.XraiAttributionOrBuilder getXraiAttributionOrBuilder();

  /**
   * <pre>
   * Similarity explainability that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Similarity similarity = 7;</code>
   * @return Whether the similarity field is set.
   */
  boolean hasSimilarity();
  /**
   * <pre>
   * Similarity explainability that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Similarity similarity = 7;</code>
   * @return The similarity.
   */
  com.google.cloud.aiplatform.v1beta1.Similarity getSimilarity();
  /**
   * <pre>
   * Similarity explainability that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Similarity similarity = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SimilarityOrBuilder getSimilarityOrBuilder();

  /**
   * <pre>
   * If populated, returns attributions for top K indices of outputs
   * (defaults to 1). Only applies to Models that predicts more than one outputs
   * (e,g, multi-class Models). When set to -1, returns explanations for all
   * outputs.
   * </pre>
   *
   * <code>int32 top_k = 4;</code>
   * @return The topK.
   */
  int getTopK();

  /**
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index] contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's
   * explaining.
   * If not populated, returns attributions for [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k] indices of outputs.
   * If neither top_k nor output_indeices is populated, returns the argmax
   * index of the outputs.
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   * @return Whether the outputIndices field is set.
   */
  boolean hasOutputIndices();
  /**
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index] contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's
   * explaining.
   * If not populated, returns attributions for [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k] indices of outputs.
   * If neither top_k nor output_indeices is populated, returns the argmax
   * index of the outputs.
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   * @return The outputIndices.
   */
  com.google.protobuf.ListValue getOutputIndices();
  /**
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index] contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's
   * explaining.
   * If not populated, returns attributions for [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k] indices of outputs.
   * If neither top_k nor output_indeices is populated, returns the argmax
   * index of the outputs.
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   */
  com.google.protobuf.ListValueOrBuilder getOutputIndicesOrBuilder();

  public com.google.cloud.aiplatform.v1beta1.ExplanationParameters.MethodCase getMethodCase();
}
