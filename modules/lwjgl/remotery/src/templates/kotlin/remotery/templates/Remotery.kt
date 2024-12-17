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

    IntConstant("TRUE".."1")
    IntConstant("FALSE".."0")

    EnumConstant(
        "SampleType_CPU".enum,
        "SampleType_CUDA".enum,
        "SampleType_D3D11".enum,
        "SampleType_D3D12".enum,
        "SampleType_OpenGL".enum,
        "SampleType_Metal".enum,
        "SampleType_Vulkan".enum,
        "SampleType_Count".enum,
    )

    EnumConstant(
        "ERROR_NONE".enum,
        "ERROR_RECURSIVE_SAMPLE".enum,
        "ERROR_UNKNOWN".enum,
        "ERROR_INVALID_INPUT".enum,
        "ERROR_RESOURCE_CREATE_FAIL".enum,
        "ERROR_RESOURCE_ACCESS_FAIL".enum,
        "ERROR_TIMEOUT".enum,

        // System errors
        "ERROR_MALLOC_FAIL".enum,
        "ERROR_TLS_ALLOC_FAIL".enum,
        "ERROR_VIRTUAL_MEMORY_BUFFER_FAIL".enum,
        "ERROR_CREATE_THREAD_FAIL".enum,
        "ERROR_OPEN_THREAD_HANDLE_FAIL".enum,

        // Network TCP/IP socket errors
        "ERROR_SOCKET_INVALID_POLL".enum,
        "ERROR_SOCKET_SELECT_FAIL".enum,
        "ERROR_SOCKET_POLL_ERRORS".enum,
        "ERROR_SOCKET_SEND_FAIL".enum,
        "ERROR_SOCKET_RECV_NO_DATA".enum,
        "ERROR_SOCKET_RECV_TIMEOUT".enum,
        "ERROR_SOCKET_RECV_FAILED".enum,

        // WebSocket errors
        "ERROR_WEBSOCKET_HANDSHAKE_NOT_GET".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_NO_HOST".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_NO_KEY".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY".enum,
        "ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL".enum,
        "ERROR_WEBSOCKET_DISCONNECTED".enum,
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER".enum,
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE".enum,
        "ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK".enum,
        "ERROR_WEBSOCKET_RECEIVE_TIMEOUT".enum,

        "ERROR_REMOTERY_NOT_CREATED".enum,
        "ERROR_SEND_ON_INCOMPLETE_PROFILE".enum,

        // CUDA error messages
        "ERROR_CUDA_DEINITIALIZED".enum,
        "ERROR_CUDA_NOT_INITIALIZED".enum,
        "ERROR_CUDA_INVALID_CONTEXT".enum,
        "ERROR_CUDA_INVALID_VALUE".enum,
        "ERROR_CUDA_INVALID_HANDLE".enum,
        "ERROR_CUDA_OUT_OF_MEMORY".enum,
        "ERROR_ERROR_NOT_READY".enum,

        // Direct3D 11 error messages
        "ERROR_D3D11_FAILED_TO_CREATE_QUERY".enum,

        // OpenGL error messages
        "ERROR_OPENGL_ERROR".enum,

        "ERROR_CUDA_UNKNOWN".enum
    )

    EnumConstant(
        "PropertyFlags_NoFlags".enum("0"),
        "PropertyFlags_FrameReset".enum
    )

    EnumConstant(
        "PropertyType_rmtGroup".enum("0"),
        "PropertyType_rmtBool".enum,
        "PropertyType_rmtS32".enum,
        "PropertyType_rmtU32".enum,
        "PropertyType_rmtF32".enum,
        "PropertyType_rmtS64".enum,
        "PropertyType_rmtU64".enum,
        "PropertyType_rmtF64".enum
    )

    EnumConstant(
        "RMTSF_None".enum("0"),
        "RMTSF_Aggregate".enum("1"),
        "RMTSF_Recursive".enum("2"),
        "RMTSF_Root".enum("4"),
        "RMTSF_SendOnClose".enum("8")
    ).noPrefix()

    rmtPStr(
        "GetLastErrorMessage",

        void()
    )

    rmtSettings.p(
        "Settings",

        void()
    )

    rmtError(
        "CreateGlobalInstance",

        Check(1)..Remotery.p.p("remotery")
    )

    void(
        "DestroyGlobalInstance",

        Remotery.p("remotery")
    )

    void(
        "SetGlobalInstance",

        Remotery.p("remotery")
    )

    Remotery.p(
        "GetGlobalInstance",

        void()
    )

    void(
        "SetCurrentThreadName",

        rmtPStr("thread_name")
    )

    void(
        "LogText",

        rmtPStr("text")
    )

    Code(
        nativeCall = "${t}_rmt_BeginCPUSample(name, flags, hash_cache);"
    )..void(
        "BeginCPUSample",

        rmtPStr("name"),
        rmtU32("flags"),
        Check(1)..nullable..rmtU32.p("hash_cache")
    )

    void("EndCPUSample")

    rmtError(
        "MarkFrame",

        void()
    )

    rmtError(
        "PropertySnapshotAll",

        void()
    )

    void(
        "PropertyFrameResetAll",

        void()
    )

    void(
        "IterateChildren",

        rmtSampleIterator.p("iter"),
        nullable..rmtSample.p("sample")
    )

    rmtBool(
        "IterateNext",

        rmtSampleIterator.p("iter")
    )

    charUTF8.const.p(
        "SampleTreeGetThreadName",

        rmtSampleTree.p("sample_tree")
    )

    rmtSample.p(
        "SampleTreeGetRootSample",

        rmtSampleTree.p("sample_tree")
    )

    charUTF8.const.p(
        "SampleGetName",

        rmtSample.p("sample")
    )

    rmtU32(
        "SampleGetNameHash",

        rmtSample.p("sample")
    )

    rmtU32(
        "SampleGetCallCount",

        rmtSample.p("sample")
    )

    rmtU64(
        "SampleGetStart",

        rmtSample.p("sample")
    )

    rmtU64(
        "SampleGetTime",

        rmtSample.p("sample")
    )

    rmtU64(
        "SampleGetSelfTime",

        rmtSample.p("sample")
    )

    void(
        "SampleGetColour",

        rmtSample.p("sample"),
        Check(1)..rmtU8.p("r"),
        Check(1)..rmtU8.p("g"),
        Check(1)..rmtU8.p("b")
    )

    rmtSampleType(
        "SampleGetType",

        rmtSample.p("sample")
    )

    void(
        "PropertyIterateChildren",

        rmtPropertyIterator.p("iter"),
        nullable..rmtProperty.p("sample")
    )

    rmtBool(
        "PropertyIterateNext",

        rmtPropertyIterator.p("iter")
    )

    rmtPropertyType(
        "PropertyGetType",

        rmtProperty.p("property")
    )

    charUTF8.const.p(
        "PropertyGetName",

        rmtProperty.p("property")
    )

    charUTF8.const.p(
        "PropertyGetDescription",

        rmtProperty.p("property")
    )

    rmtPropertyValue(
        "PropertyGetValue",

        rmtProperty.p("property")
    )

    void(
        "_rmt_PropertySetValue",

        rmtProperty.p("property"),

        noPrefix = true
    )

    void(
        "_rmt_PropertyAddValue",

        rmtProperty.p("property"),
        rmtPropertyValue("add_value"),

        noPrefix = true
    )

    rmtU32(
        "_rmt_HashString32",

        charUTF8.const.p("s"),
        int("len"),
        rmtU32("seed"),

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