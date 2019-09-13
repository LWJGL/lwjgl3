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
 * Structure specifying parameters of images that will be used with a framebuffer.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRImagelessFramebuffer#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR}</li>
 * <li>If {@code attachmentImageInfoCount} is not 0, {@code pAttachmentImageInfos} <b>must</b> be a valid pointer to an array of {@code attachmentImageInfoCount} valid {@link VkFramebufferAttachmentImageInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFramebufferAttachmentImageInfoKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code attachmentImageInfoCount} &ndash; the number of attachments being described.</li>
 * <li>{@code pAttachmentImageInfos} &ndash; a pointer to an array of {@link VkFramebufferAttachmentImageInfoKHR} instances, each of which describes a number of parameters of the corresponding attachment in a render pass instance.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentsCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentImageInfoCount;
 *     {@link VkFramebufferAttachmentImageInfoKHR VkFramebufferAttachmentImageInfoKHR} const * pAttachmentImageInfos;
 * }</code></pre>
 */
public class VkFramebufferAttachmentsCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTIMAGEINFOCOUNT,
        PATTACHMENTIMAGEINFOS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTIMAGEINFOCOUNT = layout.offsetof(2);
        PATTACHMENTIMAGEINFOS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkFramebufferAttachmentsCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentsCreateInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code attachmentImageInfoCount} field. */
    @NativeType("uint32_t")
    public int attachmentImageInfoCount() { return nattachmentImageInfoCount(address()); }
    /** Returns a {@link VkFramebufferAttachmentImageInfoKHR.Buffer} view of the struct array pointed to by the {@code pAttachmentImageInfos} field. */
    @Nullable
    @NativeType("VkFramebufferAttachmentImageInfoKHR const *")
    public VkFramebufferAttachmentImageInfoKHR.Buffer pAttachmentImageInfos() { return npAttachmentImageInfos(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFramebufferAttachmentsCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFramebufferAttachmentsCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfoKHR.Buffer} to the {@code pAttachmentImageInfos} field. */
    public VkFramebufferAttachmentsCreateInfoKHR pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfoKHR const *") VkFramebufferAttachmentImageInfoKHR.Buffer value) { npAttachmentImageInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferAttachmentsCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable VkFramebufferAttachmentImageInfoKHR.Buffer pAttachmentImageInfos
    ) {
        sType(sType);
        pNext(pNext);
        pAttachmentImageInfos(pAttachmentImageInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferAttachmentsCreateInfoKHR set(VkFramebufferAttachmentsCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfoKHR malloc() {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfoKHR calloc() {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentsCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance for the specified memory address. */
    public static VkFramebufferAttachmentsCreateInfoKHR create(long address) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentsCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFramebufferAttachmentsCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFramebufferAttachmentsCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentsCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferAttachmentsCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #attachmentImageInfoCount}. */
    public static int nattachmentImageInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentsCreateInfoKHR.ATTACHMENTIMAGEINFOCOUNT); }
    /** Unsafe version of {@link #pAttachmentImageInfos}. */
    @Nullable public static VkFramebufferAttachmentImageInfoKHR.Buffer npAttachmentImageInfos(long struct) { return VkFramebufferAttachmentImageInfoKHR.createSafe(memGetAddress(struct + VkFramebufferAttachmentsCreateInfoKHR.PATTACHMENTIMAGEINFOS), nattachmentImageInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentsCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferAttachmentsCreateInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentImageInfoCount} field of the specified {@code struct}. */
    public static void nattachmentImageInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentsCreateInfoKHR.ATTACHMENTIMAGEINFOCOUNT, value); }
    /** Unsafe version of {@link #pAttachmentImageInfos(VkFramebufferAttachmentImageInfoKHR.Buffer) pAttachmentImageInfos}. */
    public static void npAttachmentImageInfos(long struct, @Nullable VkFramebufferAttachmentImageInfoKHR.Buffer value) { memPutAddress(struct + VkFramebufferAttachmentsCreateInfoKHR.PATTACHMENTIMAGEINFOS, memAddressSafe(value)); nattachmentImageInfoCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int attachmentImageInfoCount = nattachmentImageInfoCount(struct);
        if (attachmentImageInfoCount != 0) {
            long pAttachmentImageInfos = memGetAddress(struct + VkFramebufferAttachmentsCreateInfoKHR.PATTACHMENTIMAGEINFOS);
            check(pAttachmentImageInfos);
            VkFramebufferAttachmentImageInfoKHR.validate(pAttachmentImageInfos, attachmentImageInfoCount);
        }
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

    /** An array of {@link VkFramebufferAttachmentsCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferAttachmentsCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkFramebufferAttachmentsCreateInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentsCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentsCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentsCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferAttachmentsCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferAttachmentsCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code attachmentImageInfoCount} field. */
        @NativeType("uint32_t")
        public int attachmentImageInfoCount() { return VkFramebufferAttachmentsCreateInfoKHR.nattachmentImageInfoCount(address()); }
        /** Returns a {@link VkFramebufferAttachmentImageInfoKHR.Buffer} view of the struct array pointed to by the {@code pAttachmentImageInfos} field. */
        @Nullable
        @NativeType("VkFramebufferAttachmentImageInfoKHR const *")
        public VkFramebufferAttachmentImageInfoKHR.Buffer pAttachmentImageInfos() { return VkFramebufferAttachmentsCreateInfoKHR.npAttachmentImageInfos(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentsCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfoKHR.Buffer} to the {@code pAttachmentImageInfos} field. */
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfoKHR const *") VkFramebufferAttachmentImageInfoKHR.Buffer value) { VkFramebufferAttachmentsCreateInfoKHR.npAttachmentImageInfos(address(), value); return this; }

    }

}