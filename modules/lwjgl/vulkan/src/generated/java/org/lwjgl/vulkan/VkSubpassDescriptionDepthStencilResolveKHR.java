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
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilAttachment} <b>must</b> not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> not both be {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilAttachment} <b>must</b> not have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code pDepthStencilResolveAttachment} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} then it <b>must</b> have a format whose features contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a depth component, then the {@code VkFormat} of {@code pDepthStencilAttachment} <b>must</b> have a depth component with the same number of bits and numerical type</li>
 * <li>If the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has a stencil component, then the {@code VkFormat} of {@code pDepthStencilAttachment} <b>must</b> have a stencil component with the same number of bits and numerical type</li>
 * <li>The value of {@code depthResolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::supportedDepthResolveModes} or {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR}</li>
 * <li>The value of {@code stencilResolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::supportedStencilResolveModes} or {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR}</li>
 * <li>If the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has both depth and stencil components, {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::independentResolve} is {@link VK10#VK_FALSE FALSE}, and {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::independentResolveNone} is {@link VK10#VK_FALSE FALSE}, then the values of {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> be identical</li>
 * <li>If the {@code VkFormat} of {@code pDepthStencilResolveAttachment} has both depth and stencil components, {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::independentResolve} is {@link VK10#VK_FALSE FALSE} and {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR}{@code ::independentResolveNone} is {@link VK10#VK_TRUE TRUE}, then the values of {@code depthResolveMode} and {@code stencilResolveMode} <b>must</b> be identical or one of them <b>must</b> be {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDepthStencilResolve#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR}</li>
 * <li>{@code depthResolveMode} <b>must</b> be a valid {@code VkResolveModeFlagBitsKHR} value</li>
 * <li>{@code stencilResolveMode} <b>must</b> be a valid {@code VkResolveModeFlagBitsKHR} value</li>
 * <li>If {@code pDepthStencilResolveAttachment} is not {@code NULL}, {@code pDepthStencilResolveAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference2KHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code depthResolveMode} &ndash; a bitmask of {@code VkResolveModeFlagBitsKHR} describing the depth resolve mode.</li>
 * <li>{@code stencilResolveMode} &ndash; a bitmask of {@code VkResolveModeFlagBitsKHR} describing the stencil resolve mode.</li>
 * <li>{@code pDepthStencilResolveAttachment} &ndash; an optional {@link VkAttachmentReference} structure defining the depth/stencil resolve attachment for this subpass and its layout.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescriptionDepthStencilResolveKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResolveModeFlagBitsKHR depthResolveMode;
 *     VkResolveModeFlagBitsKHR stencilResolveMode;
 *     {@link VkAttachmentReference2KHR VkAttachmentReference2KHR} const * pDepthStencilResolveAttachment;
 * }</code></pre>
 */
public class VkSubpassDescriptionDepthStencilResolveKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkSubpassDescriptionDepthStencilResolveKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescriptionDepthStencilResolveKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code depthResolveMode} field. */
    @NativeType("VkResolveModeFlagBitsKHR")
    public int depthResolveMode() { return ndepthResolveMode(address()); }
    /** Returns the value of the {@code stencilResolveMode} field. */
    @NativeType("VkResolveModeFlagBitsKHR")
    public int stencilResolveMode() { return nstencilResolveMode(address()); }
    /** Returns a {@link VkAttachmentReference2KHR} view of the struct pointed to by the {@code pDepthStencilResolveAttachment} field. */
    @Nullable
    @NativeType("VkAttachmentReference2KHR const *")
    public VkAttachmentReference2KHR pDepthStencilResolveAttachment() { return npDepthStencilResolveAttachment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDescriptionDepthStencilResolveKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDescriptionDepthStencilResolveKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolveKHR depthResolveMode(@NativeType("VkResolveModeFlagBitsKHR") int value) { ndepthResolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code stencilResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolveKHR stencilResolveMode(@NativeType("VkResolveModeFlagBitsKHR") int value) { nstencilResolveMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2KHR} to the {@code pDepthStencilResolveAttachment} field. */
    public VkSubpassDescriptionDepthStencilResolveKHR pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR value) { npDepthStencilResolveAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescriptionDepthStencilResolveKHR set(
        int sType,
        long pNext,
        int depthResolveMode,
        int stencilResolveMode,
        @Nullable VkAttachmentReference2KHR pDepthStencilResolveAttachment
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
    public VkSubpassDescriptionDepthStencilResolveKHR set(VkSubpassDescriptionDepthStencilResolveKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolveKHR malloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolveKHR calloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescriptionDepthStencilResolveKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance for the specified memory address. */
    public static VkSubpassDescriptionDepthStencilResolveKHR create(long address) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolveKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassDescriptionDepthStencilResolveKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassDescriptionDepthStencilResolveKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR mallocStack(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR callocStack(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescriptionDepthStencilResolveKHR.PNEXT); }
    /** Unsafe version of {@link #depthResolveMode}. */
    public static int ndepthResolveMode(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.DEPTHRESOLVEMODE); }
    /** Unsafe version of {@link #stencilResolveMode}. */
    public static int nstencilResolveMode(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.STENCILRESOLVEMODE); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment}. */
    @Nullable public static VkAttachmentReference2KHR npDepthStencilResolveAttachment(long struct) { return VkAttachmentReference2KHR.createSafe(memGetAddress(struct + VkSubpassDescriptionDepthStencilResolveKHR.PDEPTHSTENCILRESOLVEATTACHMENT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolveKHR.PNEXT, value); }
    /** Unsafe version of {@link #depthResolveMode(int) depthResolveMode}. */
    public static void ndepthResolveMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.DEPTHRESOLVEMODE, value); }
    /** Unsafe version of {@link #stencilResolveMode(int) stencilResolveMode}. */
    public static void nstencilResolveMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescriptionDepthStencilResolveKHR.STENCILRESOLVEMODE, value); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment(VkAttachmentReference2KHR) pDepthStencilResolveAttachment}. */
    public static void npDepthStencilResolveAttachment(long struct, @Nullable VkAttachmentReference2KHR value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolveKHR.PDEPTHSTENCILRESOLVEATTACHMENT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkSubpassDescriptionDepthStencilResolveKHR} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescriptionDepthStencilResolveKHR, Buffer> implements NativeResource {

        private static final VkSubpassDescriptionDepthStencilResolveKHR ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolveKHR.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescriptionDepthStencilResolveKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescriptionDepthStencilResolveKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescriptionDepthStencilResolveKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescriptionDepthStencilResolveKHR.npNext(address()); }
        /** Returns the value of the {@code depthResolveMode} field. */
        @NativeType("VkResolveModeFlagBitsKHR")
        public int depthResolveMode() { return VkSubpassDescriptionDepthStencilResolveKHR.ndepthResolveMode(address()); }
        /** Returns the value of the {@code stencilResolveMode} field. */
        @NativeType("VkResolveModeFlagBitsKHR")
        public int stencilResolveMode() { return VkSubpassDescriptionDepthStencilResolveKHR.nstencilResolveMode(address()); }
        /** Returns a {@link VkAttachmentReference2KHR} view of the struct pointed to by the {@code pDepthStencilResolveAttachment} field. */
        @Nullable
        @NativeType("VkAttachmentReference2KHR const *")
        public VkAttachmentReference2KHR pDepthStencilResolveAttachment() { return VkSubpassDescriptionDepthStencilResolveKHR.npDepthStencilResolveAttachment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolveKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescriptionDepthStencilResolveKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer depthResolveMode(@NativeType("VkResolveModeFlagBitsKHR") int value) { VkSubpassDescriptionDepthStencilResolveKHR.ndepthResolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code stencilResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBitsKHR") int value) { VkSubpassDescriptionDepthStencilResolveKHR.nstencilResolveMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2KHR} to the {@code pDepthStencilResolveAttachment} field. */
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR value) { VkSubpassDescriptionDepthStencilResolveKHR.npDepthStencilResolveAttachment(address(), value); return this; }

    }

}