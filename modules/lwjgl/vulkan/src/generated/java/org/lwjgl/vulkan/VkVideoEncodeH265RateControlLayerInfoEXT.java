/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing H.265 per-layer rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>H.265-specific per-layer rate control parameters <b>must</b> be specified by adding a {@link VkVideoEncodeH265RateControlLayerInfoEXT} structure to the {@code pNext} chain of each {@link VkVideoEncodeRateControlLayerInfoKHR} structure in a call to {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, when the command buffer context has an active video encode H.265 session.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT}</li>
 * <li>{@code minQp} <b>must</b> be a valid {@link VkVideoEncodeH265QpEXT} structure</li>
 * <li>{@code maxQp} <b>must</b> be a valid {@link VkVideoEncodeH265QpEXT} structure</li>
 * <li>{@code maxFrameSize} <b>must</b> be a valid {@link VkVideoEncodeH265FrameSizeEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265FrameSizeEXT}, {@link VkVideoEncodeH265QpEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265RateControlLayerInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useMinQp};
 *     {@link VkVideoEncodeH265QpEXT VkVideoEncodeH265QpEXT} {@link #minQp};
 *     VkBool32 {@link #useMaxQp};
 *     {@link VkVideoEncodeH265QpEXT VkVideoEncodeH265QpEXT} {@link #maxQp};
 *     VkBool32 {@link #useMaxFrameSize};
 *     {@link VkVideoEncodeH265FrameSizeEXT VkVideoEncodeH265FrameSizeEXT} {@link #maxFrameSize};
 * }</code></pre>
 */
public class VkVideoEncodeH265RateControlLayerInfoEXT extends Struct<VkVideoEncodeH265RateControlLayerInfoEXT> implements NativeResource {

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
            __member(VkVideoEncodeH265QpEXT.SIZEOF, VkVideoEncodeH265QpEXT.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH265QpEXT.SIZEOF, VkVideoEncodeH265QpEXT.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH265FrameSizeEXT.SIZEOF, VkVideoEncodeH265FrameSizeEXT.ALIGNOF)
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

    protected VkVideoEncodeH265RateControlLayerInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265RateControlLayerInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265RateControlLayerInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the values within {@code minQp} should be used by the implementation. When it is set to {@link VK10#VK_FALSE FALSE}, the implementation ignores the values in {@code minQp} and chooses suitable values. */
    @NativeType("VkBool32")
    public boolean useMinQp() { return nuseMinQp(address()) != 0; }
    /** provides the lower bound on the QP values for each picture type, to be used in rate control calculations. */
    public VkVideoEncodeH265QpEXT minQp() { return nminQp(address()); }
    /** indicates whether the values within {@code maxQp} should be used by the implementation. When it is set to {@link VK10#VK_FALSE FALSE}, the implementation ignores the values in {@code maxQp} and chooses suitable values. */
    @NativeType("VkBool32")
    public boolean useMaxQp() { return nuseMaxQp(address()) != 0; }
    /** provides the upper bound on the QP values for each picture type, to be used in rate control calculations. */
    public VkVideoEncodeH265QpEXT maxQp() { return nmaxQp(address()); }
    /** indicates whether the values within {@code maxFrameSize} should be used by the implementation. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** provides the upper bound on the encoded frame size for each picture type. The implementation does not guarantee the encoded frame sizes will be within the specified limits, however these limits <b>may</b> be used as a guide in rate control calculations. If enabled and not set properly, the {@code maxQp} limit may prevent the implementation from respecting the {@code maxFrameSize} limit. */
    public VkVideoEncodeH265FrameSizeEXT maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useMinQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT useMinQp(@NativeType("VkBool32") boolean value) { nuseMinQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265QpEXT} to the {@link #minQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT minQp(VkVideoEncodeH265QpEXT value) { nminQp(address(), value); return this; }
    /** Passes the {@link #minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoEXT minQp(java.util.function.Consumer<VkVideoEncodeH265QpEXT> consumer) { consumer.accept(minQp()); return this; }
    /** Sets the specified value to the {@link #useMaxQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT useMaxQp(@NativeType("VkBool32") boolean value) { nuseMaxQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265QpEXT} to the {@link #maxQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT maxQp(VkVideoEncodeH265QpEXT value) { nmaxQp(address(), value); return this; }
    /** Passes the {@link #maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoEXT maxQp(java.util.function.Consumer<VkVideoEncodeH265QpEXT> consumer) { consumer.accept(maxQp()); return this; }
    /** Sets the specified value to the {@link #useMaxFrameSize} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265FrameSizeEXT} to the {@link #maxFrameSize} field. */
    public VkVideoEncodeH265RateControlLayerInfoEXT maxFrameSize(VkVideoEncodeH265FrameSizeEXT value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@link #maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoEXT maxFrameSize(java.util.function.Consumer<VkVideoEncodeH265FrameSizeEXT> consumer) { consumer.accept(maxFrameSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265RateControlLayerInfoEXT set(
        int sType,
        long pNext,
        boolean useMinQp,
        VkVideoEncodeH265QpEXT minQp,
        boolean useMaxQp,
        VkVideoEncodeH265QpEXT maxQp,
        boolean useMaxFrameSize,
        VkVideoEncodeH265FrameSizeEXT maxFrameSize
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
    public VkVideoEncodeH265RateControlLayerInfoEXT set(VkVideoEncodeH265RateControlLayerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlLayerInfoEXT malloc() {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlLayerInfoEXT calloc() {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265RateControlLayerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlLayerInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265RateControlLayerInfoEXT create(long address) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265RateControlLayerInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265RateControlLayerInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlLayerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265RateControlLayerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #useMinQp}. */
    public static int nuseMinQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMINQP); }
    /** Unsafe version of {@link #minQp}. */
    public static VkVideoEncodeH265QpEXT nminQp(long struct) { return VkVideoEncodeH265QpEXT.create(struct + VkVideoEncodeH265RateControlLayerInfoEXT.MINQP); }
    /** Unsafe version of {@link #useMaxQp}. */
    public static int nuseMaxQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMAXQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static VkVideoEncodeH265QpEXT nmaxQp(long struct) { return VkVideoEncodeH265QpEXT.create(struct + VkVideoEncodeH265RateControlLayerInfoEXT.MAXQP); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeH265FrameSizeEXT nmaxFrameSize(long struct) { return VkVideoEncodeH265FrameSizeEXT.create(struct + VkVideoEncodeH265RateControlLayerInfoEXT.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265RateControlLayerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #useMinQp(boolean) useMinQp}. */
    public static void nuseMinQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMINQP, value); }
    /** Unsafe version of {@link #minQp(VkVideoEncodeH265QpEXT) minQp}. */
    public static void nminQp(long struct, VkVideoEncodeH265QpEXT value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoEXT.MINQP, VkVideoEncodeH265QpEXT.SIZEOF); }
    /** Unsafe version of {@link #useMaxQp(boolean) useMaxQp}. */
    public static void nuseMaxQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMAXQP, value); }
    /** Unsafe version of {@link #maxQp(VkVideoEncodeH265QpEXT) maxQp}. */
    public static void nmaxQp(long struct, VkVideoEncodeH265QpEXT value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoEXT.MAXQP, VkVideoEncodeH265QpEXT.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlLayerInfoEXT.USEMAXFRAMESIZE, value); }
    /** Unsafe version of {@link #maxFrameSize(VkVideoEncodeH265FrameSizeEXT) maxFrameSize}. */
    public static void nmaxFrameSize(long struct, VkVideoEncodeH265FrameSizeEXT value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoEXT.MAXFRAMESIZE, VkVideoEncodeH265FrameSizeEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265RateControlLayerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlLayerInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265RateControlLayerInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265RateControlLayerInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265RateControlLayerInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265RateControlLayerInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265RateControlLayerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265RateControlLayerInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265RateControlLayerInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMinQp} field. */
        @NativeType("VkBool32")
        public boolean useMinQp() { return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMinQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265QpEXT} view of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#minQp} field. */
        public VkVideoEncodeH265QpEXT minQp() { return VkVideoEncodeH265RateControlLayerInfoEXT.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMaxQp} field. */
        @NativeType("VkBool32")
        public boolean useMaxQp() { return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265QpEXT} view of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxQp} field. */
        public VkVideoEncodeH265QpEXT maxQp() { return VkVideoEncodeH265RateControlLayerInfoEXT.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265FrameSizeEXT} view of the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxFrameSize} field. */
        public VkVideoEncodeH265FrameSizeEXT maxFrameSize() { return VkVideoEncodeH265RateControlLayerInfoEXT.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#sType} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265RateControlLayerInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT} value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#sType} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#pNext} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265RateControlLayerInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMinQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer useMinQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoEXT.nuseMinQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265QpEXT} to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#minQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer minQp(VkVideoEncodeH265QpEXT value) { VkVideoEncodeH265RateControlLayerInfoEXT.nminQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoEXT#minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer minQp(java.util.function.Consumer<VkVideoEncodeH265QpEXT> consumer) { consumer.accept(minQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMaxQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer useMaxQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265QpEXT} to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer maxQp(VkVideoEncodeH265QpEXT value) { VkVideoEncodeH265RateControlLayerInfoEXT.nmaxQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer maxQp(java.util.function.Consumer<VkVideoEncodeH265QpEXT> consumer) { consumer.accept(maxQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#useMaxFrameSize} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265FrameSizeEXT} to the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxFrameSize} field. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer maxFrameSize(VkVideoEncodeH265FrameSizeEXT value) { VkVideoEncodeH265RateControlLayerInfoEXT.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoEXT#maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoEXT.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeH265FrameSizeEXT> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}