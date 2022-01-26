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
 * Structure specifying physical device sparse memory properties.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSparseProperties {
 *     VkBool32 {@link #residencyStandard2DBlockShape};
 *     VkBool32 {@link #residencyStandard2DMultisampleBlockShape};
 *     VkBool32 {@link #residencyStandard3DBlockShape};
 *     VkBool32 {@link #residencyAlignedMipSize};
 *     VkBool32 {@link #residencyNonResidentStrict};
 * }</code></pre>
 */
public class VkPhysicalDeviceSparseProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESIDENCYSTANDARD2DBLOCKSHAPE,
        RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE,
        RESIDENCYSTANDARD3DBLOCKSHAPE,
        RESIDENCYALIGNEDMIPSIZE,
        RESIDENCYNONRESIDENTSTRICT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESIDENCYSTANDARD2DBLOCKSHAPE = layout.offsetof(0);
        RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE = layout.offsetof(1);
        RESIDENCYSTANDARD3DBLOCKSHAPE = layout.offsetof(2);
        RESIDENCYALIGNEDMIPSIZE = layout.offsetof(3);
        RESIDENCYNONRESIDENTSTRICT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSparseProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSparseProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@link VK10#VK_TRUE TRUE} if the physical device will access all single-sample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-sparseblockshapessingle">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for single-sample 2D images is not <b>required</b> to match the standard sparse image block dimensions listed in the table. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DBlockShape() { return nresidencyStandard2DBlockShape(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the physical device will access all multisample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-sparseblockshapesmsaa">Standard Sparse Image Block Shapes (MSAA)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for multisample 2D images is not <b>required</b> to match the standard sparse image block dimensions listed in the table. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DMultisampleBlockShape() { return nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the physical device will access all 3D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-sparseblockshapessingle">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for 3D images is not <b>required</b> to match the standard sparse image block dimensions listed in the table. */
    @NativeType("VkBool32")
    public boolean residencyStandard3DBlockShape() { return nresidencyStandard3DBlockShape(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if images with mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block <b>may</b> be placed in the mip tail. If this property is not reported, only mip levels with dimensions smaller than the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure will be placed in the mip tail. If this property is reported the implementation is allowed to return {@link VK10#VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT} in the {@code flags} member of {@link VkSparseImageFormatProperties}, indicating that mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block will be placed in the mip tail. */
    @NativeType("VkBool32")
    public boolean residencyAlignedMipSize() { return nresidencyAlignedMipSize(address()) != 0; }
    /** specifies whether the physical device <b>can</b> consistently access non-resident regions of a resource. If this property is {@link VK10#VK_TRUE TRUE}, access to non-resident regions of resources will be guaranteed to return values as if the resource was populated with 0; writes to non-resident regions will be discarded. */
    @NativeType("VkBool32")
    public boolean residencyNonResidentStrict() { return nresidencyNonResidentStrict(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSparseProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseProperties create(long address) {
        return wrap(VkPhysicalDeviceSparseProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSparseProperties.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #residencyStandard2DBlockShape}. */
    public static int nresidencyStandard2DBlockShape(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard2DMultisampleBlockShape}. */
    public static int nresidencyStandard2DMultisampleBlockShape(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard3DBlockShape}. */
    public static int nresidencyStandard3DBlockShape(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD3DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyAlignedMipSize}. */
    public static int nresidencyAlignedMipSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseProperties.RESIDENCYALIGNEDMIPSIZE); }
    /** Unsafe version of {@link #residencyNonResidentStrict}. */
    public static int nresidencyNonResidentStrict(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseProperties.RESIDENCYNONRESIDENTSTRICT); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseProperties, Buffer> {

        private static final VkPhysicalDeviceSparseProperties ELEMENT_FACTORY = VkPhysicalDeviceSparseProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSparseProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSparseProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSparseProperties#residencyStandard2DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DBlockShape(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSparseProperties#residencyStandard2DMultisampleBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DMultisampleBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSparseProperties#residencyStandard3DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard3DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard3DBlockShape(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSparseProperties#residencyAlignedMipSize} field. */
        @NativeType("VkBool32")
        public boolean residencyAlignedMipSize() { return VkPhysicalDeviceSparseProperties.nresidencyAlignedMipSize(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSparseProperties#residencyNonResidentStrict} field. */
        @NativeType("VkBool32")
        public boolean residencyNonResidentStrict() { return VkPhysicalDeviceSparseProperties.nresidencyNonResidentStrict(address()) != 0; }

    }

}