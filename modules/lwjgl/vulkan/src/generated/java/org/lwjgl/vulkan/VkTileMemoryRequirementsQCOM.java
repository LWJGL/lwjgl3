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
 * struct VkTileMemoryRequirementsQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize size;
 *     VkDeviceSize alignment;
 * }}</pre>
 */
public class VkTileMemoryRequirementsQCOM extends Struct<VkTileMemoryRequirementsQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SIZE,
        ALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        ALIGNMENT = layout.offsetof(3);
    }

    protected VkTileMemoryRequirementsQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTileMemoryRequirementsQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkTileMemoryRequirementsQCOM(address, container);
    }

    /**
     * Creates a {@code VkTileMemoryRequirementsQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTileMemoryRequirementsQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code alignment} field. */
    @NativeType("VkDeviceSize")
    public long alignment() { return nalignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTileMemoryRequirementsQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM} value to the {@code sType} field. */
    public VkTileMemoryRequirementsQCOM sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTileMemoryRequirementsQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkTileMemoryRequirementsQCOM size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code alignment} field. */
    public VkTileMemoryRequirementsQCOM alignment(@NativeType("VkDeviceSize") long value) { nalignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTileMemoryRequirementsQCOM set(
        int sType,
        long pNext,
        long size,
        long alignment
    ) {
        sType(sType);
        pNext(pNext);
        size(size);
        alignment(alignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTileMemoryRequirementsQCOM set(VkTileMemoryRequirementsQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTileMemoryRequirementsQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTileMemoryRequirementsQCOM malloc() {
        return new VkTileMemoryRequirementsQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemoryRequirementsQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTileMemoryRequirementsQCOM calloc() {
        return new VkTileMemoryRequirementsQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemoryRequirementsQCOM} instance allocated with {@link BufferUtils}. */
    public static VkTileMemoryRequirementsQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemoryRequirementsQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkTileMemoryRequirementsQCOM} instance for the specified memory address. */
    public static VkTileMemoryRequirementsQCOM create(long address) {
        return new VkTileMemoryRequirementsQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTileMemoryRequirementsQCOM createSafe(long address) {
        return address == NULL ? null : new VkTileMemoryRequirementsQCOM(address, null);
    }

    /**
     * Returns a new {@link VkTileMemoryRequirementsQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryRequirementsQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryRequirementsQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTileMemoryRequirementsQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTileMemoryRequirementsQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTileMemoryRequirementsQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemoryRequirementsQCOM malloc(MemoryStack stack) {
        return new VkTileMemoryRequirementsQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTileMemoryRequirementsQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemoryRequirementsQCOM calloc(MemoryStack stack) {
        return new VkTileMemoryRequirementsQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTileMemoryRequirementsQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryRequirementsQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryRequirementsQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTileMemoryRequirementsQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTileMemoryRequirementsQCOM.PNEXT); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkTileMemoryRequirementsQCOM.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static long nalignment(long struct) { return memGetLong(struct + VkTileMemoryRequirementsQCOM.ALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTileMemoryRequirementsQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTileMemoryRequirementsQCOM.PNEXT, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkTileMemoryRequirementsQCOM.SIZE, value); }
    /** Unsafe version of {@link #alignment(long) alignment}. */
    public static void nalignment(long struct, long value) { memPutLong(struct + VkTileMemoryRequirementsQCOM.ALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkTileMemoryRequirementsQCOM} structs. */
    public static class Buffer extends StructBuffer<VkTileMemoryRequirementsQCOM, Buffer> implements NativeResource {

        private static final VkTileMemoryRequirementsQCOM ELEMENT_FACTORY = VkTileMemoryRequirementsQCOM.create(-1L);

        /**
         * Creates a new {@code VkTileMemoryRequirementsQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTileMemoryRequirementsQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTileMemoryRequirementsQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTileMemoryRequirementsQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkTileMemoryRequirementsQCOM.npNext(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkTileMemoryRequirementsQCOM.nsize(address()); }
        /** @return the value of the {@code alignment} field. */
        @NativeType("VkDeviceSize")
        public long alignment() { return VkTileMemoryRequirementsQCOM.nalignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTileMemoryRequirementsQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkTileMemoryRequirementsQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM} value to the {@code sType} field. */
        public VkTileMemoryRequirementsQCOM.Buffer sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTileMemoryRequirementsQCOM.Buffer pNext(@NativeType("void *") long value) { VkTileMemoryRequirementsQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkTileMemoryRequirementsQCOM.Buffer size(@NativeType("VkDeviceSize") long value) { VkTileMemoryRequirementsQCOM.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code alignment} field. */
        public VkTileMemoryRequirementsQCOM.Buffer alignment(@NativeType("VkDeviceSize") long value) { VkTileMemoryRequirementsQCOM.nalignment(address(), value); return this; }

    }

}