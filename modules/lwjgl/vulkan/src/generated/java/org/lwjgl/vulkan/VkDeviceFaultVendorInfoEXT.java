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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying vendor-specific fault information.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceFaultInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceFaultVendorInfoEXT {
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     uint64_t {@link #vendorFaultCode};
 *     uint64_t {@link #vendorFaultData};
 * }</code></pre>
 */
public class VkDeviceFaultVendorInfoEXT extends Struct<VkDeviceFaultVendorInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DESCRIPTION,
        VENDORFAULTCODE,
        VENDORFAULTDATA;

    static {
        Layout layout = __struct(
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DESCRIPTION = layout.offsetof(0);
        VENDORFAULTCODE = layout.offsetof(1);
        VENDORFAULTDATA = layout.offsetof(2);
    }

    protected VkDeviceFaultVendorInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultVendorInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultVendorInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultVendorInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultVendorInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description of the fault. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description of the fault. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** the vendor-specific fault code for this fault. */
    @NativeType("uint64_t")
    public long vendorFaultCode() { return nvendorFaultCode(address()); }
    /** the vendor-specific fault data associated with this fault. */
    @NativeType("uint64_t")
    public long vendorFaultData() { return nvendorFaultData(address()); }

    /** Copies the specified encoded string to the {@link #description} field. */
    public VkDeviceFaultVendorInfoEXT description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorFaultCode} field. */
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(@NativeType("uint64_t") long value) { nvendorFaultCode(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorFaultData} field. */
    public VkDeviceFaultVendorInfoEXT vendorFaultData(@NativeType("uint64_t") long value) { nvendorFaultData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultVendorInfoEXT set(
        ByteBuffer description,
        long vendorFaultCode,
        long vendorFaultData
    ) {
        description(description);
        vendorFaultCode(vendorFaultCode);
        vendorFaultData(vendorFaultData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultVendorInfoEXT set(VkDeviceFaultVendorInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultVendorInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorInfoEXT malloc() {
        return new VkDeviceFaultVendorInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorInfoEXT calloc() {
        return new VkDeviceFaultVendorInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultVendorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoEXT} instance for the specified memory address. */
    public static VkDeviceFaultVendorInfoEXT create(long address) {
        return new VkDeviceFaultVendorInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultVendorInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultVendorInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultVendorInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultVendorInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkDeviceFaultVendorInfoEXT.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkDeviceFaultVendorInfoEXT.DESCRIPTION); }
    /** Unsafe version of {@link #vendorFaultCode}. */
    public static long nvendorFaultCode(long struct) { return UNSAFE.getLong(null, struct + VkDeviceFaultVendorInfoEXT.VENDORFAULTCODE); }
    /** Unsafe version of {@link #vendorFaultData}. */
    public static long nvendorFaultData(long struct) { return UNSAFE.getLong(null, struct + VkDeviceFaultVendorInfoEXT.VENDORFAULTDATA); }

    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_DESCRIPTION_SIZE);
        }
        memCopy(memAddress(value), struct + VkDeviceFaultVendorInfoEXT.DESCRIPTION, value.remaining());
    }
    /** Unsafe version of {@link #vendorFaultCode(long) vendorFaultCode}. */
    public static void nvendorFaultCode(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceFaultVendorInfoEXT.VENDORFAULTCODE, value); }
    /** Unsafe version of {@link #vendorFaultData(long) vendorFaultData}. */
    public static void nvendorFaultData(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceFaultVendorInfoEXT.VENDORFAULTDATA, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultVendorInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultVendorInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceFaultVendorInfoEXT ELEMENT_FACTORY = VkDeviceFaultVendorInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultVendorInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultVendorInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultVendorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link VkDeviceFaultVendorInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkDeviceFaultVendorInfoEXT.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkDeviceFaultVendorInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkDeviceFaultVendorInfoEXT.ndescriptionString(address()); }
        /** @return the value of the {@link VkDeviceFaultVendorInfoEXT#vendorFaultCode} field. */
        @NativeType("uint64_t")
        public long vendorFaultCode() { return VkDeviceFaultVendorInfoEXT.nvendorFaultCode(address()); }
        /** @return the value of the {@link VkDeviceFaultVendorInfoEXT#vendorFaultData} field. */
        @NativeType("uint64_t")
        public long vendorFaultData() { return VkDeviceFaultVendorInfoEXT.nvendorFaultData(address()); }

        /** Copies the specified encoded string to the {@link VkDeviceFaultVendorInfoEXT#description} field. */
        public VkDeviceFaultVendorInfoEXT.Buffer description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { VkDeviceFaultVendorInfoEXT.ndescription(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultVendorInfoEXT#vendorFaultCode} field. */
        public VkDeviceFaultVendorInfoEXT.Buffer vendorFaultCode(@NativeType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.nvendorFaultCode(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultVendorInfoEXT#vendorFaultData} field. */
        public VkDeviceFaultVendorInfoEXT.Buffer vendorFaultData(@NativeType("uint64_t") long value) { VkDeviceFaultVendorInfoEXT.nvendorFaultData(address(), value); return this; }

    }

}