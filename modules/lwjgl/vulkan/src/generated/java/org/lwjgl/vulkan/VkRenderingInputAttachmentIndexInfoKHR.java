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
 * Structure specifying input attachment indices.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure allows applications to remap attachments to different input attachment indices.</p>
 * 
 * <p>Each element of {@code pColorAttachmentInputIndices} set to a value of {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} indicates that the corresponding attachment will not be used as an input attachment in this pipeline. Any other value in each of those elements will map the corresponding attachment to a {@code InputAttachmentIndex} value defined in shader code.</p>
 * 
 * <p>If {@code pColorAttachmentInputIndices} is {@code NULL}, it is equivalent to setting each element to its index within the array.</p>
 * 
 * <p>If {@code pDepthInputAttachmentIndex} or {@code pStencilInputAttachmentIndex} are set to {@code NULL}, they map to input attachments without a {@code InputAttachmentIndex} decoration. If they point to a value of {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it indicates that the corresponding attachment will not be used as an input attachment in this pipeline. If they point to any other value it maps the corresponding attachment to a {@code InputAttachmentIndex} value defined in shader code.</p>
 * 
 * <p>This structure <b>can</b> be included in the {@code pNext} chain of a {@link VkGraphicsPipelineCreateInfo} structure to set this state for a pipeline. If this structure is not included in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo}, it is equivalent to specifying this structure with the following properties:</p>
 * 
 * <ul>
 * <li>{@code colorAttachmentCount} set to {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount}.</li>
 * <li>{@code pColorAttachmentInputIndices} set to {@code NULL}.</li>
 * <li>{@code pDepthInputAttachmentIndex} set to {@code NULL}.</li>
 * <li>{@code pStencilInputAttachmentIndex} set to {@code NULL}.</li>
 * </ul>
 * 
 * <p>This structure <b>can</b> be included in the {@code pNext} chain of a {@link VkCommandBufferInheritanceInfo} structure to specify inherited state from the primary command buffer. If this structure is not included in the {@code pNext} chain of {@link VkCommandBufferInheritanceInfo}, it is equivalent to specifying this structure with the following properties:</p>
 * 
 * <ul>
 * <li>{@code colorAttachmentCount} set to {@link VkCommandBufferInheritanceRenderingInfo}{@code ::colorAttachmentCount}.</li>
 * <li>{@code pColorAttachmentInputIndices} set to {@code NULL}.</li>
 * <li>{@code pDepthInputAttachmentIndex} set to {@code NULL}.</li>
 * <li>{@code pStencilInputAttachmentIndex} set to {@code NULL}.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> feature is not enabled, and {@code pColorAttachmentInputIndices} is not {@code NULL}, each element <b>must</b> be set to {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> feature is not enabled, {@code pDepthInputAttachmentIndex} <b>must</b> be a valid pointer to a value of {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> feature is not enabled, {@code pStencilInputAttachmentIndex} <b>must</b> be a valid pointer to a value of {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>Elements of {@code pColorAttachmentInputIndices} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> each be unique</li>
 * <li>Elements of {@code pColorAttachmentInputIndices} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> not take the same value as the content of {@code pDepthInputAttachmentIndex}</li>
 * <li>Elements of {@code pColorAttachmentInputIndices} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> not take the same value as the content of {@code pStencilInputAttachmentIndex}</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxColorAttachments">{@code maxColorAttachments}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRenderingLocalRead#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR}</li>
 * <li>If {@code colorAttachmentCount} is not 0, and {@code pColorAttachmentInputIndices} is not {@code NULL}, {@code pColorAttachmentInputIndices} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} {@code uint32_t} values</li>
 * <li>If {@code pDepthInputAttachmentIndex} is not {@code NULL}, {@code pDepthInputAttachmentIndex} <b>must</b> be a valid pointer to a valid {@code uint32_t} value</li>
 * <li>If {@code pStencilInputAttachmentIndex} is not {@code NULL}, {@code pStencilInputAttachmentIndex} <b>must</b> be a valid pointer to a valid {@code uint32_t} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRDynamicRenderingLocalRead#vkCmdSetRenderingInputAttachmentIndicesKHR CmdSetRenderingInputAttachmentIndicesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingInputAttachmentIndexInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #colorAttachmentCount};
 *     uint32_t const * {@link #pColorAttachmentInputIndices};
 *     uint32_t const * {@link #pDepthInputAttachmentIndex};
 *     uint32_t const * {@link #pStencilInputAttachmentIndex};
 * }</code></pre>
 */
public class VkRenderingInputAttachmentIndexInfoKHR extends Struct<VkRenderingInputAttachmentIndexInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTINPUTINDICES,
        PDEPTHINPUTATTACHMENTINDEX,
        PSTENCILINPUTATTACHMENTINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTINPUTINDICES = layout.offsetof(3);
        PDEPTHINPUTATTACHMENTINDEX = layout.offsetof(4);
        PSTENCILINPUTATTACHMENTINDEX = layout.offsetof(5);
    }

    protected VkRenderingInputAttachmentIndexInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingInputAttachmentIndexInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderingInputAttachmentIndexInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInputAttachmentIndexInfoKHR(ByteBuffer container) {
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
    /** the number of elements in {@code pColorAttachmentInputIndices}. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code colorAttachmentCount} {@code uint32_t} values defining indices for color attachments to be used as input attachments. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pColorAttachmentInputIndices() { return npColorAttachmentInputIndices(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return either {@code NULL}, or a pointer to a {@code uint32_t} value defining the index for the depth attachment to be used as an input attachment.
     */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDepthInputAttachmentIndex(int capacity) { return npDepthInputAttachmentIndex(address(), capacity); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return either {@code NULL}, or a pointer to a {@code uint32_t} value defining the index for the stencil attachment to be used as an input attachment.
     */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pStencilInputAttachmentIndex(int capacity) { return npStencilInputAttachmentIndex(address(), capacity); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingInputAttachmentIndexInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRenderingLocalRead#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR} value to the {@link #sType} field. */
    public VkRenderingInputAttachmentIndexInfoKHR sType$Default() { return sType(KHRDynamicRenderingLocalRead.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingInputAttachmentIndexInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #colorAttachmentCount} field. */
    public VkRenderingInputAttachmentIndexInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorAttachmentInputIndices} field. */
    public VkRenderingInputAttachmentIndexInfoKHR pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npColorAttachmentInputIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDepthInputAttachmentIndex} field. */
    public VkRenderingInputAttachmentIndexInfoKHR pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDepthInputAttachmentIndex(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pStencilInputAttachmentIndex} field. */
    public VkRenderingInputAttachmentIndexInfoKHR pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npStencilInputAttachmentIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingInputAttachmentIndexInfoKHR set(
        int sType,
        long pNext,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentInputIndices,
        @Nullable IntBuffer pDepthInputAttachmentIndex,
        @Nullable IntBuffer pStencilInputAttachmentIndex
    ) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentInputIndices(pColorAttachmentInputIndices);
        pDepthInputAttachmentIndex(pDepthInputAttachmentIndex);
        pStencilInputAttachmentIndex(pStencilInputAttachmentIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInputAttachmentIndexInfoKHR set(VkRenderingInputAttachmentIndexInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfoKHR malloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfoKHR calloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInputAttachmentIndexInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInputAttachmentIndexInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance for the specified memory address. */
    public static VkRenderingInputAttachmentIndexInfoKHR create(long address) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingInputAttachmentIndexInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderingInputAttachmentIndexInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingInputAttachmentIndexInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingInputAttachmentIndexInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PNEXT); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkRenderingInputAttachmentIndexInfoKHR.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentInputIndices() pColorAttachmentInputIndices}. */
    public static @Nullable IntBuffer npColorAttachmentInputIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PCOLORATTACHMENTINPUTINDICES), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthInputAttachmentIndex(int) pDepthInputAttachmentIndex}. */
    public static @Nullable IntBuffer npDepthInputAttachmentIndex(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PDEPTHINPUTATTACHMENTINDEX), capacity); }
    /** Unsafe version of {@link #pStencilInputAttachmentIndex(int) pStencilInputAttachmentIndex}. */
    public static @Nullable IntBuffer npStencilInputAttachmentIndex(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PSTENCILINPUTATTACHMENTINDEX), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingInputAttachmentIndexInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkRenderingInputAttachmentIndexInfoKHR.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentInputIndices(IntBuffer) pColorAttachmentInputIndices}. */
    public static void npColorAttachmentInputIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PCOLORATTACHMENTINPUTINDICES, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pDepthInputAttachmentIndex(IntBuffer) pDepthInputAttachmentIndex}. */
    public static void npDepthInputAttachmentIndex(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PDEPTHINPUTATTACHMENTINDEX, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStencilInputAttachmentIndex(IntBuffer) pStencilInputAttachmentIndex}. */
    public static void npStencilInputAttachmentIndex(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfoKHR.PSTENCILINPUTATTACHMENTINDEX, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkRenderingInputAttachmentIndexInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRenderingInputAttachmentIndexInfoKHR, Buffer> implements NativeResource {

        private static final VkRenderingInputAttachmentIndexInfoKHR ELEMENT_FACTORY = VkRenderingInputAttachmentIndexInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInputAttachmentIndexInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingInputAttachmentIndexInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingInputAttachmentIndexInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingInputAttachmentIndexInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkRenderingInputAttachmentIndexInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingInputAttachmentIndexInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkRenderingInputAttachmentIndexInfoKHR#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkRenderingInputAttachmentIndexInfoKHR.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkRenderingInputAttachmentIndexInfoKHR#pColorAttachmentInputIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pColorAttachmentInputIndices() { return VkRenderingInputAttachmentIndexInfoKHR.npColorAttachmentInputIndices(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link VkRenderingInputAttachmentIndexInfoKHR#pDepthInputAttachmentIndex} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDepthInputAttachmentIndex(int capacity) { return VkRenderingInputAttachmentIndexInfoKHR.npDepthInputAttachmentIndex(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link VkRenderingInputAttachmentIndexInfoKHR#pStencilInputAttachmentIndex} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pStencilInputAttachmentIndex(int capacity) { return VkRenderingInputAttachmentIndexInfoKHR.npStencilInputAttachmentIndex(address(), capacity); }

        /** Sets the specified value to the {@link VkRenderingInputAttachmentIndexInfoKHR#sType} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRenderingLocalRead#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR} value to the {@link VkRenderingInputAttachmentIndexInfoKHR#sType} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer sType$Default() { return sType(KHRDynamicRenderingLocalRead.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR); }
        /** Sets the specified value to the {@link VkRenderingInputAttachmentIndexInfoKHR#pNext} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInputAttachmentIndexInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingInputAttachmentIndexInfoKHR#colorAttachmentCount} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfoKHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkRenderingInputAttachmentIndexInfoKHR#pColorAttachmentInputIndices} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npColorAttachmentInputIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkRenderingInputAttachmentIndexInfoKHR#pDepthInputAttachmentIndex} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npDepthInputAttachmentIndex(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkRenderingInputAttachmentIndexInfoKHR#pStencilInputAttachmentIndex} field. */
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npStencilInputAttachmentIndex(address(), value); return this; }

    }

}