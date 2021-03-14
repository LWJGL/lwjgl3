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
 * Structure specifying a fragment shading rate attachment for a subpass.
 * 
 * <h5>Description</h5>
 * 
 * <p>If no shading rate attachment is specified, or if this structure isn't specified, the implementation behaves as if a valid shading rate attachment was specified with all texels specifying a single pixel per fragment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> be equal to {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR}</li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be a power of two value</li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.width}</a></li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.width}</a></li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be a power of two value</li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.height}</a></li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.height}</a></li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the quotient of {@code shadingRateAttachmentTexelSize.width} and {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
 * <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the quotient of {@code shadingRateAttachmentTexelSize.height} and {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR}</li>
 * <li>{@code pFragmentShadingRateAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference2} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference2}, {@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code pFragmentShadingRateAttachment} &ndash; an optional {@link VkAttachmentReference2KHR} structure defining the fragment shading rate attachment for this subpass.</li>
 * <li>{@code shadingRateAttachmentTexelSize} &ndash; specifies the size of the portion of the framebuffer corresponding to each texel in {@code pFragmentShadingRateAttachment}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFragmentShadingRateAttachmentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pFragmentShadingRateAttachment;
 *     {@link VkExtent2D VkExtent2D} shadingRateAttachmentTexelSize;
 * }</code></pre>
 */
public class VkFragmentShadingRateAttachmentInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PFRAGMENTSHADINGRATEATTACHMENT,
        SHADINGRATEATTACHMENTTEXELSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PFRAGMENTSHADINGRATEATTACHMENT = layout.offsetof(2);
        SHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkFragmentShadingRateAttachmentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFragmentShadingRateAttachmentInfoKHR(ByteBuffer container) {
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
    /** Returns a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pFragmentShadingRateAttachment} field. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2 pFragmentShadingRateAttachment() { return npFragmentShadingRateAttachment(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code shadingRateAttachmentTexelSize} field. */
    public VkExtent2D shadingRateAttachmentTexelSize() { return nshadingRateAttachmentTexelSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFragmentShadingRateAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFragmentShadingRateAttachmentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pFragmentShadingRateAttachment} field. */
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npFragmentShadingRateAttachment(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code shadingRateAttachmentTexelSize} field. */
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D value) { nshadingRateAttachmentTexelSize(address(), value); return this; }
    /** Passes the {@code shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkFragmentShadingRateAttachmentInfoKHR set(
        int sType,
        long pNext,
        VkAttachmentReference2 pFragmentShadingRateAttachment,
        VkExtent2D shadingRateAttachmentTexelSize
    ) {
        sType(sType);
        pNext(pNext);
        pFragmentShadingRateAttachment(pFragmentShadingRateAttachment);
        shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFragmentShadingRateAttachmentInfoKHR set(VkFragmentShadingRateAttachmentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFragmentShadingRateAttachmentInfoKHR malloc() {
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFragmentShadingRateAttachmentInfoKHR calloc() {
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFragmentShadingRateAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance for the specified memory address. */
    public static VkFragmentShadingRateAttachmentInfoKHR create(long address) {
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFragmentShadingRateAttachmentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFragmentShadingRateAttachmentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFragmentShadingRateAttachmentInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFragmentShadingRateAttachmentInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFragmentShadingRateAttachmentInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFragmentShadingRateAttachmentInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkFragmentShadingRateAttachmentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFragmentShadingRateAttachmentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pFragmentShadingRateAttachment}. */
    public static VkAttachmentReference2 npFragmentShadingRateAttachment(long struct) { return VkAttachmentReference2.create(memGetAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PFRAGMENTSHADINGRATEATTACHMENT)); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize}. */
    public static VkExtent2D nshadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFragmentShadingRateAttachmentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pFragmentShadingRateAttachment(VkAttachmentReference2) pFragmentShadingRateAttachment}. */
    public static void npFragmentShadingRateAttachment(long struct, VkAttachmentReference2 value) { memPutAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PFRAGMENTSHADINGRATEATTACHMENT, value.address()); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize(VkExtent2D) shadingRateAttachmentTexelSize}. */
    public static void nshadingRateAttachmentTexelSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE, VkExtent2D.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PFRAGMENTSHADINGRATEATTACHMENT));
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

    /** An array of {@link VkFragmentShadingRateAttachmentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFragmentShadingRateAttachmentInfoKHR, Buffer> implements NativeResource {

        private static final VkFragmentShadingRateAttachmentInfoKHR ELEMENT_FACTORY = VkFragmentShadingRateAttachmentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFragmentShadingRateAttachmentInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFragmentShadingRateAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFragmentShadingRateAttachmentInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFragmentShadingRateAttachmentInfoKHR.npNext(address()); }
        /** Returns a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pFragmentShadingRateAttachment} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2 pFragmentShadingRateAttachment() { return VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code shadingRateAttachmentTexelSize} field. */
        public VkExtent2D shadingRateAttachmentTexelSize() { return VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFragmentShadingRateAttachmentInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFragmentShadingRateAttachmentInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pFragmentShadingRateAttachment} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer pFragmentShadingRateAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code shadingRateAttachmentTexelSize} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(VkExtent2D value) { VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address(), value); return this; }
        /** Passes the {@code shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    }

}