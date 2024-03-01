"""
buildfarm definitions that can be imported into other WORKSPACE files
"""

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")
load("@com_grail_bazel_toolchain//toolchain:rules.bzl", "llvm_toolchain")
load("@io_grpc_grpc_java//:repositories.bzl", "IO_GRPC_GRPC_JAVA_OVERRIDE_TARGETS", "grpc_java_repositories")
load("@remote_apis//:repository_rules.bzl", "switched_rules_by_language")

def buildfarm_init(name = "buildfarm"):
    """
    Initialize the WORKSPACE for buildfarm-related targets

    Args:
      name: the name of the repository
    """

    switched_rules_by_language(
        name = "bazel_remote_apis_imports",
        java = True,
    )

    protobuf_deps()

    grpc_java_repositories()

    llvm_toolchain(
        name = "llvm_toolchain",
        llvm_version = "16.0.0",
    )
