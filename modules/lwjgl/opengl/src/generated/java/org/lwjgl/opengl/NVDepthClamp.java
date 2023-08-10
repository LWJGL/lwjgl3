/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_depth_clamp.txt">NV_depth_clamp</a> extension.
 * 
 * <p>In some rendering applications such as shadow volumes, it is useful
 * to allow line and polygon primitives to be rasterized without
 * clipping the primitive to the near or far clip volume planes (side
 * clip volume planes clip normally).  Without the near and far clip
 * planes, rasterization (pixel coverage determination) in X and Y
 * can proceed normally if we ignore the near and far clip planes.
 * The one major issue is that fragments of a  primitive may extend
 * beyond the conventional window space depth range for depth values
 * (typically the range [0,1]).  Rather than discarding fragments that
 * defy the window space depth range (effectively what near and far
 * plane clipping accomplish), the depth values can be clamped to the
 * current depth range.</p>
 * 
 * <p>This extension provides exactly such functionality.</p>
 */
public final class NVDepthClamp {

    /**
     * Accepted by the {@code cap} parameter Enable, Disable, and IsEnabled,
     * and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
     */
    public static final int GL_DEPTH_CLAMP_NV = 0x864F;

    private NVDepthClamp() {}

}