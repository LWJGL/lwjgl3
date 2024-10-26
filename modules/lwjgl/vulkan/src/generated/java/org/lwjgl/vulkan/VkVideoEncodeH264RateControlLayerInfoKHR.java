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
 * <p>When used, the values in {@code minQp} and {@code maxQp} guarantee that the effective QP values used by the implementation will respect those lower and upper bounds, respectively. However, limiting the range of QP values that the implementation is able to use will also limit the capabilities of the implementation’s rate control algorithm to comply to other constraints. In particular, the implementation <b>may</b> not be able to comply to the following:</p>
 * 
 * <ul>
 * <li>The average and/or peak <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-bitrate">bitrate</a> values to be used for the encoded bitstream specified in the {@code averageBitrate} and {@code maxBitrate} members of the {@link VkVideoEncodeRateControlLayerInfoKHR} structure.</li>
 * <li>The upper bounds on the encoded frame size, for each picture type, specified in the {@code maxFrameSize} member of {@link VkVideoEncodeH264RateControlLayerInfoKHR}.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In general, applications need to configure rate control parameters appropriately in order to be able to get the desired rate control behavior, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-rate-control">Video Encode Rate Control</a> section.</p>
 * </div>
 * 
 * <p>When an instance of this structure is included in the {@code pNext} chain of a {@link VkVideoEncodeRateControlLayerInfoKHR} structure specified in one of the elements of the {@code pLayers} array member of the {@link VkVideoEncodeRateControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, {@link VkVideoCodingControlInfoKHR}{@code ::flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, and the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, it specifies the H.264-specific rate control parameters of the rate control layer corresponding to that element of {@code pLayers}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code useMinQp} is {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all be between {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@code useMaxQp} is {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code maxQp} <b>must</b> all be between {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@code useMinQp} is {@link VK10#VK_TRUE TRUE} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all specify the same value</li>
 * <li>If {@code useMaxQp} is {@link VK10#VK_TRUE TRUE} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code maxQp} <b>must</b> all specify the same value</li>
 * <li>If {@code useMinQp} and {@code useMaxQp} are both {@link VK10#VK_TRUE TRUE}, then the {@code qpI}, {@code qpP}, and {@code qpB} members of {@code minQp} <b>must</b> all be less than or equal to the respective members of {@code maxQp}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR}</li>
 * <li>{@code minQp} <b>must</b> be a valid {@link VkVideoEncodeH264QpKHR} structure</li>
 * <li>{@code maxQp} <b>must</b> be a valid {@link VkVideoEncodeH264QpKHR} structure</li>
 * <li>{@code maxFrameSize} <b>must</b> be a valid {@link VkVideoEncodeH264FrameSizeKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264FrameSizeKHR}, {@link VkVideoEncodeH264QpKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264RateControlLayerInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useMinQp};
 *     {@link VkVideoEncodeH264QpKHR VkVideoEncodeH264QpKHR} {@link #minQp};
 *     VkBool32 {@link #useMaxQp};
 *     {@link VkVideoEncodeH264QpKHR VkVideoEncodeH264QpKHR} {@link #maxQp};
 *     VkBool32 {@link #useMaxFrameSize};
 *     {@link VkVideoEncodeH264FrameSizeKHR VkVideoEncodeH264FrameSizeKHR} {@link #maxFrameSize};
 * }</code></pre>
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
    public VkVideoEncodeH264QpKHR minQp() { return nminQp(address()); }
    /** indicates whether the QP values determined by rate control will be clamped to the upper bounds on the QP values specified in {@code maxQp}. */
    @NativeType("VkBool32")
    public boolean useMaxQp() { return nuseMaxQp(address()) != 0; }
    /** specifies the upper bounds on the QP values, for each picture type, that the implementation’s rate control algorithm will use when {@code useMaxQp} is set to {@link VK10#VK_TRUE TRUE}. */
    public VkVideoEncodeH264QpKHR maxQp() { return nmaxQp(address()); }
    /** indicates whether the implementation’s rate control algorithm <b>should</b> use the values specified in {@code maxFrameSize} as the upper bounds on the encoded frame size for each picture type. */
    @NativeType("VkBool32")
    public boolean useMaxFrameSize() { return nuseMaxFrameSize(address()) != 0; }
    /** specifies the upper bounds on the encoded frame size, for each picture type, when {@code useMaxFrameSize} is set to {@link VK10#VK_TRUE TRUE}. */
    public VkVideoEncodeH264FrameSizeKHR maxFrameSize() { return nmaxFrameSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useMinQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(@NativeType("VkBool32") boolean value) { nuseMinQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@link #minQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(VkVideoEncodeH264QpKHR value) { nminQp(address(), value); return this; }
    /** Passes the {@link #minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(minQp()); return this; }
    /** Sets the specified value to the {@link #useMaxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(@NativeType("VkBool32") boolean value) { nuseMaxQp(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@link #maxQp} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(VkVideoEncodeH264QpKHR value) { nmaxQp(address(), value); return this; }
    /** Passes the {@link #maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(maxQp()); return this; }
    /** Sets the specified value to the {@link #useMaxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) { nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkVideoEncodeH264FrameSizeKHR} to the {@link #maxFrameSize} field. */
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) { nmaxFrameSize(address(), value); return this; }
    /** Passes the {@link #maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
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
    @Nullable
    public static VkVideoEncodeH264RateControlLayerInfoKHR createSafe(long address) {
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
    @Nullable
    public static VkVideoEncodeH264RateControlLayerInfoKHR.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264RateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useMinQp}. */
    public static int nuseMinQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMINQP); }
    /** Unsafe version of {@link #minQp}. */
    public static VkVideoEncodeH264QpKHR nminQp(long struct) { return VkVideoEncodeH264QpKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MINQP); }
    /** Unsafe version of {@link #useMaxQp}. */
    public static int nuseMaxQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static VkVideoEncodeH264QpKHR nmaxQp(long struct) { return VkVideoEncodeH264QpKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXQP); }
    /** Unsafe version of {@link #useMaxFrameSize}. */
    public static int nuseMaxFrameSize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXFRAMESIZE); }
    /** Unsafe version of {@link #maxFrameSize}. */
    public static VkVideoEncodeH264FrameSizeKHR nmaxFrameSize(long struct) { return VkVideoEncodeH264FrameSizeKHR.create(struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXFRAMESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264RateControlLayerInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useMinQp(boolean) useMinQp}. */
    public static void nuseMinQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMINQP, value); }
    /** Unsafe version of {@link #minQp(VkVideoEncodeH264QpKHR) minQp}. */
    public static void nminQp(long struct, VkVideoEncodeH264QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoKHR.MINQP, VkVideoEncodeH264QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxQp(boolean) useMaxQp}. */
    public static void nuseMaxQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXQP, value); }
    /** Unsafe version of {@link #maxQp(VkVideoEncodeH264QpKHR) maxQp}. */
    public static void nmaxQp(long struct, VkVideoEncodeH264QpKHR value) { memCopy(value.address(), struct + VkVideoEncodeH264RateControlLayerInfoKHR.MAXQP, VkVideoEncodeH264QpKHR.SIZEOF); }
    /** Unsafe version of {@link #useMaxFrameSize(boolean) useMaxFrameSize}. */
    public static void nuseMaxFrameSize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264RateControlLayerInfoKHR.USEMAXFRAMESIZE, value); }
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

        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMinQp} field. */
        @NativeType("VkBool32")
        public boolean useMinQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#minQp} field. */
        public VkVideoEncodeH264QpKHR minQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMaxQp} field. */
        @NativeType("VkBool32")
        public boolean useMaxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264QpKHR} view of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxQp} field. */
        public VkVideoEncodeH264QpKHR maxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMaxFrameSize} field. */
        @NativeType("VkBool32")
        public boolean useMaxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0; }
        /** @return a {@link VkVideoEncodeH264FrameSizeKHR} view of the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxFrameSize} field. */
        public VkVideoEncodeH264FrameSizeKHR maxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#pNext} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMinQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMinQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#minQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer minQp(VkVideoEncodeH264QpKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoKHR#minQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer minQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(minQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMaxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMaxQp(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264QpKHR} to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxQp} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxQp(VkVideoEncodeH264QpKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxQp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxQp(java.util.function.Consumer<VkVideoEncodeH264QpKHR> consumer) { consumer.accept(maxQp()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#useMaxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkVideoEncodeH264FrameSizeKHR} to the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxFrameSize} field. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) { VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264RateControlLayerInfoKHR#maxFrameSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264RateControlLayerInfoKHR.Buffer maxFrameSize(java.util.function.Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) { consumer.accept(maxFrameSize()); return this; }

    }

}