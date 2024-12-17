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
 * struct VkRenderPassBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPass renderPass;
 *     VkFramebuffer framebuffer;
 *     {@link VkRect2D VkRect2D} renderArea;
 *     uint32_t clearValueCount;
 *     {@link VkClearValue VkClearValue} const * pClearValues;
 * }}</pre>
 */
public class VkRenderPassBeginInfo extends Struct<VkRenderPassBeginInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        FRAMEBUFFER,
        RENDERAREA,
        CLEARVALUECOUNT,
        PCLEARVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        FRAMEBUFFER = layout.offsetof(3);
        RENDERAREA = layout.offsetof(4);
        CLEARVALUECOUNT = layout.offsetof(5);
        PCLEARVALUES = layout.offsetof(6);
    }

    protected VkRenderPassBeginInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassBeginInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassBeginInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassBeginInfo(ByteBuffer container) {
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
    /** @return the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** @return the value of the {@code framebuffer} field. */
    @NativeType("VkFramebuffer")
    public long framebuffer() { return nframebuffer(address()); }
    /** @return a {@link VkRect2D} view of the {@code renderArea} field. */
    public VkRect2D renderArea() { return nrenderArea(address()); }
    /** @return the value of the {@code clearValueCount} field. */
    @NativeType("uint32_t")
    public int clearValueCount() { return nclearValueCount(address()); }
    /** @return a {@link VkClearValue.Buffer} view of the struct array pointed to by the {@code pClearValues} field. */
    @NativeType("VkClearValue const *")
    public VkClearValue.@Nullable Buffer pClearValues() { return npClearValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
    public VkRenderPassBeginInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassAttachmentBeginInfo} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassAttachmentBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassSampleLocationsBeginInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassSampleLocationsBeginInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassStripeBeginInfoARM} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassStripeBeginInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassTransformBeginInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassTransformBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkRenderPassBeginInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code framebuffer} field. */
    public VkRenderPassBeginInfo framebuffer(@NativeType("VkFramebuffer") long value) { nframebuffer(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
    public VkRenderPassBeginInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassBeginInfo renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the specified value to the {@code clearValueCount} field. */
    public VkRenderPassBeginInfo clearValueCount(@NativeType("uint32_t") int value) { nclearValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@code pClearValues} field. */
    public VkRenderPassBeginInfo pClearValues(@NativeType("VkClearValue const *") VkClearValue.@Nullable Buffer value) { npClearValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassBeginInfo set(
        int sType,
        long pNext,
        long renderPass,
        long framebuffer,
        VkRect2D renderArea,
        int clearValueCount,
        VkClearValue.@Nullable Buffer pClearValues
    ) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        framebuffer(framebuffer);
        renderArea(renderArea);
        clearValueCount(clearValueCount);
        pClearValues(pClearValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassBeginInfo set(VkRenderPassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo malloc() {
        return new VkRenderPassBeginInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo calloc() {
        return new VkRenderPassBeginInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassBeginInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance for the specified memory address. */
    public static VkRenderPassBeginInfo create(long address) {
        return new VkRenderPassBeginInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassBeginInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderPassBeginInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassBeginInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo malloc(MemoryStack stack) {
        return new VkRenderPassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo calloc(MemoryStack stack) {
        return new VkRenderPassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkRenderPassBeginInfo.RENDERPASS); }
    /** Unsafe version of {@link #framebuffer}. */
    public static long nframebuffer(long struct) { return memGetLong(struct + VkRenderPassBeginInfo.FRAMEBUFFER); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderPassBeginInfo.RENDERAREA); }
    /** Unsafe version of {@link #clearValueCount}. */
    public static int nclearValueCount(long struct) { return memGetInt(struct + VkRenderPassBeginInfo.CLEARVALUECOUNT); }
    /** Unsafe version of {@link #pClearValues}. */
    public static VkClearValue.@Nullable Buffer npClearValues(long struct) { return VkClearValue.createSafe(memGetAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES), nclearValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkRenderPassBeginInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #framebuffer(long) framebuffer}. */
    public static void nframebuffer(long struct, long value) { memPutLong(struct + VkRenderPassBeginInfo.FRAMEBUFFER, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderPassBeginInfo.RENDERAREA, VkRect2D.SIZEOF); }
    /** Sets the specified value to the {@code clearValueCount} field of the specified {@code struct}. */
    public static void nclearValueCount(long struct, int value) { memPutInt(struct + VkRenderPassBeginInfo.CLEARVALUECOUNT, value); }
    /** Unsafe version of {@link #pClearValues(VkClearValue.Buffer) pClearValues}. */
    public static void npClearValues(long struct, VkClearValue.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES, memAddressSafe(value)); if (value != null) { nclearValueCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkRenderPassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassBeginInfo, Buffer> implements NativeResource {

        private static final VkRenderPassBeginInfo ELEMENT_FACTORY = VkRenderPassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassBeginInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassBeginInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassBeginInfo.npNext(address()); }
        /** @return the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkRenderPassBeginInfo.nrenderPass(address()); }
        /** @return the value of the {@code framebuffer} field. */
        @NativeType("VkFramebuffer")
        public long framebuffer() { return VkRenderPassBeginInfo.nframebuffer(address()); }
        /** @return a {@link VkRect2D} view of the {@code renderArea} field. */
        public VkRect2D renderArea() { return VkRenderPassBeginInfo.nrenderArea(address()); }
        /** @return the value of the {@code clearValueCount} field. */
        @NativeType("uint32_t")
        public int clearValueCount() { return VkRenderPassBeginInfo.nclearValueCount(address()); }
        /** @return a {@link VkClearValue.Buffer} view of the struct array pointed to by the {@code pClearValues} field. */
        @NativeType("VkClearValue const *")
        public VkClearValue.@Nullable Buffer pClearValues() { return VkRenderPassBeginInfo.npClearValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
        public VkRenderPassBeginInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassBeginInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassAttachmentBeginInfo} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassAttachmentBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassAttachmentBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassAttachmentBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassSampleLocationsBeginInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassSampleLocationsBeginInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassStripeBeginInfoARM} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassStripeBeginInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassTransformBeginInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassTransformBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkRenderPassBeginInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkRenderPassBeginInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code framebuffer} field. */
        public VkRenderPassBeginInfo.Buffer framebuffer(@NativeType("VkFramebuffer") long value) { VkRenderPassBeginInfo.nframebuffer(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
        public VkRenderPassBeginInfo.Buffer renderArea(VkRect2D value) { VkRenderPassBeginInfo.nrenderArea(address(), value); return this; }
        /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassBeginInfo.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the specified value to the {@code clearValueCount} field. */
        public VkRenderPassBeginInfo.Buffer clearValueCount(@NativeType("uint32_t") int value) { VkRenderPassBeginInfo.nclearValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@code pClearValues} field. */
        public VkRenderPassBeginInfo.Buffer pClearValues(@NativeType("VkClearValue const *") VkClearValue.@Nullable Buffer value) { VkRenderPassBeginInfo.npClearValues(address(), value); return this; }

    }

}