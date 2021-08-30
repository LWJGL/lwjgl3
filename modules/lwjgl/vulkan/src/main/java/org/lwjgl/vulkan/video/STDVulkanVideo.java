/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.video;

import org.lwjgl.system.*;

public class STDVulkanVideo {

    protected STDVulkanVideo() {
        throw new UnsupportedOperationException();
    }

    // --- [ VK_MAKE_VIDEO_STD_VERSION ] ---

    /**
     * @param major the major version number
     * @param minor the minor version number
     * @param patch the patch version number
     */
    @NativeType("uint32_t")
    public static int VK_MAKE_VIDEO_STD_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major << 22) | (minor << 12) | patch;
    }

}