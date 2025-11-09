/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class RenderDoc {

    public static final int
        eRENDERDOC_API_Version_1_0_0 = 10000,
        eRENDERDOC_API_Version_1_0_1 = 10001,
        eRENDERDOC_API_Version_1_0_2 = 10002,
        eRENDERDOC_API_Version_1_1_0 = 10100,
        eRENDERDOC_API_Version_1_1_1 = 10101,
        eRENDERDOC_API_Version_1_1_2 = 10102,
        eRENDERDOC_API_Version_1_2_0 = 10200,
        eRENDERDOC_API_Version_1_3_0 = 10300,
        eRENDERDOC_API_Version_1_4_0 = 10400,
        eRENDERDOC_API_Version_1_4_1 = 10401,
        eRENDERDOC_API_Version_1_4_2 = 10402,
        eRENDERDOC_API_Version_1_5_0 = 10500,
        eRENDERDOC_API_Version_1_6_0 = 10600;

    public static final int
        eRENDERDOC_Option_AllowVSync                       = 0,
        eRENDERDOC_Option_AllowFullscreen                  = 1,
        eRENDERDOC_Option_APIValidation                    = 2,
        eRENDERDOC_Option_DebugDeviceMode                  = 2,
        eRENDERDOC_Option_CaptureCallstacks                = 3,
        eRENDERDOC_Option_CaptureCallstacksOnlyDraws       = 4,
        eRENDERDOC_Option_CaptureCallstacksOnlyActions     = 4,
        eRENDERDOC_Option_DelayForDebugger                 = 5,
        eRENDERDOC_Option_VerifyBufferAccess               = 6,
        eRENDERDOC_Option_HookIntoChildren                 = 7,
        eRENDERDOC_Option_RefAllResources                  = 8,
        eRENDERDOC_Option_SaveAllInitials                  = 9,
        eRENDERDOC_Option_CaptureAllCmdLists               = 10,
        eRENDERDOC_Option_DebugOutputMute                  = 11,
        eRENDERDOC_Option_AllowUnsupportedVendorExtensions = 12,
        eRENDERDOC_Option_SoftMemoryLimit                  = 13;

    public static final int
        eRENDERDOC_Key_0            = 0x30,
        eRENDERDOC_Key_1            = 0x31,
        eRENDERDOC_Key_2            = 0x32,
        eRENDERDOC_Key_3            = 0x33,
        eRENDERDOC_Key_4            = 0x34,
        eRENDERDOC_Key_5            = 0x35,
        eRENDERDOC_Key_6            = 0x36,
        eRENDERDOC_Key_7            = 0x37,
        eRENDERDOC_Key_8            = 0x38,
        eRENDERDOC_Key_9            = 0x39,
        eRENDERDOC_Key_A            = 0x41,
        eRENDERDOC_Key_B            = 0x42,
        eRENDERDOC_Key_C            = 0x43,
        eRENDERDOC_Key_D            = 0x44,
        eRENDERDOC_Key_E            = 0x45,
        eRENDERDOC_Key_F            = 0x46,
        eRENDERDOC_Key_G            = 0x47,
        eRENDERDOC_Key_H            = 0x48,
        eRENDERDOC_Key_I            = 0x49,
        eRENDERDOC_Key_J            = 0x4A,
        eRENDERDOC_Key_K            = 0x4B,
        eRENDERDOC_Key_L            = 0x4C,
        eRENDERDOC_Key_M            = 0x4D,
        eRENDERDOC_Key_N            = 0x4E,
        eRENDERDOC_Key_O            = 0x4F,
        eRENDERDOC_Key_P            = 0x50,
        eRENDERDOC_Key_Q            = 0x51,
        eRENDERDOC_Key_R            = 0x52,
        eRENDERDOC_Key_S            = 0x53,
        eRENDERDOC_Key_T            = 0x54,
        eRENDERDOC_Key_U            = 0x55,
        eRENDERDOC_Key_V            = 0x56,
        eRENDERDOC_Key_W            = 0x57,
        eRENDERDOC_Key_X            = 0x58,
        eRENDERDOC_Key_Y            = 0x59,
        eRENDERDOC_Key_Z            = 0x5A,
        eRENDERDOC_Key_NonPrintable = 0x100,
        eRENDERDOC_Key_Divide       = 0x101,
        eRENDERDOC_Key_Multiply     = 0x102,
        eRENDERDOC_Key_Subtract     = 0x103,
        eRENDERDOC_Key_Plus         = 0x104,
        eRENDERDOC_Key_F1           = 0x105,
        eRENDERDOC_Key_F2           = 0x106,
        eRENDERDOC_Key_F3           = 0x107,
        eRENDERDOC_Key_F4           = 0x108,
        eRENDERDOC_Key_F5           = 0x109,
        eRENDERDOC_Key_F6           = 0x10A,
        eRENDERDOC_Key_F7           = 0x10B,
        eRENDERDOC_Key_F8           = 0x10C,
        eRENDERDOC_Key_F9           = 0x10D,
        eRENDERDOC_Key_F10          = 0x10E,
        eRENDERDOC_Key_F11          = 0x10F,
        eRENDERDOC_Key_F12          = 0x110,
        eRENDERDOC_Key_Home         = 0x111,
        eRENDERDOC_Key_End          = 0x112,
        eRENDERDOC_Key_Insert       = 0x113,
        eRENDERDOC_Key_Delete       = 0x114,
        eRENDERDOC_Key_PageUp       = 0x115,
        eRENDERDOC_Key_PageDn       = 0x116,
        eRENDERDOC_Key_Backspace    = 0x117,
        eRENDERDOC_Key_Tab          = 0x118,
        eRENDERDOC_Key_PrtScrn      = 0x119,
        eRENDERDOC_Key_Pause        = 0x11A,
        eRENDERDOC_Key_Max          = 0x11B;

    protected RenderDoc() {
        throw new UnsupportedOperationException();
    }

    // --- [ RENDERDOC_GetAPI ] ---

    /** {@code int RENDERDOC_GetAPI(RENDERDOC_Version version, void ** outPointers, void * __functionAddress)} */
    private static int nRENDERDOC_GetAPI(int version, long outPointers, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(version, outPointers, __functionAddress);
    }

    /** {@code int RENDERDOC_GetAPI(RENDERDOC_Version version, void ** outPointers, void * __functionAddress)} */
    @NativeType("int")
    private static boolean RENDERDOC_GetAPI(@NativeType("RENDERDOC_Version") int version, @NativeType("void **") PointerBuffer outPointers, @NativeType("void *") long __functionAddress) {
        return nRENDERDOC_GetAPI(version, memAddress(outPointers), __functionAddress) != 0;
    }

    // --- [ RENDERDOC_SetCaptureOptionU32 ] ---

    /** {@code int RENDERDOC_SetCaptureOptionU32(RENDERDOC_CaptureOption option, uint32_t value)} */
    @NativeType("int")
    public static boolean RENDERDOC_SetCaptureOptionU32(@NativeType("RENDERDOC_CaptureOption") int option, @NativeType("uint32_t") int value) {
        long __functionAddress = RENDERDOC.SetCaptureOptionU32();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(option, value, __functionAddress) != 0;
    }

    // --- [ RENDERDOC_SetCaptureOptionF32 ] ---

    /** {@code int RENDERDOC_SetCaptureOptionF32(RENDERDOC_CaptureOption option, float value)} */
    @NativeType("int")
    public static boolean RENDERDOC_SetCaptureOptionF32(@NativeType("RENDERDOC_CaptureOption") int option, float value) {
        long __functionAddress = RENDERDOC.SetCaptureOptionF32();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(option, value, __functionAddress) != 0;
    }

    // --- [ RENDERDOC_GetCaptureOptionU32 ] ---

    /** {@code uint32_t RENDERDOC_GetCaptureOptionU32(RENDERDOC_CaptureOption option)} */
    @NativeType("uint32_t")
    public static int RENDERDOC_GetCaptureOptionU32(@NativeType("RENDERDOC_CaptureOption") int option) {
        long __functionAddress = RENDERDOC.GetCaptureOptionU32();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(option, __functionAddress);
    }

    // --- [ RENDERDOC_GetCaptureOptionF32 ] ---

    /** {@code float RENDERDOC_GetCaptureOptionF32(RENDERDOC_CaptureOption option)} */
    public static float RENDERDOC_GetCaptureOptionF32(@NativeType("RENDERDOC_CaptureOption") int option) {
        long __functionAddress = RENDERDOC.GetCaptureOptionF32();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeF(option, __functionAddress);
    }

    // --- [ RENDERDOC_SetFocusToggleKeys ] ---

    /** {@code void RENDERDOC_SetFocusToggleKeys(RENDERDOC_InputButton * keys, int num)} */
    public static void nRENDERDOC_SetFocusToggleKeys(long keys, int num) {
        long __functionAddress = RENDERDOC.SetFocusToggleKeys();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(keys, num, __functionAddress);
    }

    /** {@code void RENDERDOC_SetFocusToggleKeys(RENDERDOC_InputButton * keys, int num)} */
    public static void RENDERDOC_SetFocusToggleKeys(@NativeType("RENDERDOC_InputButton *") @Nullable IntBuffer keys) {
        nRENDERDOC_SetFocusToggleKeys(memAddressSafe(keys), remainingSafe(keys));
    }

    // --- [ RENDERDOC_SetCaptureKeys ] ---

    /** {@code void RENDERDOC_SetCaptureKeys(RENDERDOC_InputButton * keys, int num)} */
    public static void nRENDERDOC_SetCaptureKeys(long keys, int num) {
        long __functionAddress = RENDERDOC.SetCaptureKeys();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(keys, num, __functionAddress);
    }

    /** {@code void RENDERDOC_SetCaptureKeys(RENDERDOC_InputButton * keys, int num)} */
    public static void RENDERDOC_SetCaptureKeys(@NativeType("RENDERDOC_InputButton *") @Nullable IntBuffer keys) {
        nRENDERDOC_SetCaptureKeys(memAddressSafe(keys), remainingSafe(keys));
    }

    // --- [ RENDERDOC_GetOverlayBits ] ---

    /** {@code uint32_t RENDERDOC_GetOverlayBits(void)} */
    @NativeType("uint32_t")
    public static int RENDERDOC_GetOverlayBits() {
        long __functionAddress = RENDERDOC.GetOverlayBits();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

    // --- [ RENDERDOC_MaskOverlayBits ] ---

    /** {@code void RENDERDOC_MaskOverlayBits(uint32_t and, uint32_t or)} */
    public static void RENDERDOC_MaskOverlayBits(@NativeType("uint32_t") int and, @NativeType("uint32_t") int or) {
        long __functionAddress = RENDERDOC.MaskOverlayBits();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(and, or, __functionAddress);
    }

    // --- [ RENDERDOC_RemoveHooks ] ---

    /** {@code void RENDERDOC_RemoveHooks(void)} */
    public static void RENDERDOC_RemoveHooks() {
        long __functionAddress = RENDERDOC.RemoveHooks();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ RENDERDOC_UnloadCrashHandler ] ---

    /** {@code void RENDERDOC_UnloadCrashHandler(void)} */
    public static void RENDERDOC_UnloadCrashHandler() {
        long __functionAddress = RENDERDOC.UnloadCrashHandler();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ RENDERDOC_SetCaptureFilePathTemplate ] ---

    /** {@code void RENDERDOC_SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void nRENDERDOC_SetCaptureFilePathTemplate(long filetemplate) {
        long __functionAddress = RENDERDOC.SetCaptureFilePathTemplate();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filetemplate, __functionAddress);
    }

    /** {@code void RENDERDOC_SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void RENDERDOC_SetCaptureFilePathTemplate(@NativeType("char const *") ByteBuffer filetemplate) {
        if (CHECKS) {
            checkNT1(filetemplate);
        }
        nRENDERDOC_SetCaptureFilePathTemplate(memAddress(filetemplate));
    }

    /** {@code void RENDERDOC_SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void RENDERDOC_SetCaptureFilePathTemplate(@NativeType("char const *") CharSequence filetemplate) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filetemplate, true);
            long filetemplateEncoded = stack.getPointerAddress();
            nRENDERDOC_SetCaptureFilePathTemplate(filetemplateEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ RENDERDOC_GetCaptureFilePathTemplate ] ---

    /** {@code char const * RENDERDOC_GetCaptureFilePathTemplate(void)} */
    public static long nRENDERDOC_GetCaptureFilePathTemplate() {
        long __functionAddress = RENDERDOC.GetCaptureFilePathTemplate();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char const * RENDERDOC_GetCaptureFilePathTemplate(void)} */
    @NativeType("char const *")
    public static @Nullable String RENDERDOC_GetCaptureFilePathTemplate() {
        long __result = nRENDERDOC_GetCaptureFilePathTemplate();
        return memUTF8Safe(__result);
    }

    // --- [ RENDERDOC_GetNumCaptures ] ---

    /** {@code uint32_t RENDERDOC_GetNumCaptures(void)} */
    @NativeType("uint32_t")
    public static int RENDERDOC_GetNumCaptures() {
        long __functionAddress = RENDERDOC.GetNumCaptures();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

    // --- [ RENDERDOC_GetCapture ] ---

    /** {@code uint32_t RENDERDOC_GetCapture(uint32_t index, char * filename, uint32_t * pathlength, uint64_t * timestamp)} */
    public static int nRENDERDOC_GetCapture(int index, long filename, long pathlength, long timestamp) {
        long __functionAddress = RENDERDOC.GetCapture();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPI(index, filename, pathlength, timestamp, __functionAddress);
    }

    /** {@code uint32_t RENDERDOC_GetCapture(uint32_t index, char * filename, uint32_t * pathlength, uint64_t * timestamp)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_GetCapture(@NativeType("uint32_t") int index, @NativeType("char *") @Nullable ByteBuffer filename, @NativeType("uint32_t *") @Nullable IntBuffer pathlength, @NativeType("uint64_t *") @Nullable LongBuffer timestamp) {
        if (CHECKS) {
            checkSafe(pathlength, 1);
            checkSafe(timestamp, 1);
        }
        return nRENDERDOC_GetCapture(index, memAddressSafe(filename), memAddressSafe(pathlength), memAddressSafe(timestamp)) != 0;
    }

    // --- [ RENDERDOC_SetCaptureFileComments ] ---

    /** {@code void RENDERDOC_SetCaptureFileComments(char const * file, char const * comments)} */
    public static void nRENDERDOC_SetCaptureFileComments(long file, long comments) {
        long __functionAddress = RENDERDOC.SetCaptureFileComments();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(file, comments, __functionAddress);
    }

    /** {@code void RENDERDOC_SetCaptureFileComments(char const * file, char const * comments)} */
    public static void RENDERDOC_SetCaptureFileComments(@NativeType("char const *") @Nullable ByteBuffer file, @NativeType("char const *") ByteBuffer comments) {
        if (CHECKS) {
            checkNT1Safe(file);
            checkNT1(comments);
        }
        nRENDERDOC_SetCaptureFileComments(memAddressSafe(file), memAddress(comments));
    }

    /** {@code void RENDERDOC_SetCaptureFileComments(char const * file, char const * comments)} */
    public static void RENDERDOC_SetCaptureFileComments(@NativeType("char const *") @Nullable CharSequence file, @NativeType("char const *") CharSequence comments) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(file, true);
            long fileEncoded = file == null ? NULL : stack.getPointerAddress();
            stack.nUTF8(comments, true);
            long commentsEncoded = stack.getPointerAddress();
            nRENDERDOC_SetCaptureFileComments(fileEncoded, commentsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ RENDERDOC_IsTargetControlConnected ] ---

    /** {@code uint32_t RENDERDOC_IsTargetControlConnected(void)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_IsTargetControlConnected() {
        long __functionAddress = RENDERDOC.IsTargetControlConnected();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress) != 0;
    }

    // --- [ RENDERDOC_LaunchReplayUI ] ---

    /** {@code uint32_t RENDERDOC_LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    public static int nRENDERDOC_LaunchReplayUI(int connectTargetControl, long cmdline) {
        long __functionAddress = RENDERDOC.LaunchReplayUI();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(connectTargetControl, cmdline, __functionAddress);
    }

    /** {@code uint32_t RENDERDOC_LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    @NativeType("uint32_t")
    public static int RENDERDOC_LaunchReplayUI(@NativeType("uint32_t") int connectTargetControl, @NativeType("char const *") @Nullable ByteBuffer cmdline) {
        if (CHECKS) {
            checkNT1Safe(cmdline);
        }
        return nRENDERDOC_LaunchReplayUI(connectTargetControl, memAddressSafe(cmdline));
    }

    /** {@code uint32_t RENDERDOC_LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    @NativeType("uint32_t")
    public static int RENDERDOC_LaunchReplayUI(@NativeType("uint32_t") int connectTargetControl, @NativeType("char const *") @Nullable CharSequence cmdline) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(cmdline, true);
            long cmdlineEncoded = cmdline == null ? NULL : stack.getPointerAddress();
            return nRENDERDOC_LaunchReplayUI(connectTargetControl, cmdlineEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ RENDERDOC_GetAPIVersion ] ---

    /** {@code void RENDERDOC_GetAPIVersion(int * major, int * minor, int * patch)} */
    public static void nRENDERDOC_GetAPIVersion(long major, long minor, long patch) {
        long __functionAddress = RENDERDOC.GetAPIVersion();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(major, minor, patch, __functionAddress);
    }

    /** {@code void RENDERDOC_GetAPIVersion(int * major, int * minor, int * patch)} */
    public static void RENDERDOC_GetAPIVersion(@NativeType("int *") @Nullable IntBuffer major, @NativeType("int *") @Nullable IntBuffer minor, @NativeType("int *") @Nullable IntBuffer patch) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(patch, 1);
        }
        nRENDERDOC_GetAPIVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(patch));
    }

    // --- [ RENDERDOC_ShowReplayUI ] ---

    /** {@code uint32_t RENDERDOC_ShowReplayUI(void)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_ShowReplayUI() {
        long __functionAddress = RENDERDOC.ShowReplayUI();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress) != 0;
    }

    // --- [ RENDERDOC_SetActiveWindow ] ---

    /** {@code void RENDERDOC_SetActiveWindow(RENDERDOC_DevicePointer device, RENDERDOC_WindowHandle wndHandle)} */
    public static void RENDERDOC_SetActiveWindow(@NativeType("RENDERDOC_DevicePointer") long device, @NativeType("RENDERDOC_WindowHandle") long wndHandle) {
        long __functionAddress = RENDERDOC.SetActiveWindow();
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(wndHandle);
        }
        invokePPV(device, wndHandle, __functionAddress);
    }

    // --- [ RENDERDOC_TriggerCapture ] ---

    /** {@code void RENDERDOC_TriggerCapture(void)} */
    public static void RENDERDOC_TriggerCapture() {
        long __functionAddress = RENDERDOC.TriggerCapture();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ RENDERDOC_TriggerMultiFrameCapture ] ---

    /** {@code void RENDERDOC_TriggerMultiFrameCapture(uint32_t numFrames)} */
    public static void RENDERDOC_TriggerMultiFrameCapture(@NativeType("uint32_t") int numFrames) {
        long __functionAddress = RENDERDOC.TriggerMultiFrameCapture();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(numFrames, __functionAddress);
    }

    // --- [ RENDERDOC_StartFrameCapture ] ---

    /** {@code void RENDERDOC_StartFrameCapture(RENDERDOC_DevicePointer device, RENDERDOC_WindowHandle wndHandle)} */
    public static void RENDERDOC_StartFrameCapture(@NativeType("RENDERDOC_DevicePointer") long device, @NativeType("RENDERDOC_WindowHandle") long wndHandle) {
        long __functionAddress = RENDERDOC.StartFrameCapture();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(device, wndHandle, __functionAddress);
    }

    // --- [ RENDERDOC_IsFrameCapturing ] ---

    /** {@code uint32_t RENDERDOC_IsFrameCapturing(void)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_IsFrameCapturing() {
        long __functionAddress = RENDERDOC.IsFrameCapturing();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress) != 0;
    }

    // --- [ RENDERDOC_EndFrameCapture ] ---

    /** {@code uint32_t RENDERDOC_EndFrameCapture(RENDERDOC_DevicePointer device, RENDERDOC_WindowHandle wndHandle)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_EndFrameCapture(@NativeType("RENDERDOC_DevicePointer") long device, @NativeType("RENDERDOC_WindowHandle") long wndHandle) {
        long __functionAddress = RENDERDOC.EndFrameCapture();
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPI(device, wndHandle, __functionAddress) != 0;
    }

    // --- [ RENDERDOC_DiscardFrameCapture ] ---

    /** {@code uint32_t RENDERDOC_DiscardFrameCapture(RENDERDOC_DevicePointer device, RENDERDOC_WindowHandle wndHandle)} */
    @NativeType("uint32_t")
    public static boolean RENDERDOC_DiscardFrameCapture(@NativeType("RENDERDOC_DevicePointer") long device, @NativeType("RENDERDOC_WindowHandle") long wndHandle) {
        long __functionAddress = RENDERDOC.DiscardFrameCapture();
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(wndHandle);
        }
        return invokePPI(device, wndHandle, __functionAddress) != 0;
    }

    // --- [ RENDERDOC_SetCaptureTitle ] ---

    /** {@code void RENDERDOC_SetCaptureTitle(char const * title)} */
    public static void nRENDERDOC_SetCaptureTitle(long title) {
        long __functionAddress = RENDERDOC.SetCaptureTitle();
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(title, __functionAddress);
    }

    /** {@code void RENDERDOC_SetCaptureTitle(char const * title)} */
    public static void RENDERDOC_SetCaptureTitle(@NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nRENDERDOC_SetCaptureTitle(memAddress(title));
    }

    /** {@code void RENDERDOC_SetCaptureTitle(char const * title)} */
    public static void RENDERDOC_SetCaptureTitle(@NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            nRENDERDOC_SetCaptureTitle(titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

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
    }

}