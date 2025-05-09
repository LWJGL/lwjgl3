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
 * struct VkMemoryMetalHandlePropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t memoryTypeBits;
 * }}</pre>
 */
public class VkMemoryMetalHandlePropertiesEXT extends Struct<VkMemoryMetalHandlePropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYTYPEBITS;

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
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    protected VkMemoryMetalHandlePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMetalHandlePropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMetalHandlePropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryMetalHandlePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMetalHandlePropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryMetalHandlePropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkMemoryMetalHandlePropertiesEXT sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryMetalHandlePropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryMetalHandlePropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryMetalHandlePropertiesEXT set(VkMemoryMetalHandlePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMetalHandlePropertiesEXT malloc() {
        return new VkMemoryMetalHandlePropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMetalHandlePropertiesEXT calloc() {
        return new VkMemoryMetalHandlePropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMetalHandlePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMetalHandlePropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance for the specified memory address. */
    public static VkMemoryMetalHandlePropertiesEXT create(long address) {
        return new VkMemoryMetalHandlePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryMetalHandlePropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryMetalHandlePropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryMetalHandlePropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMetalHandlePropertiesEXT malloc(MemoryStack stack) {
        return new VkMemoryMetalHandlePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMetalHandlePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMetalHandlePropertiesEXT calloc(MemoryStack stack) {
        return new VkMemoryMetalHandlePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMetalHandlePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMetalHandlePropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryMetalHandlePropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryMetalHandlePropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryMetalHandlePropertiesEXT.MEMORYTYPEBITS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryMetalHandlePropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryMetalHandlePropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryMetalHandlePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryMetalHandlePropertiesEXT, Buffer> implements NativeResource {

        private static final VkMemoryMetalHandlePropertiesEXT ELEMENT_FACTORY = VkMemoryMetalHandlePropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryMetalHandlePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMetalHandlePropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMetalHandlePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryMetalHandlePropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryMetalHandlePropertiesEXT.npNext(address()); }
        /** @return the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkMemoryMetalHandlePropertiesEXT.nmemoryTypeBits(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryMetalHandlePropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMetalHandlePropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkMemoryMetalHandlePropertiesEXT.Buffer sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryMetalHandlePropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkMemoryMetalHandlePropertiesEXT.npNext(address(), value); return this; }

    }

}