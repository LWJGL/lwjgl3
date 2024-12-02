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
 * Structure describing rendering area granularity query info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK14#vkGetRenderingAreaGranularity GetRenderingAreaGranularity}, {@link KHRMaintenance5#vkGetRenderingAreaGranularityKHR GetRenderingAreaGranularityKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingAreaInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #colorAttachmentCount};
 *     VkFormat const * {@link #pColorAttachmentFormats};
 *     VkFormat {@link #depthAttachmentFormat};
 *     VkFormat {@link #stencilAttachmentFormat};
 * }</code></pre>
 */
public class VkRenderingAreaInfo extends Struct<VkRenderingAreaInfo> implements NativeResource {

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

    protected VkRenderingAreaInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingAreaInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingAreaInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderingAreaInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAreaInfo(ByteBuffer container) {
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
    /** the viewMask used for rendering. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** the number of entries in {@code pColorAttachmentFormats} */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code VkFormat} values defining the format of color attachments used in the render pass instance. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** a {@code VkFormat} value defining the format of the depth attachment used in the render pass instance. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** a {@code VkFormat} value defining the format of the stencil attachment used in the render pass instance. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingAreaInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO} value to the {@link #sType} field. */
    public VkRenderingAreaInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingAreaInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkRenderingAreaInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the specified value to the {@link #colorAttachmentCount} field. */
    public VkRenderingAreaInfo colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorAttachmentFormats} field. */
    public VkRenderingAreaInfo pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@link #depthAttachmentFormat} field. */
    public VkRenderingAreaInfo depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilAttachmentFormat} field. */
    public VkRenderingAreaInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingAreaInfo set(
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
    public VkRenderingAreaInfo set(VkRenderingAreaInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAreaInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAreaInfo malloc() {
        return new VkRenderingAreaInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAreaInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAreaInfo calloc() {
        return new VkRenderingAreaInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAreaInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAreaInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAreaInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAreaInfo} instance for the specified memory address. */
    public static VkRenderingAreaInfo create(long address) {
        return new VkRenderingAreaInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingAreaInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderingAreaInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingAreaInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingAreaInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAreaInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAreaInfo malloc(MemoryStack stack) {
        return new VkRenderingAreaInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingAreaInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAreaInfo calloc(MemoryStack stack) {
        return new VkRenderingAreaInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingAreaInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingAreaInfo.PNEXT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkRenderingAreaInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkRenderingAreaInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    public static @Nullable IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderingAreaInfo.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return memGetInt(struct + VkRenderingAreaInfo.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return memGetInt(struct + VkRenderingAreaInfo.STENCILATTACHMENTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingAreaInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingAreaInfo.PNEXT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkRenderingAreaInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkRenderingAreaInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingAreaInfo.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { memPutInt(struct + VkRenderingAreaInfo.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { memPutInt(struct + VkRenderingAreaInfo.STENCILATTACHMENTFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkRenderingAreaInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingAreaInfo, Buffer> implements NativeResource {

        private static final VkRenderingAreaInfo ELEMENT_FACTORY = VkRenderingAreaInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingAreaInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAreaInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingAreaInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingAreaInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingAreaInfo.nsType(address()); }
        /** @return the value of the {@link VkRenderingAreaInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingAreaInfo.npNext(address()); }
        /** @return the value of the {@link VkRenderingAreaInfo#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkRenderingAreaInfo.nviewMask(address()); }
        /** @return the value of the {@link VkRenderingAreaInfo#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkRenderingAreaInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkRenderingAreaInfo#pColorAttachmentFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer pColorAttachmentFormats() { return VkRenderingAreaInfo.npColorAttachmentFormats(address()); }
        /** @return the value of the {@link VkRenderingAreaInfo#depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkRenderingAreaInfo.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@link VkRenderingAreaInfo#stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkRenderingAreaInfo.nstencilAttachmentFormat(address()); }

        /** Sets the specified value to the {@link VkRenderingAreaInfo#sType} field. */
        public VkRenderingAreaInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAreaInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO} value to the {@link VkRenderingAreaInfo#sType} field. */
        public VkRenderingAreaInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO); }
        /** Sets the specified value to the {@link VkRenderingAreaInfo#pNext} field. */
        public VkRenderingAreaInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAreaInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAreaInfo#viewMask} field. */
        public VkRenderingAreaInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkRenderingAreaInfo.nviewMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAreaInfo#colorAttachmentCount} field. */
        public VkRenderingAreaInfo.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingAreaInfo.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkRenderingAreaInfo#pColorAttachmentFormats} field. */
        public VkRenderingAreaInfo.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkRenderingAreaInfo.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAreaInfo#depthAttachmentFormat} field. */
        public VkRenderingAreaInfo.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkRenderingAreaInfo.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAreaInfo#stencilAttachmentFormat} field. */
        public VkRenderingAreaInfo.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkRenderingAreaInfo.nstencilAttachmentFormat(address(), value); return this; }

    }

}