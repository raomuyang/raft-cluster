// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package cn.atomicer.raft.proto;

public interface AppendEntriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AppendEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string leaderId = 1;</code>
   */
  java.lang.String getLeaderId();
  /**
   * <code>optional string leaderId = 1;</code>
   */
  com.google.protobuf.ByteString
      getLeaderIdBytes();

  /**
   * <code>optional int64 term = 2;</code>
   */
  long getTerm();

  /**
   * <code>optional int64 prevLogIndex = 3;</code>
   */
  long getPrevLogIndex();

  /**
   * <code>optional int64 prevLogTerm = 4;</code>
   */
  long getPrevLogTerm();

  /**
   * <code>optional int64 leaderCommit = 5;</code>
   */
  long getLeaderCommit();

  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  java.util.List<cn.atomicer.raft.proto.EntryInfo> 
      getEntriesList();
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  cn.atomicer.raft.proto.EntryInfo getEntries(int index);
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  java.util.List<? extends cn.atomicer.raft.proto.EntryInfoOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  cn.atomicer.raft.proto.EntryInfoOrBuilder getEntriesOrBuilder(
      int index);
}