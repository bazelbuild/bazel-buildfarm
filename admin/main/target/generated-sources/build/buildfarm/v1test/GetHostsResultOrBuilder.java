// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface GetHostsResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.GetHostsResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 num_hosts = 1;</code>
   */
  long getNumHosts();

  /**
   * <code>repeated .build.buildfarm.v1test.Host hosts = 2;</code>
   */
  java.util.List<build.buildfarm.v1test.Host> 
      getHostsList();
  /**
   * <code>repeated .build.buildfarm.v1test.Host hosts = 2;</code>
   */
  build.buildfarm.v1test.Host getHosts(int index);
  /**
   * <code>repeated .build.buildfarm.v1test.Host hosts = 2;</code>
   */
  int getHostsCount();
  /**
   * <code>repeated .build.buildfarm.v1test.Host hosts = 2;</code>
   */
  java.util.List<? extends build.buildfarm.v1test.HostOrBuilder> 
      getHostsOrBuilderList();
  /**
   * <code>repeated .build.buildfarm.v1test.Host hosts = 2;</code>
   */
  build.buildfarm.v1test.HostOrBuilder getHostsOrBuilder(
      int index);
}