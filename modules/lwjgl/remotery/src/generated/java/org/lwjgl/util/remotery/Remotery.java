/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a target="_blank" href="https://github.com/Celtoys/Remotery">Remotery</a>, a realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in
 * a web browser.
 * 
 * <p>Supported features:</p>
 * 
 * <ul>
 * <li>Lightweight instrumentation of multiple threads running on the CPU.</li>
 * <li>Web viewer that runs in Chrome, Firefox and Safari. Custom WebSockets server transmits sample data to the browser on a latent thread.</li>
 * <li>Profiles itself and shows how it's performing in the viewer.</li>
 * <li>Can optionally sample CUDA/D3D11/OpenGL GPU activity.</li>
 * <li>Console output for logging text.</li>
 * <li>Console input for sending commands to your game.</li>
 * </ul>
 */
public class Remotery {

    static { LibRemotery.initialize(); }

    /**
     * All possible error codes ({@code rmtError}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMT_ERROR_NONE ERROR_NONE}</li>
     * <li>{@link #RMT_ERROR_RECURSIVE_SAMPLE ERROR_RECURSIVE_SAMPLE} - Not an error but an internal message to calling code</li>
     * <li>{@link #RMT_ERROR_UNKNOWN ERROR_UNKNOWN} - An error with a message yet to be defined, only for internal error handling</li>
     * <li>{@link #RMT_ERROR_MALLOC_FAIL ERROR_MALLOC_FAIL} - Malloc call within remotery failed</li>
     * <li>{@link #RMT_ERROR_TLS_ALLOC_FAIL ERROR_TLS_ALLOC_FAIL} - Attempt to allocate thread local storage failed</li>
     * <li>{@link #RMT_ERROR_VIRTUAL_MEMORY_BUFFER_FAIL ERROR_VIRTUAL_MEMORY_BUFFER_FAIL} - Failed to create a virtual memory mirror buffer</li>
     * <li>{@link #RMT_ERROR_CREATE_THREAD_FAIL ERROR_CREATE_THREAD_FAIL} - Failed to create a thread for the server</li>
     * <li>{@link #RMT_ERROR_OPEN_THREAD_HANDLE_FAIL ERROR_OPEN_THREAD_HANDLE_FAIL} - Failed to open a thread handle, given a thread id</li>
     * <li>{@link #RMT_ERROR_SOCKET_INIT_NETWORK_FAIL ERROR_SOCKET_INIT_NETWORK_FAIL} - Network initialisation failure (e.g. on Win32, WSAStartup fails)</li>
     * <li>{@link #RMT_ERROR_SOCKET_CREATE_FAIL ERROR_SOCKET_CREATE_FAIL} - Can't create a socket for connection to the remote viewer</li>
     * <li>{@link #RMT_ERROR_SOCKET_BIND_FAIL ERROR_SOCKET_BIND_FAIL} - Can't bind a socket for the server</li>
     * <li>{@link #RMT_ERROR_SOCKET_LISTEN_FAIL ERROR_SOCKET_LISTEN_FAIL} - Created server socket failed to enter a listen state</li>
     * <li>{@link #RMT_ERROR_SOCKET_SET_NON_BLOCKING_FAIL ERROR_SOCKET_SET_NON_BLOCKING_FAIL} - Created server socket failed to switch to a non-blocking state</li>
     * <li>{@link #RMT_ERROR_SOCKET_INVALID_POLL ERROR_SOCKET_INVALID_POLL} - Poll attempt on an invalid socket</li>
     * <li>{@link #RMT_ERROR_SOCKET_SELECT_FAIL ERROR_SOCKET_SELECT_FAIL} - Server failed to call select on socket</li>
     * <li>{@link #RMT_ERROR_SOCKET_POLL_ERRORS ERROR_SOCKET_POLL_ERRORS} - Poll notified that the socket has errors</li>
     * <li>{@link #RMT_ERROR_SOCKET_ACCEPT_FAIL ERROR_SOCKET_ACCEPT_FAIL} - Server failed to accept connection from client</li>
     * <li>{@link #RMT_ERROR_SOCKET_SEND_TIMEOUT ERROR_SOCKET_SEND_TIMEOUT} - Timed out trying to send data</li>
     * <li>{@link #RMT_ERROR_SOCKET_SEND_FAIL ERROR_SOCKET_SEND_FAIL} - Unrecoverable error occured while client/server tried to send data</li>
     * <li>{@link #RMT_ERROR_SOCKET_RECV_NO_DATA ERROR_SOCKET_RECV_NO_DATA} - No data available when attempting a receive</li>
     * <li>{@link #RMT_ERROR_SOCKET_RECV_TIMEOUT ERROR_SOCKET_RECV_TIMEOUT} - Timed out trying to receive data</li>
     * <li>{@link #RMT_ERROR_SOCKET_RECV_FAILED ERROR_SOCKET_RECV_FAILED} - Unrecoverable error occured while client/server tried to receive data</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_NOT_GET ERROR_WEBSOCKET_HANDSHAKE_NOT_GET} - WebSocket server handshake failed, not HTTP GET</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION} - WebSocket server handshake failed, can't locate WebSocket version</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION} - WebSocket server handshake failed, unsupported WebSocket version</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_HOST ERROR_WEBSOCKET_HANDSHAKE_NO_HOST} - WebSocket server handshake failed, can't locate host</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST} - WebSocket server handshake failed, host is not allowed to connect</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_KEY ERROR_WEBSOCKET_HANDSHAKE_NO_KEY} - WebSocket server handshake failed, can't locate WebSocket key</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY} - WebSocket server handshake failed, WebSocket key is ill-formed</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL} - WebSocket server handshake failed, internal error, bad string code</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_DISCONNECTED ERROR_WEBSOCKET_DISCONNECTED} - WebSocket server received a disconnect request and closed the socket</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER ERROR_WEBSOCKET_BAD_FRAME_HEADER} - Couldn't parse WebSocket frame header</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE} - Partially received wide frame header size</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK} - Partially received frame header data mask</li>
     * <li>{@link #RMT_ERROR_WEBSOCKET_RECEIVE_TIMEOUT ERROR_WEBSOCKET_RECEIVE_TIMEOUT} - Timeout receiving frame header</li>
     * <li>{@link #RMT_ERROR_REMOTERY_NOT_CREATED ERROR_REMOTERY_NOT_CREATED} - Remotery object has not been created</li>
     * <li>{@link #RMT_ERROR_SEND_ON_INCOMPLETE_PROFILE ERROR_SEND_ON_INCOMPLETE_PROFILE} - An attempt was made to send an in,complete profile tree to the client</li>
     * <li>{@link #RMT_ERROR_CUDA_DEINITIALIZED ERROR_CUDA_DEINITIALIZED} - This indicates that the CUDA driver is in the process of shutting down</li>
     * <li>{@link #RMT_ERROR_CUDA_NOT_INITIALIZED ERROR_CUDA_NOT_INITIALIZED} - This indicates that the CUDA driver has not been initialized with cuInit() or that initialization has failed</li>
     * <li>{@link #RMT_ERROR_CUDA_INVALID_CONTEXT ERROR_CUDA_INVALID_CONTEXT} - This most frequently indicates that there is no context bound to the current thread</li>
     * <li>{@link #RMT_ERROR_CUDA_INVALID_VALUE ERROR_CUDA_INVALID_VALUE} - This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values</li>
     * <li>{@link #RMT_ERROR_CUDA_INVALID_HANDLE ERROR_CUDA_INVALID_HANDLE} - This indicates that a resource handle passed to the API call was not valid</li>
     * <li>{@link #RMT_ERROR_CUDA_OUT_OF_MEMORY ERROR_CUDA_OUT_OF_MEMORY} - The API call failed because it was unable to allocate enough memory to perform the requested operation</li>
     * <li>{@link #RMT_ERROR_ERROR_NOT_READY ERROR_ERROR_NOT_READY} - This indicates that a resource handle passed to the API call was not valid</li>
     * <li>{@link #RMT_ERROR_D3D11_FAILED_TO_CREATE_QUERY ERROR_D3D11_FAILED_TO_CREATE_QUERY} - Failed to create query for sample</li>
     * <li>{@link #RMT_ERROR_OPENGL_ERROR ERROR_OPENGL_ERROR} - Generic OpenGL error, no need to expose detail since app will need an OpenGL error callback registered</li>
     * <li>{@link #RMT_ERROR_CUDA_UNKNOWN ERROR_CUDA_UNKNOWN}</li>
     * </ul>
     */
    public static final int
        RMT_ERROR_NONE                            = 0,
        RMT_ERROR_RECURSIVE_SAMPLE                = 1,
        RMT_ERROR_UNKNOWN                         = 2,
        RMT_ERROR_MALLOC_FAIL                     = 3,
        RMT_ERROR_TLS_ALLOC_FAIL                  = 4,
        RMT_ERROR_VIRTUAL_MEMORY_BUFFER_FAIL      = 5,
        RMT_ERROR_CREATE_THREAD_FAIL              = 6,
        RMT_ERROR_OPEN_THREAD_HANDLE_FAIL         = 7,
        RMT_ERROR_SOCKET_INIT_NETWORK_FAIL        = 8,
        RMT_ERROR_SOCKET_CREATE_FAIL              = 9,
        RMT_ERROR_SOCKET_BIND_FAIL                = 10,
        RMT_ERROR_SOCKET_LISTEN_FAIL              = 11,
        RMT_ERROR_SOCKET_SET_NON_BLOCKING_FAIL    = 12,
        RMT_ERROR_SOCKET_INVALID_POLL             = 13,
        RMT_ERROR_SOCKET_SELECT_FAIL              = 14,
        RMT_ERROR_SOCKET_POLL_ERRORS              = 15,
        RMT_ERROR_SOCKET_ACCEPT_FAIL              = 16,
        RMT_ERROR_SOCKET_SEND_TIMEOUT             = 17,
        RMT_ERROR_SOCKET_SEND_FAIL                = 18,
        RMT_ERROR_SOCKET_RECV_NO_DATA             = 19,
        RMT_ERROR_SOCKET_RECV_TIMEOUT             = 20,
        RMT_ERROR_SOCKET_RECV_FAILED              = 21,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NOT_GET     = 22,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION  = 23,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION = 24,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_HOST     = 25,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST    = 26,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_KEY      = 27,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY     = 28,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL = 29,
        RMT_ERROR_WEBSOCKET_DISCONNECTED          = 30,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER      = 31,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE = 32,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK = 33,
        RMT_ERROR_WEBSOCKET_RECEIVE_TIMEOUT       = 34,
        RMT_ERROR_REMOTERY_NOT_CREATED            = 35,
        RMT_ERROR_SEND_ON_INCOMPLETE_PROFILE      = 36,
        RMT_ERROR_CUDA_DEINITIALIZED              = 37,
        RMT_ERROR_CUDA_NOT_INITIALIZED            = 38,
        RMT_ERROR_CUDA_INVALID_CONTEXT            = 39,
        RMT_ERROR_CUDA_INVALID_VALUE              = 40,
        RMT_ERROR_CUDA_INVALID_HANDLE             = 41,
        RMT_ERROR_CUDA_OUT_OF_MEMORY              = 42,
        RMT_ERROR_ERROR_NOT_READY                 = 43,
        RMT_ERROR_D3D11_FAILED_TO_CREATE_QUERY    = 44,
        RMT_ERROR_OPENGL_ERROR                    = 45,
        RMT_ERROR_CUDA_UNKNOWN                    = 46;

    /**
     * {@code rmtSampleFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMTSF_None RMTSF_None} - Default behaviour</li>
     * <li>{@link #RMTSF_Aggregate RMTSF_Aggregate} - Search parent for same-named samples and merge timing instead of adding a new sample</li>
     * <li>{@link #RMTSF_Recursive RMTSF_Recursive} - Merge sample with parent if it's the same sample</li>
     * <li>{@link #RMTSF_Root RMTSF_Root} - 
     * Set this flag on any of your root samples so that Remotery will assert if it ends up <b>not</b> being the root sample.
     * 
     * <p>This will quickly allow you to detect {@code Begin}/{@code End} mismatches causing a sample tree imbalance.</p>
     * </li>
     * </ul>
     */
    public static final int
        RMTSF_None      = 0,
        RMTSF_Aggregate = 1,
        RMTSF_Recursive = 2,
        RMTSF_Root      = 4;

    protected Remotery() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_Settings ] ---

    public static native long nrmt_Settings();

    @Nullable
    @NativeType("rmtSettings *")
    public static RMTSettings rmt_Settings() {
        long __result = nrmt_Settings();
        return RMTSettings.createSafe(__result);
    }

    // --- [ rmt_CreateGlobalInstance ] ---

    public static native int nrmt_CreateGlobalInstance(long remotery);

    @NativeType("rmtError")
    public static int rmt_CreateGlobalInstance(@NativeType("Remotery **") PointerBuffer remotery) {
        if (CHECKS) {
            check(remotery, 1);
        }
        return nrmt_CreateGlobalInstance(memAddress(remotery));
    }

    // --- [ rmt_DestroyGlobalInstance ] ---

    public static native void nrmt_DestroyGlobalInstance(long remotery);

    public static void rmt_DestroyGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_DestroyGlobalInstance(remotery);
    }

    // --- [ rmt_SetGlobalInstance ] ---

    public static native void nrmt_SetGlobalInstance(long remotery);

    public static void rmt_SetGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_SetGlobalInstance(remotery);
    }

    // --- [ rmt_GetGlobalInstance ] ---

    @NativeType("Remotery *")
    public static native long rmt_GetGlobalInstance();

    // --- [ rmt_SetCurrentThreadName ] ---

    public static native void nrmt_SetCurrentThreadName(long thread_name);

    public static void rmt_SetCurrentThreadName(@NativeType("rmtPStr") ByteBuffer thread_name) {
        if (CHECKS) {
            checkNT1(thread_name);
        }
        nrmt_SetCurrentThreadName(memAddress(thread_name));
    }

    public static void rmt_SetCurrentThreadName(@NativeType("rmtPStr") CharSequence thread_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(thread_name, true);
            long thread_nameEncoded = stack.getPointerAddress();
            nrmt_SetCurrentThreadName(thread_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_LogText ] ---

    public static native void nrmt_LogText(long text);

    public static void rmt_LogText(@NativeType("rmtPStr") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nrmt_LogText(memAddress(text));
    }

    public static void rmt_LogText(@NativeType("rmtPStr") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            nrmt_LogText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_BeginCPUSample ] ---

    /** Unsafe version of: {@link #rmt_BeginCPUSample BeginCPUSample} */
    public static native void nrmt_BeginCPUSample(long name, int flags, long hash_cache);

    /** @param flags one of:<br><table><tr><td>{@link #RMTSF_None}</td><td>{@link #RMTSF_Aggregate}</td><td>{@link #RMTSF_Recursive}</td><td>{@link #RMTSF_Root}</td></tr></table> */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32") int flags, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginCPUSample(memAddress(name), flags, memAddressSafe(hash_cache));
    }

    /** @param flags one of:<br><table><tr><td>{@link #RMTSF_None}</td><td>{@link #RMTSF_Aggregate}</td><td>{@link #RMTSF_Recursive}</td><td>{@link #RMTSF_Root}</td></tr></table> */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32") int flags, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginCPUSample(nameEncoded, flags, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndCPUSample ] ---

    public static native void rmt_EndCPUSample();

}