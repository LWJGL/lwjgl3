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

import static org.lwjgl.vulkan.ARMDataGraphInstructionSetTosa.*;

/**
 * <pre>{@code
 * struct VkDataGraphTOSANameQualityARM {
 *     char name[VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM];
 *     VkDataGraphTOSAQualityFlagsARM qualityFlags;
 * }}</pre>
 */
public class VkDataGraphTOSANameQualityARM extends Struct<VkDataGraphTOSANameQualityARM> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        QUALITYFLAGS;

    static {
        Layout layout = __struct(
            __array(1, VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        QUALITYFLAGS = layout.offsetof(1);
    }

    protected VkDataGraphTOSANameQualityARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphTOSANameQualityARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphTOSANameQualityARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphTOSANameQualityARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphTOSANameQualityARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM]")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code qualityFlags} field. */
    @NativeType("VkDataGraphTOSAQualityFlagsARM")
    public int qualityFlags() { return nqualityFlags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphTOSANameQualityARM} instance for the specified memory address. */
    public static VkDataGraphTOSANameQualityARM create(long address) {
        return new VkDataGraphTOSANameQualityARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphTOSANameQualityARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphTOSANameQualityARM(address, null);
    }

    /**
     * Create a {@link VkDataGraphTOSANameQualityARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphTOSANameQualityARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphTOSANameQualityARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkDataGraphTOSANameQualityARM.NAME, VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkDataGraphTOSANameQualityARM.NAME); }
    /** Unsafe version of {@link #qualityFlags}. */
    public static int nqualityFlags(long struct) { return memGetInt(struct + VkDataGraphTOSANameQualityARM.QUALITYFLAGS); }

    // -----------------------------------

    /** An array of {@link VkDataGraphTOSANameQualityARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphTOSANameQualityARM, Buffer> {

        private static final VkDataGraphTOSANameQualityARM ELEMENT_FACTORY = VkDataGraphTOSANameQualityARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphTOSANameQualityARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphTOSANameQualityARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphTOSANameQualityARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM]")
        public ByteBuffer name() { return VkDataGraphTOSANameQualityARM.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM]")
        public String nameString() { return VkDataGraphTOSANameQualityARM.nnameString(address()); }
        /** @return the value of the {@code qualityFlags} field. */
        @NativeType("VkDataGraphTOSAQualityFlagsARM")
        public int qualityFlags() { return VkDataGraphTOSANameQualityARM.nqualityFlags(address()); }

    }

}