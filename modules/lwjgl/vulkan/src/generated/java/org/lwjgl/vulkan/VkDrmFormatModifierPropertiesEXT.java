/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying properties of a format when combined with a DRM format modifier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The returned {@code drmFormatModifierTilingFeatures} <b>must</b> contain at least one bit.</p>
 * 
 * <p>The implementation <b>must</b> not return {@code DRM_FORMAT_MOD_INVALID} in {@code drmFormatModifier}.</p>
 * 
 * <p>An image’s <em>memory planecount</em> (as returned by {@code drmFormatModifierPlaneCount}) is distinct from its <em>format planecount</em> (in the sense of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> Y′C<sub>B</sub>C<sub>R</sub> formats). In {@code VkImageAspectFlags}, each <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> represents a <em>memory plane</em> and each <code>VK_IMAGE_ASPECT_PLANE<em>_i_</em>BIT</code> a <em>format plane</em>.</p>
 * 
 * <p>An image’s set of <em>format planes</em> is an ordered partition of the image’s <b>content</b> into separable groups of format components. The ordered partition is encoded in the name of each {@code VkFormat}. For example, {@link VK11#VK_FORMAT_G8_B8R8_2PLANE_420_UNORM FORMAT_G8_B8R8_2PLANE_420_UNORM} contains two <em>format planes</em>; the first plane contains the green component and the second plane contains the blue component and red component. If the format name does not contain {@code PLANE}, then the format contains a single plane; for example, {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}. Some commands, such as {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, do not operate on all format components in the image, but instead operate only on the <em>format planes</em> explicitly chosen by the application and operate on each <em>format plane</em> independently.</p>
 * 
 * <p>An image’s set of <em>memory planes</em> is an ordered partition of the image’s <b>memory</b> rather than the image’s <b>content</b>. Each <em>memory plane</em> is a contiguous range of memory. The union of an image’s <em>memory planes</em> is not necessarily contiguous.</p>
 * 
 * <p>If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-resource">linear</a>, then the partition is the same for <em>memory planes</em> and for <em>format planes</em>. Therefore, if the returned {@code drmFormatModifier} is {@code DRM_FORMAT_MOD_LINEAR}, then {@code drmFormatModifierPlaneCount} <b>must</b> equal the <em>format planecount</em>, and {@code drmFormatModifierTilingFeatures} <b>must</b> be identical to the {@link VkFormatProperties2}{@code ::linearTilingFeatures} returned in the same {@code pNext} chain.</p>
 * 
 * <p>If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-resource">non-linear</a>, then the partition of the image’s <b>memory</b> into <em>memory planes</em> is implementation-specific and <b>may</b> be unrelated to the partition of the image’s <b>content</b> into <em>format planes</em>. For example, consider an image whose {@code format} is {@link VK11#VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM FORMAT_G8_B8_R8_3PLANE_420_UNORM}, {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, whose {@code drmFormatModifier} is not {@code DRM_FORMAT_MOD_LINEAR}, and {@code flags} lacks {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT}. The image has 3 <em>format planes</em>, and commands such {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage} act on each <em>format plane</em> independently as if the data of each <em>format plane</em> were separable from the data of the other planes. In a straightforward implementation, the implementation <b>may</b> store the image’s content in 3 adjacent <em>memory planes</em> where each <em>memory plane</em> corresponds exactly to a <em>format plane</em>. However, the implementation <b>may</b> also store the image’s content in a single <em>memory plane</em> where all format components are combined using an implementation-private block-compressed format; or the implementation <b>may</b> store the image’s content in a collection of 7 adjacent <em>memory planes</em> using an implementation-private sharding technique. Because the image is non-linear and non-disjoint, the implementation has much freedom when choosing the image’s placement in memory.</p>
 * 
 * <p>The <em>memory planecount</em> applies to function parameters and structures only when the API specifies an explicit requirement on {@code drmFormatModifierPlaneCount}. In all other cases, the <em>memory planecount</em> is ignored.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDrmFormatModifierPropertiesListEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrmFormatModifierPropertiesEXT {
 *     uint64_t {@link #drmFormatModifier};
 *     uint32_t {@link #drmFormatModifierPlaneCount};
 *     VkFormatFeatureFlags {@link #drmFormatModifierTilingFeatures};
 * }</code></pre>
 */
public class VkDrmFormatModifierPropertiesEXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DRMFORMATMODIFIER,
        DRMFORMATMODIFIERPLANECOUNT,
        DRMFORMATMODIFIERTILINGFEATURES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DRMFORMATMODIFIER = layout.offsetof(0);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(1);
        DRMFORMATMODIFIERTILINGFEATURES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDrmFormatModifierPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrmFormatModifierPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a <em>Linux DRM format modifier</em>. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** the number of <em>memory planes</em> in any image created with {@code format} and {@code drmFormatModifier}. An image’s <em>memory planecount</em> is distinct from its <em>format planecount</em>, as explained below. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits} that are supported by any image created with {@code format} and {@code drmFormatModifier}. */
    @NativeType("VkFormatFeatureFlags")
    public int drmFormatModifierTilingFeatures() { return ndrmFormatModifierTilingFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierPropertiesEXT} instance for the specified memory address. */
    public static VkDrmFormatModifierPropertiesEXT create(long address) {
        return wrap(VkDrmFormatModifierPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDrmFormatModifierPropertiesEXT.class, address);
    }

    /**
     * Create a {@link VkDrmFormatModifierPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return UNSAFE.getLong(null, struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #drmFormatModifierTilingFeatures}. */
    public static int ndrmFormatModifierTilingFeatures(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIERTILINGFEATURES); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesEXT, Buffer> {

        private static final VkDrmFormatModifierPropertiesEXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierPropertiesEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkDrmFormatModifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrmFormatModifierPropertiesEXT#drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesEXT#drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesEXT#drmFormatModifierTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int drmFormatModifierTilingFeatures() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierTilingFeatures(address()); }

    }

}