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
 * struct VkImportMemoryMetalHandleInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 *     void * handle;
 * }}</pre>
 */
public class VkImportMemoryMetalHandleInfoEXT extends Struct<VkImportMemoryMetalHandleInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        HANDLE;

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
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
    }

    protected VkImportMemoryMetalHandleInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMemoryMetalHandleInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImportMemoryMetalHandleInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImportMemoryMetalHandleInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryMetalHandleInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryMetalHandleInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT} value to the {@code sType} field. */
    public VkImportMemoryMetalHandleInfoEXT sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryMetalHandleInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryMetalHandleInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public VkImportMemoryMetalHandleInfoEXT handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryMetalHandleInfoEXT set(
        int sType,
        long pNext,
        int handleType,
        long handle
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryMetalHandleInfoEXT set(VkImportMemoryMetalHandleInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryMetalHandleInfoEXT malloc() {
        return new VkImportMemoryMetalHandleInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryMetalHandleInfoEXT calloc() {
        return new VkImportMemoryMetalHandleInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryMetalHandleInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMemoryMetalHandleInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance for the specified memory address. */
    public static VkImportMemoryMetalHandleInfoEXT create(long address) {
        return new VkImportMemoryMetalHandleInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImportMemoryMetalHandleInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImportMemoryMetalHandleInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImportMemoryMetalHandleInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryMetalHandleInfoEXT malloc(MemoryStack stack) {
        return new VkImportMemoryMetalHandleInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMemoryMetalHandleInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryMetalHandleInfoEXT calloc(MemoryStack stack) {
        return new VkImportMemoryMetalHandleInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryMetalHandleInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryMetalHandleInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryMetalHandleInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryMetalHandleInfoEXT.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryMetalHandleInfoEXT.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryMetalHandleInfoEXT.HANDLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryMetalHandleInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryMetalHandleInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryMetalHandleInfoEXT.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryMetalHandleInfoEXT.HANDLE, value); }

    // -----------------------------------

    /** An array of {@link VkImportMemoryMetalHandleInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryMetalHandleInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMemoryMetalHandleInfoEXT ELEMENT_FACTORY = VkImportMemoryMetalHandleInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryMetalHandleInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryMetalHandleInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMemoryMetalHandleInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryMetalHandleInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryMetalHandleInfoEXT.npNext(address()); }
        /** @return the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkImportMemoryMetalHandleInfoEXT.nhandleType(address()); }
        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VkImportMemoryMetalHandleInfoEXT.nhandle(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryMetalHandleInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryMetalHandleInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryMetal#VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT} value to the {@code sType} field. */
        public VkImportMemoryMetalHandleInfoEXT.Buffer sType$Default() { return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryMetalHandleInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryMetalHandleInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryMetalHandleInfoEXT.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryMetalHandleInfoEXT.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public VkImportMemoryMetalHandleInfoEXT.Buffer handle(@NativeType("void *") long value) { VkImportMemoryMetalHandleInfoEXT.nhandle(address(), value); return this; }

    }

}