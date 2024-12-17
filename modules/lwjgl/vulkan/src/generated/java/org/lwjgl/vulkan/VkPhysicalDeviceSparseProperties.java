/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceSparseProperties {
 *     VkBool32 residencyStandard2DBlockShape;
 *     VkBool32 residencyStandard2DMultisampleBlockShape;
 *     VkBool32 residencyStandard3DBlockShape;
 *     VkBool32 residencyAlignedMipSize;
 *     VkBool32 residencyNonResidentStrict;
 * }}</pre>
 */
public class VkPhysicalDeviceSparseProperties extends Struct<VkPhysicalDeviceSparseProperties> {

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

    protected VkPhysicalDeviceSparseProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSparseProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSparseProperties(address, container);
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

    /** @return the value of the {@code residencyStandard2DBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DBlockShape() { return nresidencyStandard2DBlockShape(address()) != 0; }
    /** @return the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DMultisampleBlockShape() { return nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
    /** @return the value of the {@code residencyStandard3DBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard3DBlockShape() { return nresidencyStandard3DBlockShape(address()) != 0; }
    /** @return the value of the {@code residencyAlignedMipSize} field. */
    @NativeType("VkBool32")
    public boolean residencyAlignedMipSize() { return nresidencyAlignedMipSize(address()) != 0; }
    /** @return the value of the {@code residencyNonResidentStrict} field. */
    @NativeType("VkBool32")
    public boolean residencyNonResidentStrict() { return nresidencyNonResidentStrict(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSparseProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseProperties create(long address) {
        return new VkPhysicalDeviceSparseProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSparseProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSparseProperties(address, null);
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSparseProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #residencyStandard2DBlockShape}. */
    public static int nresidencyStandard2DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard2DMultisampleBlockShape}. */
    public static int nresidencyStandard2DMultisampleBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard3DBlockShape}. */
    public static int nresidencyStandard3DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD3DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyAlignedMipSize}. */
    public static int nresidencyAlignedMipSize(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYALIGNEDMIPSIZE); }
    /** Unsafe version of {@link #residencyNonResidentStrict}. */
    public static int nresidencyNonResidentStrict(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYNONRESIDENTSTRICT); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseProperties, Buffer> {

        private static final VkPhysicalDeviceSparseProperties ELEMENT_FACTORY = VkPhysicalDeviceSparseProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSparseProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceSparseProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code residencyStandard2DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DBlockShape(address()) != 0; }
        /** @return the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DMultisampleBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
        /** @return the value of the {@code residencyStandard3DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard3DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard3DBlockShape(address()) != 0; }
        /** @return the value of the {@code residencyAlignedMipSize} field. */
        @NativeType("VkBool32")
        public boolean residencyAlignedMipSize() { return VkPhysicalDeviceSparseProperties.nresidencyAlignedMipSize(address()) != 0; }
        /** @return the value of the {@code residencyNonResidentStrict} field. */
        @NativeType("VkBool32")
        public boolean residencyNonResidentStrict() { return VkPhysicalDeviceSparseProperties.nresidencyNonResidentStrict(address()) != 0; }

    }

}