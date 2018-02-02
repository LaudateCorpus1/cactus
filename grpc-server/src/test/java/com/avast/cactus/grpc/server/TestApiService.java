// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test_api.proto

package com.avast.cactus.grpc.server;

/**
 * Protobuf service {@code TestApiService}
 */
public  abstract class TestApiService
    implements com.google.protobuf.Service {
  protected TestApiService() {}

  public interface Interface {
    /**
     * <code>rpc Get(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
     */
    public abstract void get(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request,
            com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

    /**
     * <code>rpc Get2(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
     */
    public abstract void get2(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request,
            com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

    /**
     * <code>rpc Get3(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
     */
    public abstract void get3(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request,
            com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new TestApiService() {
      @Override
      public  void get(
          com.google.protobuf.RpcController controller,
          com.avast.cactus.grpc.server.TestApi.GetRequest request,
          com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
        impl.get(controller, request, done);
      }

      @Override
      public  void get2(
          com.google.protobuf.RpcController controller,
          com.avast.cactus.grpc.server.TestApi.GetRequest request,
          com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
        impl.get2(controller, request, done);
      }

      @Override
      public  void get3(
          com.google.protobuf.RpcController controller,
          com.avast.cactus.grpc.server.TestApi.GetRequest request,
          com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
        impl.get3(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.get(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request);
          case 1:
            return impl.get2(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request);
          case 2:
            return impl.get3(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request);
          default:
            throw new AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
          case 1:
            return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
          case 2:
            return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
          default:
            throw new AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
          case 1:
            return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
          case 2:
            return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
          default:
            throw new AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc Get(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
   */
  public abstract void get(
      com.google.protobuf.RpcController controller,
      com.avast.cactus.grpc.server.TestApi.GetRequest request,
      com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

  /**
   * <code>rpc Get2(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
   */
  public abstract void get2(
      com.google.protobuf.RpcController controller,
      com.avast.cactus.grpc.server.TestApi.GetRequest request,
      com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

  /**
   * <code>rpc Get3(.TestApi.GetRequest) returns (.TestApi.GetResponse);</code>
   */
  public abstract void get3(
      com.google.protobuf.RpcController controller,
      com.avast.cactus.grpc.server.TestApi.GetRequest request,
      com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.avast.cactus.grpc.server.TestApiOuterClass.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.get(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request,
          com.google.protobuf.RpcUtil.<com.avast.cactus.grpc.server.TestApi.GetResponse>specializeCallback(
            done));
        return;
      case 1:
        this.get2(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request,
          com.google.protobuf.RpcUtil.<com.avast.cactus.grpc.server.TestApi.GetResponse>specializeCallback(
            done));
        return;
      case 2:
        this.get3(controller, (com.avast.cactus.grpc.server.TestApi.GetRequest)request,
          com.google.protobuf.RpcUtil.<com.avast.cactus.grpc.server.TestApi.GetResponse>specializeCallback(
            done));
        return;
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
      case 1:
        return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
      case 2:
        return com.avast.cactus.grpc.server.TestApi.GetRequest.getDefaultInstance();
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
      case 1:
        return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
      case 2:
        return com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance();
      default:
        throw new AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.avast.cactus.grpc.server.TestApiService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void get(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request,
        com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.avast.cactus.grpc.server.TestApi.GetResponse.class,
          com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance()));
    }

    public  void get2(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request,
        com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.avast.cactus.grpc.server.TestApi.GetResponse.class,
          com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance()));
    }

    public  void get3(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request,
        com.google.protobuf.RpcCallback<com.avast.cactus.grpc.server.TestApi.GetResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.avast.cactus.grpc.server.TestApi.GetResponse.class,
          com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.avast.cactus.grpc.server.TestApi.GetResponse get(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException;

    public com.avast.cactus.grpc.server.TestApi.GetResponse get2(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException;

    public com.avast.cactus.grpc.server.TestApi.GetResponse get3(
            com.google.protobuf.RpcController controller,
            com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.avast.cactus.grpc.server.TestApi.GetResponse get(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.avast.cactus.grpc.server.TestApi.GetResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance());
    }


    public com.avast.cactus.grpc.server.TestApi.GetResponse get2(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.avast.cactus.grpc.server.TestApi.GetResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance());
    }


    public com.avast.cactus.grpc.server.TestApi.GetResponse get3(
        com.google.protobuf.RpcController controller,
        com.avast.cactus.grpc.server.TestApi.GetRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.avast.cactus.grpc.server.TestApi.GetResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.avast.cactus.grpc.server.TestApi.GetResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:TestApiService)
}

