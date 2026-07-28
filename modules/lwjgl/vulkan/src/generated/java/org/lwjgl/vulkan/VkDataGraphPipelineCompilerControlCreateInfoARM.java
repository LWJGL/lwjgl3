/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDataGraphPipelineCompilerControlCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pVendorOptions;
 * }}</pre>
 */
public class VkDataGraphPipelineCompilerControlCreateInfoARM extends Struct<VkDataGraphPipelineCompilerControlCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PVENDOROPTIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVENDOROPTIONS = layout.offsetof(2);
    }

    protected VkDataGraphPipelineCompilerControlCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineCompilerControlCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineCompilerControlCreateInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pVendorOptions} field. */
    @NativeType("char const *")
    public ByteBuffer pVendorOptions() { return npVendorOptions(address()); }
    /** @return the null-terminated string pointed to by the {@code pVendorOptions} field. */
    @NativeType("char const *")
    public String pVendorOptionsString() { return npVendorOptionsString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineCompilerControlCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineCompilerControlCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pVendorOptions} field. */
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptions(@NativeType("char const *") ByteBuffer value) { npVendorOptions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineCompilerControlCreateInfoARM set(
        int sType,
        long pNext,
        ByteBuffer pVendorOptions
    ) {
        sType(sType);
        pNext(pNext);
        pVendorOptions(pVendorOptions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineCompilerControlCreateInfoARM set(VkDataGraphPipelineCompilerControlCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM malloc() {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM calloc() {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM create(long address) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineCompilerControlCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #pVendorOptions}. */
    public static ByteBuffer npVendorOptions(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PVENDOROPTIONS)); }
    /** Unsafe version of {@link #pVendorOptionsString}. */
    public static String npVendorOptionsString(long struct) { return memUTF8(memGetAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PVENDOROPTIONS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #pVendorOptions(ByteBuffer) pVendorOptions}. */
    public static void npVendorOptions(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PVENDOROPTIONS, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineCompilerControlCreateInfoARM.PVENDOROPTIONS));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineCompilerControlCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineCompilerControlCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineCompilerControlCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineCompilerControlCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineCompilerControlCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineCompilerControlCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineCompilerControlCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineCompilerControlCreateInfoARM.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pVendorOptions} field. */
        @NativeType("char const *")
        public ByteBuffer pVendorOptions() { return VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptions(address()); }
        /** @return the null-terminated string pointed to by the {@code pVendorOptions} field. */
        @NativeType("char const *")
        public String pVendorOptionsString() { return VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptionsString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineCompilerControlCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineCompilerControlCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pVendorOptions} field. */
        public VkDataGraphPipelineCompilerControlCreateInfoARM.Buffer pVendorOptions(@NativeType("char const *") ByteBuffer value) { VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptions(address(), value); return this; }

    }

}