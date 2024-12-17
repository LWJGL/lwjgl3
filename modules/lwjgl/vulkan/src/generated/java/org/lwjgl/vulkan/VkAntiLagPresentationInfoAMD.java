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
 * struct VkAntiLagPresentationInfoAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkAntiLagStageAMD stage;
 *     uint64_t frameIndex;
 * }}</pre>
 */
public class VkAntiLagPresentationInfoAMD extends Struct<VkAntiLagPresentationInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGE,
        FRAMEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGE = layout.offsetof(2);
        FRAMEINDEX = layout.offsetof(3);
    }

    protected VkAntiLagPresentationInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAntiLagPresentationInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkAntiLagPresentationInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkAntiLagPresentationInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAntiLagPresentationInfoAMD(ByteBuffer container) {
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
    @NativeType("VkAntiLagStageAMD")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code frameIndex} field. */
    @NativeType("uint64_t")
    public long frameIndex() { return nframeIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAntiLagPresentationInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD} value to the {@code sType} field. */
    public VkAntiLagPresentationInfoAMD sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAntiLagPresentationInfoAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public VkAntiLagPresentationInfoAMD stage(@NativeType("VkAntiLagStageAMD") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code frameIndex} field. */
    public VkAntiLagPresentationInfoAMD frameIndex(@NativeType("uint64_t") long value) { nframeIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAntiLagPresentationInfoAMD set(
        int sType,
        long pNext,
        int stage,
        long frameIndex
    ) {
        sType(sType);
        pNext(pNext);
        stage(stage);
        frameIndex(frameIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAntiLagPresentationInfoAMD set(VkAntiLagPresentationInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAntiLagPresentationInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAntiLagPresentationInfoAMD malloc() {
        return new VkAntiLagPresentationInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAntiLagPresentationInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAntiLagPresentationInfoAMD calloc() {
        return new VkAntiLagPresentationInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAntiLagPresentationInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkAntiLagPresentationInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAntiLagPresentationInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkAntiLagPresentationInfoAMD} instance for the specified memory address. */
    public static VkAntiLagPresentationInfoAMD create(long address) {
        return new VkAntiLagPresentationInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAntiLagPresentationInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkAntiLagPresentationInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkAntiLagPresentationInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagPresentationInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagPresentationInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAntiLagPresentationInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAntiLagPresentationInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAntiLagPresentationInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAntiLagPresentationInfoAMD malloc(MemoryStack stack) {
        return new VkAntiLagPresentationInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAntiLagPresentationInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAntiLagPresentationInfoAMD calloc(MemoryStack stack) {
        return new VkAntiLagPresentationInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAntiLagPresentationInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagPresentationInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAntiLagPresentationInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAntiLagPresentationInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAntiLagPresentationInfoAMD.PNEXT); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + VkAntiLagPresentationInfoAMD.STAGE); }
    /** Unsafe version of {@link #frameIndex}. */
    public static long nframeIndex(long struct) { return memGetLong(struct + VkAntiLagPresentationInfoAMD.FRAMEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAntiLagPresentationInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAntiLagPresentationInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + VkAntiLagPresentationInfoAMD.STAGE, value); }
    /** Unsafe version of {@link #frameIndex(long) frameIndex}. */
    public static void nframeIndex(long struct, long value) { memPutLong(struct + VkAntiLagPresentationInfoAMD.FRAMEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkAntiLagPresentationInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkAntiLagPresentationInfoAMD, Buffer> implements NativeResource {

        private static final VkAntiLagPresentationInfoAMD ELEMENT_FACTORY = VkAntiLagPresentationInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkAntiLagPresentationInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAntiLagPresentationInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAntiLagPresentationInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAntiLagPresentationInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAntiLagPresentationInfoAMD.npNext(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkAntiLagStageAMD")
        public int stage() { return VkAntiLagPresentationInfoAMD.nstage(address()); }
        /** @return the value of the {@code frameIndex} field. */
        @NativeType("uint64_t")
        public long frameIndex() { return VkAntiLagPresentationInfoAMD.nframeIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAntiLagPresentationInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkAntiLagPresentationInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD} value to the {@code sType} field. */
        public VkAntiLagPresentationInfoAMD.Buffer sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAntiLagPresentationInfoAMD.Buffer pNext(@NativeType("void *") long value) { VkAntiLagPresentationInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public VkAntiLagPresentationInfoAMD.Buffer stage(@NativeType("VkAntiLagStageAMD") int value) { VkAntiLagPresentationInfoAMD.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code frameIndex} field. */
        public VkAntiLagPresentationInfoAMD.Buffer frameIndex(@NativeType("uint64_t") long value) { VkAntiLagPresentationInfoAMD.nframeIndex(address(), value); return this; }

    }

}