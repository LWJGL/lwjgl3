/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class SDLCPUInfo {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNumLogicalCPUCores = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumLogicalCPUCores"),
            GetCPUCacheLineSize   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCPUCacheLineSize"),
            HasAltiVec            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAltiVec"),
            HasMMX                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasMMX"),
            HasSSE                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE"),
            HasSSE2               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE2"),
            HasSSE3               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE3"),
            HasSSE41              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE41"),
            HasSSE42              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE42"),
            HasAVX                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX"),
            HasAVX2               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX2"),
            HasAVX512F            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX512F"),
            HasARMSIMD            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasARMSIMD"),
            HasNEON               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasNEON"),
            HasLSX                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasLSX"),
            HasLASX               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasLASX"),
            GetSystemRAM          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSystemRAM"),
            GetSIMDAlignment      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSIMDAlignment");

    }

    public static final int SDL_CACHELINE_SIZE = 128;

    protected SDLCPUInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetNumLogicalCPUCores ] ---

    /** {@code int SDL_GetNumLogicalCPUCores(void)} */
    public static int SDL_GetNumLogicalCPUCores() {
        long __functionAddress = Functions.GetNumLogicalCPUCores;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetCPUCacheLineSize ] ---

    /** {@code int SDL_GetCPUCacheLineSize(void)} */
    public static int SDL_GetCPUCacheLineSize() {
        long __functionAddress = Functions.GetCPUCacheLineSize;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_HasAltiVec ] ---

    /** {@code bool SDL_HasAltiVec(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAltiVec() {
        long __functionAddress = Functions.HasAltiVec;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasMMX ] ---

    /** {@code bool SDL_HasMMX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasMMX() {
        long __functionAddress = Functions.HasMMX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE ] ---

    /** {@code bool SDL_HasSSE(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE() {
        long __functionAddress = Functions.HasSSE;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE2 ] ---

    /** {@code bool SDL_HasSSE2(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE2() {
        long __functionAddress = Functions.HasSSE2;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE3 ] ---

    /** {@code bool SDL_HasSSE3(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE3() {
        long __functionAddress = Functions.HasSSE3;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE41 ] ---

    /** {@code bool SDL_HasSSE41(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE41() {
        long __functionAddress = Functions.HasSSE41;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE42 ] ---

    /** {@code bool SDL_HasSSE42(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE42() {
        long __functionAddress = Functions.HasSSE42;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX ] ---

    /** {@code bool SDL_HasAVX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX() {
        long __functionAddress = Functions.HasAVX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX2 ] ---

    /** {@code bool SDL_HasAVX2(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX2() {
        long __functionAddress = Functions.HasAVX2;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX512F ] ---

    /** {@code bool SDL_HasAVX512F(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX512F() {
        long __functionAddress = Functions.HasAVX512F;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasARMSIMD ] ---

    /** {@code bool SDL_HasARMSIMD(void)} */
    @NativeType("bool")
    public static boolean SDL_HasARMSIMD() {
        long __functionAddress = Functions.HasARMSIMD;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasNEON ] ---

    /** {@code bool SDL_HasNEON(void)} */
    @NativeType("bool")
    public static boolean SDL_HasNEON() {
        long __functionAddress = Functions.HasNEON;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasLSX ] ---

    /** {@code bool SDL_HasLSX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasLSX() {
        long __functionAddress = Functions.HasLSX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasLASX ] ---

    /** {@code bool SDL_HasLASX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasLASX() {
        long __functionAddress = Functions.HasLASX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetSystemRAM ] ---

    /** {@code int SDL_GetSystemRAM(void)} */
    public static int SDL_GetSystemRAM() {
        long __functionAddress = Functions.GetSystemRAM;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetSIMDAlignment ] ---

    /** {@code size_t SDL_GetSIMDAlignment(void)} */
    @NativeType("size_t")
    public static long SDL_GetSIMDAlignment() {
        long __functionAddress = Functions.GetSIMDAlignment;
        return invokeP(__functionAddress);
    }

}