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
 * struct VkPipelineViewportStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineViewportStateCreateFlags flags;
 *     uint32_t viewportCount;
 *     {@link VkViewport VkViewport} const * pViewports;
 *     uint32_t scissorCount;
 *     {@link VkRect2D VkRect2D} const * pScissors;
 * }</code></pre>
 */
public class VkPipelineViewportStateCreateInfo extends Struct<VkPipelineViewportStateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIEWPORTCOUNT,
        PVIEWPORTS,
        SCISSORCOUNT,
        PSCISSORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTS = layout.offsetof(4);
        SCISSORCOUNT = layout.offsetof(5);
        PSCISSORS = layout.offsetof(6);
    }

    protected VkPipelineViewportStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportStateCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineViewportStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code viewportCount} field. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** @return a {@link VkViewport.Buffer} view of the struct array pointed to by the {@code pViewports} field. */
    @NativeType("VkViewport const *")
    public VkViewport.@Nullable Buffer pViewports() { return npViewports(address()); }
    /** @return the value of the {@code scissorCount} field. */
    @NativeType("uint32_t")
    public int scissorCount() { return nscissorCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pScissors} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pScissors() { return npScissors(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineViewportStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportDepthClampControlCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportDepthClampControlCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportDepthClipControlCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportDepthClipControlCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportExclusiveScissorStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportShadingRateImageStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportShadingRateImageStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportSwizzleStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportSwizzleStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineViewportWScalingStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportWScalingStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineViewportStateCreateInfo flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code viewportCount} field. */
    public VkPipelineViewportStateCreateInfo viewportCount(@NativeType("uint32_t") int value) { nviewportCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkViewport.Buffer} to the {@code pViewports} field. */
    public VkPipelineViewportStateCreateInfo pViewports(@NativeType("VkViewport const *") VkViewport.@Nullable Buffer value) { npViewports(address(), value); return this; }
    /** Sets the specified value to the {@code scissorCount} field. */
    public VkPipelineViewportStateCreateInfo scissorCount(@NativeType("uint32_t") int value) { nscissorCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pScissors} field. */
    public VkPipelineViewportStateCreateInfo pScissors(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npScissors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int viewportCount,
        VkViewport.@Nullable Buffer pViewports,
        int scissorCount,
        VkRect2D.@Nullable Buffer pScissors
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewportCount(viewportCount);
        pViewports(pViewports);
        scissorCount(scissorCount);
        pScissors(pScissors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportStateCreateInfo set(VkPipelineViewportStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportStateCreateInfo malloc() {
        return new VkPipelineViewportStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportStateCreateInfo calloc() {
        return new VkPipelineViewportStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineViewportStateCreateInfo create(long address) {
        return new VkPipelineViewportStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineViewportStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineViewportStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineViewportStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pViewports}. */
    public static VkViewport.@Nullable Buffer npViewports(long struct) { return VkViewport.createSafe(memGetAddress(struct + VkPipelineViewportStateCreateInfo.PVIEWPORTS), nviewportCount(struct)); }
    /** Unsafe version of {@link #scissorCount}. */
    public static int nscissorCount(long struct) { return memGetInt(struct + VkPipelineViewportStateCreateInfo.SCISSORCOUNT); }
    /** Unsafe version of {@link #pScissors}. */
    public static VkRect2D.@Nullable Buffer npScissors(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkPipelineViewportStateCreateInfo.PSCISSORS), nscissorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pViewports(VkViewport.Buffer) pViewports}. */
    public static void npViewports(long struct, VkViewport.@Nullable Buffer value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PVIEWPORTS, memAddressSafe(value)); if (value != null) { nviewportCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code scissorCount} field of the specified {@code struct}. */
    public static void nscissorCount(long struct, int value) { memPutInt(struct + VkPipelineViewportStateCreateInfo.SCISSORCOUNT, value); }
    /** Unsafe version of {@link #pScissors(VkRect2D.Buffer) pScissors}. */
    public static void npScissors(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkPipelineViewportStateCreateInfo.PSCISSORS, memAddressSafe(value)); if (value != null) { nscissorCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineViewportStateCreateInfo ELEMENT_FACTORY = VkPipelineViewportStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportStateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportStateCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineViewportStateCreateFlags")
        public int flags() { return VkPipelineViewportStateCreateInfo.nflags(address()); }
        /** @return the value of the {@code viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportStateCreateInfo.nviewportCount(address()); }
        /** @return a {@link VkViewport.Buffer} view of the struct array pointed to by the {@code pViewports} field. */
        @NativeType("VkViewport const *")
        public VkViewport.@Nullable Buffer pViewports() { return VkPipelineViewportStateCreateInfo.npViewports(address()); }
        /** @return the value of the {@code scissorCount} field. */
        @NativeType("uint32_t")
        public int scissorCount() { return VkPipelineViewportStateCreateInfo.nscissorCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pScissors} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pScissors() { return VkPipelineViewportStateCreateInfo.npScissors(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineViewportStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportStateCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportDepthClampControlCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportDepthClampControlCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportDepthClipControlCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportDepthClipControlCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportExclusiveScissorStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportShadingRateImageStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportShadingRateImageStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportSwizzleStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportSwizzleStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineViewportWScalingStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkPipelineViewportStateCreateInfo.Buffer pNext(VkPipelineViewportWScalingStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineViewportStateCreateInfo.Buffer flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) { VkPipelineViewportStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code viewportCount} field. */
        public VkPipelineViewportStateCreateInfo.Buffer viewportCount(@NativeType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.nviewportCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkViewport.Buffer} to the {@code pViewports} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pViewports(@NativeType("VkViewport const *") VkViewport.@Nullable Buffer value) { VkPipelineViewportStateCreateInfo.npViewports(address(), value); return this; }
        /** Sets the specified value to the {@code scissorCount} field. */
        public VkPipelineViewportStateCreateInfo.Buffer scissorCount(@NativeType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.nscissorCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pScissors} field. */
        public VkPipelineViewportStateCreateInfo.Buffer pScissors(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkPipelineViewportStateCreateInfo.npScissors(address(), value); return this; }

    }

}