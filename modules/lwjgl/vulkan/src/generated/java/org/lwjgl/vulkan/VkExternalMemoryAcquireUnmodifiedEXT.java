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
 * struct VkExternalMemoryAcquireUnmodifiedEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 acquireUnmodifiedMemory;
 * }}</pre>
 */
public class VkExternalMemoryAcquireUnmodifiedEXT extends Struct<VkExternalMemoryAcquireUnmodifiedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACQUIREUNMODIFIEDMEMORY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACQUIREUNMODIFIEDMEMORY = layout.offsetof(2);
    }

    protected VkExternalMemoryAcquireUnmodifiedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalMemoryAcquireUnmodifiedEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, container);
    }

    /**
     * Creates a {@code VkExternalMemoryAcquireUnmodifiedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryAcquireUnmodifiedEXT(ByteBuffer container) {
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
    /** @return the value of the {@code acquireUnmodifiedMemory} field. */
    @NativeType("VkBool32")
    public boolean acquireUnmodifiedMemory() { return nacquireUnmodifiedMemory(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryAcquireUnmodified#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT} value to the {@code sType} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT sType$Default() { return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code acquireUnmodifiedMemory} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) { nacquireUnmodifiedMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalMemoryAcquireUnmodifiedEXT set(
        int sType,
        long pNext,
        boolean acquireUnmodifiedMemory
    ) {
        sType(sType);
        pNext(pNext);
        acquireUnmodifiedMemory(acquireUnmodifiedMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalMemoryAcquireUnmodifiedEXT set(VkExternalMemoryAcquireUnmodifiedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryAcquireUnmodifiedEXT malloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryAcquireUnmodifiedEXT calloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link BufferUtils}. */
    public static VkExternalMemoryAcquireUnmodifiedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryAcquireUnmodifiedEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance for the specified memory address. */
    public static VkExternalMemoryAcquireUnmodifiedEXT create(long address) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalMemoryAcquireUnmodifiedEXT createSafe(long address) {
        return address == NULL ? null : new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalMemoryAcquireUnmodifiedEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT malloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT calloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalMemoryAcquireUnmodifiedEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalMemoryAcquireUnmodifiedEXT.PNEXT); }
    /** Unsafe version of {@link #acquireUnmodifiedMemory}. */
    public static int nacquireUnmodifiedMemory(long struct) { return memGetInt(struct + VkExternalMemoryAcquireUnmodifiedEXT.ACQUIREUNMODIFIEDMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalMemoryAcquireUnmodifiedEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalMemoryAcquireUnmodifiedEXT.PNEXT, value); }
    /** Unsafe version of {@link #acquireUnmodifiedMemory(boolean) acquireUnmodifiedMemory}. */
    public static void nacquireUnmodifiedMemory(long struct, int value) { memPutInt(struct + VkExternalMemoryAcquireUnmodifiedEXT.ACQUIREUNMODIFIEDMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryAcquireUnmodifiedEXT} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryAcquireUnmodifiedEXT, Buffer> implements NativeResource {

        private static final VkExternalMemoryAcquireUnmodifiedEXT ELEMENT_FACTORY = VkExternalMemoryAcquireUnmodifiedEXT.create(-1L);

        /**
         * Creates a new {@code VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryAcquireUnmodifiedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalMemoryAcquireUnmodifiedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalMemoryAcquireUnmodifiedEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExternalMemoryAcquireUnmodifiedEXT.npNext(address()); }
        /** @return the value of the {@code acquireUnmodifiedMemory} field. */
        @NativeType("VkBool32")
        public boolean acquireUnmodifiedMemory() { return VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalMemoryAcquireUnmodifiedEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryAcquireUnmodified#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT} value to the {@code sType} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer sType$Default() { return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer pNext(@NativeType("void const *") long value) { VkExternalMemoryAcquireUnmodifiedEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code acquireUnmodifiedMemory} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) { VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address(), value ? 1 : 0); return this; }

    }

}