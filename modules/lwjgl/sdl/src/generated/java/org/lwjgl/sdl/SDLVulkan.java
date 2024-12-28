/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class SDLVulkan {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Vulkan_LoadLibrary              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_LoadLibrary"),
            Vulkan_GetVkGetInstanceProcAddr = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetVkGetInstanceProcAddr"),
            Vulkan_UnloadLibrary            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_UnloadLibrary"),
            Vulkan_GetInstanceExtensions    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetInstanceExtensions"),
            Vulkan_CreateSurface            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_CreateSurface"),
            Vulkan_DestroySurface           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_DestroySurface"),
            Vulkan_GetPresentationSupport   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetPresentationSupport");

    }

    protected SDLVulkan() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_Vulkan_LoadLibrary ] ---

    /** {@code bool SDL_Vulkan_LoadLibrary(char const * path)} */
    public static boolean nSDL_Vulkan_LoadLibrary(long path) {
        long __functionAddress = Functions.Vulkan_LoadLibrary;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_Vulkan_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_Vulkan_LoadLibrary(@NativeType("char const *") @Nullable ByteBuffer path) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return nSDL_Vulkan_LoadLibrary(memAddressSafe(path));
    }

    /** {@code bool SDL_Vulkan_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_Vulkan_LoadLibrary(@NativeType("char const *") @Nullable CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            return nSDL_Vulkan_LoadLibrary(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_Vulkan_GetVkGetInstanceProcAddr ] ---

    /** {@code SDL_FunctionPointer SDL_Vulkan_GetVkGetInstanceProcAddr(void)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_Vulkan_GetVkGetInstanceProcAddr() {
        long __functionAddress = Functions.Vulkan_GetVkGetInstanceProcAddr;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_Vulkan_UnloadLibrary ] ---

    /** {@code void SDL_Vulkan_UnloadLibrary(void)} */
    public static void SDL_Vulkan_UnloadLibrary() {
        long __functionAddress = Functions.Vulkan_UnloadLibrary;
        invokeV(__functionAddress);
    }

    // --- [ SDL_Vulkan_GetInstanceExtensions ] ---

    /** {@code char const * const * SDL_Vulkan_GetInstanceExtensions(Uint32 * count)} */
    public static long nSDL_Vulkan_GetInstanceExtensions(long count) {
        long __functionAddress = Functions.Vulkan_GetInstanceExtensions;
        return invokePP(count, __functionAddress);
    }

    /** {@code char const * const * SDL_Vulkan_GetInstanceExtensions(Uint32 * count)} */
    @NativeType("char const * const *")
    public static @Nullable PointerBuffer SDL_Vulkan_GetInstanceExtensions() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_Vulkan_GetInstanceExtensions(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_Vulkan_CreateSurface ] ---

    /** {@code bool SDL_Vulkan_CreateSurface(SDL_Window * window, VkInstance instance, VkAllocationCallbacks const * allocator, VkSurfaceKHR * surface)} */
    public static boolean nSDL_Vulkan_CreateSurface(long window, long instance, long allocator, long surface) {
        long __functionAddress = Functions.Vulkan_CreateSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPZ(window, instance, allocator, surface, __functionAddress);
    }

    /** {@code bool SDL_Vulkan_CreateSurface(SDL_Window * window, VkInstance instance, VkAllocationCallbacks const * allocator, VkSurfaceKHR * surface)} */
    @NativeType("bool")
    public static boolean SDL_Vulkan_CreateSurface(@NativeType("SDL_Window *") long window, VkInstance instance, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") LongBuffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_Vulkan_CreateSurface(window, instance.address(), memAddressSafe(allocator), memAddress(surface));
    }

    // --- [ SDL_Vulkan_DestroySurface ] ---

    /** {@code void SDL_Vulkan_DestroySurface(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks const * allocator)} */
    public static void nSDL_Vulkan_DestroySurface(long instance, long surface, long allocator) {
        long __functionAddress = Functions.Vulkan_DestroySurface;
        invokePJPV(instance, surface, allocator, __functionAddress);
    }

    /** {@code void SDL_Vulkan_DestroySurface(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks const * allocator)} */
    public static void SDL_Vulkan_DestroySurface(VkInstance instance, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks allocator) {
        nSDL_Vulkan_DestroySurface(instance.address(), surface, memAddressSafe(allocator));
    }

    // --- [ SDL_Vulkan_GetPresentationSupport ] ---

    /** {@code bool SDL_Vulkan_GetPresentationSupport(VkInstance instance, VkPhysicalDevice physicalDevice, Uint32 queueFamilyIndex)} */
    @NativeType("bool")
    public static boolean SDL_Vulkan_GetPresentationSupport(VkInstance instance, VkPhysicalDevice physicalDevice, @NativeType("Uint32") int queueFamilyIndex) {
        long __functionAddress = Functions.Vulkan_GetPresentationSupport;
        return invokePPZ(instance.address(), physicalDevice.address(), queueFamilyIndex, __functionAddress);
    }

}