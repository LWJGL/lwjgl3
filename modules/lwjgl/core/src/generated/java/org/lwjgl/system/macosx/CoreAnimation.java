/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to &lt;QuartzCore/CoreAnimation.h&gt;. */
public class CoreAnimation {

    static { Library.initialize(); }

    protected CoreAnimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ CALayerGetBounds ] ---

    public static native void nCALayerGetBounds(long _this, long __result);

    public static CGRect CALayerGetBounds(@NativeType("CALayer *") long _this, CGRect __result) {
        if (CHECKS) {
            check(_this);
        }
        nCALayerGetBounds(_this, __result.address());
        return __result;
    }

    // --- [ CALayerSetBounds ] ---

    public static native void nCALayerSetBounds(long _this, long bounds);

    public static void CALayerSetBounds(@NativeType("CALayer *") long _this, CGRect bounds) {
        if (CHECKS) {
            check(_this);
        }
        nCALayerSetBounds(_this, bounds.address());
    }

    // --- [ CAMetalLayerLayer ] ---

    @NativeType("CAMetalLayer *")
    public static native long CAMetalLayerLayer();

    // --- [ CAMetalLayerNextDrawable ] ---

    public static native long nCAMetalLayerNextDrawable(long _this);

    @NativeType("CAMetalDrawable *")
    public static long CAMetalLayerNextDrawable(@NativeType("CAMetalLayer *") long _this) {
        if (CHECKS) {
            check(_this);
        }
        return nCAMetalLayerNextDrawable(_this);
    }

}