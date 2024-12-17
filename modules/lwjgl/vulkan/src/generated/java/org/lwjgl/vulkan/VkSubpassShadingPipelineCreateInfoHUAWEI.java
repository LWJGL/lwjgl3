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
 * struct VkSubpassShadingPipelineCreateInfoHUAWEI {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 * }}</pre>
 */
public class VkSubpassShadingPipelineCreateInfoHUAWEI extends Struct<VkSubpassShadingPipelineCreateInfoHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        SUBPASS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        SUBPASS = layout.offsetof(3);
    }

    protected VkSubpassShadingPipelineCreateInfoHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassShadingPipelineCreateInfoHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassShadingPipelineCreateInfoHUAWEI(ByteBuffer container) {
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
    /** @return the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** @return the value of the {@code subpass} field. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI} value to the {@code sType} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code subpass} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(
        int sType,
        long pNext,
        long renderPass,
        int subpass
    ) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        subpass(subpass);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(VkSubpassShadingPipelineCreateInfoHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc() {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc() {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance for the specified memory address. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI create(long address) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassShadingPipelineCreateInfoHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc(MemoryStack stack) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc(MemoryStack stack) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return memGetInt(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.SUBPASS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.RENDERPASS, value); }
    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { memPutInt(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.SUBPASS, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassShadingPipelineCreateInfoHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkSubpassShadingPipelineCreateInfoHUAWEI, Buffer> implements NativeResource {

        private static final VkSubpassShadingPipelineCreateInfoHUAWEI ELEMENT_FACTORY = VkSubpassShadingPipelineCreateInfoHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassShadingPipelineCreateInfoHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassShadingPipelineCreateInfoHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address()); }
        /** @return the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nrenderPass(address()); }
        /** @return the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nsubpass(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI} value to the {@code sType} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkSubpassShadingPipelineCreateInfoHUAWEI.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code subpass} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer subpass(@NativeType("uint32_t") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.nsubpass(address(), value); return this; }

    }

}