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
 * struct VkCheckpointDataNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineStageFlagBits stage;
 *     void * pCheckpointMarker;
 * }}</pre>
 */
public class VkCheckpointDataNV extends Struct<VkCheckpointDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGE,
        PCHECKPOINTMARKER;

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
        STAGE = layout.offsetof(2);
        PCHECKPOINTMARKER = layout.offsetof(3);
    }

    protected VkCheckpointDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCheckpointDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkCheckpointDataNV(address, container);
    }

    /**
     * Creates a {@code VkCheckpointDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCheckpointDataNV(ByteBuffer container) {
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
    /** @return the value of the {@code stage} field. */
    @NativeType("VkPipelineStageFlagBits")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code pCheckpointMarker} field. */
    @NativeType("void *")
    public long pCheckpointMarker() { return npCheckpointMarker(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCheckpointDataNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV STRUCTURE_TYPE_CHECKPOINT_DATA_NV} value to the {@code sType} field. */
    public VkCheckpointDataNV sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCheckpointDataNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCheckpointDataNV set(
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
    public VkCheckpointDataNV set(VkCheckpointDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCheckpointDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCheckpointDataNV malloc() {
        return new VkCheckpointDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCheckpointDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCheckpointDataNV calloc() {
        return new VkCheckpointDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCheckpointDataNV} instance allocated with {@link BufferUtils}. */
    public static VkCheckpointDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCheckpointDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCheckpointDataNV} instance for the specified memory address. */
    public static VkCheckpointDataNV create(long address) {
        return new VkCheckpointDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCheckpointDataNV createSafe(long address) {
        return address == NULL ? null : new VkCheckpointDataNV(address, null);
    }

    /**
     * Returns a new {@link VkCheckpointDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCheckpointDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCheckpointDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCheckpointDataNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCheckpointDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCheckpointDataNV malloc(MemoryStack stack) {
        return new VkCheckpointDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCheckpointDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCheckpointDataNV calloc(MemoryStack stack) {
        return new VkCheckpointDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCheckpointDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCheckpointDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCheckpointDataNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCheckpointDataNV.PNEXT); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + VkCheckpointDataNV.STAGE); }
    /** Unsafe version of {@link #pCheckpointMarker}. */
    public static long npCheckpointMarker(long struct) { return memGetAddress(struct + VkCheckpointDataNV.PCHECKPOINTMARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCheckpointDataNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCheckpointDataNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkCheckpointDataNV} structs. */
    public static class Buffer extends StructBuffer<VkCheckpointDataNV, Buffer> implements NativeResource {

        private static final VkCheckpointDataNV ELEMENT_FACTORY = VkCheckpointDataNV.create(-1L);

        /**
         * Creates a new {@code VkCheckpointDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCheckpointDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCheckpointDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCheckpointDataNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCheckpointDataNV.npNext(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkPipelineStageFlagBits")
        public int stage() { return VkCheckpointDataNV.nstage(address()); }
        /** @return the value of the {@code pCheckpointMarker} field. */
        @NativeType("void *")
        public long pCheckpointMarker() { return VkCheckpointDataNV.npCheckpointMarker(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCheckpointDataNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCheckpointDataNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV STRUCTURE_TYPE_CHECKPOINT_DATA_NV} value to the {@code sType} field. */
        public VkCheckpointDataNV.Buffer sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCheckpointDataNV.Buffer pNext(@NativeType("void *") long value) { VkCheckpointDataNV.npNext(address(), value); return this; }

    }

}