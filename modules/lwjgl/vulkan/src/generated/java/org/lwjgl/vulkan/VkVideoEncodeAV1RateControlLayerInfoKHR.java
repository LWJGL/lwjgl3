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
 * <pre><code>
 * struct VkVideoEncodeAV1RateControlLayerInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 useMinQIndex;
 *     {@link VkVideoEncodeAV1QIndexKHR VkVideoEncodeAV1QIndexKHR} minQIndex;
 *     VkBool32 useMaxQIndex;
 *     {@link VkVideoEncodeAV1QIndexKHR VkVideoEncodeAV1QIndexKHR} maxQIndex;
 *     VkBool32 useMaxFrameSize;
 *     {@link VkVideoEncodeAV1FrameSizeKHR VkVideoEncodeAV1FrameSizeKHR} maxFrameSize;
 * }</code></pre>
 */
public class VkVideoEncodeAV1RateControlLayerInfoKHR extends Struct<VkVideoEncodeAV1RateControlLayerInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEMINQINDEX,
        MINQINDEX,
        USEMAXQINDEX,
        MAXQINDEX,
        USEMAXFRAMESIZE,
        MAXFRAMESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeAV1FrameSizeKHR.SIZEOF, VkVideoEncodeAV1FrameSizeKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMINQINDEX = layout.offsetof(2);
        MINQINDEX = layout.offsetof(3);
        USEMAXQINDEX = layout.offsetof(4);
        MAXQINDEX = layout.offsetof(5);
        USEMAXFRAMESIZE = layout.offsetof(6);
        MAXFRAMESIZE = layout.offsetof(7);
    }

    protected VkVideoEncodeAV1RateControlLayerInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1RateControlLayerInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1RateControlLayerInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code useMinQIndex} field. */
    @NativeType("VkBool32")
    public boolean useMinQIndex() { return nuseMinQIndex(address()) != 0; }
    /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code minQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR minQIndex() { return nminQIndex(address()); }
    /** @return the value of the {@code useMaxQIndex} field. */
    @NativeType("VkBool32")
    public boolean useMaxQIndex() { return nuseMaxQIndex(address()) != 0; }
    /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code maxQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR maxQIndex() { return nmaxQIndex(address()); }
    /** @return the value of the {@code useMaxFrameSize} field. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** @return a {@link VkVideoEncodeAV1FrameSizeKHR} view of the {@code maxFrameSize} field. */
    public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code useMinQIndex} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(@NativeType("VkBool32") boolean value) { nuseMinQIndex(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeAV1QIndexKHR} to the {@code minQIndex} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(VkVideoEncodeAV1QIndexKHR value) { nminQIndex(address(), value); return this; }
    /** Passes the {@code minQIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(java.util.function.Consumer<VkVideoEncodeAV1QIndexKHR> consumer) { consumer.accept(minQIndex()); return this; }
    /** Sets the specified value to the {@code useMaxQIndex} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(@NativeType("VkBool32") boolean value) { nuseMaxQIndex(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeAV1QIndexKHR} to the {@code maxQIndex} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(VkVideoEncodeAV1QIndexKHR value) { nmaxQIndex(address(), value); return this; }
    /** Passes the {@code maxQIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(java.util.function.Consumer<VkVideoEncodeAV1QIndexKHR> consumer) { consumer.accept(maxQIndex()); return this; }
    /** Sets the specified value to the {@code useMaxFrameSize} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeAV1FrameSizeKHR} to the {@code maxFrameSize} field. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@code maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(java.util.function.Consumer<VkVideoEncodeAV1FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1RateControlLayerInfoKHR set(
        int sType,
        long pNext,
        boolean useMinQIndex,
        VkVideoEncodeAV1QIndexKHR minQIndex,
        boolean useMaxQIndex,
        VkVideoEncodeAV1QIndexKHR maxQIndex,
        boolean useMaxFrameSize,
        VkVideoEncodeAV1FrameSizeKHR maxFrameSize
    ) {
        sType(sType);
        pNext(pNext);
        useMinQIndex(useMinQIndex);
        minQIndex(minQIndex);
        useMaxQIndex(useMaxQIndex);
        maxQIndex(maxQIndex);
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
    public VkVideoEncodeAV1RateControlLayerInfoKHR set(VkVideoEncodeAV1RateControlLayerInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1RateControlLayerInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useMinQIndex}. */
    public static int nuseMinQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMINQINDEX); }
    /** Unsafe version of {@link #minQIndex}. */
    public static VkVideoEncodeAV1QIndexKHR nminQIndex(long struct) { return VkVideoEncodeAV1QIndexKHR.create(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MINQINDEX); }
    /** Unsafe version of {@link #useMaxQIndex}. */
    public static int nuseMaxQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMAXQINDEX); }
    /** Unsafe version of {@link #maxQIndex}. */
    public static VkVideoEncodeAV1QIndexKHR nmaxQIndex(long struct) { return VkVideoEncodeAV1QIndexKHR.create(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MAXQINDEX); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeAV1FrameSizeKHR nmaxFrameSize(long struct) { return VkVideoEncodeAV1FrameSizeKHR.create(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useMinQIndex(boolean) useMinQIndex}. */
    public static void nuseMinQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMINQINDEX, value); }
    /** Unsafe version of {@link #minQIndex(VkVideoEncodeAV1QIndexKHR) minQIndex}. */
    public static void nminQIndex(long struct, VkVideoEncodeAV1QIndexKHR value) { memCopy(value.address(), struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MINQINDEX, VkVideoEncodeAV1QIndexKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxQIndex(boolean) useMaxQIndex}. */
    public static void nuseMaxQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMAXQINDEX, value); }
    /** Unsafe version of {@link #maxQIndex(VkVideoEncodeAV1QIndexKHR) maxQIndex}. */
    public static void nmaxQIndex(long struct, VkVideoEncodeAV1QIndexKHR value) { memCopy(value.address(), struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MAXQINDEX, VkVideoEncodeAV1QIndexKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlLayerInfoKHR.USEMAXFRAMESIZE, value); }
    /** Unsafe version of {@link #maxFrameSize(VkVideoEncodeAV1FrameSizeKHR) maxFrameSize}. */
    public static void nmaxFrameSize(long struct, VkVideoEncodeAV1FrameSizeKHR value) { memCopy(value.address(), struct + VkVideoEncodeAV1RateControlLayerInfoKHR.MAXFRAMESIZE, VkVideoEncodeAV1FrameSizeKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1RateControlLayerInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1RateControlLayerInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1RateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1RateControlLayerInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1RateControlLayerInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1RateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1RateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@code useMinQIndex} field. */
        @NativeType("VkBool32")
        public boolean useMinQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMinQIndex(address()) != 0; }
        /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code minQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR minQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nminQIndex(address()); }
        /** @return the value of the {@code useMaxQIndex} field. */
        @NativeType("VkBool32")
        public boolean useMaxQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxQIndex(address()) != 0; }
        /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code maxQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR maxQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxQIndex(address()); }
        /** @return the value of the {@code useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeAV1FrameSizeKHR} view of the {@code maxFrameSize} field. */
        public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() { return VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1RateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code useMinQIndex} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer useMinQIndex(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMinQIndex(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeAV1QIndexKHR} to the {@code minQIndex} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer minQIndex(VkVideoEncodeAV1QIndexKHR value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nminQIndex(address(), value); return this; }
        /** Passes the {@code minQIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer minQIndex(java.util.function.Consumer<VkVideoEncodeAV1QIndexKHR> consumer) { consumer.accept(minQIndex()); return this; }
        /** Sets the specified value to the {@code useMaxQIndex} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer useMaxQIndex(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxQIndex(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeAV1QIndexKHR} to the {@code maxQIndex} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer maxQIndex(VkVideoEncodeAV1QIndexKHR value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxQIndex(address(), value); return this; }
        /** Passes the {@code maxQIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer maxQIndex(java.util.function.Consumer<VkVideoEncodeAV1QIndexKHR> consumer) { consumer.accept(maxQIndex()); return this; }
        /** Sets the specified value to the {@code useMaxFrameSize} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeAV1FrameSizeKHR} to the {@code maxFrameSize} field. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) { VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@code maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeAV1RateControlLayerInfoKHR.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeAV1FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}