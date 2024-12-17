/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRRenderModels {

    protected VRRenderModels() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRRenderModels_LoadRenderModel_Async ] ---

    /** {@code EVRRenderModelError VRRenderModels_LoadRenderModel_Async(char const * pchRenderModelName, RenderModel_t ** ppRenderModel)} */
    public static int nVRRenderModels_LoadRenderModel_Async(long pchRenderModelName, long ppRenderModel) {
        long __functionAddress = OpenVR.VRRenderModels.LoadRenderModel_Async;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchRenderModelName, ppRenderModel, __functionAddress);
    }

    /** {@code EVRRenderModelError VRRenderModels_LoadRenderModel_Async(char const * pchRenderModelName, RenderModel_t ** ppRenderModel)} */
    @NativeType("EVRRenderModelError")
    public static int VRRenderModels_LoadRenderModel_Async(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("RenderModel_t **") PointerBuffer ppRenderModel) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(ppRenderModel, 1);
        }
        return nVRRenderModels_LoadRenderModel_Async(memAddress(pchRenderModelName), memAddress(ppRenderModel));
    }

    /** {@code EVRRenderModelError VRRenderModels_LoadRenderModel_Async(char const * pchRenderModelName, RenderModel_t ** ppRenderModel)} */
    @NativeType("EVRRenderModelError")
    public static int VRRenderModels_LoadRenderModel_Async(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("RenderModel_t **") PointerBuffer ppRenderModel) {
        if (CHECKS) {
            check(ppRenderModel, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_LoadRenderModel_Async(pchRenderModelNameEncoded, memAddress(ppRenderModel));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_FreeRenderModel ] ---

    /** {@code void VRRenderModels_FreeRenderModel(RenderModel_t * pRenderModel)} */
    public static void nVRRenderModels_FreeRenderModel(long pRenderModel) {
        long __functionAddress = OpenVR.VRRenderModels.FreeRenderModel;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pRenderModel, __functionAddress);
    }

    /** {@code void VRRenderModels_FreeRenderModel(RenderModel_t * pRenderModel)} */
    public static void VRRenderModels_FreeRenderModel(@NativeType("RenderModel_t *") @Nullable RenderModel pRenderModel) {
        nVRRenderModels_FreeRenderModel(memAddressSafe(pRenderModel));
    }

    // --- [ VRRenderModels_LoadTexture_Async ] ---

    /** {@code EVRRenderModelError VRRenderModels_LoadTexture_Async(TextureID_t textureId, RenderModel_TextureMap_t ** ppTexture)} */
    public static int nVRRenderModels_LoadTexture_Async(int textureId, long ppTexture) {
        long __functionAddress = OpenVR.VRRenderModels.LoadTexture_Async;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(textureId, ppTexture, __functionAddress);
    }

    /** {@code EVRRenderModelError VRRenderModels_LoadTexture_Async(TextureID_t textureId, RenderModel_TextureMap_t ** ppTexture)} */
    @NativeType("EVRRenderModelError")
    public static int VRRenderModels_LoadTexture_Async(@NativeType("TextureID_t") int textureId, @NativeType("RenderModel_TextureMap_t **") PointerBuffer ppTexture) {
        if (CHECKS) {
            check(ppTexture, 1);
        }
        return nVRRenderModels_LoadTexture_Async(textureId, memAddress(ppTexture));
    }

    // --- [ VRRenderModels_FreeTexture ] ---

    /** {@code void VRRenderModels_FreeTexture(RenderModel_TextureMap_t * pTexture)} */
    public static void nVRRenderModels_FreeTexture(long pTexture) {
        long __functionAddress = OpenVR.VRRenderModels.FreeTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pTexture, __functionAddress);
    }

    /** {@code void VRRenderModels_FreeTexture(RenderModel_TextureMap_t * pTexture)} */
    public static void VRRenderModels_FreeTexture(@NativeType("RenderModel_TextureMap_t *") @Nullable RenderModelTextureMap pTexture) {
        nVRRenderModels_FreeTexture(memAddressSafe(pTexture));
    }

    // --- [ VRRenderModels_LoadTextureD3D11_Async ] ---

    /** {@code EVRRenderModelError VRRenderModels_LoadTextureD3D11_Async(TextureID_t textureId, void * pD3D11Device, void ** ppD3D11Texture2D)} */
    public static int nVRRenderModels_LoadTextureD3D11_Async(int textureId, long pD3D11Device, long ppD3D11Texture2D) {
        long __functionAddress = OpenVR.VRRenderModels.LoadTextureD3D11_Async;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11Device);
        }
        return callPPI(textureId, pD3D11Device, ppD3D11Texture2D, __functionAddress);
    }

    /** {@code EVRRenderModelError VRRenderModels_LoadTextureD3D11_Async(TextureID_t textureId, void * pD3D11Device, void ** ppD3D11Texture2D)} */
    @NativeType("EVRRenderModelError")
    public static int VRRenderModels_LoadTextureD3D11_Async(@NativeType("TextureID_t") int textureId, @NativeType("void *") long pD3D11Device, @NativeType("void **") PointerBuffer ppD3D11Texture2D) {
        if (CHECKS) {
            check(ppD3D11Texture2D, 1);
        }
        return nVRRenderModels_LoadTextureD3D11_Async(textureId, pD3D11Device, memAddress(ppD3D11Texture2D));
    }

    // --- [ VRRenderModels_LoadIntoTextureD3D11_Async ] ---

    /** {@code EVRRenderModelError VRRenderModels_LoadIntoTextureD3D11_Async(TextureID_t textureId, void * pDstTexture)} */
    @NativeType("EVRRenderModelError")
    public static int VRRenderModels_LoadIntoTextureD3D11_Async(@NativeType("TextureID_t") int textureId, @NativeType("void *") long pDstTexture) {
        long __functionAddress = OpenVR.VRRenderModels.LoadIntoTextureD3D11_Async;
        if (CHECKS) {
            check(__functionAddress);
            check(pDstTexture);
        }
        return callPI(textureId, pDstTexture, __functionAddress);
    }

    // --- [ VRRenderModels_FreeTextureD3D11 ] ---

    /** {@code void VRRenderModels_FreeTextureD3D11(void * pD3D11Texture2D)} */
    public static void VRRenderModels_FreeTextureD3D11(@NativeType("void *") long pD3D11Texture2D) {
        long __functionAddress = OpenVR.VRRenderModels.FreeTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11Texture2D);
        }
        callPV(pD3D11Texture2D, __functionAddress);
    }

    // --- [ VRRenderModels_GetRenderModelName ] ---

    /** {@code uint32_t VRRenderModels_GetRenderModelName(uint32_t unRenderModelIndex, char * pchRenderModelName, uint32_t unRenderModelNameLen)} */
    public static int nVRRenderModels_GetRenderModelName(int unRenderModelIndex, long pchRenderModelName, int unRenderModelNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unRenderModelIndex, pchRenderModelName, unRenderModelNameLen, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelName(uint32_t unRenderModelIndex, char * pchRenderModelName, uint32_t unRenderModelNameLen)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelName(@NativeType("uint32_t") int unRenderModelIndex, @NativeType("char *") @Nullable ByteBuffer pchRenderModelName) {
        return nVRRenderModels_GetRenderModelName(unRenderModelIndex, memAddressSafe(pchRenderModelName), remainingSafe(pchRenderModelName));
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelName(uint32_t unRenderModelIndex, char * pchRenderModelName, uint32_t unRenderModelNameLen)} */
    @NativeType("uint32_t")
    public static String VRRenderModels_GetRenderModelName(@NativeType("uint32_t") int unRenderModelIndex, @NativeType("uint32_t") int unRenderModelNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelName = stack.malloc(unRenderModelNameLen);
            int __result = nVRRenderModels_GetRenderModelName(unRenderModelIndex, memAddress(pchRenderModelName), unRenderModelNameLen);
            return memASCII(pchRenderModelName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelCount ] ---

    /** {@code uint32_t VRRenderModels_GetRenderModelCount(void)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelCount() {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRRenderModels_GetComponentCount ] ---

    /** {@code uint32_t VRRenderModels_GetComponentCount(char const * pchRenderModelName)} */
    public static int nVRRenderModels_GetComponentCount(long pchRenderModelName) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchRenderModelName, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetComponentCount(char const * pchRenderModelName)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentCount(@NativeType("char const *") ByteBuffer pchRenderModelName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
        }
        return nVRRenderModels_GetComponentCount(memAddress(pchRenderModelName));
    }

    /** {@code uint32_t VRRenderModels_GetComponentCount(char const * pchRenderModelName)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentCount(@NativeType("char const *") CharSequence pchRenderModelName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentCount(pchRenderModelNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentName ] ---

    /** {@code uint32_t VRRenderModels_GetComponentName(char const * pchRenderModelName, uint32_t unComponentIndex, char * pchComponentName, uint32_t unComponentNameLen)} */
    public static int nVRRenderModels_GetComponentName(long pchRenderModelName, int unComponentIndex, long pchComponentName, int unComponentNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchRenderModelName, unComponentIndex, pchComponentName, unComponentNameLen, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetComponentName(char const * pchRenderModelName, uint32_t unComponentIndex, char * pchComponentName, uint32_t unComponentNameLen)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentName(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("uint32_t") int unComponentIndex, @NativeType("char *") @Nullable ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
        }
        return nVRRenderModels_GetComponentName(memAddress(pchRenderModelName), unComponentIndex, memAddressSafe(pchComponentName), remainingSafe(pchComponentName));
    }

    /** {@code uint32_t VRRenderModels_GetComponentName(char const * pchRenderModelName, uint32_t unComponentIndex, char * pchComponentName, uint32_t unComponentNameLen)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentName(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("uint32_t") int unComponentIndex, @NativeType("char *") @Nullable ByteBuffer pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentName(pchRenderModelNameEncoded, unComponentIndex, memAddressSafe(pchComponentName), remainingSafe(pchComponentName));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRRenderModels_GetComponentName(char const * pchRenderModelName, uint32_t unComponentIndex, char * pchComponentName, uint32_t unComponentNameLen)} */
    @NativeType("uint32_t")
    public static String VRRenderModels_GetComponentName(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("uint32_t") int unComponentIndex, @NativeType("uint32_t") int unComponentNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            ByteBuffer pchComponentName = stack.malloc(unComponentNameLen);
            int __result = nVRRenderModels_GetComponentName(pchRenderModelNameEncoded, unComponentIndex, memAddress(pchComponentName), unComponentNameLen);
            return memASCII(pchComponentName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentButtonMask ] ---

    /** {@code uint64_t VRRenderModels_GetComponentButtonMask(char const * pchRenderModelName, char const * pchComponentName)} */
    public static long nVRRenderModels_GetComponentButtonMask(long pchRenderModelName, long pchComponentName) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentButtonMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(pchRenderModelName, pchComponentName, __functionAddress);
    }

    /** {@code uint64_t VRRenderModels_GetComponentButtonMask(char const * pchRenderModelName, char const * pchComponentName)} */
    @NativeType("uint64_t")
    public static long VRRenderModels_GetComponentButtonMask(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentButtonMask(memAddress(pchRenderModelName), memAddress(pchComponentName));
    }

    /** {@code uint64_t VRRenderModels_GetComponentButtonMask(char const * pchRenderModelName, char const * pchComponentName)} */
    @NativeType("uint64_t")
    public static long VRRenderModels_GetComponentButtonMask(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentButtonMask(pchRenderModelNameEncoded, pchComponentNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentRenderModelName ] ---

    /** {@code uint32_t VRRenderModels_GetComponentRenderModelName(char const * pchRenderModelName, char const * pchComponentName, char * pchComponentRenderModelName, uint32_t unComponentRenderModelNameLen)} */
    public static int nVRRenderModels_GetComponentRenderModelName(long pchRenderModelName, long pchComponentName, long pchComponentRenderModelName, int unComponentRenderModelNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentRenderModelName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchRenderModelName, pchComponentName, pchComponentRenderModelName, unComponentRenderModelNameLen, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetComponentRenderModelName(char const * pchRenderModelName, char const * pchComponentName, char * pchComponentRenderModelName, uint32_t unComponentRenderModelNameLen)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentRenderModelName(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName, @NativeType("char *") @Nullable ByteBuffer pchComponentRenderModelName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentRenderModelName(memAddress(pchRenderModelName), memAddress(pchComponentName), memAddressSafe(pchComponentRenderModelName), remainingSafe(pchComponentRenderModelName));
    }

    /** {@code uint32_t VRRenderModels_GetComponentRenderModelName(char const * pchRenderModelName, char const * pchComponentName, char * pchComponentRenderModelName, uint32_t unComponentRenderModelNameLen)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetComponentRenderModelName(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName, @NativeType("char *") @Nullable ByteBuffer pchComponentRenderModelName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentRenderModelName(pchRenderModelNameEncoded, pchComponentNameEncoded, memAddressSafe(pchComponentRenderModelName), remainingSafe(pchComponentRenderModelName));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRRenderModels_GetComponentRenderModelName(char const * pchRenderModelName, char const * pchComponentName, char * pchComponentRenderModelName, uint32_t unComponentRenderModelNameLen)} */
    @NativeType("uint32_t")
    public static String VRRenderModels_GetComponentRenderModelName(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName, @NativeType("uint32_t") int unComponentRenderModelNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            ByteBuffer pchComponentRenderModelName = stack.malloc(unComponentRenderModelNameLen);
            int __result = nVRRenderModels_GetComponentRenderModelName(pchRenderModelNameEncoded, pchComponentNameEncoded, memAddress(pchComponentRenderModelName), unComponentRenderModelNameLen);
            return memASCII(pchComponentRenderModelName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentStateForDevicePath ] ---

    /** {@code bool VRRenderModels_GetComponentStateForDevicePath(char const * pchRenderModelName, char const * pchComponentName, VRInputValueHandle_t devicePath, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    public static boolean nVRRenderModels_GetComponentStateForDevicePath(long pchRenderModelName, long pchComponentName, long devicePath, long pState, long pComponentState) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentStateForDevicePath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJPPZ(pchRenderModelName, pchComponentName, devicePath, pState, pComponentState, __functionAddress);
    }

    /** {@code bool VRRenderModels_GetComponentStateForDevicePath(char const * pchRenderModelName, char const * pchComponentName, VRInputValueHandle_t devicePath, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("bool")
    public static boolean VRRenderModels_GetComponentStateForDevicePath(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName, @NativeType("VRInputValueHandle_t") long devicePath, @NativeType("RenderModel_ControllerMode_State_t const *") RenderModelControllerModeState pState, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState pComponentState) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentStateForDevicePath(memAddress(pchRenderModelName), memAddress(pchComponentName), devicePath, pState.address(), pComponentState.address());
    }

    /** {@code bool VRRenderModels_GetComponentStateForDevicePath(char const * pchRenderModelName, char const * pchComponentName, VRInputValueHandle_t devicePath, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("bool")
    public static boolean VRRenderModels_GetComponentStateForDevicePath(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName, @NativeType("VRInputValueHandle_t") long devicePath, @NativeType("RenderModel_ControllerMode_State_t const *") RenderModelControllerModeState pState, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState pComponentState) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentStateForDevicePath(pchRenderModelNameEncoded, pchComponentNameEncoded, devicePath, pState.address(), pComponentState.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentState ] ---

    /** {@code bool VRRenderModels_GetComponentState(char const * pchRenderModelName, char const * pchComponentName, VRControllerState_t const * pControllerState, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    public static boolean nVRRenderModels_GetComponentState(long pchRenderModelName, long pchComponentName, long pControllerState, long pState, long pComponentState) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPZ(pchRenderModelName, pchComponentName, pControllerState, pState, pComponentState, __functionAddress);
    }

    /** {@code bool VRRenderModels_GetComponentState(char const * pchRenderModelName, char const * pchComponentName, VRControllerState_t const * pControllerState, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("bool")
    public static boolean VRRenderModels_GetComponentState(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName, @NativeType("VRControllerState_t const *") VRControllerState pControllerState, @NativeType("RenderModel_ControllerMode_State_t const *") RenderModelControllerModeState pState, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState pComponentState) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentState(memAddress(pchRenderModelName), memAddress(pchComponentName), pControllerState.address(), pState.address(), pComponentState.address());
    }

    /** {@code bool VRRenderModels_GetComponentState(char const * pchRenderModelName, char const * pchComponentName, VRControllerState_t const * pControllerState, RenderModel_ControllerMode_State_t const * pState, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("bool")
    public static boolean VRRenderModels_GetComponentState(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName, @NativeType("VRControllerState_t const *") VRControllerState pControllerState, @NativeType("RenderModel_ControllerMode_State_t const *") RenderModelControllerModeState pState, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState pComponentState) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetComponentState(pchRenderModelNameEncoded, pchComponentNameEncoded, pControllerState.address(), pState.address(), pComponentState.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_RenderModelHasComponent ] ---

    /** {@code bool VRRenderModels_RenderModelHasComponent(char const * pchRenderModelName, char const * pchComponentName)} */
    public static boolean nVRRenderModels_RenderModelHasComponent(long pchRenderModelName, long pchComponentName) {
        long __functionAddress = OpenVR.VRRenderModels.RenderModelHasComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchRenderModelName, pchComponentName, __functionAddress);
    }

    /** {@code bool VRRenderModels_RenderModelHasComponent(char const * pchRenderModelName, char const * pchComponentName)} */
    @NativeType("bool")
    public static boolean VRRenderModels_RenderModelHasComponent(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_RenderModelHasComponent(memAddress(pchRenderModelName), memAddress(pchComponentName));
    }

    /** {@code bool VRRenderModels_RenderModelHasComponent(char const * pchRenderModelName, char const * pchComponentName)} */
    @NativeType("bool")
    public static boolean VRRenderModels_RenderModelHasComponent(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_RenderModelHasComponent(pchRenderModelNameEncoded, pchComponentNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelThumbnailURL ] ---

    /** {@code uint32_t VRRenderModels_GetRenderModelThumbnailURL(char const * pchRenderModelName, char * pchThumbnailURL, uint32_t unThumbnailURLLen, EVRRenderModelError * peError)} */
    public static int nVRRenderModels_GetRenderModelThumbnailURL(long pchRenderModelName, long pchThumbnailURL, int unThumbnailURLLen, long peError) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelThumbnailURL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchRenderModelName, pchThumbnailURL, unThumbnailURLLen, peError, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelThumbnailURL(char const * pchRenderModelName, char * pchThumbnailURL, uint32_t unThumbnailURLLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelThumbnailURL(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char *") @Nullable ByteBuffer pchThumbnailURL, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(peError, 1);
        }
        return nVRRenderModels_GetRenderModelThumbnailURL(memAddress(pchRenderModelName), memAddressSafe(pchThumbnailURL), remainingSafe(pchThumbnailURL), memAddress(peError));
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelThumbnailURL(char const * pchRenderModelName, char * pchThumbnailURL, uint32_t unThumbnailURLLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelThumbnailURL(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char *") @Nullable ByteBuffer pchThumbnailURL, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetRenderModelThumbnailURL(pchRenderModelNameEncoded, memAddressSafe(pchThumbnailURL), remainingSafe(pchThumbnailURL), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelThumbnailURL(char const * pchRenderModelName, char * pchThumbnailURL, uint32_t unThumbnailURLLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static String VRRenderModels_GetRenderModelThumbnailURL(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("uint32_t") int unThumbnailURLLen, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            ByteBuffer pchThumbnailURL = stack.malloc(unThumbnailURLLen);
            int __result = nVRRenderModels_GetRenderModelThumbnailURL(pchRenderModelNameEncoded, memAddress(pchThumbnailURL), unThumbnailURLLen, memAddress(peError));
            return memASCII(pchThumbnailURL, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelOriginalPath ] ---

    /** {@code uint32_t VRRenderModels_GetRenderModelOriginalPath(char const * pchRenderModelName, char * pchOriginalPath, uint32_t unOriginalPathLen, EVRRenderModelError * peError)} */
    public static int nVRRenderModels_GetRenderModelOriginalPath(long pchRenderModelName, long pchOriginalPath, int unOriginalPathLen, long peError) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelOriginalPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchRenderModelName, pchOriginalPath, unOriginalPathLen, peError, __functionAddress);
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelOriginalPath(char const * pchRenderModelName, char * pchOriginalPath, uint32_t unOriginalPathLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelOriginalPath(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char *") @Nullable ByteBuffer pchOriginalPath, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(peError, 1);
        }
        return nVRRenderModels_GetRenderModelOriginalPath(memAddress(pchRenderModelName), memAddressSafe(pchOriginalPath), remainingSafe(pchOriginalPath), memAddress(peError));
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelOriginalPath(char const * pchRenderModelName, char * pchOriginalPath, uint32_t unOriginalPathLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static int VRRenderModels_GetRenderModelOriginalPath(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char *") @Nullable ByteBuffer pchOriginalPath, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            return nVRRenderModels_GetRenderModelOriginalPath(pchRenderModelNameEncoded, memAddressSafe(pchOriginalPath), remainingSafe(pchOriginalPath), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRRenderModels_GetRenderModelOriginalPath(char const * pchRenderModelName, char * pchOriginalPath, uint32_t unOriginalPathLen, EVRRenderModelError * peError)} */
    @NativeType("uint32_t")
    public static String VRRenderModels_GetRenderModelOriginalPath(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("uint32_t") int unOriginalPathLen, @NativeType("EVRRenderModelError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            ByteBuffer pchOriginalPath = stack.malloc(unOriginalPathLen);
            int __result = nVRRenderModels_GetRenderModelOriginalPath(pchRenderModelNameEncoded, memAddress(pchOriginalPath), unOriginalPathLen, memAddress(peError));
            return memASCII(pchOriginalPath, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelErrorNameFromEnum ] ---

    /** {@code char const * VRRenderModels_GetRenderModelErrorNameFromEnum(EVRRenderModelError error)} */
    public static long nVRRenderModels_GetRenderModelErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /** {@code char const * VRRenderModels_GetRenderModelErrorNameFromEnum(EVRRenderModelError error)} */
    @NativeType("char const *")
    public static @Nullable String VRRenderModels_GetRenderModelErrorNameFromEnum(@NativeType("EVRRenderModelError") int error) {
        long __result = nVRRenderModels_GetRenderModelErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

}