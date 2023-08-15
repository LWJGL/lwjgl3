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
 * Structure specifying descriptor buffer address info.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code address} <b>must</b> not be zero</li>
 * <li>If {@code address} is zero, {@code range} <b>must</b> be {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}</li>
 * <li>If {@code address} is not zero, {@code range} <b>must</b> not be {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}</li>
 * <li>If {@code address} is not zero, {@code address} <b>must</b> be a valid device address at an offset within a {@code VkBuffer}</li>
 * <li>{@code range} <b>must</b> be less than or equal to the size of the buffer containing {@code address} minus the offset of {@code address} from the base address of the buffer</li>
 * <li>{@code range} <b>must</b> not be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * </ul>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, {@code address} <b>can</b> be zero. Loads from a null descriptor return zero values and stores and atomics to a null descriptor are discarded.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorDataEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorAddressInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceAddress {@link #address$ address};
 *     VkDeviceSize {@link #range};
 *     VkFormat {@link #format};
 * }</code></pre>
 */
public class VkDescriptorAddressInfoEXT extends Struct<VkDescriptorAddressInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESS,
        RANGE,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESS = layout.offsetof(2);
        RANGE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
    }

    protected VkDescriptorAddressInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorAddressInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorAddressInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorAddressInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorAddressInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** either 0 or a device address at an offset in a buffer, where the base address can be queried from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}. */
    @NativeType("VkDeviceAddress")
    public long address$() { return naddress$(address()); }
    /** the size in bytes of the buffer or buffer view used by the descriptor. */
    @NativeType("VkDeviceSize")
    public long range() { return nrange(address()); }
    /** the format of the data elements in the buffer view and is ignored for buffers. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorAddressInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT} value to the {@link #sType} field. */
    public VkDescriptorAddressInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorAddressInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #address$} field. */
    public VkDescriptorAddressInfoEXT address$(@NativeType("VkDeviceAddress") long value) { naddress$(address(), value); return this; }
    /** Sets the specified value to the {@link #range} field. */
    public VkDescriptorAddressInfoEXT range(@NativeType("VkDeviceSize") long value) { nrange(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkDescriptorAddressInfoEXT format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorAddressInfoEXT set(
        int sType,
        long pNext,
        long address$,
        long range,
        int format
    ) {
        sType(sType);
        pNext(pNext);
        address$(address$);
        range(range);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorAddressInfoEXT set(VkDescriptorAddressInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorAddressInfoEXT malloc() {
        return new VkDescriptorAddressInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorAddressInfoEXT calloc() {
        return new VkDescriptorAddressInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorAddressInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance for the specified memory address. */
    public static VkDescriptorAddressInfoEXT create(long address) {
        return new VkDescriptorAddressInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorAddressInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorAddressInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorAddressInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorAddressInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAddressInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAddressInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorAddressInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorAddressInfoEXT.PNEXT); }
    /** Unsafe version of {@link #address$}. */
    public static long naddress$(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorAddressInfoEXT.ADDRESS); }
    /** Unsafe version of {@link #range}. */
    public static long nrange(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorAddressInfoEXT.RANGE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorAddressInfoEXT.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorAddressInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorAddressInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #address$(long) address$}. */
    public static void naddress$(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorAddressInfoEXT.ADDRESS, value); }
    /** Unsafe version of {@link #range(long) range}. */
    public static void nrange(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorAddressInfoEXT.RANGE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorAddressInfoEXT.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorAddressInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorAddressInfoEXT, Buffer> implements NativeResource {

        private static final VkDescriptorAddressInfoEXT ELEMENT_FACTORY = VkDescriptorAddressInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorAddressInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorAddressInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorAddressInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorAddressInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDescriptorAddressInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorAddressInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDescriptorAddressInfoEXT#address$} field. */
        @NativeType("VkDeviceAddress")
        public long address$() { return VkDescriptorAddressInfoEXT.naddress$(address()); }
        /** @return the value of the {@link VkDescriptorAddressInfoEXT#range} field. */
        @NativeType("VkDeviceSize")
        public long range() { return VkDescriptorAddressInfoEXT.nrange(address()); }
        /** @return the value of the {@link VkDescriptorAddressInfoEXT#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkDescriptorAddressInfoEXT.nformat(address()); }

        /** Sets the specified value to the {@link VkDescriptorAddressInfoEXT#sType} field. */
        public VkDescriptorAddressInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorAddressInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT} value to the {@link VkDescriptorAddressInfoEXT#sType} field. */
        public VkDescriptorAddressInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT); }
        /** Sets the specified value to the {@link VkDescriptorAddressInfoEXT#pNext} field. */
        public VkDescriptorAddressInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorAddressInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorAddressInfoEXT#address$} field. */
        public VkDescriptorAddressInfoEXT.Buffer address$(@NativeType("VkDeviceAddress") long value) { VkDescriptorAddressInfoEXT.naddress$(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorAddressInfoEXT#range} field. */
        public VkDescriptorAddressInfoEXT.Buffer range(@NativeType("VkDeviceSize") long value) { VkDescriptorAddressInfoEXT.nrange(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorAddressInfoEXT#format} field. */
        public VkDescriptorAddressInfoEXT.Buffer format(@NativeType("VkFormat") int value) { VkDescriptorAddressInfoEXT.nformat(address(), value); return this; }

    }

}