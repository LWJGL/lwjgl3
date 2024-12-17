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
 * struct VkPipelineRenderingCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 * }}</pre>
 */
public class VkPipelineRenderingCreateInfo extends Struct<VkPipelineRenderingCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWMASK,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTFORMATS,
        DEPTHATTACHMENTFORMAT,
        STENCILATTACHMENTFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWMASK = layout.offsetof(2);
        COLORATTACHMENTCOUNT = layout.offsetof(3);
        PCOLORATTACHMENTFORMATS = layout.offsetof(4);
        DEPTHATTACHMENTFORMAT = layout.offsetof(5);
        STENCILATTACHMENTFORMAT = layout.offsetof(6);
    }

    protected VkPipelineRenderingCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRenderingCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRenderingCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineRenderingCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRenderingCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code viewMask} field. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** @return the value of the {@code depthAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** @return the value of the {@code stencilAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRenderingCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineRenderingCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRenderingCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    public VkPipelineRenderingCreateInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkPipelineRenderingCreateInfo colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    public VkPipelineRenderingCreateInfo pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    public VkPipelineRenderingCreateInfo depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    public VkPipelineRenderingCreateInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRenderingCreateInfo set(
        int sType,
        long pNext,
        int viewMask,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat
    ) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRenderingCreateInfo set(VkPipelineRenderingCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRenderingCreateInfo malloc() {
        return new VkPipelineRenderingCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRenderingCreateInfo calloc() {
        return new VkPipelineRenderingCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRenderingCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRenderingCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance for the specified memory address. */
    public static VkPipelineRenderingCreateInfo create(long address) {
        return new VkPipelineRenderingCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRenderingCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineRenderingCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRenderingCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRenderingCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRenderingCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRenderingCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRenderingCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRenderingCreateInfo.PNEXT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkPipelineRenderingCreateInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    public static @Nullable IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return memGetInt(struct + VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return memGetInt(struct + VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRenderingCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRenderingCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkPipelineRenderingCreateInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { memPutInt(struct + VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { memPutInt(struct + VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRenderingCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRenderingCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineRenderingCreateInfo ELEMENT_FACTORY = VkPipelineRenderingCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineRenderingCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRenderingCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRenderingCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRenderingCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRenderingCreateInfo.npNext(address()); }
        /** @return the value of the {@code viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkPipelineRenderingCreateInfo.nviewMask(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkPipelineRenderingCreateInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer pColorAttachmentFormats() { return VkPipelineRenderingCreateInfo.npColorAttachmentFormats(address()); }
        /** @return the value of the {@code depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkPipelineRenderingCreateInfo.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@code stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkPipelineRenderingCreateInfo.nstencilAttachmentFormat(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRenderingCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRenderingCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineRenderingCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRenderingCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRenderingCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        public VkPipelineRenderingCreateInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkPipelineRenderingCreateInfo.nviewMask(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkPipelineRenderingCreateInfo.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkPipelineRenderingCreateInfo.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        public VkPipelineRenderingCreateInfo.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkPipelineRenderingCreateInfo.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        public VkPipelineRenderingCreateInfo.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfo.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        public VkPipelineRenderingCreateInfo.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfo.nstencilAttachmentFormat(address(), value); return this; }

    }

}