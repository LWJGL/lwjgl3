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
 * struct VkVideoEncodeH264RateControlLayerInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 useMinQp;
 *     {@link VkVideoEncodeH264QpKHR VkVideoEncodeH264QpKHR} minQp;
 *     VkBool32 useMaxQp;
 *     {@link VkVideoEncodeH264QpKHR VkVideoEncodeH264QpKHR} maxQp;
 *     VkBool32 useMaxFrameSize;
 *     {@link VkVideoEncodeH264FrameSizeKHR VkVideoEncodeH264FrameSizeKHR} maxFrameSize;
 * }}</pre>
 */
public class VkVideoEncodeH264RateControlLayerInfoKHR extends Struct<VkVideoEncodeH264RateControlLayerInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEMINQP,
        MINQP,
        USEMAXQP,
        MAXQP,
        USEMAXFRAMESIZE,
        MAXFRAMESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkVideoEncodeH264QpKHR.SIZEOF, VkVideoEncodeH264QpKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH264QpKHR.SIZEOF, VkVideoEncodeH264QpKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH264FrameSizeKHR.SIZEOF, VkVideoEncodeH264FrameSizeKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMINQP = layout.offsetof(2);
        MINQP = layout.offsetof(3);
        USEMAXQP = layout.offsetof(4);
        MAXQP = layout.offsetof(5);
        USEMAXFRAMESIZE = layout.offsetof(6);
        MAXFRAMESIZE = layout.offsetof(7);
    }

    protected VkVideoEncodeH264RateControlLayerInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264RateControlLayerInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264RateControlLayerInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code useMinQp} field. */
    @NativeType("VkBool32")
    public boolean useMinQp() { return nuseMinQp(address()) != 0; }
    /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@code minQp} field. */
    public VkVideoEncodeH264QpKHR minQp() { return nminQp(address()); }
    /** @return the value of the {@code useMaxQp} field. */
    @NativeType("VkBool32")
    public boolean useMaxQp() { return nuseMaxQp(address()) != 0; }
    /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@code maxQp} field. */
    public VkVideoEncodeH264QpKHR maxQp() { return nmaxQp(address()); }
    /** @return the value of the {@code useMaxFrameSize} field. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** @return a {@link VkVideoEncodeH264FrameSizeKHR} view of the {@code maxFrameSize} field. */
    public VkVideoEncodeH264FrameSizeKHR maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code useMinQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(@NativeType("VkBool32") boolean value) { nuseMinQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@code minQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(VkVideoEncodeH264QpKHR value) { nminQp(address(), value); return this; }
    /** Passes the {@code minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(minQp()); return this; }
    /** Sets the specified value to the {@code useMaxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(@NativeType("VkBool32") boolean value) { nuseMaxQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@code maxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(VkVideoEncodeH264QpKHR value) { nmaxQp(address(), value); return this; }
    /** Passes the {@code maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(maxQp()); return this; }
    /** Sets the specified value to the {@code useMaxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264FrameSizeKHR} to the {@code maxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@code maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(java.util.function.Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264RateControlLayerInfoKHR set(
        int sType,
        long pNext,
        boolean useMinQp,
        VkVideoEncodeH264QpKHR minQp,
        boolean useMaxQp,
        VkVideoEncodeH264QpKHR maxQp,
        boolean useMaxFrameSize,
        VkVideoEncodeH264FrameSizeKHR maxFrameSize
    ) {
        sType(sType);
        pNext(pNext);
        useMinQp(useMinQp);
        minQp(minQp);
        useMaxQp(useMaxQp);
        maxQp(maxQp);
        useMaxFrameSize(useMaxFrameSize);
        maxFrameSize(maxFrameSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264RateControlLayerInfoKHR set(VkVideoEncodeH264RateControlLayerInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264RateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlLayerInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264RateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264RateControlLayerInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264RateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useMinQp}. */
    public static int nuseMinQp(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMINQP); }
    /** Unsafe version of {@link #minQp}. */
    public static VkVideoEncodeH264QpKHR nminQp(long struct) { return VkVideoEncodeH264QpKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MINQP); }
    /** Unsafe version of {@link #useMaxQp}. */
    public static int nuseMaxQp(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static VkVideoEncodeH264QpKHR nmaxQp(long struct) { return VkVideoEncodeH264QpKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXQP); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeH264FrameSizeKHR nmaxFrameSize(long struct) { return VkVideoEncodeH264FrameSizeKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264RateControlLayerInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useMinQp(boolean) useMinQp}. */
    public static void nuseMinQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMINQP, value); }
    /** Unsafe version of {@link #minQp(VkVideoEncodeH264QpKHR) minQp}. */
    public static void nminQp(long struct, VkVideoEncodeH264QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoKHR.MINQP, VkVideoEncodeH264QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxQp(boolean) useMaxQp}. */
    public static void nuseMaxQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXQP, value); }
    /** Unsafe version of {@link #maxQp(VkVideoEncodeH264QpKHR) maxQp}. */
    public static void nmaxQp(long struct, VkVideoEncodeH264QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXQP, VkVideoEncodeH264QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXFRAMESIZE, value); }
    /** Unsafe version of {@link #maxFrameSize(VkVideoEncodeH264FrameSizeKHR) maxFrameSize}. */
    public static void nmaxFrameSize(long struct, VkVideoEncodeH264FrameSizeKHR value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXFRAMESIZE, VkVideoEncodeH264FrameSizeKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264RateControlLayerInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlLayerInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264RateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264RateControlLayerInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264RateControlLayerInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264RateControlLayerInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264RateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@code useMinQp} field. */
        @NativeType("VkBool32")
        public boolean useMinQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@code minQp} field. */
        public VkVideoEncodeH264QpKHR minQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address()); }
        /** @return the value of the {@code useMaxQp} field. */
        @NativeType("VkBool32")
        public boolean useMaxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@code maxQp} field. */
        public VkVideoEncodeH264QpKHR maxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address()); }
        /** @return the value of the {@code useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264FrameSizeKHR} view of the {@code maxFrameSize} field. */
        public VkVideoEncodeH264FrameSizeKHR maxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code useMinQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMinQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@code minQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer minQp(VkVideoEncodeH264QpKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address(), value); return this; }
        /** Passes the {@code minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer minQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(minQp()); return this; }
        /** Sets the specified value to the {@code useMaxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMaxQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@code maxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxQp(VkVideoEncodeH264QpKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address(), value); return this; }
        /** Passes the {@code maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(maxQp()); return this; }
        /** Sets the specified value to the {@code useMaxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264FrameSizeKHR} to the {@code maxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@code maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}