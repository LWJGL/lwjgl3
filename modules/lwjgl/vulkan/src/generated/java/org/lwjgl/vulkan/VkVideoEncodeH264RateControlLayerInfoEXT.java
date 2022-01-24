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
 * Structure describing H.264 per-layer rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>H.264-specific per-layer rate control parameters <b>must</b> be specified by adding a {@link VkVideoEncodeH264RateControlLayerInfoEXT} structure to the {@code pNext} chain of each {@link VkVideoEncodeRateControlLayerInfoKHR} structure in a call to {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, when the command buffer context has an active video encode H.264 session.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>When {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}, both {@code useMinQp} and {@code useMaxQp} must be set to {@link VK10#VK_TRUE TRUE}.</li>
 * <li>When {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}, the values provided in {@code minQP} must be identical to those provided in {@code maxQp}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT}</li>
 * <li>{@code initialRcQp} <b>must</b> be a valid {@link VkVideoEncodeH264QpEXT} structure</li>
 * <li>{@code minQp} <b>must</b> be a valid {@link VkVideoEncodeH264QpEXT} structure</li>
 * <li>{@code maxQp} <b>must</b> be a valid {@link VkVideoEncodeH264QpEXT} structure</li>
 * <li>{@code maxFrameSize} <b>must</b> be a valid {@link VkVideoEncodeH264FrameSizeEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264FrameSizeEXT}, {@link VkVideoEncodeH264QpEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264RateControlLayerInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #temporalLayerId};
 *     VkBool32 {@link #useInitialRcQp};
 *     {@link VkVideoEncodeH264QpEXT VkVideoEncodeH264QpEXT} {@link #initialRcQp};
 *     VkBool32 {@link #useMinQp};
 *     {@link VkVideoEncodeH264QpEXT VkVideoEncodeH264QpEXT} {@link #minQp};
 *     VkBool32 {@link #useMaxQp};
 *     {@link VkVideoEncodeH264QpEXT VkVideoEncodeH264QpEXT} {@link #maxQp};
 *     VkBool32 {@link #useMaxFrameSize};
 *     {@link VkVideoEncodeH264FrameSizeEXT VkVideoEncodeH264FrameSizeEXT} {@link #maxFrameSize};
 * }</code></pre>
 */
public class VkVideoEncodeH264RateControlLayerInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEMPORALLAYERID,
        USEINITIALRCQP,
        INITIALRCQP,
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
            __member(1),
            __member(4),
            __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH264FrameSizeEXT.SIZEOF, VkVideoEncodeH264FrameSizeEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TEMPORALLAYERID = layout.offsetof(2);
        USEINITIALRCQP = layout.offsetof(3);
        INITIALRCQP = layout.offsetof(4);
        USEMINQP = layout.offsetof(5);
        MINQP = layout.offsetof(6);
        USEMAXQP = layout.offsetof(7);
        MAXQP = layout.offsetof(8);
        USEMAXFRAMESIZE = layout.offsetof(9);
        MAXFRAMESIZE = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264RateControlLayerInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** specifies the H.264 temporal layer ID of the video coding layer that settings provided in this structure and its parent {@link VkVideoEncodeRateControlLayerInfoKHR} structure apply to. */
    @NativeType("uint8_t")
    public byte temporalLayerId() { return ntemporalLayerId(address()); }
    /** indicates whether the values within {@code initialRcQp} should be used by the implementation. */
    @NativeType("VkBool32")
    public boolean useInitialRcQp() { return nuseInitialRcQp(address()) != 0; }
    /** provides the QP values for each picture type, to be used in rate control calculations at the start of video encode operations on a newly-created video session, or immediately after a session reset. These values are ignored when {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    public VkVideoEncodeH264QpEXT initialRcQp() { return ninitialRcQp(address()); }
    /** indicates whether the values within {@code minQp} should be used by the implementation. When it is set to {@link VK10#VK_FALSE FALSE}, the implementation ignores the values in {@code minQp} and chooses suitable values. */
    @NativeType("VkBool32")
    public boolean useMinQp() { return nuseMinQp(address()) != 0; }
    /** provides the lower bound on the QP values for each picture type, to be used in rate control calculations. */
    public VkVideoEncodeH264QpEXT minQp() { return nminQp(address()); }
    /** indicates whether the values within {@code maxQp} should be used by the implementation. When it is set to {@link VK10#VK_FALSE FALSE}, the implementation ignores the values in {@code maxQp} and chooses suitable values. */
    @NativeType("VkBool32")
    public boolean useMaxQp() { return nuseMaxQp(address()) != 0; }
    /** provides the upper bound on the QP values for each picture type, to be used in rate control calculations. */
    public VkVideoEncodeH264QpEXT maxQp() { return nmaxQp(address()); }
    /** indicates whether the values within {@code maxFrameSize} should be used by the implementation. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** provides the upper bound on the encoded frame size for each picture type. The implementation does not guarantee the encoded frame sizes will be within the specified limits, however these limits <b>may</b> be used as a guide in rate control calculations. If enabled and not set properly, the {@code maxQp} limit may prevent the implementation from respecting the {@code maxFrameSize} limit. */
    public VkVideoEncodeH264FrameSizeEXT maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #temporalLayerId} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT temporalLayerId(@NativeType("uint8_t") byte value) { ntemporalLayerId(address(), value); return this; }
    /** Sets the specified value to the {@link #useInitialRcQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT useInitialRcQp(@NativeType("VkBool32") boolean value) { nuseInitialRcQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link #initialRcQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT initialRcQp(VkVideoEncodeH264QpEXT value) { ninitialRcQp(address(), value); return this; }
    /** Passes the {@link #initialRcQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoEXT initialRcQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(initialRcQp()); return this; }
    /** Sets the specified value to the {@link #useMinQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT useMinQp(@NativeType("VkBool32") boolean value) { nuseMinQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link #minQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT minQp(VkVideoEncodeH264QpEXT value) { nminQp(address(), value); return this; }
    /** Passes the {@link #minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoEXT minQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(minQp()); return this; }
    /** Sets the specified value to the {@link #useMaxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT useMaxQp(@NativeType("VkBool32") boolean value) { nuseMaxQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link #maxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT maxQp(VkVideoEncodeH264QpEXT value) { nmaxQp(address(), value); return this; }
    /** Passes the {@link #maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoEXT maxQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(maxQp()); return this; }
    /** Sets the specified value to the {@link #useMaxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264FrameSizeEXT} to the {@link #maxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(VkVideoEncodeH264FrameSizeEXT value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@link #maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(java.util.function.Consumer<VkVideoEncodeH264FrameSizeEXT> consumer) { consumer.accept(maxFrameSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264RateControlLayerInfoEXT set(
        int sType,
        long pNext,
        byte temporalLayerId,
        boolean useInitialRcQp,
        VkVideoEncodeH264QpEXT initialRcQp,
        boolean useMinQp,
        VkVideoEncodeH264QpEXT minQp,
        boolean useMaxQp,
        VkVideoEncodeH264QpEXT maxQp,
        boolean useMaxFrameSize,
        VkVideoEncodeH264FrameSizeEXT maxFrameSize
    ) {
        sType(sType);
        pNext(pNext);
        temporalLayerId(temporalLayerId);
        useInitialRcQp(useInitialRcQp);
        initialRcQp(initialRcQp);
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
    public VkVideoEncodeH264RateControlLayerInfoEXT set(VkVideoEncodeH264RateControlLayerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlLayerInfoEXT malloc() {
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlLayerInfoEXT calloc() {
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264RateControlLayerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264RateControlLayerInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264RateControlLayerInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlLayerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264RateControlLayerInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlLayerInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264RateControlLayerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #temporalLayerId}. */
    public static byte ntemporalLayerId(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.TEMPORALLAYERID); }
    /** Unsafe version of {@link #useInitialRcQp}. */
    public static int nuseInitialRcQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEINITIALRCQP); }
    /** Unsafe version of {@link #initialRcQp}. */
    public static VkVideoEncodeH264QpEXT ninitialRcQp(long struct) { return VkVideoEncodeH264QpEXT.create(struct + VkVideoEncodeH264RateControlLayerInfoEXT.INITIALRCQP); }
    /** Unsafe version of {@link #useMinQp}. */
    public static int nuseMinQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMINQP); }
    /** Unsafe version of {@link #minQp}. */
    public static VkVideoEncodeH264QpEXT nminQp(long struct) { return VkVideoEncodeH264QpEXT.create(struct + VkVideoEncodeH264RateControlLayerInfoEXT.MINQP); }
    /** Unsafe version of {@link #useMaxQp}. */
    public static int nuseMaxQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static VkVideoEncodeH264QpEXT nmaxQp(long struct) { return VkVideoEncodeH264QpEXT.create(struct + VkVideoEncodeH264RateControlLayerInfoEXT.MAXQP); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeH264FrameSizeEXT nmaxFrameSize(long struct) { return VkVideoEncodeH264FrameSizeEXT.create(struct + VkVideoEncodeH264RateControlLayerInfoEXT.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264RateControlLayerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #temporalLayerId(byte) temporalLayerId}. */
    public static void ntemporalLayerId(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.TEMPORALLAYERID, value); }
    /** Unsafe version of {@link #useInitialRcQp(boolean) useInitialRcQp}. */
    public static void nuseInitialRcQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEINITIALRCQP, value); }
    /** Unsafe version of {@link #initialRcQp(VkVideoEncodeH264QpEXT) initialRcQp}. */
    public static void ninitialRcQp(long struct, VkVideoEncodeH264QpEXT value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoEXT.INITIALRCQP, VkVideoEncodeH264QpEXT.SIZEOF); }
    /** Unsafe version of {@link #useMinQp(boolean) useMinQp}. */
    public static void nuseMinQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMINQP, value); }
    /** Unsafe version of {@link #minQp(VkVideoEncodeH264QpEXT) minQp}. */
    public static void nminQp(long struct, VkVideoEncodeH264QpEXT value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoEXT.MINQP, VkVideoEncodeH264QpEXT.SIZEOF); }
    /** Unsafe version of {@link #useMaxQp(boolean) useMaxQp}. */
    public static void nuseMaxQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXQP, value); }
    /** Unsafe version of {@link #maxQp(VkVideoEncodeH264QpEXT) maxQp}. */
    public static void nmaxQp(long struct, VkVideoEncodeH264QpEXT value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoEXT.MAXQP, VkVideoEncodeH264QpEXT.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXFRAMESIZE, value); }
    /** Unsafe version of {@link #maxFrameSize(VkVideoEncodeH264FrameSizeEXT) maxFrameSize}. */
    public static void nmaxFrameSize(long struct, VkVideoEncodeH264FrameSizeEXT value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoEXT.MAXFRAMESIZE, VkVideoEncodeH264FrameSizeEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264RateControlLayerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlLayerInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264RateControlLayerInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264RateControlLayerInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264RateControlLayerInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264RateControlLayerInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264RateControlLayerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264RateControlLayerInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264RateControlLayerInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#temporalLayerId} field. */
        @NativeType("uint8_t")
        public byte temporalLayerId() { return VkVideoEncodeH264RateControlLayerInfoEXT.ntemporalLayerId(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useInitialRcQp} field. */
        @NativeType("VkBool32")
        public boolean useInitialRcQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.nuseInitialRcQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpEXT} view of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#initialRcQp} field. */
        public VkVideoEncodeH264QpEXT initialRcQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.ninitialRcQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMinQp} field. */
        @NativeType("VkBool32")
        public boolean useMinQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpEXT} view of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#minQp} field. */
        public VkVideoEncodeH264QpEXT minQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMaxQp} field. */
        @NativeType("VkBool32")
        public boolean useMaxQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpEXT} view of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxQp} field. */
        public VkVideoEncodeH264QpEXT maxQp() { return VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264FrameSizeEXT} view of the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxFrameSize} field. */
        public VkVideoEncodeH264FrameSizeEXT maxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT} value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#pNext} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264RateControlLayerInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#temporalLayerId} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer temporalLayerId(@NativeType("uint8_t") byte value) { VkVideoEncodeH264RateControlLayerInfoEXT.ntemporalLayerId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useInitialRcQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useInitialRcQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoEXT.nuseInitialRcQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#initialRcQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer initialRcQp(VkVideoEncodeH264QpEXT value) { VkVideoEncodeH264RateControlLayerInfoEXT.ninitialRcQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoEXT#initialRcQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer initialRcQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(initialRcQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMinQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMinQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#minQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer minQp(VkVideoEncodeH264QpEXT value) { VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoEXT#minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer minQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(minQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMaxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMaxQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpEXT} to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxQp(VkVideoEncodeH264QpEXT value) { VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxQp(java.util.function.Consumer<VkVideoEncodeH264QpEXT> consumer) { consumer.accept(maxQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#useMaxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264FrameSizeEXT} to the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxFrameSize(VkVideoEncodeH264FrameSizeEXT value) { VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoEXT#maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeH264FrameSizeEXT> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}