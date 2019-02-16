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
 * Structure specifying the buffer to query an address for.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code buffer} is non-sparse and was not created with the {@link EXTBufferDeviceAddress#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT} flag, then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code buffer} <b>must</b> have been created with {@link EXTBufferDeviceAddress#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBufferDeviceAddress#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTBufferDeviceAddress#vkGetBufferDeviceAddressEXT GetBufferDeviceAddressEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code buffer} &ndash; specifies the buffer whose address is being queried.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferDeviceAddressInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 * }</code></pre>
 */
public class VkBufferDeviceAddressInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBufferDeviceAddressInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferDeviceAddressInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferDeviceAddressInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferDeviceAddressInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkBufferDeviceAddressInfoEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferDeviceAddressInfoEXT set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferDeviceAddressInfoEXT set(VkBufferDeviceAddressInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoEXT malloc() {
        return wrap(VkBufferDeviceAddressInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoEXT calloc() {
        return wrap(VkBufferDeviceAddressInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkBufferDeviceAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferDeviceAddressInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance for the specified memory address. */
    public static VkBufferDeviceAddressInfoEXT create(long address) {
        return wrap(VkBufferDeviceAddressInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferDeviceAddressInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferDeviceAddressInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferDeviceAddressInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferDeviceAddressInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferDeviceAddressInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferDeviceAddressInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkBufferDeviceAddressInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkBufferDeviceAddressInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferDeviceAddressInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferDeviceAddressInfoEXT.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkBufferDeviceAddressInfoEXT.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferDeviceAddressInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferDeviceAddressInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferDeviceAddressInfoEXT.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkBufferDeviceAddressInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkBufferDeviceAddressInfoEXT, Buffer> implements NativeResource {

        private static final VkBufferDeviceAddressInfoEXT ELEMENT_FACTORY = VkBufferDeviceAddressInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkBufferDeviceAddressInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferDeviceAddressInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferDeviceAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferDeviceAddressInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferDeviceAddressInfoEXT.npNext(address()); }
        /** Returns the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferDeviceAddressInfoEXT.nbuffer(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferDeviceAddressInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferDeviceAddressInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferDeviceAddressInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkBufferDeviceAddressInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkBufferDeviceAddressInfoEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferDeviceAddressInfoEXT.nbuffer(address(), value); return this; }

    }

}