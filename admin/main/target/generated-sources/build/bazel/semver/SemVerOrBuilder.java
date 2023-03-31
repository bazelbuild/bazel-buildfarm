// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: semver.proto

package build.bazel.semver;

public interface SemVerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.semver.SemVer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The major version, e.g 10 for 10.2.3.
   * </pre>
   *
   * <code>int32 major = 1;</code>
   */
  int getMajor();

  /**
   * <pre>
   * The minor version, e.g. 2 for 10.2.3.
   * </pre>
   *
   * <code>int32 minor = 2;</code>
   */
  int getMinor();

  /**
   * <pre>
   * The patch version, e.g 3 for 10.2.3.
   * </pre>
   *
   * <code>int32 patch = 3;</code>
   */
  int getPatch();

  /**
   * <pre>
   * The pre-release version. Either this field or major/minor/patch fields
   * must be filled. They are mutually exclusive. Pre-release versions are
   * assumed to be earlier than any released versions.
   * </pre>
   *
   * <code>string prerelease = 4;</code>
   */
  java.lang.String getPrerelease();
  /**
   * <pre>
   * The pre-release version. Either this field or major/minor/patch fields
   * must be filled. They are mutually exclusive. Pre-release versions are
   * assumed to be earlier than any released versions.
   * </pre>
   *
   * <code>string prerelease = 4;</code>
   */
  com.google.protobuf.ByteString
      getPrereleaseBytes();
}