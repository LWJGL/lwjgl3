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
 * struct VkMemoryGetMetalHandleInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * }}</pre>
 */
public class VkMemoryGetMetalHandleInfoEXT extends Struct<VkMemoryGetMetalHandleInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkMemoryGetMetalHandleInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryGetMetalHandleInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryGetMetalHandleInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryGetMetalHandleInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetMetalHandleInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryGetMetalHandleInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT} value to the {@code sType} field. */
    public VkMemoryGetMetalHandleInfoEXT sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryGetMetalHandleInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryGetMetalHandleInfoEXT memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkMemoryGetMetalHandleInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetMetalHandleInfoEXT set(
        int sType,
        long pNext,
        long memory,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryGetMetalHandleInfoEXT set(VkMemoryGetMetalHandleInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetMetalHandleInfoEXT malloc() {
        return new VkMemoryGetMetalHandleInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetMetalHandleInfoEXT calloc() {
        return new VkMemoryGetMetalHandleInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetMetalHandleInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetMetalHandleInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance for the specified memory address. */
    public static VkMemoryGetMetalHandleInfoEXT create(long address) {
        return new VkMemoryGetMetalHandleInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryGetMetalHandleInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryGetMetalHandleInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryGetMetalHandleInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetMetalHandleInfoEXT malloc(MemoryStack stack) {
        return new VkMemoryGetMetalHandleInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryGetMetalHandleInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetMetalHandleInfoEXT calloc(MemoryStack stack) {
        return new VkMemoryGetMetalHandleInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetMetalHandleInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetMetalHandleInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryGetMetalHandleInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetMetalHandleInfoEXT.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryGetMetalHandleInfoEXT.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkMemoryGetMetalHandleInfoEXT.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryGetMetalHandleInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetMetalHandleInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryGetMetalHandleInfoEXT.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkMemoryGetMetalHandleInfoEXT.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetMetalHandleInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetMetalHandleInfoEXT, Buffer> implements NativeResource {

        private static final VkMemoryGetMetalHandleInfoEXT ELEMENT_FACTORY = VkMemoryGetMetalHandleInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryGetMetalHandleInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetMetalHandleInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryGetMetalHandleInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetMetalHandleInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryGetMetalHandleInfoEXT.npNext(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetMetalHandleInfoEXT.nmemory(address()); }
        /** @return the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkMemoryGetMetalHandleInfoEXT.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryGetMetalHandleInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetMetalHandleInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT} value to the {@code sType} field. */
        public VkMemoryGetMetalHandleInfoEXT.Buffer sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryGetMetalHandleInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMemoryGetMetalHandleInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryGetMetalHandleInfoEXT.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetMetalHandleInfoEXT.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkMemoryGetMetalHandleInfoEXT.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetMetalHandleInfoEXT.nhandleType(address(), value); return this; }

    }

}