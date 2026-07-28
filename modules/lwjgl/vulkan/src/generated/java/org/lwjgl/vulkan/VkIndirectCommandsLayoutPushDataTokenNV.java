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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkIndirectCommandsLayoutPushDataTokenNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t pushDataOffset;
 *     uint32_t pushDataSize;
 * }}</pre>
 */
public class VkIndirectCommandsLayoutPushDataTokenNV extends Struct<VkIndirectCommandsLayoutPushDataTokenNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PUSHDATAOFFSET,
        PUSHDATASIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PUSHDATAOFFSET = layout.offsetof(2);
        PUSHDATASIZE = layout.offsetof(3);
    }

    protected VkIndirectCommandsLayoutPushDataTokenNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutPushDataTokenNV create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutPushDataTokenNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutPushDataTokenNV(ByteBuffer container) {
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
    /** @return the value of the {@code pushDataOffset} field. */
    @NativeType("uint32_t")
    public int pushDataOffset() { return npushDataOffset(address()); }
    /** @return the value of the {@code pushDataSize} field. */
    @NativeType("uint32_t")
    public int pushDataSize() { return npushDataSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutPushDataTokenNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV} value to the {@code sType} field. */
    public VkIndirectCommandsLayoutPushDataTokenNV sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutPushDataTokenNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pushDataOffset} field. */
    public VkIndirectCommandsLayoutPushDataTokenNV pushDataOffset(@NativeType("uint32_t") int value) { npushDataOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushDataSize} field. */
    public VkIndirectCommandsLayoutPushDataTokenNV pushDataSize(@NativeType("uint32_t") int value) { npushDataSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutPushDataTokenNV set(
        int sType,
        long pNext,
        int pushDataOffset,
        int pushDataSize
    ) {
        sType(sType);
        pNext(pNext);
        pushDataOffset(pushDataOffset);
        pushDataSize(pushDataSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutPushDataTokenNV set(VkIndirectCommandsLayoutPushDataTokenNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutPushDataTokenNV malloc() {
        return new VkIndirectCommandsLayoutPushDataTokenNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutPushDataTokenNV calloc() {
        return new VkIndirectCommandsLayoutPushDataTokenNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutPushDataTokenNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutPushDataTokenNV(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutPushDataTokenNV create(long address) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutPushDataTokenNV createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutPushDataTokenNV(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutPushDataTokenNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutPushDataTokenNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutPushDataTokenNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutPushDataTokenNV.PNEXT); }
    /** Unsafe version of {@link #pushDataOffset}. */
    public static int npushDataOffset(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.PUSHDATAOFFSET); }
    /** Unsafe version of {@link #pushDataSize}. */
    public static int npushDataSize(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.PUSHDATASIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutPushDataTokenNV.PNEXT, value); }
    /** Unsafe version of {@link #pushDataOffset(int) pushDataOffset}. */
    public static void npushDataOffset(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.PUSHDATAOFFSET, value); }
    /** Unsafe version of {@link #pushDataSize(int) pushDataSize}. */
    public static void npushDataSize(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutPushDataTokenNV.PUSHDATASIZE, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutPushDataTokenNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutPushDataTokenNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutPushDataTokenNV ELEMENT_FACTORY = VkIndirectCommandsLayoutPushDataTokenNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutPushDataTokenNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutPushDataTokenNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutPushDataTokenNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutPushDataTokenNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutPushDataTokenNV.npNext(address()); }
        /** @return the value of the {@code pushDataOffset} field. */
        @NativeType("uint32_t")
        public int pushDataOffset() { return VkIndirectCommandsLayoutPushDataTokenNV.npushDataOffset(address()); }
        /** @return the value of the {@code pushDataSize} field. */
        @NativeType("uint32_t")
        public int pushDataSize() { return VkIndirectCommandsLayoutPushDataTokenNV.npushDataSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutPushDataTokenNV.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutPushDataTokenNV.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV} value to the {@code sType} field. */
        public VkIndirectCommandsLayoutPushDataTokenNV.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutPushDataTokenNV.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutPushDataTokenNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pushDataOffset} field. */
        public VkIndirectCommandsLayoutPushDataTokenNV.Buffer pushDataOffset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutPushDataTokenNV.npushDataOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushDataSize} field. */
        public VkIndirectCommandsLayoutPushDataTokenNV.Buffer pushDataSize(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutPushDataTokenNV.npushDataSize(address(), value); return this; }

    }

}