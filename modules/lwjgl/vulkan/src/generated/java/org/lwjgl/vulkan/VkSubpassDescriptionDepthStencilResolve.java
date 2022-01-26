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
 * Structure specifying depth/stencil resolve operations for a subpass.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code pDepthStencilResolveAttachment} is {@code NULL}, or if its attachment index is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it indicates that no depth/stencil resolve attachment will be used in the subpass.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilAttachment} <b>must</b> not be {@code NULL} or have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> not both be {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilAttachment} <b>must</b> not have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilResolveAttachment} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} then it <b>must</b> have an image format whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a depth component, then the {@code VkFormat} of {@code pDepthStencilAttachment} <b>must</b> have a depth component with the same number of bits and numerical type</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, and {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a stencil component, then the {@code VkFormat} of {@code pDepthStencilAttachment} <b>must</b> have a stencil component with the same number of bits and numerical type</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a depth component, then the value of {@code depthResolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::supportedDepthResolveModes} or {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a stencil component, then the value of {@code stencilResolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::supportedStencilResolveModes} or {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has both depth and stencil components, {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolve} is {@link VK10#VK_FALSE FALSE}, and {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolveNone} is {@link VK10#VK_FALSE FALSE}, then the values of {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> be identical</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has both depth and stencil components, {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolve} is {@link VK10#VK_FALSE FALSE} and {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolveNone} is {@link VK10#VK_TRUE TRUE}, then the values of {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> be identical or one of them <b>must</b> be {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL}, {@code pDepthStencilResolveAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference2} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescriptionDepthStencilResolve {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkResolveModeFlagBits {@link #depthResolveMode};
 *     VkResolveModeFlagBits {@link #stencilResolveMode};
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * {@link #pDepthStencilResolveAttachment};
 * }</code></pre>
 */
public class VkSubpassDescriptionDepthStencilResolve extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHRESOLVEMODE,
        STENCILRESOLVEMODE,
        PDEPTHSTENCILRESOLVEATTACHMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHRESOLVEMODE = layout.offsetof(2);
        STENCILRESOLVEMODE = layout.offsetof(3);
        PDEPTHSTENCILRESOLVEATTACHMENT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkSubpassDescriptionDepthStencilResolve} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescriptionDepthStencilResolve(ByteBuffer container) {
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
    /** a {@code VkResolveModeFlagBits} value describing the depth resolve mode. */
    @NativeType("VkResolveModeFlagBits")
    public int depthResolveMode() { return ndepthResolveMode(address()); }
    /** a {@code VkResolveModeFlagBits} value describing the stencil resolve mode. */
    @NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() { return nstencilResolveMode(address()); }
    /** {@code NULL} or a pointer to a {@link VkAttachmentReference2} structure defining the depth/stencil resolve attachment for this subpass and its layout. */
    @Nullable
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2 pDepthStencilResolveAttachment() { return npDepthStencilResolveAttachment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassDescriptionDepthStencilResolve sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@link #sType} field. */
    public VkSubpassDescriptionDepthStencilResolve sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassDescriptionDepthStencilResolve pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { ndepthResolveMode(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { nstencilResolveMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@link #pDepthStencilResolveAttachment} field. */
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilResolveAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescriptionDepthStencilResolve set(
        int sType,
        long pNext,
        int depthResolveMode,
        int stencilResolveMode,
        @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment
    ) {
        sType(sType);
        pNext(pNext);
        depthResolveMode(depthResolveMode);
        stencilResolveMode(stencilResolveMode);
        pDepthStencilResolveAttachment(pDepthStencilResolveAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescriptionDepthStencilResolve set(VkSubpassDescriptionDepthStencilResolve src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolve malloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolve calloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescriptionDepthStencilResolve create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance for the specified memory address. */
    public static VkSubpassDescriptionDepthStencilResolve create(long address) {
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolve createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescriptionDepthStencilResolve.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolve.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolve malloc(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolve calloc(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolve.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolve.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescriptionDepthStencilResolve.PNEXT); }
    /** Unsafe version of {@link #depthResolveMode}. */
    public static int ndepthResolveMode(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE); }
    /** Unsafe version of {@link #stencilResolveMode}. */
    public static int nstencilResolveMode(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment}. */
    @Nullable public static VkAttachmentReference2 npDepthStencilResolveAttachment(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolve.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolve.PNEXT, value); }
    /** Unsafe version of {@link #depthResolveMode(int) depthResolveMode}. */
    public static void ndepthResolveMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE, value); }
    /** Unsafe version of {@link #stencilResolveMode(int) stencilResolveMode}. */
    public static void nstencilResolveMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE, value); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment(VkAttachmentReference2) pDepthStencilResolveAttachment}. */
    public static void npDepthStencilResolveAttachment(long struct, @Nullable VkAttachmentReference2 value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkSubpassDescriptionDepthStencilResolve} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescriptionDepthStencilResolve, Buffer> implements NativeResource {

        private static final VkSubpassDescriptionDepthStencilResolve ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolve.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescriptionDepthStencilResolve.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescriptionDepthStencilResolve#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescriptionDepthStencilResolve getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassDescriptionDepthStencilResolve#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescriptionDepthStencilResolve.nsType(address()); }
        /** @return the value of the {@link VkSubpassDescriptionDepthStencilResolve#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescriptionDepthStencilResolve.npNext(address()); }
        /** @return the value of the {@link VkSubpassDescriptionDepthStencilResolve#depthResolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int depthResolveMode() { return VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address()); }
        /** @return the value of the {@link VkSubpassDescriptionDepthStencilResolve#stencilResolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() { return VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address()); }
        /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@link VkSubpassDescriptionDepthStencilResolve#pDepthStencilResolveAttachment} field. */
        @Nullable
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2 pDepthStencilResolveAttachment() { return VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address()); }

        /** Sets the specified value to the {@link VkSubpassDescriptionDepthStencilResolve#sType} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolve.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@link VkSubpassDescriptionDepthStencilResolve#sType} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
        /** Sets the specified value to the {@link VkSubpassDescriptionDepthStencilResolve#pNext} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescriptionDepthStencilResolve.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescriptionDepthStencilResolve#depthResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescriptionDepthStencilResolve#stencilResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@link VkSubpassDescriptionDepthStencilResolve#pDepthStencilResolveAttachment} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address(), value); return this; }

    }

}