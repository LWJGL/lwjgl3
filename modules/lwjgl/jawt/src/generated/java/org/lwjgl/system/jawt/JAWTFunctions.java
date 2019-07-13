/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import java.awt.Component;
import java.awt.Frame;

/**
 * Bindings to the AWT native interface (jawt.h).
 * 
 * <p>The AWT native interface allows a native C or C++ application a means by which to access native structures in AWT. This is to facilitate moving legacy
 * C and C++ applications to Java and to target the needs of the community who, at present, wish to do their own native rendering to canvases for
 * performance reasons. Standard extensions such as Java3D also require a means to access the underlying native data structures of AWT.</p>
 * 
 * <h3>AWT Native Drawing Surface (JAWT_DrawingSurface)</h3>
 * 
 * <p>For each platform, there is a native drawing surface structure. This platform-specific structure can be found in {@code jawt_md.h}. See
 * {@link JAWTX11DrawingSurfaceInfo} for the Linux platform, {@link JAWTWin32DrawingSurfaceInfo} for the Windows platform and {@link #JAWT_MACOSX_USE_CALAYER MACOSX_USE_CALAYER} for the OS X
 * platform.</p>
 */
public class JAWTFunctions {

    /** JAWT versions. */
    public static final int
        JAWT_VERSION_1_3 = 0x10003,
        JAWT_VERSION_1_4 = 0x10004,
        JAWT_VERSION_1_7 = 0x10007,
        JAWT_VERSION_9   = 0x90000;

    /**
     * When calling {@link #JAWT_GetAWT GetAWT} with a JAWT version less than 1.7, you must pass this flag or you will not be able to get a valid drawing surface and {@link #JAWT_GetAWT GetAWT}
     * will return false. This is to maintain compatibility with applications that used the interface with Java 6 which had multiple rendering models. This
     * flag is not necessary when JAWT version 1.7 or greater is used as this is the only supported rendering mode.
     * 
     * <p>When the native Cocoa toolkit is in use, the pointer stored in {@code JAWT_DrawingSurfaceInfo->platformInfo} points to a {@code NSObject} that conforms
     * to the {@code JAWT_SurfaceLayers} protocol. Setting the layer property of this object will cause the specified layer to be overlaid on the Component's
     * rectangle. If the window the Component belongs to has a {@code CALayer} attached to it, this layer will be accessible via the {@code windowLayer}
     * property.</p>
     * 
     * <pre><code>
     * &#64;protocol JAWT_SurfaceLayers
     *     &#64;property (readwrite, retain) CALayer *layer;
     *     &#64;property (readonly) CALayer *windowLayer;
     * &#64;end</code></pre>
     */
    public static final int JAWT_MACOSX_USE_CALAYER = 0x10008;

    /** Bitmask values returned by {@code Lock()}. */
    public static final int
        JAWT_LOCK_ERROR           = 0x1,
        JAWT_LOCK_CLIP_CHANGED    = 0x2,
        JAWT_LOCK_BOUNDS_CHANGED  = 0x4,
        JAWT_LOCK_SURFACE_CHANGED = 0x8;

    protected JAWTFunctions() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary JAWT = Library.loadNative(JAWTFunctions.class, "org.lwjgl.jawt", Configuration.JAWT_LIBRARY_NAME, "jawt", apiFindLibrary(System.getProperty("java.home"), "jawt"));

    /** Contains the function pointers loaded from the jawt {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetAWT = apiGetFunctionAddress(JAWT, Pointer.BITS64 || Platform.get() != Platform.WINDOWS ? "JAWT_GetAWT" : "_JAWT_GetAWT@8");

    }

    /** Returns the jawt {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return JAWT;
    }

    // --- [ JAWT_GetAWT ] ---

    /** Unsafe version of: {@link #JAWT_GetAWT GetAWT} */
    public static native boolean nJAWT_GetAWT(long awt, long __functionAddress);

    /** Unsafe version of: {@link #JAWT_GetAWT GetAWT} */
    public static boolean nJAWT_GetAWT(long awt) {
        long __functionAddress = Functions.GetAWT;
        return nJAWT_GetAWT(awt, __functionAddress);
    }

    /**
     * Returns the AWT native structure.
     *
     * @param awt the target {@code JAWT} struct
     *
     * @return {@code JNI_FALSE} if an error occurs
     */
    @NativeType("jboolean")
    public static boolean JAWT_GetAWT(@NativeType("JAWT *") JAWT awt) {
        return nJAWT_GetAWT(awt.address());
    }

    // --- [ JAWT_DrawingSurface_Lock ] ---

    /** Unsafe version of: {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} */
    public static int nJAWT_DrawingSurface_Lock(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(ds, __functionAddress);
    }

    /**
     * Locks the surface of the target component for native rendering. When finished drawing, the surface must be unlocked with {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock}.
     *
     * @param ds                the surface to lock
     * @param __functionAddress the function address
     *
     * @return a bitmask with one or more of the following values:
     *         
     *         <ul>
     *         <li>{@link #JAWT_LOCK_ERROR LOCK_ERROR} - When an error has occurred and the surface could not be locked.</li>
     *         <li>{@link #JAWT_LOCK_CLIP_CHANGED LOCK_CLIP_CHANGED} - When the clip region has changed.</li>
     *         <li>{@link #JAWT_LOCK_BOUNDS_CHANGED LOCK_BOUNDS_CHANGED} - When the bounds of the surface have changed.</li>
     *         <li>{@link #JAWT_LOCK_SURFACE_CHANGED LOCK_SURFACE_CHANGED} - When the surface itself has changed</li>
     *         </ul>
     */
    @NativeType("jint")
    public static int JAWT_DrawingSurface_Lock(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        return nJAWT_DrawingSurface_Lock(ds.address(), __functionAddress);
    }

    // --- [ JAWT_DrawingSurface_GetDrawingSurfaceInfo ] ---

    /** Unsafe version of: {@link #JAWT_DrawingSurface_GetDrawingSurfaceInfo DrawingSurface_GetDrawingSurfaceInfo} */
    public static long nJAWT_DrawingSurface_GetDrawingSurfaceInfo(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(ds, __functionAddress);
    }

    /**
     * Returns the drawing surface info.
     * 
     * <p>The value returned may be cached, but the values may change if additional calls to {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} or {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock} are made.
     * {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} must be called before this can return a valid value.</p>
     * 
     * <p>When finished with the returned value, {@link #JAWT_DrawingSurface_FreeDrawingSurfaceInfo DrawingSurface_FreeDrawingSurfaceInfo} must be called.</p>
     *
     * @param ds                the {@link JAWTDrawingSurface} to free
     * @param __functionAddress the function address
     *
     * @return {@code NULL} if an error has occurred.
     */
    @Nullable
    @NativeType("JAWT_DrawingSurfaceInfo *")
    public static JAWTDrawingSurfaceInfo JAWT_DrawingSurface_GetDrawingSurfaceInfo(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        long __result = nJAWT_DrawingSurface_GetDrawingSurfaceInfo(ds.address(), __functionAddress);
        return JAWTDrawingSurfaceInfo.createSafe(__result);
    }

    // --- [ JAWT_DrawingSurface_FreeDrawingSurfaceInfo ] ---

    /** Unsafe version of: {@link #JAWT_DrawingSurface_FreeDrawingSurfaceInfo DrawingSurface_FreeDrawingSurfaceInfo} */
    public static void nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(long dsi, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(dsi, __functionAddress);
    }

    /**
     * Frees the drawing surface info.
     *
     * @param dsi               the {@link JAWTDrawingSurfaceInfo} to free
     * @param __functionAddress the function address
     */
    public static void JAWT_DrawingSurface_FreeDrawingSurfaceInfo(@NativeType("JAWT_DrawingSurfaceInfo *") JAWTDrawingSurfaceInfo dsi, @NativeType("void *") long __functionAddress) {
        nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(dsi.address(), __functionAddress);
    }

    // --- [ JAWT_DrawingSurface_Unlock ] ---

    /** Unsafe version of: {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock} */
    public static void nJAWT_DrawingSurface_Unlock(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ds, __functionAddress);
    }

    /**
     * Unlocks the drawing surface of the target component for native rendering.
     *
     * @param ds                the surface to unlock
     * @param __functionAddress the function address
     */
    public static void JAWT_DrawingSurface_Unlock(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        nJAWT_DrawingSurface_Unlock(ds.address(), __functionAddress);
    }

    // --- [ JAWT_GetDrawingSurface ] ---

    /** Unsafe version of: {@link #JAWT_GetDrawingSurface GetDrawingSurface} */
    public static native long nJAWT_GetDrawingSurface(Object target, long __functionAddress);

    /**
     * Returns a drawing surface from a target {@code jobject}. This value may be cached.
     * 
     * <p>{@link #JAWT_FreeDrawingSurface FreeDrawingSurface} must be called when finished with the returned {@link JAWTDrawingSurface}.</p>
     *
     * @param target            must be a {@link java.awt.Component Component} (should be a {@link java.awt.Canvas Canvas} or {@link java.awt.Window Window} for native rendering)
     * @param __functionAddress the function address
     *
     * @return {@code NULL} if an error has occurred
     */
    @Nullable
    @NativeType("JAWT_DrawingSurface *")
    public static JAWTDrawingSurface JAWT_GetDrawingSurface(@NativeType("jobject") Object target, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        long __result = nJAWT_GetDrawingSurface(target, __functionAddress);
        return JAWTDrawingSurface.createSafe(__result);
    }

    // --- [ JAWT_FreeDrawingSurface ] ---

    /** Unsafe version of: {@link #JAWT_FreeDrawingSurface FreeDrawingSurface} */
    public static void nJAWT_FreeDrawingSurface(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ds, __functionAddress);
    }

    /**
     * Frees the drawing surface allocated in {@link #JAWT_GetDrawingSurface GetDrawingSurface}.
     *
     * @param ds                the {@link JAWTDrawingSurface} to free
     * @param __functionAddress the function address
     */
    public static void JAWT_FreeDrawingSurface(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        nJAWT_FreeDrawingSurface(ds.address(), __functionAddress);
    }

    // --- [ JAWT_Lock ] ---

    /** Unsafe version of: {@link #JAWT_Lock Lock} */
    public static native void nJAWT_Lock(long __functionAddress);

    /**
     * Locks the entire AWT for synchronization purposes.
     *
     * @param __functionAddress the function address
     */
    public static void JAWT_Lock(@NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_Lock(__functionAddress);
    }

    // --- [ JAWT_Unlock ] ---

    /** Unsafe version of: {@link #JAWT_Unlock Unlock} */
    public static native void nJAWT_Unlock(long __functionAddress);

    /**
     * Unlocks the entire AWT for synchronization purposes.
     *
     * @param __functionAddress the function address
     */
    public static void JAWT_Unlock(@NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_Unlock(__functionAddress);
    }

    // --- [ JAWT_GetComponent ] ---

    /** Unsafe version of: {@link #JAWT_GetComponent GetComponent} */
    @Nullable
    public static native Component nJAWT_GetComponent(long platformInfo, long __functionAddress);

    /**
     * Returns a reference to a {@link Component} from a native platform handle. On Windows, this corresponds to an {@code HWND}; on Solaris and Linux, this is a
     * {@code Drawable}. For other platforms, see the appropriate machine-dependent header file for a description. The reference returned by this function is
     * a local reference that is only valid in this environment. This function returns a {@code NULL} reference if no component could be found with matching platform
     * information.
     *
     * @param platformInfo      the native platform handle
     * @param __functionAddress the function address
     */
    @Nullable
    @NativeType("jobject")
    public static Component JAWT_GetComponent(@NativeType("void *") long platformInfo, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(platformInfo);
            check(__functionAddress);
        }
        return nJAWT_GetComponent(platformInfo, __functionAddress);
    }

    // --- [ JAWT_CreateEmbeddedFrame ] ---

    /** Unsafe version of: {@link #JAWT_CreateEmbeddedFrame CreateEmbeddedFrame} */
    @Nullable
    public static native Frame nJAWT_CreateEmbeddedFrame(long platformInfo, long __functionAddress);

    /**
     * Creates a {@link Frame} placed in a native container. Container is referenced by the native platform handle. For example on Windows this corresponds to an
     * {@code HWND}. For other platforms, see the appropriate machine-dependent header file for a description. The reference returned by this function is a
     * local reference that is only valid in this environment. This function returns a {@code NULL} reference if no frame could be created with matching platform
     * information.
     *
     * @param platformInfo      the native platform handle
     * @param __functionAddress the function address
     *
     * @since Java 9
     */
    @Nullable
    @NativeType("jobject")
    public static Frame JAWT_CreateEmbeddedFrame(@NativeType("void *") long platformInfo, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(platformInfo);
            check(__functionAddress);
        }
        return nJAWT_CreateEmbeddedFrame(platformInfo, __functionAddress);
    }

    // --- [ JAWT_SetBounds ] ---

    /** Unsafe version of: {@link #JAWT_SetBounds SetBounds} */
    public static native void nJAWT_SetBounds(Frame embeddedFrame, int x, int y, int w, int h, long __functionAddress);

    /**
     * Moves and resizes the embedded frame. The new location of the top-left corner is specified by x and y parameters relative to the native parent
     * component. The new size is specified by width and height.
     * 
     * <p>The embedded frame should be created by {@link #JAWT_CreateEmbeddedFrame CreateEmbeddedFrame} method, or this function will not have any effect.</p>
     * 
     * <p>{@link Component#setLocation} and {@link Component#setBounds} for {@code EmbeddedFrame} really don't move it within the native parent. These methods always locate
     * the embedded frame at (0, 0) for backward compatibility. To allow moving embedded frames this method was introduced, and it works just the same way as
     * {@code setLocation()} and {@code setBounds()} for usual, non-embedded components.</p>
     * 
     * <p>Using usual {@code get/setLocation()} and {@code get/setBounds()} together with this new method is not recommended.</p>
     *
     * @param embeddedFrame     the embedded frame
     * @param x                 the x coordinate
     * @param y                 the y coordinate
     * @param w                 the width
     * @param h                 the height
     * @param __functionAddress the function address
     *
     * @since Java 9
     */
    public static void JAWT_SetBounds(@NativeType("jobject") Frame embeddedFrame, @NativeType("jint") int x, @NativeType("jint") int y, @NativeType("jint") int w, @NativeType("jint") int h, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_SetBounds(embeddedFrame, x, y, w, h, __functionAddress);
    }

    // --- [ JAWT_SynthesizeWindowActivation ] ---

    /** Unsafe version of: {@link #JAWT_SynthesizeWindowActivation SynthesizeWindowActivation} */
    public static native void nJAWT_SynthesizeWindowActivation(Frame embeddedFrame, boolean doActivate, long __functionAddress);

    /**
     * Synthesizes a native message to activate or deactivate an {@code EmbeddedFrame} window depending on the value of parameter {@code doActivate}.
     * 
     * <p>The embedded frame should be created by {@link #JAWT_CreateEmbeddedFrame CreateEmbeddedFrame} method, or this function will not have any effect.</p>
     *
     * @param embeddedFrame     the embedded frame
     * @param doActivate        if true activates the window; otherwise, deactivates the window
     * @param __functionAddress the function address
     *
     * @since Java 9
     */
    public static void JAWT_SynthesizeWindowActivation(@NativeType("jobject") Frame embeddedFrame, @NativeType("jboolean") boolean doActivate, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_SynthesizeWindowActivation(embeddedFrame, doActivate, __functionAddress);
    }

}