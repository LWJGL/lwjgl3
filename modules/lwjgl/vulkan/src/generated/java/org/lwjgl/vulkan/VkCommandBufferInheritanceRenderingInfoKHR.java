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
 * <p>If the {@code pNext} chain of {@link VkCommandBufferInheritanceInfo} includes a {@link VkCommandBufferInheritanceRenderingInfoKHR} structure, then that structure controls parameters of dynamic render pass instances that the {@code VkCommandBuffer} <b>can</b> be executed within. If {@link VkCommandBufferInheritanceInfo}{@code ::renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} is not specified in {@link VkCommandBufferBeginInfo}{@code ::flags}, parameters of this structure are ignored.</p>
 * 
 * <p>If {@code colorAttachmentCount} is 0 and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-variableMultisampleRate">{@code variableMultisampleRate}</a> feature is enabled, {@code rasterizationSamples} is ignored.</p>
 * 
 * <p>If {@code depthAttachmentFormat}, {@code stencilAttachmentFormat}, or any element of {@code pColorAttachmentFormats} is {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it indicates that the corresponding attachment is unused within the render pass.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code colorAttachmentCount} is not 0, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-variableMultisampleRate">{@code variableMultisampleRate}</a> feature is not enabled, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If any element of {@code pColorAttachmentFormats} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> be a format with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#potential-format-features">potential format features</a> that include {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code depthAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} and {@code stencilAttachmentFormat} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code depthAttachmentFormat} <b>must</b> equal {@code stencilAttachmentFormat}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> feature is not enabled, {@code viewMask} <b>must</b> be 0</li>
 * <li>The index of the most significant bit in {@code viewMask} <b>must</b> be less than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxMultiviewViewCount">{@code maxMultiviewViewCount}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkRenderingFlagBitsKHR} values</li>
 * <li>{@code pColorAttachmentFormats} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@code VkFormat} values</li>
 * <li>{@code depthAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code stencilAttachmentFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>If {@code rasterizationSamples} is not 0, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceRenderingInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderingFlagsKHR {@link #flags};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #colorAttachmentCount};
 *     VkFormat const * {@link #pColorAttachmentFormats};
 *     VkFormat {@link #depthAttachmentFormat};
 *     VkFormat {@link #stencilAttachmentFormat};
 *     VkSampleCountFlagBits {@link #rasterizationSamples};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceRenderingInfoKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkCommandBufferInheritanceRenderingInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceRenderingInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkRenderingFlagBitsKHR} used by the render pass instance. */
    @NativeType("VkRenderingFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the view mask used for rendering. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** the number of color attachments specified in the render pass instance. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** an array of {@code VkFormat} values defining the format of color attachments. */
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
    public VkCommandBufferInheritanceRenderingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR flags(@NativeType("VkRenderingFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorAttachmentFormats} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@link #depthAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilAttachmentFormat} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationSamples} field. */
    public VkCommandBufferInheritanceRenderingInfoKHR rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceRenderingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int viewMask,
        IntBuffer pColorAttachmentFormats,
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
    public VkCommandBufferInheritanceRenderingInfoKHR set(VkCommandBufferInheritanceRenderingInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfoKHR malloc() {
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfoKHR calloc() {
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceRenderingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance for the specified memory address. */
    public static VkCommandBufferInheritanceRenderingInfoKHR create(long address) {
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderingInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR malloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR calloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderingInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceRenderingInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.FLAGS); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    public static IntBuffer npColorAttachmentFormats(long struct) { return memIntBuffer(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfoKHR.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.STENCILATTACHMENTFORMAT); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.RASTERIZATIONSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, IntBuffer value) { memPutAddress(struct + VkCommandBufferInheritanceRenderingInfoKHR.PCOLORATTACHMENTFORMATS, memAddress(value)); ncolorAttachmentCount(struct, value.remaining()); }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.STENCILATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
    public static void nrasterizationSamples(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderingInfoKHR.RASTERIZATIONSAMPLES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCommandBufferInheritanceRenderingInfoKHR.PCOLORATTACHMENTFORMATS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceRenderingInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderingInfoKHR, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceRenderingInfoKHR ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceRenderingInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferInheritanceRenderingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceRenderingInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceRenderingInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#flags} field. */
        @NativeType("VkRenderingFlagsKHR")
        public int flags() { return VkCommandBufferInheritanceRenderingInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkCommandBufferInheritanceRenderingInfoKHR.nviewMask(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkCommandBufferInheritanceRenderingInfoKHR.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkCommandBufferInheritanceRenderingInfoKHR#pColorAttachmentFormats} field. */
        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() { return VkCommandBufferInheritanceRenderingInfoKHR.npColorAttachmentFormats(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfoKHR.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkCommandBufferInheritanceRenderingInfoKHR.nstencilAttachmentFormat(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderingInfoKHR#rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkCommandBufferInheritanceRenderingInfoKHR.nrasterizationSamples(address()); }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#sType} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR} value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#sType} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#pNext} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceRenderingInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#flags} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer flags(@NativeType("VkRenderingFlagsKHR") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#viewMask} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkCommandBufferInheritanceRenderingInfoKHR#pColorAttachmentFormats} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) { VkCommandBufferInheritanceRenderingInfoKHR.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#depthAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfoKHR.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#stencilAttachmentFormat} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nstencilAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderingInfoKHR#rasterizationSamples} field. */
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nrasterizationSamples(address(), value); return this; }

    }

}