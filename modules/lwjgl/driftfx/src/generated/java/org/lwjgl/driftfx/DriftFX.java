/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.driftfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Bindings to the {@code DriftFX} class. */
public class DriftFX {

    /**
     * {@code PresentationHint}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #DRIFTFX_CENTER CENTER}</li>
     * <li>{@link #DRIFTFX_COVER COVER}</li>
     * <li>{@link #DRIFTFX_CONTAIN CONTAIN}</li>
     * <li>{@link #DRIFTFX_TOP_LEFT TOP_LEFT}</li>
     * <li>{@link #DRIFTFX_TOP_CENTER TOP_CENTER}</li>
     * <li>{@link #DRIFTFX_TOP_RIGHT TOP_RIGHT}</li>
     * <li>{@link #DRIFTFX_CENTER_LEFT CENTER_LEFT}</li>
     * <li>{@link #DRIFTFX_CENTER_RIGHT CENTER_RIGHT}</li>
     * <li>{@link #DRIFTFX_BOTTOM_LEFT BOTTOM_LEFT}</li>
     * <li>{@link #DRIFTFX_BOTTOM_CENTER BOTTOM_CENTER}</li>
     * <li>{@link #DRIFTFX_BOTTOM_RIGHT BOTTOM_RIGHT}</li>
     * </ul>
     */
    public static final int
        DRIFTFX_CENTER        = 0x0,
        DRIFTFX_COVER         = 0x1,
        DRIFTFX_CONTAIN       = 0x2,
        DRIFTFX_TOP_LEFT      = 0x3,
        DRIFTFX_TOP_CENTER    = 0x4,
        DRIFTFX_TOP_RIGHT     = 0x5,
        DRIFTFX_CENTER_LEFT   = 0x6,
        DRIFTFX_CENTER_RIGHT  = 0x7,
        DRIFTFX_BOTTOM_LEFT   = 0x8,
        DRIFTFX_BOTTOM_CENTER = 0x9,
        DRIFTFX_BOTTOM_RIGHT  = 0xA;

    static { LibDriftFX.initialize(); }

    protected DriftFX() {
        throw new UnsupportedOperationException();
    }

    // --- [ driftfxGet ] ---

    @NativeType("driftfx::DriftFX *")
    public static native long driftfxGet();

    // --- [ driftfxGetSurface ] ---

    public static native long ndriftfxGetSurface(long _this, long surfaceId);

    @NativeType("driftfx::DriftFXSurface *")
    public static long driftfxGetSurface(@NativeType("driftfx::DriftFX *") long _this, long surfaceId) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxGetSurface(_this, surfaceId);
    }

    // --- [ driftfxSurfaceInitialize ] ---

    /** Unsafe version of: {@link #driftfxSurfaceInitialize SurfaceInitialize} */
    public static native void ndriftfxSurfaceInitialize(long _this);

    /**
     * Initializes this surface.
     * 
     * <p>Should be called on your render thread. This will create a {@code GLContext}. Its accessible via {@link #driftfxSurfaceGetContext SurfaceGetContext}.</p>
     */
    public static void driftfxSurfaceInitialize(@NativeType("driftfx::DriftFXSurface *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceInitialize(_this);
    }

    // --- [ driftfxSurfaceCleanup ] ---

    /** Unsafe version of: {@link #driftfxSurfaceCleanup SurfaceCleanup} */
    public static native void ndriftfxSurfaceCleanup(long _this);

    /**
     * Cleanup this native surface.
     * 
     * <p>Should be called on your render thread. Releases all pending resources and destroys its contexts.</p>
     */
    public static void driftfxSurfaceCleanup(@NativeType("driftfx::DriftFXSurface *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceCleanup(_this);
    }

    // --- [ driftfxSurfaceAcquire ] ---

    /** Unsafe version of: {@link #driftfxSurfaceAcquire SurfaceAcquire} */
    public static native long ndriftfxSurfaceAcquire(long _this, int width, int height, long transferMode);

    /**
     * Acquires a new {@code RenderTarget} with the given size.
     *
     * @param width        the render target width, or -1 to use the surface width
     * @param height       the render target height, or -1 to use the surface height
     * @param transferMode the transfer mode, or {@code null} to use the default
     */
    @NativeType("driftfx::RenderTarget *")
    public static long driftfxSurfaceAcquire(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("driftfx::TransferMode *") long transferMode) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxSurfaceAcquire(_this, width, height, transferMode);
    }

    // --- [ driftfxSurfaceAcquireV ] ---

    /** Unsafe version of: {@link #driftfxSurfaceAcquireV SurfaceAcquireV} */
    public static native long ndriftfxSurfaceAcquireV(long _this, long size);

    /**
     * Acquires a new {@code RenderTarget} with the given size.
     * 
     * <p>Should be called from your render thread.</p>
     */
    @NativeType("driftfx::RenderTarget *")
    public static long driftfxSurfaceAcquireV(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2ui") Vec2ui size) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxSurfaceAcquireV(_this, size.address());
    }

    // --- [ driftfxSurfaceAcquireVM ] ---

    /** Unsafe version of: {@link #driftfxSurfaceAcquireVM SurfaceAcquireVM} */
    public static native long ndriftfxSurfaceAcquireVM(long _this, long size, long transferMode);

    /**
     * Acquires a new {@code RenderTarget} with the given size.
     * 
     * <p>Should be called from your render thread.</p>
     */
    @NativeType("driftfx::RenderTarget *")
    public static long driftfxSurfaceAcquireVM(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2ui") Vec2ui size, @NativeType("driftfx::TransferMode *") long transferMode) {
        if (CHECKS) {
            check(_this);
            check(transferMode);
        }
        return ndriftfxSurfaceAcquireVM(_this, size.address(), transferMode);
    }

    // --- [ driftfxSurfacePresent ] ---

    /** Unsafe version of: {@link #driftfxSurfacePresent SurfacePresent} */
    public static native void ndriftfxSurfacePresent(long _this, long target, int hint);

    /**
     * Presents a previously acquired {@code RenderTarget}.
     * 
     * <p>Should be called from your render thread.</p>
     */
    public static void driftfxSurfacePresent(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::RenderTarget *") long target, @NativeType("driftfx::PresentationHint") int hint) {
        if (CHECKS) {
            check(_this);
            check(target);
        }
        ndriftfxSurfacePresent(_this, target, hint);
    }

    // --- [ driftfxSurfaceGetContext ] ---

    public static native long ndriftfxSurfaceGetContext(long _this);

    @NativeType("driftfx::gl::GLContext *")
    public static long driftfxSurfaceGetContext(@NativeType("driftfx::DriftFXSurface *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxSurfaceGetContext(_this);
    }

    // --- [ driftfxSurfaceGetWidth ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetWidth SurfaceGetWidth} */
    public static native int ndriftfxSurfaceGetWidth(long _this);

    /** Returns the current width of the {@code NativeSurface} in JavaFX. */
    @NativeType("unsigned int")
    public static int driftfxSurfaceGetWidth(@NativeType("driftfx::DriftFXSurface *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxSurfaceGetWidth(_this);
    }

    // --- [ driftfxSurfaceGetHeight ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetHeight SurfaceGetHeight} */
    public static native int ndriftfxSurfaceGetHeight(long _this);

    /** Returns the current height of the {@code NativeSurface} in JavaFX. */
    @NativeType("unsigned int")
    public static int driftfxSurfaceGetHeight(@NativeType("driftfx::DriftFXSurface *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxSurfaceGetHeight(_this);
    }

    // --- [ driftfxSurfaceGetSurfaceSize ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetSurfaceSize SurfaceGetSurfaceSize} */
    public static native void ndriftfxSurfaceGetSurfaceSize(long _this, long __result);

    /** Returns the current surface size in JavaFX units. */
    @NativeType("driftfx::math::Vec2d")
    public static Vec2d driftfxSurfaceGetSurfaceSize(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2d") Vec2d __result) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceGetSurfaceSize(_this, __result.address());
        return __result;
    }

    // --- [ driftfxSurfaceGetScreenScale ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetScreenScale SurfaceGetScreenScale} */
    public static native void ndriftfxSurfaceGetScreenScale(long _this, long __result);

    /** Returns the current screen scale. */
    @NativeType("driftfx::math::Vec2d")
    public static Vec2d driftfxSurfaceGetScreenScale(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2d") Vec2d __result) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceGetScreenScale(_this, __result.address());
        return __result;
    }

    // --- [ driftfxSurfaceGetUserScale ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetUserScale SurfaceGetUserScale} */
    public static native void ndriftfxSurfaceGetUserScale(long _this, long __result);

    /** Returns the current user scale. */
    @NativeType("driftfx::math::Vec2d")
    public static Vec2d driftfxSurfaceGetUserScale(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2d") Vec2d __result) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceGetUserScale(_this, __result.address());
        return __result;
    }

    // --- [ driftfxSurfaceGetScaledSize ] ---

    /** Unsafe version of: {@link #driftfxSurfaceGetScaledSize SurfaceGetScaledSize} */
    public static native void ndriftfxSurfaceGetScaledSize(long _this, long __result);

    /** Returns {@code ceil(surfaceSize * screenScale * userScale)}. */
    @NativeType("driftfx::math::Vec2ui")
    public static Vec2ui driftfxSurfaceGetScaledSize(@NativeType("driftfx::DriftFXSurface *") long _this, @NativeType("driftfx::math::Vec2ui") Vec2ui __result) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxSurfaceGetScaledSize(_this, __result.address());
        return __result;
    }

    // --- [ driftfxSurfaceGetAvailableTransferModes ] ---

    public static native long ndriftfxSurfaceGetAvailableTransferModes(long modes, long modesLength);

    @NativeType("size_t")
    public static long driftfxSurfaceGetAvailableTransferModes(@Nullable @NativeType("driftfx::TransferMode **") PointerBuffer modes) {
        return ndriftfxSurfaceGetAvailableTransferModes(memAddressSafe(modes), remainingSafe(modes));
    }

    // --- [ driftfxSurfaceGetPlatformDefaultTransferMode ] ---

    @NativeType("driftfx::TransferMode *")
    public static native long driftfxSurfaceGetPlatformDefaultTransferMode();

    // --- [ driftfxSurfaceGetFallbackTransferMode ] ---

    @NativeType("driftfx::TransferMode *")
    public static native long driftfxSurfaceGetFallbackTransferMode();

    // --- [ driftfxContextCreateTexture ] ---

    public static native long ndriftfxContextCreateTexture(long _this, int width, int height);

    @NativeType("driftfx::Texture *")
    public static long driftfxContextCreateTexture(@NativeType("driftfx::Context *") long _this, int width, int height) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxContextCreateTexture(_this, width, height);
    }

    // --- [ driftfxRenderTargetGetWidth ] ---

    public static native int ndriftfxRenderTargetGetWidth(long _this);

    @NativeType("unsigned int")
    public static int driftfxRenderTargetGetWidth(@NativeType("driftfx::RenderTarget *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxRenderTargetGetWidth(_this);
    }

    // --- [ driftfxRenderTargetGetHeight ] ---

    public static native int ndriftfxRenderTargetGetHeight(long _this);

    @NativeType("unsigned int")
    public static int driftfxRenderTargetGetHeight(@NativeType("driftfx::RenderTarget *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxRenderTargetGetHeight(_this);
    }

    // --- [ driftfxRenderTargetGetGLTexture ] ---

    public static native int ndriftfxRenderTargetGetGLTexture(long _this);

    @NativeType("unsigned int")
    public static int driftfxRenderTargetGetGLTexture(@NativeType("driftfx::RenderTarget *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxRenderTargetGetGLTexture(_this);
    }

    // --- [ driftfxTextureGetWidth ] ---

    public static native int ndriftfxTextureGetWidth(long _this);

    @NativeType("unsigned int")
    public static int driftfxTextureGetWidth(@NativeType("driftfx::Texture *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxTextureGetWidth(_this);
    }

    // --- [ driftfxTextureGetHeight ] ---

    public static native int ndriftfxTextureGetHeight(long _this);

    @NativeType("unsigned int")
    public static int driftfxTextureGetHeight(@NativeType("driftfx::Texture *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxTextureGetHeight(_this);
    }

    // --- [ driftfxTransferModeId ] ---

    public static native int ndriftfxTransferModeId(long _this);

    @NativeType("driftfx::TransferModeId")
    public static int driftfxTransferModeId(@NativeType("driftfx::TransferMode *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxTransferModeId(_this);
    }

    // --- [ driftfxTransferModeName ] ---

    public static native long ndriftfxTransferModeName(long _this, long name, long nameLength);

    @NativeType("size_t")
    public static long driftfxTransferModeName(@NativeType("driftfx::TransferMode *") long _this, @Nullable @NativeType("char *") ByteBuffer name) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxTransferModeName(_this, memAddressSafe(name), remainingSafe(name));
    }

    // --- [ driftfxGLContextSetCurrent ] ---

    public static native void ndriftfxGLContextSetCurrent(long _this);

    public static void driftfxGLContextSetCurrent(@NativeType("driftfx::gl::GLContext *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxGLContextSetCurrent(_this);
    }

    // --- [ driftfxGLContextUnsetCurrent ] ---

    public static native void ndriftfxGLContextUnsetCurrent(long _this);

    public static void driftfxGLContextUnsetCurrent(@NativeType("driftfx::gl::GLContext *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        ndriftfxGLContextUnsetCurrent(_this);
    }

    // --- [ driftfxGLContextIsCurrent ] ---

    public static native boolean ndriftfxGLContextIsCurrent(long _this);

    @NativeType("bool")
    public static boolean driftfxGLContextIsCurrent(@NativeType("driftfx::gl::GLContext *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxGLContextIsCurrent(_this);
    }

    // --- [ driftfxGLContextCreateSharedContext ] ---

    public static native long ndriftfxGLContextCreateSharedContext(long _this);

    @NativeType("driftfx::gl::GLContext *")
    public static long driftfxGLContextCreateSharedContext(@NativeType("driftfx::gl::GLContext *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxGLContextCreateSharedContext(_this);
    }

    // --- [ driftfxGLContextCreateTexture ] ---

    public static native long ndriftfxGLContextCreateTexture(long _this, int width, int height);

    @NativeType("driftfx::Texture *")
    public static long driftfxGLContextCreateTexture(@NativeType("driftfx::gl::GLContext *") long _this, int width, int height) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxGLContextCreateTexture(_this, width, height);
    }

    // --- [ driftfxGLContextGetName ] ---

    public static native long ndriftfxGLContextGetName(long _this, long name, long nameLength);

    @NativeType("size_t")
    public static long driftfxGLContextGetName(@NativeType("driftfx::gl::GLContext *") long _this, @Nullable @NativeType("char *") ByteBuffer name) {
        if (CHECKS) {
            check(_this);
        }
        return ndriftfxGLContextGetName(_this, memAddressSafe(name), remainingSafe(name));
    }

}