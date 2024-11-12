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
 * Structure describing H.265 per-layer rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>When used, the values in {@code minQp} and {@code maxQp} guarantee that the effective QP values used by the implementation will respect those lower and upper bounds, respectively. However, limiting the range of QP values that the implementation is able to use will also limit the capabilities of the implementation’s rate control algorithm to comply to other constraints. In particular, the implementation <b>may</b> not be able to comply to the following:</p>
 * 
 * <ul>
 * <li>The average and/or peak <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-bitrate">bitrate</a> values to be used for the encoded bitstream specified in the {@code averageBitrate} and {@code maxBitrate} members of the {@link VkVideoEncodeRateControlLayerInfoKHR} structure.</li>
 * <li>The upper bounds on the encoded frame size, for each picture type, specified in the {@code maxFrameSize} member of {@link VkVideoEncodeH265RateControlLayerInfoKHR}.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In general, applications need to configure rate control parameters appropriately in order to be able to get the desired rate control behavior, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-rate-control">Video Encode Rate Control</a> section.</p>
 * </div>
 * 
 * <p>When an instance of this structure is included in the {@code pNext} chain of a {@link VkVideoEncodeRateControlLayerInfoKHR} structure specified in one of the elements of the {@code pLayers} array member of the {@link VkVideoEncodeRateControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, {@link VkVideoCodingControlInfoKHR}{@code ::flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, and the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, it specifies the H.265-specific rate control parameters of the rate control layer corresponding to that element of {@code pLayers}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code useMinQp} is {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all be between {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@code useMaxQp} is {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code maxQp} <b>must</b> all be between {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@code useMinQp} is {@link VK10#VK_TRUE TRUE} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all specify the same value</li>
 * <li>If {@code useMaxQp} is {@link VK10#VK_TRUE TRUE} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code maxQp} <b>must</b> all specify the same value</li>
 * <li>If {@code useMinQp} and {@code useMaxQp} are both {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all be less than or equal to the respective members of {@code maxQp}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR}</li>
 * <li>{@code minQp} <b>must</b> be a valid {@link VkVideoEncodeH265QpKHR} structure</li>
 * <li>{@code maxQp} <b>must</b> be a valid {@link VkVideoEncodeH265QpKHR} structure</li>
 * <li>{@code maxFrameSize} <b>must</b> be a valid {@link VkVideoEncodeH265FrameSizeKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265FrameSizeKHR}, {@link VkVideoEncodeH265QpKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265RateControlLayerInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useMinQp};
 *     {@link VkVideoEncodeH265QpKHR VkVideoEncodeH265QpKHR} {@link #minQp};
 *     VkBool32 {@link #useMaxQp};
 *     {@link VkVideoEncodeH265QpKHR VkVideoEncodeH265QpKHR} {@link #maxQp};
 *     VkBool32 {@link #useMaxFrameSize};
 *     {@link VkVideoEncodeH265FrameSizeKHR VkVideoEncodeH265FrameSizeKHR} {@link #maxFrameSize};
 * }</code></pre>
 */
public class VkVideoEncodeH265RateControlLayerInfoKHR extends Struct<VkVideoEncodeH265RateControlLayerInfoKHR> implements NativeResource {

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
            __member(VkVideoEncodeH265QpKHR.SIZEOF, VkVideoEncodeH265QpKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH265QpKHR.SIZEOF, VkVideoEncodeH265QpKHR.ALIGNOF),
            __member(4),
            __member(VkVideoEncodeH265FrameSizeKHR.SIZEOF, VkVideoEncodeH265FrameSizeKHR.ALIGNOF)
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

    protected VkVideoEncodeH265RateControlLayerInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265RateControlLayerInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265RateControlLayerInfoKHR(ByteBuffer container) {
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
    /** indicates whether the QP values determined by rate control will be clamped to the lower bounds on the QP values specified in {@code minQp}. */
    @NativeType("VkBool32")
    public boolean useMinQp() { return nuseMinQp(address()) != 0; }
    /** specifies the lower bounds on the QP values, for each picture type, that the implementation’s rate control algorithm will use when {@code useMinQp} is set to {@link VK10#VK_TRUE TRUE}. */
    public VkVideoEncodeH265QpKHR minQp() { return nminQp(address()); }
    /** indicates whether the QP values determined by rate control will be clamped to the upper bounds on the QP values specified in {@code maxQp}. */
    @NativeType("VkBool32")
    public boolean useMaxQp() { return nuseMaxQp(address()) != 0; }
    /** specifies the upper bounds on the QP values, for each picture type, that the implementation’s rate control algorithm will use when {@code useMaxQp} is set to {@link VK10#VK_TRUE TRUE}. */
    public VkVideoEncodeH265QpKHR maxQp() { return nmaxQp(address()); }
    /** indicates whether the implementation’s rate control algorithm <b>should</b> use the values specified in {@code maxFrameSize} as the upper bounds on the encoded frame size for each picture type. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** specifies the upper bounds on the encoded frame size, for each picture type, when {@code useMaxFrameSize} is set to {@link VK10#VK_TRUE TRUE}. */
    public VkVideoEncodeH265FrameSizeKHR maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useMinQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR useMinQp(@NativeType("VkBool32") boolean value) { nuseMinQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265QpKHR} to the {@link #minQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR minQp(VkVideoEncodeH265QpKHR value) { nminQp(address(), value); return this; }
    /** Passes the {@link #minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoKHR minQp(java.util.function.Consumer<VkVideoEncodeH265QpKHR> consumer) { consumer.accept(minQp()); return this; }
    /** Sets the specified value to the {@link #useMaxQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR useMaxQp(@NativeType("VkBool32") boolean value) { nuseMaxQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265QpKHR} to the {@link #maxQp} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR maxQp(VkVideoEncodeH265QpKHR value) { nmaxQp(address(), value); return this; }
    /** Passes the {@link #maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoKHR maxQp(java.util.function.Consumer<VkVideoEncodeH265QpKHR> consumer) { consumer.accept(maxQp()); return this; }
    /** Sets the specified value to the {@link #useMaxFrameSize} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH265FrameSizeKHR} to the {@link #maxFrameSize} field. */
    public VkVideoEncodeH265RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeH265FrameSizeKHR value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@link #maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265RateControlLayerInfoKHR maxFrameSize(java.util.function.Consumer<VkVideoEncodeH265FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265RateControlLayerInfoKHR set(
        int sType,
        long pNext,
        boolean useMinQp,
        VkVideoEncodeH265QpKHR minQp,
        boolean useMaxQp,
        VkVideoEncodeH265QpKHR maxQp,
        boolean useMaxFrameSize,
        VkVideoEncodeH265FrameSizeKHR maxFrameSize
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
    public VkVideoEncodeH265RateControlLayerInfoKHR set(VkVideoEncodeH265RateControlLayerInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265RateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlLayerInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265RateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265RateControlLayerInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265RateControlLayerInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlLayerInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265RateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useMinQp}. */
    public static int nuseMinQp(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMINQP); }
    /** Unsafe version of {@link #minQp}. */
    public static VkVideoEncodeH265QpKHR nminQp(long struct) { return VkVideoEncodeH265QpKHR.create(struct + VkVideoEncodeH265RateControlLayerInfoKHR.MINQP); }
    /** Unsafe version of {@link #useMaxQp}. */
    public static int nuseMaxQp(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static VkVideoEncodeH265QpKHR nmaxQp(long struct) { return VkVideoEncodeH265QpKHR.create(struct + VkVideoEncodeH265RateControlLayerInfoKHR.MAXQP); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeH265FrameSizeKHR nmaxFrameSize(long struct) { return VkVideoEncodeH265FrameSizeKHR.create(struct + VkVideoEncodeH265RateControlLayerInfoKHR.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265RateControlLayerInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useMinQp(boolean) useMinQp}. */
    public static void nuseMinQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMINQP, value); }
    /** Unsafe version of {@link #minQp(VkVideoEncodeH265QpKHR) minQp}. */
    public static void nminQp(long struct, VkVideoEncodeH265QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoKHR.MINQP, VkVideoEncodeH265QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxQp(boolean) useMaxQp}. */
    public static void nuseMaxQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXQP, value); }
    /** Unsafe version of {@link #maxQp(VkVideoEncodeH265QpKHR) maxQp}. */
    public static void nmaxQp(long struct, VkVideoEncodeH265QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoKHR.MAXQP, VkVideoEncodeH265QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXFRAMESIZE, value); }
    /** Unsafe version of {@link #maxFrameSize(VkVideoEncodeH265FrameSizeKHR) maxFrameSize}. */
    public static void nmaxFrameSize(long struct, VkVideoEncodeH265FrameSizeKHR value) { memCopy(value.address(), struct + VkVideoEncodeH265RateControlLayerInfoKHR.MAXFRAMESIZE, VkVideoEncodeH265FrameSizeKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265RateControlLayerInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlLayerInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265RateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265RateControlLayerInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265RateControlLayerInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265RateControlLayerInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265RateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265RateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265RateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMinQp} field. */
        @NativeType("VkBool32")
        public boolean useMinQp() { return VkVideoEncodeH265RateControlLayerInfoKHR.nuseMinQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265QpKHR} view of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#minQp} field. */
        public VkVideoEncodeH265QpKHR minQp() { return VkVideoEncodeH265RateControlLayerInfoKHR.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMaxQp} field. */
        @NativeType("VkBool32")
        public boolean useMaxQp() { return VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265QpKHR} view of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxQp} field. */
        public VkVideoEncodeH265QpKHR maxQp() { return VkVideoEncodeH265RateControlLayerInfoKHR.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeH265FrameSizeKHR} view of the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxFrameSize} field. */
        public VkVideoEncodeH265FrameSizeKHR maxFrameSize() { return VkVideoEncodeH265RateControlLayerInfoKHR.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265RateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#pNext} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265RateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMinQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMinQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoKHR.nuseMinQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265QpKHR} to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#minQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer minQp(VkVideoEncodeH265QpKHR value) { VkVideoEncodeH265RateControlLayerInfoKHR.nminQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoKHR#minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer minQp(java.util.function.Consumer<VkVideoEncodeH265QpKHR> consumer) { consumer.accept(minQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMaxQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMaxQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265QpKHR} to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxQp} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxQp(VkVideoEncodeH265QpKHR value) { VkVideoEncodeH265RateControlLayerInfoKHR.nmaxQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxQp(java.util.function.Consumer<VkVideoEncodeH265QpKHR> consumer) { consumer.accept(maxQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#useMaxFrameSize} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH265FrameSizeKHR} to the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxFrameSize} field. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxFrameSize(VkVideoEncodeH265FrameSizeKHR value) { VkVideoEncodeH265RateControlLayerInfoKHR.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265RateControlLayerInfoKHR#maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeH265FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}