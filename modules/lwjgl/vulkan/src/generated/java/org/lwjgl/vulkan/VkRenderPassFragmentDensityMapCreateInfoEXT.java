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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing fragment density map attachment for render pass.
 * 
 * <h5>Description</h5>
 * 
 * <p>The fragment density map attachment is read at an implementation-dependent time either by the host during {@link VK10#vkCmdBeginRenderPass CmdBeginRenderPass} if the attachment's image view was not created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT}, or by the device when drawing commands in the renderpass execute {@link EXTFragmentDensityMap#VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT}.</p>
 * 
 * <p>If this structure is not present, it is as if {@code fragmentDensityMapAttachment} was given as {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code fragmentDensityMapAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code fragmentDensityMapAttachment} <b>must</b> be less than {@link VkRenderPassCreateInfo}{@code ::attachmentCount}</li>
 * <li>If {@code fragmentDensityMapAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code fragmentDensityMapAttachment} <b>must</b> not be an element of {@link VkSubpassDescription}{@code ::pInputAttachments}, {@link VkSubpassDescription}{@code ::pColorAttachments}, {@link VkSubpassDescription}{@code ::pResolveAttachments}, {@link VkSubpassDescription}{@code ::pDepthStencilAttachment}, or {@link VkSubpassDescription}{@code ::pPreserveAttachments} for any subpass</li>
 * <li>If {@code fragmentDensityMapAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code layout} <b>must</b> be equal to {@link EXTFragmentDensityMap#VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT}, or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>If {@code fragmentDensityMapAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD} or {@link VK10#VK_ATTACHMENT_LOAD_OP_DONT_CARE ATTACHMENT_LOAD_OP_DONT_CARE}.</li>
 * <li>If {@code fragmentDensityMapAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code storeOp} equal to {@link VK10#VK_ATTACHMENT_STORE_OP_DONT_CARE ATTACHMENT_STORE_OP_DONT_CARE}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT}</li>
 * <li>{@code fragmentDensityMapAttachment} <b>must</b> be a valid {@link VkAttachmentReference} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code fragmentDensityMapAttachment} &ndash; the fragment density map to use for the render pass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassFragmentDensityMapCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkAttachmentReference VkAttachmentReference} fragmentDensityMapAttachment;
 * }</code></pre>
 */
public class VkRenderPassFragmentDensityMapCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAPATTACHMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkAttachmentReference.SIZEOF, VkAttachmentReference.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYMAPATTACHMENT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassFragmentDensityMapCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkAttachmentReference} view of the {@code fragmentDensityMapAttachment} field. */
    public VkAttachmentReference fragmentDensityMapAttachment() { return nfragmentDensityMapAttachment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassFragmentDensityMapCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkAttachmentReference} to the {@code fragmentDensityMapAttachment} field. */
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(VkAttachmentReference value) { nfragmentDensityMapAttachment(address(), value); return this; }
    /** Passes the {@code fragmentDensityMapAttachment} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(java.util.function.Consumer<VkAttachmentReference> consumer) { consumer.accept(fragmentDensityMapAttachment()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassFragmentDensityMapCreateInfoEXT set(
        int sType,
        long pNext,
        VkAttachmentReference fragmentDensityMapAttachment
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapAttachment(fragmentDensityMapAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassFragmentDensityMapCreateInfoEXT set(VkRenderPassFragmentDensityMapCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT malloc() {
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT calloc() {
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance for the specified memory address. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT create(long address) {
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassFragmentDensityMapCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkRenderPassFragmentDensityMapCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassFragmentDensityMapCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassFragmentDensityMapCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMapAttachment}. */
    public static VkAttachmentReference nfragmentDensityMapAttachment(long struct) { return VkAttachmentReference.create(struct + VkRenderPassFragmentDensityMapCreateInfoEXT.FRAGMENTDENSITYMAPATTACHMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassFragmentDensityMapCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassFragmentDensityMapCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMapAttachment(VkAttachmentReference) fragmentDensityMapAttachment}. */
    public static void nfragmentDensityMapAttachment(long struct, VkAttachmentReference value) { memCopy(value.address(), struct + VkRenderPassFragmentDensityMapCreateInfoEXT.FRAGMENTDENSITYMAPATTACHMENT, VkAttachmentReference.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderPassFragmentDensityMapCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassFragmentDensityMapCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassFragmentDensityMapCreateInfoEXT ELEMENT_FACTORY = VkRenderPassFragmentDensityMapCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassFragmentDensityMapCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassFragmentDensityMapCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassFragmentDensityMapCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassFragmentDensityMapCreateInfoEXT.npNext(address()); }
        /** Returns a {@link VkAttachmentReference} view of the {@code fragmentDensityMapAttachment} field. */
        public VkAttachmentReference fragmentDensityMapAttachment() { return VkRenderPassFragmentDensityMapCreateInfoEXT.nfragmentDensityMapAttachment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassFragmentDensityMapCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassFragmentDensityMapCreateInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkAttachmentReference} to the {@code fragmentDensityMapAttachment} field. */
        public VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer fragmentDensityMapAttachment(VkAttachmentReference value) { VkRenderPassFragmentDensityMapCreateInfoEXT.nfragmentDensityMapAttachment(address(), value); return this; }
        /** Passes the {@code fragmentDensityMapAttachment} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer fragmentDensityMapAttachment(java.util.function.Consumer<VkAttachmentReference> consumer) { consumer.accept(fragmentDensityMapAttachment()); return this; }

    }

}