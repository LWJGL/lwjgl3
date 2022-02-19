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
 * Structure specifying command buffer inheritance info for dynamic render pass instances.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkCommandBufferInheritanceInfo} includes a {@link VkCommandBufferInheritanceRenderingInfo} structure, then that structure controls parameters of dynamic render pass instances that the {@code VkCommandBuffer} <b>can</b> be executed within. If {@link VkCommandBufferInheritanceInfo}{@code ::renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} is not specified in {@link VkCommandBufferBeginInfo}{@code ::flags}, parameters of this structure are ignored.</p>
 * 
 * <p>If {@code colorAttachmentCount} is 0 and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-variableMultisampleRate">{@code variableMultisampleRate}</a> feature is enabled, {@code rasterizationSamples} is ignored.</p>
 * 
 * <p>If {@code depthAttachmentFormat}, {@code stencilAttachmentFormat}, or any element of {@code pColorAttachmentFormats} is {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it indicates that the corresponding attachment is unused within the render pass.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code colorAttachmentCount} is not 0, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-variableMultisampleRate">{@code variableMultisampleRate}</a> feature is not enabled, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If any element of {@code pColorAttachmentFormats} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format that includes a depth aspect</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>When rendering to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary">Linear Color attachment</a>, if any element of {@code pColorAttachmentFormats} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format that includes a stencil aspect</li>
 * <li>If {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} and {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code depthAttachmentFormat} <b>must</b> equal {@code stencilAttachmentFormat}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> feature is not enabled, {@code viewMask} <b>must</b> be 0</li>
 * <li>The index of the most significant bit in {@code viewMask} <b>must</b> be less than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxMultiviewViewCount">{@code maxMultiviewViewCount}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkRenderingFlagBits} values</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachmentFormats} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@code VkFormat} values</li>
 * <li>{@code depthAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code stencilAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>If {@code rasterizationSamples} is not 0, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceRenderingInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderingFlags {@link #flags};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #colorAttachmentCount};
 *     VkFormat const * {@link #pColorAttachmentFormats};
 *     VkFormat {@link #depthAttachmentFormat};
 *     VkFormat {@link #stencilAttachmentFormat};
 *     VkSampleCountFlagBits {@link #rasterizationSamples};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceRenderingInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIEWMASK,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTFORMATS,
        DEPTHATTACHMENTFORMAT,
        STENCILATTACHMENTFORMAT,
        RASTERIZATIONSAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWMASK = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTFORMATS = layout.offsetof(5);
        DEPTHATTACHMENTFORMAT = layout.offsetof(6);
        STENCILATTACHMENTFORMAT = layout.offsetof(7);
        RASTERIZATIONSAMPLES = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceRenderingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceRenderingInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkRenderingFlagBits} used by the render pass instance. */
    @NativeType("VkRenderingFlags")
    public int flags() { return nflags(address()); }
    /** the view mask used for rendering. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** the number of color attachments specified in the render pass instance. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code VkFormat} values defining the format of color attachments. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** a {@code VkFormat} value defining the format of the depth attachment. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** a {@code VkFormat} value defining the format of the stencil attachment. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }
    /** a {@code VkSampleCountFlagBits} specifying the number of samples used in rasterization. */
    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() { return nrasterizationSamples(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferInheritanceRenderingInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceRenderingInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferInheritanceRenderingInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkCommandBufferInheritanceRenderingInfo flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkCommandBufferInheritanceRenderingInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorAttachmentFormats} field. */
    public VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@link #depthAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationSamples} field. */
    public VkCommandBufferInheritanceRenderingInfo rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceRenderingInfo set(
        int sType,
        long pNext,
        int flags,
        int viewMask,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat,
        int rasterizationSamples
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        rasterizationSamples(rasterizationSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceRenderingInfo set(VkCommandBufferInheritanceRenderingInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfo malloc() {
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfo calloc() {
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance for the specified memory address. */
    public static VkCommandBufferInheritanceRenderingInfo create(long address) {
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderingInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceRenderingInfo.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderingInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfo malloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfo calloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderingInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.FLAGS); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    @Nullable public static IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.FLAGS, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
    public static void nrasterizationSamples(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceRenderingInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderingInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceRenderingInfo ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceRenderingInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceRenderingInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferInheritanceRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceRenderingInfo.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceRenderingInfo.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#flags} field. */
        @NativeType("VkRenderingFlags")
        public int flags() { return VkCommandBufferInheritanceRenderingInfo.nflags(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkCommandBufferInheritanceRenderingInfo.nviewMask(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkCommandBufferInheritanceRenderingInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkCommandBufferInheritanceRenderingInfo#pColorAttachmentFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() { return VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfo#rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address()); }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#sType} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceRenderingInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@link VkCommandBufferInheritanceRenderingInfo#sType} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#pNext} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceRenderingInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#flags} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkCommandBufferInheritanceRenderingInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#viewMask} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceRenderingInfo.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkCommandBufferInheritanceRenderingInfo#pColorAttachmentFormats} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#depthAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#stencilAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfo#rasterizationSamples} field. */
        public VkCommandBufferInheritanceRenderingInfo.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address(), value); return this; }

    }

}