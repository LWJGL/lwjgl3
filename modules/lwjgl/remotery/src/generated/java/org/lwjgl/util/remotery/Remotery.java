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
 * Bindings to <a href="https://github.com/Celtoys/Remotery">Remotery</a>, a realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in
 * a web browser.
 * 
 * <p>Supported features:</p>
 * 
 * <ul>
 * <li>Lightweight instrumentation of multiple threads running on the CPU and GPU.</li>
 * <li>Web viewer that runs in Chrome, Firefox and Safari; on Desktops, Mobiles or Tablets.</li>
 * <li>GPU UI rendering, bypassing the DOM completely, for real-time 60hz viewer updates at 10,000x the performance.</li>
 * <li>Automatic thread sampler that tells you what processor cores your threads are running on without requiring Administrator privileges.</li>
 * <li>Drop saved traces onto the Remotery window to load historical runs for inspection.</li>
 * <li>Console output for logging text.</li>
 * <li>Console input for sending commands to your game.</li>
 * <li>A Property API for recording named/typed values over time, alongside samples.</li>
 * <li>Profiles itself and shows how it's performing in the viewer.</li>
 * </ul>
 * 
 * <p>Supported Profiling Platforms:</p>
 * 
 * <ul>
 * <li>Windows 7/8/10/11/UWP (Hololens)</li>
 * <li>Linux</li>
 * <li>OSX</li>
 * <li>Android</li>
 * <li>Free BSD</li>
 * </ul>
 * 
 * <p>Supported GPU Profiling APIs:</p>
 * 
 * <ul>
 * <li><s>D3D 11/12</s></li>
 * <li>OpenGL</li>
 * <li><s>CUDA</s></li>
 * <li>Metal</li>
 * </ul>
 * 
 * <p><b>LWJGL</b>: The current version of the Remotery bindings is compatible with commit
 * <a href="https://github.com/Celtoys/Remotery/tree/cc32849f1075154c087fccdfff829662be69a23f/vis">cc32849</a>. Run the following commands to clone the
 * Remotery repository at that commit:</p>
 * 
 * <pre><code>
 * git clone --depth=1 https://github.com/Celtoys/Remotery.git
 * cd Remotery
 * git fetch --depth=1 origin cc32849f1075154c087fccdfff829662be69a23f
 * git branch --no-track lwjgl cc32849f1075154c087fccdfff829662be69a23f
 * git checkout lwjgl
 * git branch -D @{-1}</code></pre>
 * 
 * <p>Now open {@code vis/index.html} in your favorite browser to view the profiler.</p>
 */
public class Remotery {

    static { LibRemotery.initialize(); }

    /** Boolean */
    public static final int RMT_TRUE = 1;

    /** Boolean */
    public static final int RMT_FALSE = 0;

    /**
     * {@code rmtSampleType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMT_SampleType_CPU SampleType_CPU}</li>
     * <li>{@link #RMT_SampleType_CUDA SampleType_CUDA}</li>
     * <li>{@link #RMT_SampleType_D3D11 SampleType_D3D11}</li>
     * <li>{@link #RMT_SampleType_D3D12 SampleType_D3D12}</li>
     * <li>{@link #RMT_SampleType_OpenGL SampleType_OpenGL}</li>
     * <li>{@link #RMT_SampleType_Metal SampleType_Metal}</li>
     * <li>{@link #RMT_SampleType_Count SampleType_Count}</li>
     * </ul>
     */
    public static final int
        RMT_SampleType_CPU    = 0,
        RMT_SampleType_CUDA   = 1,
        RMT_SampleType_D3D11  = 2,
        RMT_SampleType_D3D12  = 3,
        RMT_SampleType_OpenGL = 4,
        RMT_SampleType_Metal  = 5,
        RMT_SampleType_Count  = 6;

    /**
     * All possible error codes ({@code rmtError}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMT_ERROR_NONE ERROR_NONE}</li>
     * <li>{@link #RMT_ERROR_RECURSIVE_SAMPLE ERROR_RECURSIVE_SAMPLE} - Not an error but an internal message to calling code</li>
     * <li>{@link #RMT_ERROR_UNKNOWN ERROR_UNKNOWN} - An error with a message yet to be defined, only for internal error handling</li>
     * <li>{@link #RMT_ERROR_INVALID_INPUT ERROR_INVALID_INPUT} - An invalid input to a function call was provided</li>
     * <li>{@link #RMT_ERROR_RESOURCE_CREATE_FAIL ERROR_RESOURCE_CREATE_FAIL} - Creation of an internal resource failed</li>
     * <li>{@link #RMT_ERROR_RESOURCE_ACCESS_FAIL ERROR_RESOURCE_ACCESS_FAIL} - Access of an internal resource failed</li>
     * <li>{@link #RMT_ERROR_TIMEOUT ERROR_TIMEOUT} - Internal system timeout</li>
     * <li>{@link #RMT_ERROR_MALLOC_FAIL ERROR_MALLOC_FAIL} - Malloc call within remotery failed</li>
     * <li>{@link #RMT_ERROR_TLS_ALLOC_FAIL ERROR_TLS_ALLOC_FAIL} - Attempt to allocate thread local storage failed</li>
     * <li>{@link #RMT_ERROR_VIRTUAL_MEMORY_BUFFER_FAIL ERROR_VIRTUAL_MEMORY_BUFFER_FAIL} - Failed to create a virtual memory mirror buffer</li>
     * <li>{@link #RMT_ERROR_CREATE_THREAD_FAIL ERROR_CREATE_THREAD_FAIL} - Failed to create a thread for the server</li>
     * <li>{@link #RMT_ERROR_OPEN_THREAD_HANDLE_FAIL ERROR_OPEN_THREAD_HANDLE_FAIL} - Failed to open a thread handle, given a thread id</li>
     * <li>{@link #RMT_ERROR_SOCKET_INVALID_POLL ERROR_SOCKET_INVALID_POLL} - Poll attempt on an invalid socket</li>
     * <li>{@link #RMT_ERROR_SOCKET_SELECT_FAIL ERROR_SOCKET_SELECT_FAIL} - Server failed to call select on socket</li>
     * <li>{@link #RMT_ERROR_SOCKET_POLL_ERRORS ERROR_SOCKET_POLL_ERRORS} - Poll notified that the socket has errors</li>
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
        RMT_ERROR_INVALID_INPUT                   = 3,
        RMT_ERROR_RESOURCE_CREATE_FAIL            = 4,
        RMT_ERROR_RESOURCE_ACCESS_FAIL            = 5,
        RMT_ERROR_TIMEOUT                         = 6,
        RMT_ERROR_MALLOC_FAIL                     = 7,
        RMT_ERROR_TLS_ALLOC_FAIL                  = 8,
        RMT_ERROR_VIRTUAL_MEMORY_BUFFER_FAIL      = 9,
        RMT_ERROR_CREATE_THREAD_FAIL              = 10,
        RMT_ERROR_OPEN_THREAD_HANDLE_FAIL         = 11,
        RMT_ERROR_SOCKET_INVALID_POLL             = 12,
        RMT_ERROR_SOCKET_SELECT_FAIL              = 13,
        RMT_ERROR_SOCKET_POLL_ERRORS              = 14,
        RMT_ERROR_SOCKET_SEND_FAIL                = 15,
        RMT_ERROR_SOCKET_RECV_NO_DATA             = 16,
        RMT_ERROR_SOCKET_RECV_TIMEOUT             = 17,
        RMT_ERROR_SOCKET_RECV_FAILED              = 18,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NOT_GET     = 19,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION  = 20,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION = 21,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_HOST     = 22,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST    = 23,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_KEY      = 24,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY     = 25,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL = 26,
        RMT_ERROR_WEBSOCKET_DISCONNECTED          = 27,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER      = 28,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE = 29,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK = 30,
        RMT_ERROR_WEBSOCKET_RECEIVE_TIMEOUT       = 31,
        RMT_ERROR_REMOTERY_NOT_CREATED            = 32,
        RMT_ERROR_SEND_ON_INCOMPLETE_PROFILE      = 33,
        RMT_ERROR_CUDA_DEINITIALIZED              = 34,
        RMT_ERROR_CUDA_NOT_INITIALIZED            = 35,
        RMT_ERROR_CUDA_INVALID_CONTEXT            = 36,
        RMT_ERROR_CUDA_INVALID_VALUE              = 37,
        RMT_ERROR_CUDA_INVALID_HANDLE             = 38,
        RMT_ERROR_CUDA_OUT_OF_MEMORY              = 39,
        RMT_ERROR_ERROR_NOT_READY                 = 40,
        RMT_ERROR_D3D11_FAILED_TO_CREATE_QUERY    = 41,
        RMT_ERROR_OPENGL_ERROR                    = 42,
        RMT_ERROR_CUDA_UNKNOWN                    = 43;

    /**
     * Flags that control property behaviour. ({@code rmtPropertyFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMT_PropertyFlags_NoFlags PropertyFlags_NoFlags}</li>
     * <li>{@link #RMT_PropertyFlags_FrameReset PropertyFlags_FrameReset} - Reset property back to its default value on each new frame.</li>
     * </ul>
     */
    public static final int
        RMT_PropertyFlags_NoFlags    = 0,
        RMT_PropertyFlags_FrameReset = 1;

    /**
     * All possible property types that can be recorded and sent to the viewer. ({@code rmtPropertyType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RMT_PropertyType_rmtGroup PropertyType_rmtGroup}</li>
     * <li>{@link #RMT_PropertyType_rmtBool PropertyType_rmtBool}</li>
     * <li>{@link #RMT_PropertyType_rmtS32 PropertyType_rmtS32}</li>
     * <li>{@link #RMT_PropertyType_rmtU32 PropertyType_rmtU32}</li>
     * <li>{@link #RMT_PropertyType_rmtF32 PropertyType_rmtF32}</li>
     * <li>{@link #RMT_PropertyType_rmtS64 PropertyType_rmtS64}</li>
     * <li>{@link #RMT_PropertyType_rmtU64 PropertyType_rmtU64}</li>
     * <li>{@link #RMT_PropertyType_rmtF64 PropertyType_rmtF64}</li>
     * </ul>
     */
    public static final int
        RMT_PropertyType_rmtGroup = 0,
        RMT_PropertyType_rmtBool  = 1,
        RMT_PropertyType_rmtS32   = 2,
        RMT_PropertyType_rmtU32   = 3,
        RMT_PropertyType_rmtF32   = 4,
        RMT_PropertyType_rmtS64   = 5,
        RMT_PropertyType_rmtU64   = 6,
        RMT_PropertyType_rmtF64   = 7;

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
     * <li>{@link #RMTSF_SendOnClose RMTSF_SendOnClose} - ,
     * Mainly for platforms other than Windows that don't support the thread sampler and can't detect stalling samples.
     * 
     * <p>Where you have a non-root sample that stays open indefinitely and never sends its contents to log/viewer. Send this sample to log/viewer when it
     * closes.  You can not have more than one sample open with this flag on the same thread at a time. This flag will be removed in a future version when all
     * platforms support stalling samples.</p>
     * </li>
     * </ul>
     */
    public static final int
        RMTSF_None        = 0,
        RMTSF_Aggregate   = 1,
        RMTSF_Recursive   = 2,
        RMTSF_Root        = 4,
        RMTSF_SendOnClose = 8;

    protected Remotery() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_GetLastErrorMessage ] ---

    /** Unsafe version of: {@link #rmt_GetLastErrorMessage GetLastErrorMessage} */
    public static native long nrmt_GetLastErrorMessage();

    /** Gets the last error message issued on the calling thread */
    @Nullable
    @NativeType("rmtPStr")
    public static String rmt_GetLastErrorMessage() {
        long __result = nrmt_GetLastErrorMessage();
        return memUTF8Safe(__result);
    }

    // --- [ rmt_Settings ] ---

    /** Unsafe version of: {@link #rmt_Settings Settings} */
    public static native long nrmt_Settings();

    /**
     * Retrieve and configure the global {@code rmtSettings} object.
     * 
     * <p>This can be done before or after Remotery is initialised, however some fields are only referenced on initialisation.</p>
     */
    @Nullable
    @NativeType("rmtSettings *")
    public static RMTSettings rmt_Settings() {
        long __result = nrmt_Settings();
        return RMTSettings.createSafe(__result);
    }

    // --- [ rmt_CreateGlobalInstance ] ---

    /** Unsafe version of: {@link #rmt_CreateGlobalInstance CreateGlobalInstance} */
    public static native int nrmt_CreateGlobalInstance(long remotery);

    /**
     * Initialises Remotery and sets its internal global instance pointer.
     *
     * @param remotery returns the pointer for further use
     */
    @NativeType("rmtError")
    public static int rmt_CreateGlobalInstance(@NativeType("Remotery **") PointerBuffer remotery) {
        if (CHECKS) {
            check(remotery, 1);
        }
        return nrmt_CreateGlobalInstance(memAddress(remotery));
    }

    // --- [ rmt_DestroyGlobalInstance ] ---

    /** Unsafe version of: {@link #rmt_DestroyGlobalInstance DestroyGlobalInstance} */
    public static native void nrmt_DestroyGlobalInstance(long remotery);

    /** Shutsdown Remotery, requiring its pointer to be passed to ensure you are destroying the correct instance. */
    public static void rmt_DestroyGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_DestroyGlobalInstance(remotery);
    }

    // --- [ rmt_SetGlobalInstance ] ---

    /** Unsafe version of: {@link #rmt_SetGlobalInstance SetGlobalInstance} */
    public static native void nrmt_SetGlobalInstance(long remotery);

    /**
     * For use in the presence of DLLs/SOs if each of them are linking Remotery statically.
     * 
     * <p>If Remotery is hosted in its own DLL and linked dynamically then there is no need to use this. Otherwise, pass the result of {@link #rmt_CreateGlobalInstance CreateGlobalInstance}
     * from your main DLL to this in your other DLLs.</p>
     */
    public static void rmt_SetGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_SetGlobalInstance(remotery);
    }

    // --- [ rmt_GetGlobalInstance ] ---

    /** Gets a pointer to the current global Remotery instance. */
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
            stack.nUTF8(thread_name, true);
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
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nrmt_LogText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_BeginCPUSample ] ---

    /** Unsafe version of: {@link #rmt_BeginCPUSample BeginCPUSample} */
    public static native void nrmt_BeginCPUSample(long name, int flags, long hash_cache);

    /**
     * @param flags      one of:<br><table><tr><td>{@link #RMTSF_None}</td><td>{@link #RMTSF_Aggregate}</td><td>{@link #RMTSF_Recursive}</td><td>{@link #RMTSF_Root}</td><td>{@link #RMTSF_SendOnClose}</td></tr></table>
     * @param hash_cache Stores a pointer to a sample name's hash value.
     *                   
     *                   <p>Internally this is used to identify unique callstacks and it would be ideal that it's not recalculated each time the sample is used. This can be
     *                   statically cached at the point of call or stored elsewhere when dynamic names are required.</p>
     *                   
     *                   <p>If {@code NULL} then this call becomes more expensive, as it has to recalculate the hash of the name.</p>
     */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32") int flags, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginCPUSample(memAddress(name), flags, memAddressSafe(hash_cache));
    }

    /**
     * @param flags      one of:<br><table><tr><td>{@link #RMTSF_None}</td><td>{@link #RMTSF_Aggregate}</td><td>{@link #RMTSF_Recursive}</td><td>{@link #RMTSF_Root}</td><td>{@link #RMTSF_SendOnClose}</td></tr></table>
     * @param hash_cache Stores a pointer to a sample name's hash value.
     *                   
     *                   <p>Internally this is used to identify unique callstacks and it would be ideal that it's not recalculated each time the sample is used. This can be
     *                   statically cached at the point of call or stored elsewhere when dynamic names are required.</p>
     *                   
     *                   <p>If {@code NULL} then this call becomes more expensive, as it has to recalculate the hash of the name.</p>
     */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32") int flags, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginCPUSample(nameEncoded, flags, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndCPUSample ] ---

    public static native void rmt_EndCPUSample();

    // --- [ rmt_MarkFrame ] ---

    /**
     * Used for both CPU and GPU profiling.
     * 
     * <p>Essential to call this every frame, ever since D3D12 support was added.</p>
     * 
     * <p>D3D12 Requirements: Don't sample any command lists that begin before this call and end after it</p>
     */
    @NativeType("rmtError")
    public static native int rmt_MarkFrame();

    // --- [ rmt_PropertySnapshotAll ] ---

    /** Sends all properties and their values to the viewer and log to file. */
    @NativeType("rmtError")
    public static native int rmt_PropertySnapshotAll();

    // --- [ rmt_PropertyFrameResetAll ] ---

    /** Resets all {@link #RMT_PropertyFlags_FrameReset PropertyFlags_FrameReset} properties to their default value. */
    public static native void rmt_PropertyFrameResetAll();

    // --- [ rmt_IterateChildren ] ---

    public static native void nrmt_IterateChildren(long iter, long sample);

    public static void rmt_IterateChildren(@NativeType("rmtSampleIterator *") RMTSampleIterator iter, @NativeType("rmtSample *") long sample) {
        nrmt_IterateChildren(iter.address(), sample);
    }

    // --- [ rmt_IterateNext ] ---

    public static native int nrmt_IterateNext(long iter);

    @NativeType("rmtBool")
    public static boolean rmt_IterateNext(@NativeType("rmtSampleIterator *") RMTSampleIterator iter) {
        return nrmt_IterateNext(iter.address()) != 0;
    }

    // --- [ rmt_SampleTreeGetThreadName ] ---

    public static native long nrmt_SampleTreeGetThreadName(long sample_tree);

    @Nullable
    @NativeType("char const *")
    public static String rmt_SampleTreeGetThreadName(@NativeType("rmtSampleTree *") long sample_tree) {
        if (CHECKS) {
            check(sample_tree);
        }
        long __result = nrmt_SampleTreeGetThreadName(sample_tree);
        return memUTF8Safe(__result);
    }

    // --- [ rmt_SampleTreeGetRootSample ] ---

    public static native long nrmt_SampleTreeGetRootSample(long sample_tree);

    @NativeType("rmtSample *")
    public static long rmt_SampleTreeGetRootSample(@NativeType("rmtSampleTree *") long sample_tree) {
        if (CHECKS) {
            check(sample_tree);
        }
        return nrmt_SampleTreeGetRootSample(sample_tree);
    }

    // --- [ rmt_SampleGetName ] ---

    /** Unsafe version of: {@link #rmt_SampleGetName SampleGetName} */
    public static native long nrmt_SampleGetName(long sample);

    /** Should only called from within the sample tree callback, when the internal string lookup table is valid (i.e. on the main Remotery thread). */
    @Nullable
    @NativeType("char const *")
    public static String rmt_SampleGetName(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        long __result = nrmt_SampleGetName(sample);
        return memUTF8Safe(__result);
    }

    // --- [ rmt_SampleGetNameHash ] ---

    public static native int nrmt_SampleGetNameHash(long sample);

    @NativeType("rmtU32")
    public static int rmt_SampleGetNameHash(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetNameHash(sample);
    }

    // --- [ rmt_SampleGetCallCount ] ---

    public static native int nrmt_SampleGetCallCount(long sample);

    @NativeType("rmtU32")
    public static int rmt_SampleGetCallCount(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetCallCount(sample);
    }

    // --- [ rmt_SampleGetStart ] ---

    public static native long nrmt_SampleGetStart(long sample);

    @NativeType("rmtU64")
    public static long rmt_SampleGetStart(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetStart(sample);
    }

    // --- [ rmt_SampleGetTime ] ---

    public static native long nrmt_SampleGetTime(long sample);

    @NativeType("rmtU64")
    public static long rmt_SampleGetTime(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetTime(sample);
    }

    // --- [ rmt_SampleGetSelfTime ] ---

    public static native long nrmt_SampleGetSelfTime(long sample);

    @NativeType("rmtU64")
    public static long rmt_SampleGetSelfTime(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetSelfTime(sample);
    }

    // --- [ rmt_SampleGetColour ] ---

    public static native void nrmt_SampleGetColour(long sample, long r, long g, long b);

    public static void rmt_SampleGetColour(@NativeType("rmtSample *") long sample, @NativeType("rmtU8 *") ByteBuffer r, @NativeType("rmtU8 *") ByteBuffer g, @NativeType("rmtU8 *") ByteBuffer b) {
        if (CHECKS) {
            check(sample);
            check(r, 1);
            check(g, 1);
            check(b, 1);
        }
        nrmt_SampleGetColour(sample, memAddress(r), memAddress(g), memAddress(b));
    }

    // --- [ rmt_SampleGetType ] ---

    public static native int nrmt_SampleGetType(long sample);

    @NativeType("rmtSampleType")
    public static int rmt_SampleGetType(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetType(sample);
    }

    // --- [ rmt_PropertyIterateChildren ] ---

    public static native void nrmt_PropertyIterateChildren(long iter, long sample);

    public static void rmt_PropertyIterateChildren(@NativeType("rmtPropertyIterator *") RMTPropertyIterator iter, @Nullable @NativeType("rmtProperty *") RMTProperty sample) {
        nrmt_PropertyIterateChildren(iter.address(), memAddressSafe(sample));
    }

    // --- [ rmt_PropertyIterateNext ] ---

    public static native int nrmt_PropertyIterateNext(long iter);

    @NativeType("rmtBool")
    public static boolean rmt_PropertyIterateNext(@NativeType("rmtPropertyIterator *") RMTPropertyIterator iter) {
        return nrmt_PropertyIterateNext(iter.address()) != 0;
    }

    // --- [ rmt_PropertyGetType ] ---

    public static native int nrmt_PropertyGetType(long property);

    @NativeType("rmtPropertyType")
    public static int rmt_PropertyGetType(@NativeType("rmtProperty *") RMTProperty property) {
        return nrmt_PropertyGetType(property.address());
    }

    // --- [ rmt_PropertyGetName ] ---

    public static native long nrmt_PropertyGetName(long property);

    @Nullable
    @NativeType("char const *")
    public static String rmt_PropertyGetName(@NativeType("rmtProperty *") RMTProperty property) {
        long __result = nrmt_PropertyGetName(property.address());
        return memUTF8Safe(__result);
    }

    // --- [ rmt_PropertyGetDescription ] ---

    public static native long nrmt_PropertyGetDescription(long property);

    @Nullable
    @NativeType("char const *")
    public static String rmt_PropertyGetDescription(@NativeType("rmtProperty *") RMTProperty property) {
        long __result = nrmt_PropertyGetDescription(property.address());
        return memUTF8Safe(__result);
    }

    // --- [ rmt_PropertyGetValue ] ---

    public static native void nrmt_PropertyGetValue(long property, long __result);

    @NativeType("rmtPropertyValue")
    public static RMTPropertyValue rmt_PropertyGetValue(@NativeType("rmtProperty *") RMTProperty property, @NativeType("rmtPropertyValue") RMTPropertyValue __result) {
        nrmt_PropertyGetValue(property.address(), __result.address());
        return __result;
    }

    // --- [ _rmt_PropertySetValue ] ---

    public static native void n_rmt_PropertySetValue(long property);

    public static void _rmt_PropertySetValue(@NativeType("rmtProperty *") RMTProperty property) {
        n_rmt_PropertySetValue(property.address());
    }

    // --- [ _rmt_PropertyAddValue ] ---

    public static native void n_rmt_PropertyAddValue(long property, long add_value);

    public static void _rmt_PropertyAddValue(@NativeType("rmtProperty *") RMTProperty property, @NativeType("rmtPropertyValue") RMTPropertyValue add_value) {
        n_rmt_PropertyAddValue(property.address(), add_value.address());
    }

    // --- [ _rmt_HashString32 ] ---

    public static native int n_rmt_HashString32(long s, int len, int seed);

    @NativeType("rmtU32")
    public static int _rmt_HashString32(@NativeType("char const *") ByteBuffer s, int len, @NativeType("rmtU32") int seed) {
        if (CHECKS) {
            checkNT1(s);
        }
        return n_rmt_HashString32(memAddress(s), len, seed);
    }

    @NativeType("rmtU32")
    public static int _rmt_HashString32(@NativeType("char const *") CharSequence s, int len, @NativeType("rmtU32") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            return n_rmt_HashString32(sEncoded, len, seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Initializes the {@code __result} {@code RMTProperty} with the specified values.
     *
     * <p>This method does not allocate any memory.</p>
     *
     * @return the initialized property
     */
    public static RMTProperty rmt_PropertyDefine(int type, int flags, RMTPropertyValue default_value, ByteBuffer name, ByteBuffer desc, @Nullable RMTProperty parent, RMTProperty __result) {
        return __result
            .initialised(false)
            .type(type)
            .flags(flags)
            .value(default_value)
            .lastFrameValue(default_value)
            .prevValue(default_value)
            .prevValueFrame(0)
            .name(name)
            .description(desc)
            .defaultValue(default_value)
            .parent(parent)
            .firstChild(null)
            .lastChild(null)
            .nextSibling(null)
            .nameHash(0)
            .uniqueID(0);
    }

    /**
     * Uses the specified {@code MemoryStack} frame to encode the {@code name} and {@code desc} strings and allocate memory for a new {@code RMTProperty}, then
     * initializes the property with the specified values.
     *
     * @return the new property
     */
    public static RMTProperty rmt_PropertyDefine(int type, int flags, RMTPropertyValue default_value, String name, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return RMTProperty.malloc(frame)
            .initialised(false)
            .type(type)
            .flags(flags)
            .value(default_value)
            .lastFrameValue(default_value)
            .prevValue(default_value)
            .prevValueFrame(0)
            .name(frame.UTF8(name))
            .description(frame.UTF8(desc))
            .defaultValue(default_value)
            .parent(parent)
            .firstChild(null)
            .lastChild(null)
            .nextSibling(null)
            .nameHash(0)
            .uniqueID(0);
    }

    private static final RMTPropertyValue NULL_VALUE = RMTPropertyValue.create();

    /**
     * Allocates a new group property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new group property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_Group(String name, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return rmt_PropertyDefine(RMT_PropertyType_rmtGroup, RMT_PropertyFlags_NoFlags, NULL_VALUE, name, desc, parent, frame);
    }

    private static final RMTPropertyValue FALSE = RMTPropertyValue.create().Bool(false);
    private static final RMTPropertyValue TRUE  = RMTPropertyValue.create().Bool(true);

    /**
     * Allocates a new boolean property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new boolean property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_Bool(String name, boolean default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return rmt_PropertyDefine(RMT_PropertyType_rmtBool, flags, default_value ? TRUE : FALSE, name, desc, parent, frame);
    }

    /**
     * Allocates a new S32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new S32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_S32(String name, int default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtS32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .S32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new U32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new U32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_U32(String name, int default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtU32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .U32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new F32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new F32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_F32(String name, float default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtF32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .F32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new S64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new S64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_S64(String name, long default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtS64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .S64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new U64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new U64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_U64(String name, long default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtU64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .U64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new F64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new F64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_F64(String name, double default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtF64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .F64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    public static void rmt_PropertySet_Bool(RMTProperty property, boolean value) {
        property.value().Bool(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_S32(RMTProperty property, int value) {
        property.value().S32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_U32(RMTProperty property, int value) {
        property.value().U32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_F32(RMTProperty property, float value) {
        property.value().F32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_S64(RMTProperty property, long value) {
        property.value().S64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_U64(RMTProperty property, long value) {
        property.value().U64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_F64(RMTProperty property, double value) {
        property.value().F64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertyAdd_S32(RMTProperty property, int add_value, MemoryStack frame) {
        rmt_PropertyAdd_S32(property, RMTPropertyValue.malloc(frame).S32(add_value));
    }
    public static void rmt_PropertyAdd_S32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().S32(property.value().S32() + add_value.S32());
        _rmt_PropertyAddValue(property, add_value);
    }
    
    public static void rmt_PropertyAdd_U32(RMTProperty property, int add_value, MemoryStack frame) {
        rmt_PropertyAdd_U32(property, RMTPropertyValue.malloc(frame).U32(add_value));
    }
    public static void rmt_PropertyAdd_U32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().U32(property.value().U32() + add_value.U32());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_F32(RMTProperty property, float add_value, MemoryStack frame) {
        rmt_PropertyAdd_F32(property, RMTPropertyValue.malloc(frame).F32(add_value));
    }
    public static void rmt_PropertyAdd_F32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().F32(property.value().F32() + add_value.F32());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_S64(RMTProperty property, long add_value, MemoryStack frame) {
        rmt_PropertyAdd_S64(property, RMTPropertyValue.malloc(frame).S64(add_value));
    }
    public static void rmt_PropertyAdd_S64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().S64(property.value().S64() + add_value.S64());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_U64(RMTProperty property, long add_value, MemoryStack frame) {
        rmt_PropertyAdd_U64(property, RMTPropertyValue.malloc(frame).U64(add_value));
    }
    public static void rmt_PropertyAdd_U64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().U64(property.value().U64() + add_value.U64());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_F64(RMTProperty property, double add_value, MemoryStack frame) {
        rmt_PropertyAdd_F64(property, RMTPropertyValue.malloc(frame).F64(add_value));
    }
    public static void rmt_PropertyAdd_F64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().F64(property.value().F64() + add_value.F64());
        _rmt_PropertyAddValue(property, add_value);
    }

}