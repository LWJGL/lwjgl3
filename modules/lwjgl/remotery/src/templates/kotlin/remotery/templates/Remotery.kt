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

    val COMMIT = "cc32849f1075154c087fccdfff829662be69a23f"
    documentation =
        """
        Bindings to ${url("https://github.com/Celtoys/Remotery", "Remotery")}, a realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in
        a web browser.

        Supported features:
        ${ul(
            "Lightweight instrumentation of multiple threads running on the CPU and GPU.",
            "Web viewer that runs in Chrome, Firefox and Safari; on Desktops, Mobiles or Tablets.",
            "GPU UI rendering, bypassing the DOM completely, for real-time 60hz viewer updates at 10,000x the performance.",
            "Automatic thread sampler that tells you what processor cores your threads are running on without requiring Administrator privileges.",
            "Drop saved traces onto the Remotery window to load historical runs for inspection.",
            "Console output for logging text.",
            "Console input for sending commands to your game.",
            "A Property API for recording named/typed values over time, alongside samples.",
            "Profiles itself and shows how it's performing in the viewer."
        )}

        Supported Profiling Platforms:
        ${ul(
            "Windows 7/8/10/11/UWP (Hololens)",
            "Linux",
            "OSX",
            "Android",
            "Free BSD"
        )}

        Supported GPU Profiling APIs:
        ${ul(
            "<s>D3D 11/12</s>",
            "OpenGL",
            "<s>CUDA</s>",
            "Metal"
        )}

        <b>LWJGL</b>: The current version of the Remotery bindings is compatible with commit
        <a href="https://github.com/Celtoys/Remotery/tree/$COMMIT/vis">${COMMIT.substring(0, 7)}</a>. Run the following commands to clone the
        Remotery repository at that commit:
        ${codeBlock("""
git clone --depth=1 https://github.com/Celtoys/Remotery.git
cd Remotery
git fetch --depth=1 origin $COMMIT
git branch --no-track lwjgl $COMMIT
git checkout lwjgl
git branch -D @{-1}""")}

        Now open {@code vis/index.html} in your favorite browser to view the profiler.
        """

    IntConstant("Boolean", "TRUE".."1")
    IntConstant("Boolean", "FALSE".."0")

    EnumConstant(
        "{@code rmtSampleType}",

        "SampleType_CPU".enum,
        "SampleType_CUDA".enum,
        "SampleType_D3D11".enum,
        "SampleType_D3D12".enum,
        "SampleType_OpenGL".enum,
        "SampleType_Metal".enum,
        "SampleType_Count".enum,
    )

    EnumConstant(
        "All possible error codes ({@code rmtError}).",

        "ERROR_NONE".enum,
        "ERROR_RECURSIVE_SAMPLE".enum("Not an error but an internal message to calling code"),
        "ERROR_UNKNOWN".enum("An error with a message yet to be defined, only for internal error handling"),
        "ERROR_INVALID_INPUT".enum("An invalid input to a function call was provided"),
        "ERROR_RESOURCE_CREATE_FAIL".enum("Creation of an internal resource failed"),
        "ERROR_RESOURCE_ACCESS_FAIL".enum("Access of an internal resource failed"),
        "ERROR_TIMEOUT".enum("Internal system timeout"),

        // System errors
        "ERROR_MALLOC_FAIL".enum("Malloc call within remotery failed"),
        "ERROR_TLS_ALLOC_FAIL".enum("Attempt to allocate thread local storage failed"),
        "ERROR_VIRTUAL_MEMORY_BUFFER_FAIL".enum("Failed to create a virtual memory mirror buffer"),
        "ERROR_CREATE_THREAD_FAIL".enum("Failed to create a thread for the server"),
        "ERROR_OPEN_THREAD_HANDLE_FAIL".enum("Failed to open a thread handle, given a thread id"),

        // Network TCP/IP socket errors
        "ERROR_SOCKET_INVALID_POLL".enum("Poll attempt on an invalid socket"),
        "ERROR_SOCKET_SELECT_FAIL".enum("Server failed to call select on socket"),
        "ERROR_SOCKET_POLL_ERRORS".enum("Poll notified that the socket has errors"),
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

    EnumConstant(
        "Flags that control property behaviour. ({@code rmtPropertyFlags})",

        "PropertyFlags_NoFlags".enum("", "0"),
        "PropertyFlags_FrameReset".enum("Reset property back to its default value on each new frame.")
    )

    EnumConstant(
        "All possible property types that can be recorded and sent to the viewer. ({@code rmtPropertyType})",

        "PropertyType_rmtGroup".enum("", "0"),
        "PropertyType_rmtBool".enum,
        "PropertyType_rmtS32".enum,
        "PropertyType_rmtU32".enum,
        "PropertyType_rmtF32".enum,
        "PropertyType_rmtS64".enum,
        "PropertyType_rmtU64".enum,
        "PropertyType_rmtF64".enum
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
        ),
        "RMTSF_SendOnClose".enum(
            """,
            Mainly for platforms other than Windows that don't support the thread sampler and can't detect stalling samples.
    
            Where you have a non-root sample that stays open indefinitely and never sends its contents to log/viewer. Send this sample to log/viewer when it
            closes.  You can not have more than one sample open with this flag on the same thread at a time. This flag will be removed in a future version when all
            platforms support stalling samples.
            """,
            "8"
        )
    ).noPrefix().javaDocLinks

    rmtPStr(
        "GetLastErrorMessage",
        "Gets the last error message issued on the calling thread",

        void()
    )

    rmtSettings.p(
        "Settings",
        """
        Retrieve and configure the global {@code rmtSettings} object.

        This can be done before or after Remotery is initialised, however some fields are only referenced on initialisation.
        """,

        void()
    )

    rmtError(
        "CreateGlobalInstance",
        "Initialises Remotery and sets its internal global instance pointer.",

        Check(1)..Remotery.p.p("remotery", "returns the pointer for further use")
    )

    void(
        "DestroyGlobalInstance",
        "Shutsdown Remotery, requiring its pointer to be passed to ensure you are destroying the correct instance.",

        Remotery.p("remotery", "")
    )

    void(
        "SetGlobalInstance",
        """
        For use in the presence of DLLs/SOs if each of them are linking Remotery statically.
        
        If Remotery is hosted in its own DLL and linked dynamically then there is no need to use this. Otherwise, pass the result of #CreateGlobalInstance()
        from your main DLL to this in your other DLLs.
        """,

        Remotery.p("remotery", "")
    )

    Remotery.p(
        "GetGlobalInstance",
        "Gets a pointer to the current global Remotery instance.",

        void()
    )

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
        Check(1)..nullable..rmtU32.p(
            "hash_cache",
            """
            Stores a pointer to a sample name's hash value.

            Internally this is used to identify unique callstacks and it would be ideal that it's not recalculated each time the sample is used. This can be
            statically cached at the point of call or stored elsewhere when dynamic names are required.

            If #NULL then this call becomes more expensive, as it has to recalculate the hash of the name.
            """
        )
    )

    void(
        "EndCPUSample",
        ""
    )

    rmtError(
        "MarkFrame",
        """
        Used for both CPU and GPU profiling.

        Essential to call this every frame, ever since D3D12 support was added.

        D3D12 Requirements: Don't sample any command lists that begin before this call and end after it
        """,

        void()
    )

    rmtError(
        "PropertySnapshotAll",
        "Sends all properties and their values to the viewer and log to file.",

        void()
    )

    void(
        "PropertyFrameResetAll",
        "Resets all #PropertyFlags_FrameReset properties to their default value.",

        void()
    )

    void(
        "IterateChildren",
        "",

        rmtSampleIterator.p("iter", ""),
        nullable..rmtSample.p("sample", "")
    )

    rmtBool(
        "IterateNext",
        "",

        rmtSampleIterator.p("iter", "")
    )

    charUTF8.const.p(
        "SampleTreeGetThreadName",
        "",

        rmtSampleTree.p("sample_tree", "")
    )

    rmtSample.p(
        "SampleTreeGetRootSample",
        "",

        rmtSampleTree.p("sample_tree", "")
    )

    charUTF8.const.p(
        "SampleGetName",
        "Should only called from within the sample tree callback, when the internal string lookup table is valid (i.e. on the main Remotery thread).",

        rmtSample.p("sample", "")
    )

    rmtU32(
        "SampleGetNameHash",
        "",

        rmtSample.p("sample", "")
    )

    rmtU32(
        "SampleGetCallCount",
        "",

        rmtSample.p("sample", "")
    )

    rmtU64(
        "SampleGetStart",
        "",

        rmtSample.p("sample", "")
    )

    rmtU64(
        "SampleGetTime",
        "",

        rmtSample.p("sample", "")
    )

    rmtU64(
        "SampleGetSelfTime",
        "",

        rmtSample.p("sample", "")
    )

    void(
        "SampleGetColour",
        "",

        rmtSample.p("sample", ""),
        Check(1)..rmtU8.p("r", ""),
        Check(1)..rmtU8.p("g", ""),
        Check(1)..rmtU8.p("b", "")
    )

    rmtSampleType(
        "SampleGetType",
        "",

        rmtSample.p("sample", "")
    )

    void(
        "PropertyIterateChildren",
        "",

        rmtPropertyIterator.p("iter", ""),
        nullable..rmtProperty.p("sample", "")
    )

    rmtBool(
        "PropertyIterateNext",
        "",

        rmtPropertyIterator.p("iter", "")
    )

    rmtPropertyType(
        "PropertyGetType",
        "",

        rmtProperty.p("property", "")
    )

    charUTF8.const.p(
        "PropertyGetName",
        "",

        rmtProperty.p("property", "")
    )

    charUTF8.const.p(
        "PropertyGetDescription",
        "",

        rmtProperty.p("property", "")
    )

    rmtPropertyValue(
        "PropertyGetValue",
        "",

        rmtProperty.p("property", "")
    )

    void(
        "_rmt_PropertySetValue",
        "",

        rmtProperty.p("property", ""),

        noPrefix = true
    )

    void(
        "_rmt_PropertyAddValue",
        "",

        rmtProperty.p("property", ""),
        rmtPropertyValue("add_value", ""),

        noPrefix = true
    )

    rmtU32(
        "_rmt_HashString32",
        "",

        charUTF8.const.p("s", ""),
        int("len", ""),
        rmtU32("seed", ""),

        noPrefix = true
    )

    customMethod("""
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
    }""")

}