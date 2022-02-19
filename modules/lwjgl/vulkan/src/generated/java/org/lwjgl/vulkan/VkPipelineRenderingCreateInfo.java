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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying attachment formats.
 * 
 * <h5>Description</h5>
 * 
 * <p>When a pipeline is created without a {@code VkRenderPass}, if this structure is present in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo}, it specifies the view mask and format of attachments used for rendering. If this structure is not specified, and the pipeline does not include a {@code VkRenderPass}, {@code viewMask} and {@code colorAttachmentCount} are 0, and {@code depthAttachmentFormat} and {@code stencilAttachmentFormat} are {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}. If a graphics pipeline is created with a valid {@code VkRenderPass}, parameters of this structure are ignored.</p>
 * 
 * <p>If {@code depthAttachmentFormat}, {@code stencilAttachmentFormat}, or any element of {@code pColorAttachmentFormats} is {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it indicates that the corresponding attachment is unused within the render pass. Valid formats indicate that an attachment <b>can</b> be used - but it is still valid to set the attachment to {@code NULL} when beginning rendering.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any element of {@code pColorAttachmentFormats} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that includes either {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format that includes a depth aspect</li>
 * <li>If {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format that includes a stencil aspect</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} and {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code depthAttachmentFormat} <b>must</b> equal {@code stencilAttachmentFormat}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> feature is not enabled, {@code viewMask} <b>must</b> be 0</li>
 * <li>The index of the most significant bit in {@code viewMask} <b>must</b> be less than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxMultiviewViewCount">{@code maxMultiviewViewCount}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO}</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachmentFormats} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@code VkFormat} values</li>
 * <li>{@code depthAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code stencilAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRenderingCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #colorAttachmentCount};
 *     VkFormat const * {@link #pColorAttachmentFormats};
 *     VkFormat {@link #depthAttachmentFormat};
 *     VkFormat {@link #stencilAttachmentFormat};
 * }</code></pre>
 */
public class VkPipelineRenderingCreateInfo extends Struct implements NativeResource {

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

    /** the type of this structure. */
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
    /** a pointer to an array of {@code VkFormat} values defining the format of color attachments used in this pipeline. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** a {@code VkFormat} value defining the format of the depth attachment used in this pipeline. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** a {@code VkFormat} value defining the format of the stencil attachment used in this pipeline. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRenderingCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineRenderingCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRenderingCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkPipelineRenderingCreateInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorAttachmentFormats} field. */
    public VkPipelineRenderingCreateInfo pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@link #depthAttachmentFormat} field. */
    public VkPipelineRenderingCreateInfo depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilAttachmentFormat} field. */
    public VkPipelineRenderingCreateInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRenderingCreateInfo set(
        int sType,
        long pNext,
        int viewMask,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat
    ) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
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
        return wrap(VkPipelineRenderingCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRenderingCreateInfo calloc() {
        return wrap(VkPipelineRenderingCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRenderingCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRenderingCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfo} instance for the specified memory address. */
    public static VkPipelineRenderingCreateInfo create(long address) {
        return wrap(VkPipelineRenderingCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRenderingCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRenderingCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRenderingCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRenderingCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineRenderingCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineRenderingCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRenderingCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRenderingCreateInfo.PNEXT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRenderingCreateInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    @Nullable public static IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRenderingCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRenderingCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRenderingCreateInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineRenderingCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRenderingCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineRenderingCreateInfo ELEMENT_FACTORY = VkPipelineRenderingCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineRenderingCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRenderingCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRenderingCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRenderingCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRenderingCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineRenderingCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRenderingCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineRenderingCreateInfo#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkPipelineRenderingCreateInfo.nviewMask(address()); }
        /** @return the value of the {@link VkPipelineRenderingCreateInfo#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkPipelineRenderingCreateInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPipelineRenderingCreateInfo#pColorAttachmentFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() { return VkPipelineRenderingCreateInfo.npColorAttachmentFormats(address()); }
        /** @return the value of the {@link VkPipelineRenderingCreateInfo#depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkPipelineRenderingCreateInfo.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@link VkPipelineRenderingCreateInfo#stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkPipelineRenderingCreateInfo.nstencilAttachmentFormat(address()); }

        /** Sets the specified value to the {@link VkPipelineRenderingCreateInfo#sType} field. */
        public VkPipelineRenderingCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRenderingCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@link VkPipelineRenderingCreateInfo#sType} field. */
        public VkPipelineRenderingCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineRenderingCreateInfo#pNext} field. */
        public VkPipelineRenderingCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRenderingCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRenderingCreateInfo#viewMask} field. */
        public VkPipelineRenderingCreateInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkPipelineRenderingCreateInfo.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPipelineRenderingCreateInfo#pColorAttachmentFormats} field. */
        public VkPipelineRenderingCreateInfo.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkPipelineRenderingCreateInfo.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRenderingCreateInfo#depthAttachmentFormat} field. */
        public VkPipelineRenderingCreateInfo.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfo.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRenderingCreateInfo#stencilAttachmentFormat} field. */
        public VkPipelineRenderingCreateInfo.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfo.nstencilAttachmentFormat(address(), value); return this; }

    }

}