/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.nanovg.NanoVG.*;

/** Implementation of the NanoVG API using bgfx. */
public class NanoVGBGFX {

    protected NanoVGBGFX() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from bgfx. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Create                 = apiGetFunctionAddress(BGFX.getLibrary(), "nvgCreate"),
            Delete                 = apiGetFunctionAddress(BGFX.getLibrary(), "nvgDelete"),
            SetViewId              = apiGetFunctionAddress(BGFX.getLibrary(), "nvgSetViewId"),
            GetViewId              = apiGetFunctionAddress(BGFX.getLibrary(), "nvgGetViewId"),
            luCreateFramebuffer    = apiGetFunctionAddress(BGFX.getLibrary(), "nvgluCreateFramebuffer"),
            luBindFramebuffer      = apiGetFunctionAddress(BGFX.getLibrary(), "nvgluBindFramebuffer"),
            luDeleteFramebuffer    = apiGetFunctionAddress(BGFX.getLibrary(), "nvgluDeleteFramebuffer"),
            luSetViewFramebuffer   = apiGetFunctionAddress(BGFX.getLibrary(), "nvgluSetViewFramebuffer"),
            org_lwjgl_nanovg_setup = apiGetFunctionAddress(BGFX.getLibrary(), "org_lwjgl_nanovg_setup");

    }

    static {
        MemoryAllocator allocator = getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        org_lwjgl_nanovg_setup(
            allocator.getRealloc(),
            allocator.getFree(),
            nvgCreateInternal,
            nvgInternalParams,
            nvgDeleteInternal
        );
    }

    // --- [ nvgCreate ] ---

    public static long nnvgCreate(int _edgeaa, short _viewId, long _allocator) {
        long __functionAddress = Functions.Create;
        return invokePP(_edgeaa, _viewId, _allocator, __functionAddress);
    }

    @NativeType("NVGcontext *")
    public static long nvgCreate(@NativeType("int32_t") boolean _edgeaa, @NativeType("bgfx_view_id_t") int _viewId, @NativeType("bgfx_allocator_interface_t *") long _allocator) {
        return nnvgCreate(_edgeaa ? 1 : 0, (short)_viewId, _allocator);
    }

    // --- [ nvgDelete ] ---

    public static void nvgDelete(@NativeType("NVGcontext *") long _ctx) {
        long __functionAddress = Functions.Delete;
        if (CHECKS) {
            check(_ctx);
        }
        invokePV(_ctx, __functionAddress);
    }

    // --- [ nvgSetViewId ] ---

    public static void nnvgSetViewId(long _ctx, short _viewId) {
        long __functionAddress = Functions.SetViewId;
        if (CHECKS) {
            check(_ctx);
        }
        invokePV(_ctx, _viewId, __functionAddress);
    }

    public static void nvgSetViewId(@NativeType("NVGcontext *") long _ctx, @NativeType("bgfx_view_id_t") int _viewId) {
        nnvgSetViewId(_ctx, (short)_viewId);
    }

    // --- [ nvgGetViewId ] ---

    @NativeType("uint16_t")
    public static short nvgGetViewId(@NativeType("NVGcontext *") long _ctx) {
        long __functionAddress = Functions.GetViewId;
        if (CHECKS) {
            check(_ctx);
        }
        return invokePS(_ctx, __functionAddress);
    }

    // --- [ nvgluCreateFramebuffer ] ---

    public static long nnvgluCreateFramebuffer(long _ctx, int _width, int _height, int imageFlags) {
        long __functionAddress = Functions.luCreateFramebuffer;
        if (CHECKS) {
            check(_ctx);
        }
        return invokePP(_ctx, _width, _height, imageFlags, __functionAddress);
    }

    @Nullable
    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebufferBGFX nvgluCreateFramebuffer(@NativeType("NVGcontext *") long _ctx, @NativeType("int32_t") int _width, @NativeType("int32_t") int _height, @NativeType("int32_t") int imageFlags) {
        long __result = nnvgluCreateFramebuffer(_ctx, _width, _height, imageFlags);
        return NVGLUFramebufferBGFX.createSafe(__result);
    }

    // --- [ nvgluBindFramebuffer ] ---

    public static void nnvgluBindFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luBindFramebuffer;
        invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluBindFramebuffer(@Nullable @NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluBindFramebuffer(memAddressSafe(_framebuffer));
    }

    // --- [ nvgluDeleteFramebuffer ] ---

    public static void nnvgluDeleteFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luDeleteFramebuffer;
        invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluDeleteFramebuffer(@NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluDeleteFramebuffer(_framebuffer.address());
    }

    // --- [ nvgluSetViewFramebuffer ] ---

    public static void nnvgluSetViewFramebuffer(short _view_id, long _framebuffer) {
        long __functionAddress = Functions.luSetViewFramebuffer;
        invokePV(_view_id, _framebuffer, __functionAddress);
    }

    public static void nvgluSetViewFramebuffer(@NativeType("bgfx_view_id_t") int _view_id, @NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluSetViewFramebuffer((short)_view_id, _framebuffer.address());
    }

    // --- [ org_lwjgl_nanovg_setup ] ---

    private static void org_lwjgl_nanovg_setup(@NativeType("void *") long realloc, @NativeType("void *") long free, @NativeType("void *") long nvgCreateInternal, @NativeType("void *") long nvgInternalParams, @NativeType("void *") long nvgDeleteInternal) {
        long __functionAddress = Functions.org_lwjgl_nanovg_setup;
        if (CHECKS) {
            check(realloc);
            check(free);
            check(nvgCreateInternal);
            check(nvgInternalParams);
            check(nvgDeleteInternal);
        }
        invokePPPPPV(realloc, free, nvgCreateInternal, nvgInternalParams, nvgDeleteInternal, __functionAddress);
    }

    private static class BGFX {
        private static final SharedLibrary library;

        static {
            try {
                library = (SharedLibrary)Class.forName("org.lwjgl.bgfx.BGFX").getMethod("getLibrary").invoke(null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        static SharedLibrary getLibrary() {
            return library;
        }
    }

}