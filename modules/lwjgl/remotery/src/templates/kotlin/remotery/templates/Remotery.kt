/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery.templates

import org.lwjgl.generator.*
import remotery.*

// Prefixed with an underscore to avoid a nameclash with the Remotery type
val _Remotery = "Remotery".nativeClass(Module.REMOTERY, prefix = "RMT_") {
    remoteryIncludes("c")

    documentation =
        """
        Bindings to ${url("https://github.com/Celtoys/Remotery", "Remotery")}, a realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in
        a web browser.

        Supported features:
        ${ul(
            "Lightweight instrumentation of multiple threads running on the CPU.",
            "Web viewer that runs in Chrome, Firefox and Safari. Custom WebSockets server transmits sample data to the browser on a latent thread.",
            "Profiles itself and shows how it's performing in the viewer.",
            "Can optionally sample CUDA/D3D11/OpenGL GPU activity.",
            "Console output for logging text.",
            "Console input for sending commands to your game."
        )}
        """

    EnumConstant(
        "All possible error codes ({@code rmtError}).",

        "ERROR_NONE".enum,
        "ERROR_RECURSIVE_SAMPLE".enum("Not an error but an internal message to calling code"),
        "ERROR_UNKNOWN".enum("An error with a message yet to be defined, only for internal error handling"),

        // System errors
        "ERROR_MALLOC_FAIL".enum("Malloc call within remotery failed"),
        "ERROR_TLS_ALLOC_FAIL".enum("Attempt to allocate thread local storage failed"),
        "ERROR_VIRTUAL_MEMORY_BUFFER_FAIL".enum("Failed to create a virtual memory mirror buffer"),
        "ERROR_CREATE_THREAD_FAIL".enum("Failed to create a thread for the server"),
        "ERROR_OPEN_THREAD_HANDLE_FAIL".enum("Failed to open a thread handle, given a thread id"),

        // Network TCP/IP socket errors
        "ERROR_SOCKET_INIT_NETWORK_FAIL".enum("Network initialisation failure (e.g. on Win32, WSAStartup fails)"),
        "ERROR_SOCKET_CREATE_FAIL".enum("Can't create a socket for connection to the remote viewer"),
        "ERROR_SOCKET_BIND_FAIL".enum("Can't bind a socket for the server"),
        "ERROR_SOCKET_LISTEN_FAIL".enum("Created server socket failed to enter a listen state"),
        "ERROR_SOCKET_SET_NON_BLOCKING_FAIL".enum("Created server socket failed to switch to a non-blocking state"),
        "ERROR_SOCKET_INVALID_POLL".enum("Poll attempt on an invalid socket"),
        "ERROR_SOCKET_SELECT_FAIL".enum("Server failed to call select on socket"),
        "ERROR_SOCKET_POLL_ERRORS".enum("Poll notified that the socket has errors"),
        "ERROR_SOCKET_ACCEPT_FAIL".enum("Server failed to accept connection from client"),
        "ERROR_SOCKET_SEND_TIMEOUT".enum("Timed out trying to send data"),
        "ERROR_SOCKET_SEND_FAIL".enum("Unrecoverable error occured while client/server tried to send data"),
        "ERROR_SOCKET_RECV_NO_DATA".enum("No data available when attempting a receive"),
        "ERROR_SOCKET_RECV_TIMEOUT".enum("Timed out trying to receive data"),
        "ERROR_SOCKET_RECV_FAILED".enum("Unrecoverable error occured while client/server tried to receive data"),

        // WebSocket errors
        "ERROR_WEBSOCKET_HANDSHAKE_NOT_GET".enum("WebSocket server handshake failed, not HTTP GET"),
        "ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION".enum("WebSocket server handshake failed, can't locate WebSocket version"),
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION".enum("WebSocket server handshake failed, unsupported WebSocket version"),
        "ERROR_WEBSOCKET_HANDSHAKE_NO_HOST".enum("WebSocket server handshake failed, can't locate host"),
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST".enum("WebSocket server handshake failed, host is not allowed to connect"),
        "ERROR_WEBSOCKET_HANDSHAKE_NO_KEY".enum("WebSocket server handshake failed, can't locate WebSocket key"),
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY".enum("WebSocket server handshake failed, WebSocket key is ill-formed"),
        "ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL".enum("WebSocket server handshake failed, internal error, bad string code"),
        "ERROR_WEBSOCKET_DISCONNECTED".enum("WebSocket server received a disconnect request and closed the socket"),
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER".enum("Couldn't parse WebSocket frame header"),
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE".enum("Partially received wide frame header size"),
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK".enum("Partially received frame header data mask"),
        "ERROR_WEBSOCKET_RECEIVE_TIMEOUT".enum("Timeout receiving frame header"),

        "ERROR_REMOTERY_NOT_CREATED".enum("Remotery object has not been created"),
        "ERROR_SEND_ON_INCOMPLETE_PROFILE".enum("An attempt was made to send an in,complete profile tree to the client"),

        // CUDA error messages
        "ERROR_CUDA_DEINITIALIZED".enum("This indicates that the CUDA driver is in the process of shutting down"),
        "ERROR_CUDA_NOT_INITIALIZED".enum("This indicates that the CUDA driver has not been initialized with cuInit() or that initialization has failed"),
        "ERROR_CUDA_INVALID_CONTEXT".enum("This most frequently indicates that there is no context bound to the current thread"),
        "ERROR_CUDA_INVALID_VALUE".enum("This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values"),
        "ERROR_CUDA_INVALID_HANDLE".enum("This indicates that a resource handle passed to the API call was not valid"),
        "ERROR_CUDA_OUT_OF_MEMORY".enum("The API call failed because it was unable to allocate enough memory to perform the requested operation"),
        "ERROR_ERROR_NOT_READY".enum("This indicates that a resource handle passed to the API call was not valid"),

        // Direct3D 11 error messages
        "ERROR_D3D11_FAILED_TO_CREATE_QUERY".enum("Failed to create query for sample"),

        // OpenGL error messages
        "ERROR_OPENGL_ERROR".enum("Generic OpenGL error, no need to expose detail since app will need an OpenGL error callback registered"),

        "ERROR_CUDA_UNKNOWN".enum
    )

    val rmtSampleFlags = EnumConstant(
        "{@code rmtSampleFlags}",

        "RMTSF_None".enum("Default behaviour", "0"),
        "RMTSF_Aggregate".enum("Search parent for same-named samples and merge timing instead of adding a new sample", "1"),
        "RMTSF_Recursive".enum("Merge sample with parent if it's the same sample", "2"),
        "RMTSF_Root".enum(
            """
            Set this flag on any of your root samples so that Remotery will assert if it ends up <b>not</b> being the root sample.
    
            This will quickly allow you to detect {@code Begin}/{@code End} mismatches causing a sample tree imbalance.
            """,
            "4"
        )
    ).noPrefix().javaDocLinks

    rmtSettings.p("Settings", "", void())

    rmtError(
        "CreateGlobalInstance",
        "",

        Check(1)..Remotery.p.p("remotery", "")
    )

    void(
        "DestroyGlobalInstance",
        "",

        Remotery.p("remotery", "")
    )

    void(
        "SetGlobalInstance",
        "",

        Remotery.p("remotery", "")
    )

    Remotery.p("GetGlobalInstance", "", void())

    void(
        "SetCurrentThreadName",
        "",

        rmtPStr("thread_name", "")
    )

    void(
        "LogText",
        "",

        rmtPStr("text", "")
    )

    Code(
        nativeCall = "${t}_rmt_BeginCPUSample(name, flags, hash_cache);"
    )..void(
        "BeginCPUSample",
        "",

        rmtPStr("name", ""),
        rmtU32("flags", "", rmtSampleFlags),
        Check(1)..nullable..rmtU32.p("hash_cache", "")
    )

    void(
        "EndCPUSample",
        ""
    )
}