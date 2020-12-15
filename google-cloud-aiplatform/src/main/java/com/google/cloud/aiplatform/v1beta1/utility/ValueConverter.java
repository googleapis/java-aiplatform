package com.google.cloud.aiplatform.v1beta1.utility;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Value;
import com.google.protobuf.util.JsonFormat;

/**
 * Exposes utility methods for converting AI Platform messages to and from
 * {@com.google.protobuf.Value} objects.
 */
public class ValueConverter {

  /** An empty {@com.google.protobuf.Value} message. */
  public static final Value EMPTY_VALUE = Value.newBuilder().build();

  /**
   * Converts a message type to a {@com.google.protobuf.Value}.
   *
   * @param message the message to convert
   * @return the message as a {@com.google.protobuf.Value}
   * @throws InvalidProtocolBufferException
   */
  public static Value toValue(Message message) throws InvalidProtocolBufferException {
    String jsonString = JsonFormat.printer().print(message);
    Value.Builder value = Value.newBuilder();
    JsonFormat.parser().merge(jsonString, value);
    return value.build();
  }

  /**
   * Converts a {@com.google.protobuf.Value} to a {@com.google.protobuf.Message} of the provided
   * {@com.google.protobuf.Message.Builder}.
   *
   * @param messageBuilder a builder for the message type
   * @param value the Value to convert to a message
   * @return the value as a message
   * @throws InvalidProtocolBufferException
   */
  public static Message fromValue(Message.Builder messageBuilder, Value value)
      throws InvalidProtocolBufferException {
    String valueString = JsonFormat.printer().print(value);
    JsonFormat.parser().merge(valueString, messageBuilder);
    return messageBuilder.build();
  }
}
