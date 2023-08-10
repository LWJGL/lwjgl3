/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_socket.txt">NV_stream_socket</a> extension.
 * 
 * <p>These extensions build on the framework for remote streams provided in {@link NVStreamRemote NV_stream_remote} to define a means for two {@code EGLStream} objects
 * representing opposite ends of a single stream to establish communication using a socket. The application is expected to create and connnect both ends
 * of the socket before creating the stream objects.</p>
 * 
 * <p>The base {@code EGL_NV_stream_socket} extension defines most of the attributes required to initialize the stream objects. The
 * {@code EGL_NV_stream_socket_unix} and {@code EGL_NV_stream_socket_inet} extensions indicate support for UNIX domain and internet protocol socket types,
 * respectively. Additional extensions may provide support for other socket types. The type of socket is important, as certain operations are only
 * available with certain types, which may influence how the streams are implemented. For instance, UNIX domain sockets allow file descriptors to be
 * passed between processes, while internet protocol sockets do not. This ability may allow more efficient sharing of resources between the socket
 * endpoints.</p>
 * 
 * <p>An application using this extension will bear some similarity to the example code from the {@link KHRStreamCrossProcessFD KHR_stream_cross_process_fd} extension, which also
 * uses sockets to establish the communication between two processes and then create a pair of {@code EGLStream} objects. The key difference is that in
 * that case, the sockets are merely a temporary means to an end to pass a file descriptor between the processes. Once that is accomplished, the sockets
 * are discarded.</p>
 * 
 * <p>The file descriptor used by that extension may represent an underlying object such as shared memory which allows more efficient communication than the
 * sockets themselves. However, there is nothing preventing an implementation of {@code EGL_NV_stream_socket} from creating and passing such a file
 * descriptor as well, gaining the same efficiency. Therefore, a protocol based on sockets will work at least as well as one based on file descriptors,
 * with the added benefit of being more portable.</p>
 * 
 * <p>Requires {@link NVStreamRemote NV_stream_remote}.</p>
 */
public final class NVStreamSocket {

    /** Accepted by {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and returned by {@link KHRStream#eglQueryStreamKHR QueryStreamKHR} when attribute is {@link NVStreamRemote#EGL_STREAM_PROTOCOL_NV STREAM_PROTOCOL_NV}. */
    public static final int EGL_STREAM_PROTOCOL_SOCKET_NV = 0x324B;

    /** Accepted as attribute names by {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and {@link KHRStream#eglQueryStreamKHR QueryStreamKHR} functions. */
    public static final int
        EGL_SOCKET_HANDLE_NV = 0x324C,
        EGL_SOCKET_TYPE_NV   = 0x324D;

    private NVStreamSocket() {}

}