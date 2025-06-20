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
 * struct VkDataGraphPipelineIdentifierCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t identifierSize;
 *     uint8_t const * pIdentifier;
 * }}</pre>
 */
public class VkDataGraphPipelineIdentifierCreateInfoARM extends Struct<VkDataGraphPipelineIdentifierCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IDENTIFIERSIZE,
        PIDENTIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IDENTIFIERSIZE = layout.offsetof(2);
        PIDENTIFIER = layout.offsetof(3);
    }

    protected VkDataGraphPipelineIdentifierCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineIdentifierCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineIdentifierCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code identifierSize} field. */
    @NativeType("uint32_t")
    public int identifierSize() { return nidentifierSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pIdentifier} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pIdentifier() { return npIdentifier(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineIdentifierCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineIdentifierCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineIdentifierCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pIdentifier} field. */
    public VkDataGraphPipelineIdentifierCreateInfoARM pIdentifier(@NativeType("uint8_t const *") ByteBuffer value) { npIdentifier(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineIdentifierCreateInfoARM set(
        int sType,
        long pNext,
        ByteBuffer pIdentifier
    ) {
        sType(sType);
        pNext(pNext);
        pIdentifier(pIdentifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineIdentifierCreateInfoARM set(VkDataGraphPipelineIdentifierCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineIdentifierCreateInfoARM malloc() {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineIdentifierCreateInfoARM calloc() {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineIdentifierCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineIdentifierCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineIdentifierCreateInfoARM create(long address) {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineIdentifierCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineIdentifierCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineIdentifierCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineIdentifierCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineIdentifierCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineIdentifierCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineIdentifierCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #identifierSize}. */
    public static int nidentifierSize(long struct) { return memGetInt(struct + VkDataGraphPipelineIdentifierCreateInfoARM.IDENTIFIERSIZE); }
    /** Unsafe version of {@link #pIdentifier() pIdentifier}. */
    public static ByteBuffer npIdentifier(long struct) { return memByteBuffer(memGetAddress(struct + VkDataGraphPipelineIdentifierCreateInfoARM.PIDENTIFIER), nidentifierSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineIdentifierCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineIdentifierCreateInfoARM.PNEXT, value); }
    /** Sets the specified value to the {@code identifierSize} field of the specified {@code struct}. */
    public static void nidentifierSize(long struct, int value) { memPutInt(struct + VkDataGraphPipelineIdentifierCreateInfoARM.IDENTIFIERSIZE, value); }
    /** Unsafe version of {@link #pIdentifier(ByteBuffer) pIdentifier}. */
    public static void npIdentifier(long struct, ByteBuffer value) { memPutAddress(struct + VkDataGraphPipelineIdentifierCreateInfoARM.PIDENTIFIER, memAddress(value)); nidentifierSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineIdentifierCreateInfoARM.PIDENTIFIER));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineIdentifierCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineIdentifierCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineIdentifierCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineIdentifierCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineIdentifierCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineIdentifierCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineIdentifierCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineIdentifierCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineIdentifierCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code identifierSize} field. */
        @NativeType("uint32_t")
        public int identifierSize() { return VkDataGraphPipelineIdentifierCreateInfoARM.nidentifierSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pIdentifier} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pIdentifier() { return VkDataGraphPipelineIdentifierCreateInfoARM.npIdentifier(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineIdentifierCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineIdentifierCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineIdentifierCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineIdentifierCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineIdentifierCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pIdentifier} field. */
        public VkDataGraphPipelineIdentifierCreateInfoARM.Buffer pIdentifier(@NativeType("uint8_t const *") ByteBuffer value) { VkDataGraphPipelineIdentifierCreateInfoARM.npIdentifier(address(), value); return this; }

    }

}