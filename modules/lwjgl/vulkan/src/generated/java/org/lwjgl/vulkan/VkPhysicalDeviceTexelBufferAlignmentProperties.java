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
 * Structure describing the texel buffer alignment requirements supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTexelBufferAlignmentProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If the single texel alignment property is {@link VK10#VK_FALSE FALSE}, then the buffer view’s offset <b>must</b> be aligned to the corresponding byte alignment value. If the single texel alignment property is {@link VK10#VK_TRUE TRUE}, then the buffer view’s offset <b>must</b> be aligned to the lesser of the corresponding byte alignment value or the size of a single texel, based on {@link VkBufferViewCreateInfo}{@code ::format}. If the size of a single texel is a multiple of three bytes, then the size of a single component of the format is used instead.</p>
 * 
 * <p>These limits <b>must</b> not advertise a larger alignment than the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-required">required</a> maximum minimum value of {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}, for any format that supports use as a texel buffer.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTexelBufferAlignmentProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #storageTexelBufferOffsetAlignmentBytes};
 *     VkBool32 {@link #storageTexelBufferOffsetSingleTexelAlignment};
 *     VkDeviceSize {@link #uniformTexelBufferOffsetAlignmentBytes};
 *     VkBool32 {@link #uniformTexelBufferOffsetSingleTexelAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceTexelBufferAlignmentProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGETEXELBUFFEROFFSETALIGNMENTBYTES,
        STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT,
        UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES,
        UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGETEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(2);
        STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(3);
        UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(4);
        UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTexelBufferAlignmentProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a byte alignment that is sufficient for a storage texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long storageTexelBufferOffsetAlignmentBytes() { return nstorageTexelBufferOffsetAlignmentBytes(address()); }
    /** indicates whether single texel alignment is sufficient for a storage texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkBool32")
    public boolean storageTexelBufferOffsetSingleTexelAlignment() { return nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
    /** a byte alignment that is sufficient for a uniform texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long uniformTexelBufferOffsetAlignmentBytes() { return nuniformTexelBufferOffsetAlignmentBytes(address()); }
    /** indicates whether single texel alignment is sufficient for a uniform texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkBool32")
    public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTexelBufferAlignmentProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTexelBufferAlignmentProperties set(VkPhysicalDeviceTexelBufferAlignmentProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties malloc() {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties calloc() {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties create(long address) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTexelBufferAlignmentProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTexelBufferAlignmentProperties.PNEXT); }
    /** Unsafe version of {@link #storageTexelBufferOffsetAlignmentBytes}. */
    public static long nstorageTexelBufferOffsetAlignmentBytes(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.STORAGETEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #storageTexelBufferOffsetSingleTexelAlignment}. */
    public static int nstorageTexelBufferOffsetSingleTexelAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetAlignmentBytes}. */
    public static long nuniformTexelBufferOffsetAlignmentBytes(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetSingleTexelAlignment}. */
    public static int nuniformTexelBufferOffsetSingleTexelAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTexelBufferAlignmentProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTexelBufferAlignmentProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTexelBufferAlignmentProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTexelBufferAlignmentProperties ELEMENT_FACTORY = VkPhysicalDeviceTexelBufferAlignmentProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTexelBufferAlignmentProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTexelBufferAlignmentProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTexelBufferAlignmentProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTexelBufferAlignmentProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#storageTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.nstorageTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#storageTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#uniformTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.nuniformTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#uniformTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#sType} field. */
        public VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES} value to the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#sType} field. */
        public VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceTexelBufferAlignmentProperties#pNext} field. */
        public VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.npNext(address(), value); return this; }

    }

}