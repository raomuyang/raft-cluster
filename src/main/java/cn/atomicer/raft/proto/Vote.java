// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package cn.atomicer.raft.proto;

/**
 * Protobuf type {@code proto.Vote}
 */
public  final class Vote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Vote)
    VoteOrBuilder {
  // Use Vote.newBuilder() to construct.
  private Vote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vote() {
    nodeId_ = "";
    term_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Vote(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nodeId_ = s;
            break;
          }
          case 16: {

            term_ = input.readInt64();
            break;
          }
          case 26: {
            cn.atomicer.raft.proto.EntryInfo.Builder subBuilder = null;
            if (lastEntryInfo_ != null) {
              subBuilder = lastEntryInfo_.toBuilder();
            }
            lastEntryInfo_ = input.readMessage(cn.atomicer.raft.proto.EntryInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastEntryInfo_);
              lastEntryInfo_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.atomicer.raft.proto.Messages.internal_static_proto_Vote_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.atomicer.raft.proto.Messages.internal_static_proto_Vote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.atomicer.raft.proto.Vote.class, cn.atomicer.raft.proto.Vote.Builder.class);
  }

  public static final int NODEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object nodeId_;
  /**
   * <code>optional string nodeId = 1;</code>
   */
  public java.lang.String getNodeId() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodeId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string nodeId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNodeIdBytes() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TERM_FIELD_NUMBER = 2;
  private long term_;
  /**
   * <code>optional int64 term = 2;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int LASTENTRYINFO_FIELD_NUMBER = 3;
  private cn.atomicer.raft.proto.EntryInfo lastEntryInfo_;
  /**
   * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
   */
  public boolean hasLastEntryInfo() {
    return lastEntryInfo_ != null;
  }
  /**
   * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
   */
  public cn.atomicer.raft.proto.EntryInfo getLastEntryInfo() {
    return lastEntryInfo_ == null ? cn.atomicer.raft.proto.EntryInfo.getDefaultInstance() : lastEntryInfo_;
  }
  /**
   * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
   */
  public cn.atomicer.raft.proto.EntryInfoOrBuilder getLastEntryInfoOrBuilder() {
    return getLastEntryInfo();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNodeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nodeId_);
    }
    if (term_ != 0L) {
      output.writeInt64(2, term_);
    }
    if (lastEntryInfo_ != null) {
      output.writeMessage(3, getLastEntryInfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNodeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nodeId_);
    }
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, term_);
    }
    if (lastEntryInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastEntryInfo());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.atomicer.raft.proto.Vote)) {
      return super.equals(obj);
    }
    cn.atomicer.raft.proto.Vote other = (cn.atomicer.raft.proto.Vote) obj;

    boolean result = true;
    result = result && getNodeId()
        .equals(other.getNodeId());
    result = result && (getTerm()
        == other.getTerm());
    result = result && (hasLastEntryInfo() == other.hasLastEntryInfo());
    if (hasLastEntryInfo()) {
      result = result && getLastEntryInfo()
          .equals(other.getLastEntryInfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NODEID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId().hashCode();
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    if (hasLastEntryInfo()) {
      hash = (37 * hash) + LASTENTRYINFO_FIELD_NUMBER;
      hash = (53 * hash) + getLastEntryInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.atomicer.raft.proto.Vote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.Vote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.Vote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.Vote parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.atomicer.raft.proto.Vote prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Vote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Vote)
      cn.atomicer.raft.proto.VoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_Vote_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_Vote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.atomicer.raft.proto.Vote.class, cn.atomicer.raft.proto.Vote.Builder.class);
    }

    // Construct using cn.atomicer.raft.proto.Vote.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      nodeId_ = "";

      term_ = 0L;

      if (lastEntryInfoBuilder_ == null) {
        lastEntryInfo_ = null;
      } else {
        lastEntryInfo_ = null;
        lastEntryInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_Vote_descriptor;
    }

    public cn.atomicer.raft.proto.Vote getDefaultInstanceForType() {
      return cn.atomicer.raft.proto.Vote.getDefaultInstance();
    }

    public cn.atomicer.raft.proto.Vote build() {
      cn.atomicer.raft.proto.Vote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.atomicer.raft.proto.Vote buildPartial() {
      cn.atomicer.raft.proto.Vote result = new cn.atomicer.raft.proto.Vote(this);
      result.nodeId_ = nodeId_;
      result.term_ = term_;
      if (lastEntryInfoBuilder_ == null) {
        result.lastEntryInfo_ = lastEntryInfo_;
      } else {
        result.lastEntryInfo_ = lastEntryInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.atomicer.raft.proto.Vote) {
        return mergeFrom((cn.atomicer.raft.proto.Vote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.atomicer.raft.proto.Vote other) {
      if (other == cn.atomicer.raft.proto.Vote.getDefaultInstance()) return this;
      if (!other.getNodeId().isEmpty()) {
        nodeId_ = other.nodeId_;
        onChanged();
      }
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (other.hasLastEntryInfo()) {
        mergeLastEntryInfo(other.getLastEntryInfo());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.atomicer.raft.proto.Vote parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.atomicer.raft.proto.Vote) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nodeId_ = "";
    /**
     * <code>optional string nodeId = 1;</code>
     */
    public java.lang.String getNodeId() {
      java.lang.Object ref = nodeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string nodeId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNodeIdBytes() {
      java.lang.Object ref = nodeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string nodeId = 1;</code>
     */
    public Builder setNodeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string nodeId = 1;</code>
     */
    public Builder clearNodeId() {
      
      nodeId_ = getDefaultInstance().getNodeId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string nodeId = 1;</code>
     */
    public Builder setNodeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nodeId_ = value;
      onChanged();
      return this;
    }

    private long term_ ;
    /**
     * <code>optional int64 term = 2;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>optional int64 term = 2;</code>
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 term = 2;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0L;
      onChanged();
      return this;
    }

    private cn.atomicer.raft.proto.EntryInfo lastEntryInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder> lastEntryInfoBuilder_;
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public boolean hasLastEntryInfo() {
      return lastEntryInfoBuilder_ != null || lastEntryInfo_ != null;
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo getLastEntryInfo() {
      if (lastEntryInfoBuilder_ == null) {
        return lastEntryInfo_ == null ? cn.atomicer.raft.proto.EntryInfo.getDefaultInstance() : lastEntryInfo_;
      } else {
        return lastEntryInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public Builder setLastEntryInfo(cn.atomicer.raft.proto.EntryInfo value) {
      if (lastEntryInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastEntryInfo_ = value;
        onChanged();
      } else {
        lastEntryInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public Builder setLastEntryInfo(
        cn.atomicer.raft.proto.EntryInfo.Builder builderForValue) {
      if (lastEntryInfoBuilder_ == null) {
        lastEntryInfo_ = builderForValue.build();
        onChanged();
      } else {
        lastEntryInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public Builder mergeLastEntryInfo(cn.atomicer.raft.proto.EntryInfo value) {
      if (lastEntryInfoBuilder_ == null) {
        if (lastEntryInfo_ != null) {
          lastEntryInfo_ =
            cn.atomicer.raft.proto.EntryInfo.newBuilder(lastEntryInfo_).mergeFrom(value).buildPartial();
        } else {
          lastEntryInfo_ = value;
        }
        onChanged();
      } else {
        lastEntryInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public Builder clearLastEntryInfo() {
      if (lastEntryInfoBuilder_ == null) {
        lastEntryInfo_ = null;
        onChanged();
      } else {
        lastEntryInfo_ = null;
        lastEntryInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo.Builder getLastEntryInfoBuilder() {
      
      onChanged();
      return getLastEntryInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    public cn.atomicer.raft.proto.EntryInfoOrBuilder getLastEntryInfoOrBuilder() {
      if (lastEntryInfoBuilder_ != null) {
        return lastEntryInfoBuilder_.getMessageOrBuilder();
      } else {
        return lastEntryInfo_ == null ?
            cn.atomicer.raft.proto.EntryInfo.getDefaultInstance() : lastEntryInfo_;
      }
    }
    /**
     * <code>optional .proto.EntryInfo lastEntryInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder> 
        getLastEntryInfoFieldBuilder() {
      if (lastEntryInfoBuilder_ == null) {
        lastEntryInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder>(
                getLastEntryInfo(),
                getParentForChildren(),
                isClean());
        lastEntryInfo_ = null;
      }
      return lastEntryInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.Vote)
  }

  // @@protoc_insertion_point(class_scope:proto.Vote)
  private static final cn.atomicer.raft.proto.Vote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.atomicer.raft.proto.Vote();
  }

  public static cn.atomicer.raft.proto.Vote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vote>
      PARSER = new com.google.protobuf.AbstractParser<Vote>() {
    public Vote parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Vote(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Vote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vote> getParserForType() {
    return PARSER;
  }

  public cn.atomicer.raft.proto.Vote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
