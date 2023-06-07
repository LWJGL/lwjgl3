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
 * Structure specifying decompression parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code srcAddress} <b>must</b> be 4 byte aligned</li>
 * <li>The memory in range {@code srcAddress} and {@code srcAddress} + {@code compressedSize} <b>must</b> be valid and bound to a {@code VkDeviceMemory} object</li>
 * <li>The {@code dstAddress} <b>must</b> be 4 byte aligned</li>
 * <li>The memory in range {@code dstAddress} and {@code dstAddress} + {@code decompressedSize} <b>must</b> be valid and bound to a {@code VkDeviceMemory} object</li>
 * <li>The {@code decompressedSize} <b>must</b> be large enough to hold the decompressed data based on the {@code decompressionMethod}</li>
 * <li>The {@code decompressionMethod} <b>must</b> have a single bit set</li>
 * <li>The {@code srcAddress} to {@code srcAddress} + {@code compressedSize} region <b>must</b> not overlap with the {@code dstAddress} and {@code dstAddress} + {@code decompressedSize} region</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code decompressionMethod} <b>must</b> be a valid combination of {@code VkMemoryDecompressionMethodFlagBitsNV} values</li>
 * <li>{@code decompressionMethod} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVMemoryDecompression#vkCmdDecompressMemoryNV CmdDecompressMemoryNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDecompressMemoryRegionNV {
 *     VkDeviceAddress {@link #srcAddress};
 *     VkDeviceAddress {@link #dstAddress};
 *     VkDeviceSize {@link #compressedSize};
 *     VkDeviceSize {@link #decompressedSize};
 *     VkMemoryDecompressionMethodFlagsNV {@link #decompressionMethod};
 * }</code></pre>
 */
public class VkDecompressMemoryRegionNV extends Struct<VkDecompressMemoryRegionNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCADDRESS,
        DSTADDRESS,
        COMPRESSEDSIZE,
        DECOMPRESSEDSIZE,
        DECOMPRESSIONMETHOD;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        COMPRESSEDSIZE = layout.offsetof(2);
        DECOMPRESSEDSIZE = layout.offsetof(3);
        DECOMPRESSIONMETHOD = layout.offsetof(4);
    }

    protected VkDecompressMemoryRegionNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDecompressMemoryRegionNV create(long address, @Nullable ByteBuffer container) {
        return new VkDecompressMemoryRegionNV(address, container);
    }

    /**
     * Creates a {@code VkDecompressMemoryRegionNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDecompressMemoryRegionNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the address where compressed data is stored. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
    /** the destination address where decompressed data will be written. */
    @NativeType("VkDeviceAddress")
    public long dstAddress() { return ndstAddress(address()); }
    /** the size of compressed data in bytes. */
    @NativeType("VkDeviceSize")
    public long compressedSize() { return ncompressedSize(address()); }
    /** the size of decompressed data in bytes. */
    @NativeType("VkDeviceSize")
    public long decompressedSize() { return ndecompressedSize(address()); }
    /** a bitmask of {@code VkMemoryDecompressionMethodFlagBitsNV} with a single bit set specifying the method used to decompress data. */
    @NativeType("VkMemoryDecompressionMethodFlagsNV")
    public long decompressionMethod() { return ndecompressionMethod(address()); }

    /** Sets the specified value to the {@link #srcAddress} field. */
    public VkDecompressMemoryRegionNV srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAddress} field. */
    public VkDecompressMemoryRegionNV dstAddress(@NativeType("VkDeviceAddress") long value) { ndstAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #compressedSize} field. */
    public VkDecompressMemoryRegionNV compressedSize(@NativeType("VkDeviceSize") long value) { ncompressedSize(address(), value); return this; }
    /** Sets the specified value to the {@link #decompressedSize} field. */
    public VkDecompressMemoryRegionNV decompressedSize(@NativeType("VkDeviceSize") long value) { ndecompressedSize(address(), value); return this; }
    /** Sets the specified value to the {@link #decompressionMethod} field. */
    public VkDecompressMemoryRegionNV decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsNV") long value) { ndecompressionMethod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDecompressMemoryRegionNV set(
        long srcAddress,
        long dstAddress,
        long compressedSize,
        long decompressedSize,
        long decompressionMethod
    ) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        compressedSize(compressedSize);
        decompressedSize(decompressedSize);
        decompressionMethod(decompressionMethod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDecompressMemoryRegionNV set(VkDecompressMemoryRegionNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDecompressMemoryRegionNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryRegionNV malloc() {
        return new VkDecompressMemoryRegionNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryRegionNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryRegionNV calloc() {
        return new VkDecompressMemoryRegionNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryRegionNV} instance allocated with {@link BufferUtils}. */
    public static VkDecompressMemoryRegionNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryRegionNV(memAddress(container), container);
    }

    /** Returns a new {@code VkDecompressMemoryRegionNV} instance for the specified memory address. */
    public static VkDecompressMemoryRegionNV create(long address) {
        return new VkDecompressMemoryRegionNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDecompressMemoryRegionNV createSafe(long address) {
        return address == NULL ? null : new VkDecompressMemoryRegionNV(address, null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDecompressMemoryRegionNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDecompressMemoryRegionNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDecompressMemoryRegionNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryRegionNV malloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDecompressMemoryRegionNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryRegionNV calloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return UNSAFE.getLong(null, struct + VkDecompressMemoryRegionNV.SRCADDRESS); }
    /** Unsafe version of {@link #dstAddress}. */
    public static long ndstAddress(long struct) { return UNSAFE.getLong(null, struct + VkDecompressMemoryRegionNV.DSTADDRESS); }
    /** Unsafe version of {@link #compressedSize}. */
    public static long ncompressedSize(long struct) { return UNSAFE.getLong(null, struct + VkDecompressMemoryRegionNV.COMPRESSEDSIZE); }
    /** Unsafe version of {@link #decompressedSize}. */
    public static long ndecompressedSize(long struct) { return UNSAFE.getLong(null, struct + VkDecompressMemoryRegionNV.DECOMPRESSEDSIZE); }
    /** Unsafe version of {@link #decompressionMethod}. */
    public static long ndecompressionMethod(long struct) { return UNSAFE.getLong(null, struct + VkDecompressMemoryRegionNV.DECOMPRESSIONMETHOD); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkDecompressMemoryRegionNV.SRCADDRESS, value); }
    /** Unsafe version of {@link #dstAddress(long) dstAddress}. */
    public static void ndstAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkDecompressMemoryRegionNV.DSTADDRESS, value); }
    /** Unsafe version of {@link #compressedSize(long) compressedSize}. */
    public static void ncompressedSize(long struct, long value) { UNSAFE.putLong(null, struct + VkDecompressMemoryRegionNV.COMPRESSEDSIZE, value); }
    /** Unsafe version of {@link #decompressedSize(long) decompressedSize}. */
    public static void ndecompressedSize(long struct, long value) { UNSAFE.putLong(null, struct + VkDecompressMemoryRegionNV.DECOMPRESSEDSIZE, value); }
    /** Unsafe version of {@link #decompressionMethod(long) decompressionMethod}. */
    public static void ndecompressionMethod(long struct, long value) { UNSAFE.putLong(null, struct + VkDecompressMemoryRegionNV.DECOMPRESSIONMETHOD, value); }

    // -----------------------------------

    /** An array of {@link VkDecompressMemoryRegionNV} structs. */
    public static class Buffer extends StructBuffer<VkDecompressMemoryRegionNV, Buffer> implements NativeResource {

        private static final VkDecompressMemoryRegionNV ELEMENT_FACTORY = VkDecompressMemoryRegionNV.create(-1L);

        /**
         * Creates a new {@code VkDecompressMemoryRegionNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDecompressMemoryRegionNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDecompressMemoryRegionNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDecompressMemoryRegionNV#srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkDecompressMemoryRegionNV.nsrcAddress(address()); }
        /** @return the value of the {@link VkDecompressMemoryRegionNV#dstAddress} field. */
        @NativeType("VkDeviceAddress")
        public long dstAddress() { return VkDecompressMemoryRegionNV.ndstAddress(address()); }
        /** @return the value of the {@link VkDecompressMemoryRegionNV#compressedSize} field. */
        @NativeType("VkDeviceSize")
        public long compressedSize() { return VkDecompressMemoryRegionNV.ncompressedSize(address()); }
        /** @return the value of the {@link VkDecompressMemoryRegionNV#decompressedSize} field. */
        @NativeType("VkDeviceSize")
        public long decompressedSize() { return VkDecompressMemoryRegionNV.ndecompressedSize(address()); }
        /** @return the value of the {@link VkDecompressMemoryRegionNV#decompressionMethod} field. */
        @NativeType("VkMemoryDecompressionMethodFlagsNV")
        public long decompressionMethod() { return VkDecompressMemoryRegionNV.ndecompressionMethod(address()); }

        /** Sets the specified value to the {@link VkDecompressMemoryRegionNV#srcAddress} field. */
        public VkDecompressMemoryRegionNV.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDecompressMemoryRegionNV#dstAddress} field. */
        public VkDecompressMemoryRegionNV.Buffer dstAddress(@NativeType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.ndstAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDecompressMemoryRegionNV#compressedSize} field. */
        public VkDecompressMemoryRegionNV.Buffer compressedSize(@NativeType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.ncompressedSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkDecompressMemoryRegionNV#decompressedSize} field. */
        public VkDecompressMemoryRegionNV.Buffer decompressedSize(@NativeType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.ndecompressedSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkDecompressMemoryRegionNV#decompressionMethod} field. */
        public VkDecompressMemoryRegionNV.Buffer decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsNV") long value) { VkDecompressMemoryRegionNV.ndecompressionMethod(address(), value); return this; }

    }

}