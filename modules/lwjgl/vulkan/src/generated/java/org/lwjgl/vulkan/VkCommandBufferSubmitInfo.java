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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a command buffer submission.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code commandBuffer} <b>must</b> not have been allocated with {@link VK10#VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
 * <li>If {@code deviceMask} is not 0, it <b>must</b> be a valid device mask</li>
 * <li>If any render pass instance in {@code commandBuffer} was recorded with a {@link VkRenderPassStripeBeginInfoARM} structure in its pNext chain and did not specify the {@link VK13#VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT} flag, a {@link VkRenderPassStripeSubmitInfoARM} <b>must</b> be included in the {@code pNext} chain</li>
 * <li>If a {@link VkRenderPassStripeSubmitInfoARM} is included in the {@code pNext} chain, the value of {@link VkRenderPassStripeSubmitInfoARM}{@code ::stripeSemaphoreInfoCount} <b>must</b> be equal to the sum of the {@link VkRenderPassStripeBeginInfoARM}{@code ::stripeInfoCount} parameters provided to render pass instances recorded in {@code commandBuffer} that did not specify the {@link VK13#VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT} flag</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkRenderPassStripeSubmitInfoARM}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubmitInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferSubmitInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCommandBuffer {@link #commandBuffer};
 *     uint32_t {@link #deviceMask};
 * }</code></pre>
 */
public class VkCommandBufferSubmitInfo extends Struct<VkCommandBufferSubmitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMMANDBUFFER,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDBUFFER = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    protected VkCommandBufferSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferSubmitInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferSubmitInfo(ByteBuffer container) {
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
    /** a {@code VkCommandBuffer} to be submitted for execution. */
    @NativeType("VkCommandBuffer")
    public long commandBuffer() { return ncommandBuffer(address()); }
    /** a bitmask indicating which devices in a device group execute the command buffer. A {@code deviceMask} of 0 is equivalent to setting all bits corresponding to valid devices in the group to 1. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO} value to the {@link #sType} field. */
    public VkCommandBufferSubmitInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkRenderPassStripeSubmitInfoARM} value to the {@code pNext} chain. */
    public VkCommandBufferSubmitInfo pNext(VkRenderPassStripeSubmitInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #commandBuffer} field. */
    public VkCommandBufferSubmitInfo commandBuffer(VkCommandBuffer value) { ncommandBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceMask} field. */
    public VkCommandBufferSubmitInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferSubmitInfo set(
        int sType,
        long pNext,
        VkCommandBuffer commandBuffer,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        commandBuffer(commandBuffer);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferSubmitInfo set(VkCommandBufferSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfo malloc() {
        return new VkCommandBufferSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfo calloc() {
        return new VkCommandBufferSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferSubmitInfo} instance for the specified memory address. */
    public static VkCommandBufferSubmitInfo create(long address) {
        return new VkCommandBufferSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferSubmitInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfo malloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfo calloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #commandBuffer}. */
    public static long ncommandBuffer(long struct) { return memGetAddress(struct + VkCommandBufferSubmitInfo.COMMANDBUFFER); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkCommandBufferSubmitInfo.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferSubmitInfo.PNEXT, value); }
    /** Unsafe version of {@link #commandBuffer(VkCommandBuffer) commandBuffer}. */
    public static void ncommandBuffer(long struct, VkCommandBuffer value) { memPutAddress(struct + VkCommandBufferSubmitInfo.COMMANDBUFFER, value.address()); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkCommandBufferSubmitInfo.DEVICEMASK, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCommandBufferSubmitInfo.COMMANDBUFFER));
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferSubmitInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferSubmitInfo ELEMENT_FACTORY = VkCommandBufferSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferSubmitInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferSubmitInfo.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferSubmitInfo.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfo#commandBuffer} field. */
        @NativeType("VkCommandBuffer")
        public long commandBuffer() { return VkCommandBufferSubmitInfo.ncommandBuffer(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfo#deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkCommandBufferSubmitInfo.ndeviceMask(address()); }

        /** Sets the specified value to the {@link VkCommandBufferSubmitInfo#sType} field. */
        public VkCommandBufferSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO} value to the {@link VkCommandBufferSubmitInfo#sType} field. */
        public VkCommandBufferSubmitInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO); }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfo#pNext} field. */
        public VkCommandBufferSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferSubmitInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkRenderPassStripeSubmitInfoARM} value to the {@code pNext} chain. */
        public VkCommandBufferSubmitInfo.Buffer pNext(VkRenderPassStripeSubmitInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfo#commandBuffer} field. */
        public VkCommandBufferSubmitInfo.Buffer commandBuffer(VkCommandBuffer value) { VkCommandBufferSubmitInfo.ncommandBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfo#deviceMask} field. */
        public VkCommandBufferSubmitInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkCommandBufferSubmitInfo.ndeviceMask(address(), value); return this; }

    }

}