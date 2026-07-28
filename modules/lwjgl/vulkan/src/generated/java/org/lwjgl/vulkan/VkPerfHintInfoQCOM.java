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
 * struct VkPerfHintInfoQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPerfHintTypeQCOM type;
 *     uint32_t scale;
 * }}</pre>
 */
public class VkPerfHintInfoQCOM extends Struct<VkPerfHintInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        SCALE;

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
        TYPE = layout.offsetof(2);
        SCALE = layout.offsetof(3);
    }

    protected VkPerfHintInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerfHintInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPerfHintInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkPerfHintInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerfHintInfoQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkPerfHintTypeQCOM")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code scale} field. */
    @NativeType("uint32_t")
    public int scale() { return nscale(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerfHintInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PERF_HINT_INFO_QCOM STRUCTURE_TYPE_PERF_HINT_INFO_QCOM} value to the {@code sType} field. */
    public VkPerfHintInfoQCOM sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PERF_HINT_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerfHintInfoQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkPerfHintInfoQCOM type(@NativeType("VkPerfHintTypeQCOM") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public VkPerfHintInfoQCOM scale(@NativeType("uint32_t") int value) { nscale(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerfHintInfoQCOM set(
        int sType,
        long pNext,
        int type,
        int scale
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        scale(scale);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerfHintInfoQCOM set(VkPerfHintInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerfHintInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerfHintInfoQCOM malloc() {
        return new VkPerfHintInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerfHintInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerfHintInfoQCOM calloc() {
        return new VkPerfHintInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerfHintInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPerfHintInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerfHintInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPerfHintInfoQCOM} instance for the specified memory address. */
    public static VkPerfHintInfoQCOM create(long address) {
        return new VkPerfHintInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerfHintInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkPerfHintInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPerfHintInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerfHintInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerfHintInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerfHintInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerfHintInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerfHintInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerfHintInfoQCOM malloc(MemoryStack stack) {
        return new VkPerfHintInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerfHintInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerfHintInfoQCOM calloc(MemoryStack stack) {
        return new VkPerfHintInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerfHintInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerfHintInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerfHintInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPerfHintInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerfHintInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPerfHintInfoQCOM.TYPE); }
    /** Unsafe version of {@link #scale}. */
    public static int nscale(long struct) { return memGetInt(struct + VkPerfHintInfoQCOM.SCALE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPerfHintInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerfHintInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkPerfHintInfoQCOM.TYPE, value); }
    /** Unsafe version of {@link #scale(int) scale}. */
    public static void nscale(long struct, int value) { memPutInt(struct + VkPerfHintInfoQCOM.SCALE, value); }

    // -----------------------------------

    /** An array of {@link VkPerfHintInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPerfHintInfoQCOM, Buffer> implements NativeResource {

        private static final VkPerfHintInfoQCOM ELEMENT_FACTORY = VkPerfHintInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkPerfHintInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerfHintInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerfHintInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerfHintInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPerfHintInfoQCOM.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkPerfHintTypeQCOM")
        public int type() { return VkPerfHintInfoQCOM.ntype(address()); }
        /** @return the value of the {@code scale} field. */
        @NativeType("uint32_t")
        public int scale() { return VkPerfHintInfoQCOM.nscale(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerfHintInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPerfHintInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PERF_HINT_INFO_QCOM STRUCTURE_TYPE_PERF_HINT_INFO_QCOM} value to the {@code sType} field. */
        public VkPerfHintInfoQCOM.Buffer sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PERF_HINT_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerfHintInfoQCOM.Buffer pNext(@NativeType("void *") long value) { VkPerfHintInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkPerfHintInfoQCOM.Buffer type(@NativeType("VkPerfHintTypeQCOM") int value) { VkPerfHintInfoQCOM.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public VkPerfHintInfoQCOM.Buffer scale(@NativeType("uint32_t") int value) { VkPerfHintInfoQCOM.nscale(address(), value); return this; }

    }

}