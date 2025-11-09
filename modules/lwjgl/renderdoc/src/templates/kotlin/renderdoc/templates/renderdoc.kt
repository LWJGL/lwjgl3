/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc.templates

import org.lwjgl.generator.*
import renderdoc.*

val renderdoc = "RenderDoc".nativeClass(Module.RENDERDOC, prefixConstant = "eRENDERDOC_", prefixMethod = "RENDERDOC_", binding = RENDERDOC_BINDING) {
    EnumConstant(
        "API_Version_1_0_0".enum("10000"),
        "API_Version_1_0_1".enum("10001"),
        "API_Version_1_0_2".enum("10002"),
        "API_Version_1_1_0".enum("10100"),
        "API_Version_1_1_1".enum("10101"),
        "API_Version_1_1_2".enum("10102"),
        "API_Version_1_2_0".enum("10200"),
        "API_Version_1_3_0".enum("10300"),
        "API_Version_1_4_0".enum("10400"),
        "API_Version_1_4_1".enum("10401"),
        "API_Version_1_4_2".enum("10402"),
        "API_Version_1_5_0".enum("10500"),
        "API_Version_1_6_0".enum("10600"),
    )

    EnumConstant(
        "Option_AllowVSync".enum("0"),
        "Option_AllowFullscreen".enum,
        "Option_APIValidation".enum,
        "Option_DebugDeviceMode".enum("2"),
        "Option_CaptureCallstacks".enum,
        "Option_CaptureCallstacksOnlyDraws".enum,
        "Option_CaptureCallstacksOnlyActions".enum("4"),
        "Option_DelayForDebugger".enum,
        "Option_VerifyBufferAccess".enum,
        "Option_HookIntoChildren".enum,
        "Option_RefAllResources".enum,
        "Option_SaveAllInitials".enum,
        "Option_CaptureAllCmdLists".enum,
        "Option_DebugOutputMute".enum,
        "Option_AllowUnsupportedVendorExtensions".enum,
        "Option_SoftMemoryLimit".enum,
    )

    EnumConstant(
        // '0' - '9' matches ASCII values
        "Key_0".enum(0x30),
        "Key_1".enum,
        "Key_2".enum,
        "Key_3".enum,
        "Key_4".enum,
        "Key_5".enum,
        "Key_6".enum,
        "Key_7".enum,
        "Key_8".enum,
        "Key_9".enum,

        // 'A' - 'Z' matches ASCII values
        "Key_A".enum(0x41),
        "Key_B".enum,
        "Key_C".enum,
        "Key_D".enum,
        "Key_E".enum,
        "Key_F".enum,
        "Key_G".enum,
        "Key_H".enum,
        "Key_I".enum,
        "Key_J".enum,
        "Key_K".enum,
        "Key_L".enum,
        "Key_M".enum,
        "Key_N".enum,
        "Key_O".enum,
        "Key_P".enum,
        "Key_Q".enum,
        "Key_R".enum,
        "Key_S".enum,
        "Key_T".enum,
        "Key_U".enum,
        "Key_V".enum,
        "Key_W".enum,
        "Key_X".enum,
        "Key_Y".enum,
        "Key_Z".enum,

        // leave the rest of the ASCII range free
        // in case we want to use it later
        "Key_NonPrintable".enum(0x100),

        "Key_Divide".enum,
        "Key_Multiply".enum,
        "Key_Subtract".enum,
        "Key_Plus".enum,

        "Key_F1".enum,
        "Key_F2".enum,
        "Key_F3".enum,
        "Key_F4".enum,
        "Key_F5".enum,
        "Key_F6".enum,
        "Key_F7".enum,
        "Key_F8".enum,
        "Key_F9".enum,
        "Key_F10".enum,
        "Key_F11".enum,
        "Key_F12".enum,

        "Key_Home".enum,
        "Key_End".enum,
        "Key_Insert".enum,
        "Key_Delete".enum,
        "Key_PageUp".enum,
        "Key_PageDn".enum,

        "Key_Backspace".enum,
        "Key_Tab".enum,
        "Key_PrtScrn".enum,
        "Key_Pause".enum,

        "Key_Max".enum,
    )

    customMethod("""
    private static final RENDERDOC_API_1_6_0 RENDERDOC = RENDERDOC_API_1_6_0.create();

    public static RENDERDOC_API_1_6_0 getAPI() {
        return RENDERDOC;
    }

    /**
     * Loads the RenderDoc API pointers into the {@link RENDERDOC_API_1_6_0} struct returned by {@link #getAPI() getAPI}.
     *
     * <p>This method does not allocate resources that must be freed and may be called multiple times if necessary.</p>
     *
     * @throws IllegalStateException if the RenderDoc debugger is not attached to the process.
     */
    public static void create() {
        String libraryName = Configuration.RENDERDOC_LIBRARY_NAME.get(System.mapLibraryName("renderdoc"));

        long module = NULL;
        switch (Platform.get()) {
            case FREEBSD:
                module = org.lwjgl.system.freebsd.DynamicLinkLoader.dlopen(
                    libraryName,
                    org.lwjgl.system.freebsd.DynamicLinkLoader.RTLD_NOW |
                    org.lwjgl.system.freebsd.DynamicLinkLoader.RTLD_NOLOAD
                );
                break;
            case LINUX:
                module = org.lwjgl.system.linux.DynamicLinkLoader.dlopen(
                    libraryName,
                    org.lwjgl.system.linux.DynamicLinkLoader.RTLD_NOW |
                    org.lwjgl.system.linux.DynamicLinkLoader.RTLD_NOLOAD
                );
                break;
            case MACOSX:
                module = org.lwjgl.system.macosx.DynamicLinkLoader.dlopen(
                    libraryName,
                    org.lwjgl.system.macosx.DynamicLinkLoader.RTLD_NOW |
                    org.lwjgl.system.macosx.DynamicLinkLoader.RTLD_NOLOAD
                );
                break;
            case WINDOWS:
                module = org.lwjgl.system.windows.WinBase.GetModuleHandle(null, libraryName);
                break;
        }

        if (module == NULL) {
            throw new IllegalStateException("Failed to load " + libraryName + ". Please make sure that RenderDoc is attached to the process.");
        }

        long GetAPI = NULL;
        switch (Platform.get()) {
            case FREEBSD:
                GetAPI = org.lwjgl.system.freebsd.DynamicLinkLoader.dlsym(module, "RENDERDOC_GetAPI");
                break;
            case LINUX:
                GetAPI = org.lwjgl.system.linux.DynamicLinkLoader.dlsym(module, "RENDERDOC_GetAPI");
                break;
            case MACOSX:
                GetAPI = org.lwjgl.system.macosx.DynamicLinkLoader.dlsym(module, "RENDERDOC_GetAPI");
                break;
            case WINDOWS:
                GetAPI = org.lwjgl.system.windows.WinBase.GetProcAddress(null, module, "RENDERDOC_GetAPI");
                break;
        }

        if (GetAPI == NULL) {
            throw new IllegalStateException("Failed to retrieve the RENDERDOC_GetAPI function from " + libraryName + ".");
        }

        try (MemoryStack stack = MemoryStack.stackPush()) {
            PointerBuffer pp = stack.callocPointer(1);

            if (!RENDERDOC_GetAPI(eRENDERDOC_API_Version_1_6_0, pp, GetAPI)) {
                throw new IllegalStateException("The RENDERDOC_GetAPI function failed.");
            }

            memCopy(pp.get(0), RENDERDOC.address(), RENDERDOC_API_1_6_0.SIZEOF);
        }
    }""")

    private..intb(
        "GetAPI",

        RENDERDOC_Version("version"),
        Unsafe..opaque_p.p("outPointers"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    intb(
        "SetCaptureOptionU32",

        RENDERDOC_CaptureOption("option"),
        uint32_t("value")
    )

    intb(
        "SetCaptureOptionF32",

        RENDERDOC_CaptureOption("option"),
        float("value")
    )

    uint32_t(
        "GetCaptureOptionU32",

        RENDERDOC_CaptureOption("option")
    )

    float(
        "GetCaptureOptionF32",

        RENDERDOC_CaptureOption("option")
    )

    void(
        "SetFocusToggleKeys",

        nullable..RENDERDOC_InputButton.p("keys"),
        AutoSize("keys")..int("num")
    )

    void(
        "SetCaptureKeys",

        nullable..RENDERDOC_InputButton.p("keys"),
        AutoSize("keys")..int("num")
    )

    uint32_t(
        "GetOverlayBits",

        void()
    )

    void(
        "MaskOverlayBits",

        uint32_t("and"),
        uint32_t("or")
    )

    void(
        "RemoveHooks",

        void()
    )

    void(
        "UnloadCrashHandler",

        void()
    )

    void(
        "SetCaptureFilePathTemplate",

        charUTF8.const.p("filetemplate")
    )

    charUTF8.const.p(
        "GetCaptureFilePathTemplate",

        void()
    )

    uint32_t(
        "GetNumCaptures",

        void()
    )

    uint32_tb(
        "GetCapture",

        uint32_t("index"),
        Unsafe..nullable..char.p("filename"),
        Check(1)..nullable..uint32_t.p("pathlength"),
        Check(1)..nullable..uint64_t.p("timestamp")
    )

    void(
        "SetCaptureFileComments",

        nullable..charUTF8.const.p("file"),
        charUTF8.const.p("comments")
    )

    uint32_tb(
        "IsTargetControlConnected",
        void()
    )

    uint32_t(
        "LaunchReplayUI",

        uint32_t("connectTargetControl"),
        nullable..charUTF8.const.p("cmdline")
    )

    void(
        "GetAPIVersion",

        Check(1)..nullable..int.p("major"),
        Check(1)..nullable..int.p("minor"),
        Check(1)..nullable..int.p("patch")
    )

    uint32_tb(
        "ShowReplayUI",

        void()
    )

    void(
        "SetActiveWindow",

        RENDERDOC_DevicePointer("device"),
        RENDERDOC_WindowHandle("wndHandle"),
    )

    void(
        "TriggerCapture",

        void()
    )

    void(
        "TriggerMultiFrameCapture",

        uint32_t("numFrames")
    )

    void(
        "StartFrameCapture",

        nullable..RENDERDOC_DevicePointer("device"),
        nullable..RENDERDOC_WindowHandle("wndHandle"),
    )

    uint32_tb(
        "IsFrameCapturing",

        void()
    )

    uint32_tb(
        "EndFrameCapture",

        nullable..RENDERDOC_DevicePointer("device"),
        nullable..RENDERDOC_WindowHandle("wndHandle"),
    )

    uint32_tb(
        "DiscardFrameCapture",

        RENDERDOC_DevicePointer("device"),
        RENDERDOC_WindowHandle("wndHandle"),
    )

    void(
        "SetCaptureTitle",

        charUTF8.const.p("title")
    )
}
