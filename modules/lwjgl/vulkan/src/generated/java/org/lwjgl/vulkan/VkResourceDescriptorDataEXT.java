/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * union VkResourceDescriptorDataEXT {
 *     {@link VkImageDescriptorInfoEXT VkImageDescriptorInfoEXT} const * pImage;
 *     {@link VkTexelBufferDescriptorInfoEXT VkTexelBufferDescriptorInfoEXT} const * pTexelBuffer;
 *     {@link VkDeviceAddressRangeEXT VkDeviceAddressRangeEXT} const * pAddressRange;
 *     {@link VkTensorViewCreateInfoARM VkTensorViewCreateInfoARM} const * pTensorARM;
 * }</code></pre>
 */
public class VkResourceDescriptorDataEXT extends Struct<VkResourceDescriptorDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIMAGE,
        PTEXELBUFFER,
        PADDRESSRANGE,
        PTENSORARM;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIMAGE = layout.offsetof(0);
        PTEXELBUFFER = layout.offsetof(1);
        PADDRESSRANGE = layout.offsetof(2);
        PTENSORARM = layout.offsetof(3);
    }

    protected VkResourceDescriptorDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkResourceDescriptorDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkResourceDescriptorDataEXT(address, container);
    }

    /**
     * Creates a {@code VkResourceDescriptorDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResourceDescriptorDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkImageDescriptorInfoEXT} view of the struct pointed to by the {@code pImage} field. */
    @NativeType("VkImageDescriptorInfoEXT const *")
    public @Nullable VkImageDescriptorInfoEXT pImage() { return npImage(address()); }
    /** @return a {@link VkTexelBufferDescriptorInfoEXT} view of the struct pointed to by the {@code pTexelBuffer} field. */
    @NativeType("VkTexelBufferDescriptorInfoEXT const *")
    public @Nullable VkTexelBufferDescriptorInfoEXT pTexelBuffer() { return npTexelBuffer(address()); }
    /** @return a {@link VkDeviceAddressRangeEXT} view of the struct pointed to by the {@code pAddressRange} field. */
    @NativeType("VkDeviceAddressRangeEXT const *")
    public @Nullable VkDeviceAddressRangeEXT pAddressRange() { return npAddressRange(address()); }
    /** @return a {@link VkTensorViewCreateInfoARM} view of the struct pointed to by the {@code pTensorARM} field. */
    @NativeType("VkTensorViewCreateInfoARM const *")
    public @Nullable VkTensorViewCreateInfoARM pTensorARM() { return npTensorARM(address()); }

    /** Sets the address of the specified {@link VkImageDescriptorInfoEXT} to the {@code pImage} field. */
    public VkResourceDescriptorDataEXT pImage(@Nullable @NativeType("VkImageDescriptorInfoEXT const *") VkImageDescriptorInfoEXT value) { npImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkTexelBufferDescriptorInfoEXT} to the {@code pTexelBuffer} field. */
    public VkResourceDescriptorDataEXT pTexelBuffer(@Nullable @NativeType("VkTexelBufferDescriptorInfoEXT const *") VkTexelBufferDescriptorInfoEXT value) { npTexelBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceAddressRangeEXT} to the {@code pAddressRange} field. */
    public VkResourceDescriptorDataEXT pAddressRange(@Nullable @NativeType("VkDeviceAddressRangeEXT const *") VkDeviceAddressRangeEXT value) { npAddressRange(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorViewCreateInfoARM} to the {@code pTensorARM} field. */
    public VkResourceDescriptorDataEXT pTensorARM(@Nullable @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM value) { npTensorARM(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkResourceDescriptorDataEXT set(VkResourceDescriptorDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResourceDescriptorDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResourceDescriptorDataEXT malloc() {
        return new VkResourceDescriptorDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkResourceDescriptorDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResourceDescriptorDataEXT calloc() {
        return new VkResourceDescriptorDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkResourceDescriptorDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkResourceDescriptorDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResourceDescriptorDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkResourceDescriptorDataEXT} instance for the specified memory address. */
    public static VkResourceDescriptorDataEXT create(long address) {
        return new VkResourceDescriptorDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkResourceDescriptorDataEXT createSafe(long address) {
        return address == NULL ? null : new VkResourceDescriptorDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkResourceDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkResourceDescriptorDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkResourceDescriptorDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkResourceDescriptorDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResourceDescriptorDataEXT malloc(MemoryStack stack) {
        return new VkResourceDescriptorDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkResourceDescriptorDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResourceDescriptorDataEXT calloc(MemoryStack stack) {
        return new VkResourceDescriptorDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkResourceDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pImage}. */
    public static @Nullable VkImageDescriptorInfoEXT npImage(long struct) { return VkImageDescriptorInfoEXT.createSafe(memGetAddress(struct + VkResourceDescriptorDataEXT.PIMAGE)); }
    /** Unsafe version of {@link #pTexelBuffer}. */
    public static @Nullable VkTexelBufferDescriptorInfoEXT npTexelBuffer(long struct) { return VkTexelBufferDescriptorInfoEXT.createSafe(memGetAddress(struct + VkResourceDescriptorDataEXT.PTEXELBUFFER)); }
    /** Unsafe version of {@link #pAddressRange}. */
    public static @Nullable VkDeviceAddressRangeEXT npAddressRange(long struct) { return VkDeviceAddressRangeEXT.createSafe(memGetAddress(struct + VkResourceDescriptorDataEXT.PADDRESSRANGE)); }
    /** Unsafe version of {@link #pTensorARM}. */
    public static @Nullable VkTensorViewCreateInfoARM npTensorARM(long struct) { return VkTensorViewCreateInfoARM.createSafe(memGetAddress(struct + VkResourceDescriptorDataEXT.PTENSORARM)); }

    /** Unsafe version of {@link #pImage(VkImageDescriptorInfoEXT) pImage}. */
    public static void npImage(long struct, @Nullable VkImageDescriptorInfoEXT value) { memPutAddress(struct + VkResourceDescriptorDataEXT.PIMAGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTexelBuffer(VkTexelBufferDescriptorInfoEXT) pTexelBuffer}. */
    public static void npTexelBuffer(long struct, @Nullable VkTexelBufferDescriptorInfoEXT value) { memPutAddress(struct + VkResourceDescriptorDataEXT.PTEXELBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pAddressRange(VkDeviceAddressRangeEXT) pAddressRange}. */
    public static void npAddressRange(long struct, @Nullable VkDeviceAddressRangeEXT value) { memPutAddress(struct + VkResourceDescriptorDataEXT.PADDRESSRANGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTensorARM(VkTensorViewCreateInfoARM) pTensorARM}. */
    public static void npTensorARM(long struct, @Nullable VkTensorViewCreateInfoARM value) { memPutAddress(struct + VkResourceDescriptorDataEXT.PTENSORARM, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkResourceDescriptorDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkResourceDescriptorDataEXT, Buffer> implements NativeResource {

        private static final VkResourceDescriptorDataEXT ELEMENT_FACTORY = VkResourceDescriptorDataEXT.create(-1L);

        /**
         * Creates a new {@code VkResourceDescriptorDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResourceDescriptorDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkResourceDescriptorDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkImageDescriptorInfoEXT} view of the struct pointed to by the {@code pImage} field. */
        @NativeType("VkImageDescriptorInfoEXT const *")
        public @Nullable VkImageDescriptorInfoEXT pImage() { return VkResourceDescriptorDataEXT.npImage(address()); }
        /** @return a {@link VkTexelBufferDescriptorInfoEXT} view of the struct pointed to by the {@code pTexelBuffer} field. */
        @NativeType("VkTexelBufferDescriptorInfoEXT const *")
        public @Nullable VkTexelBufferDescriptorInfoEXT pTexelBuffer() { return VkResourceDescriptorDataEXT.npTexelBuffer(address()); }
        /** @return a {@link VkDeviceAddressRangeEXT} view of the struct pointed to by the {@code pAddressRange} field. */
        @NativeType("VkDeviceAddressRangeEXT const *")
        public @Nullable VkDeviceAddressRangeEXT pAddressRange() { return VkResourceDescriptorDataEXT.npAddressRange(address()); }
        /** @return a {@link VkTensorViewCreateInfoARM} view of the struct pointed to by the {@code pTensorARM} field. */
        @NativeType("VkTensorViewCreateInfoARM const *")
        public @Nullable VkTensorViewCreateInfoARM pTensorARM() { return VkResourceDescriptorDataEXT.npTensorARM(address()); }

        /** Sets the address of the specified {@link VkImageDescriptorInfoEXT} to the {@code pImage} field. */
        public VkResourceDescriptorDataEXT.Buffer pImage(@Nullable @NativeType("VkImageDescriptorInfoEXT const *") VkImageDescriptorInfoEXT value) { VkResourceDescriptorDataEXT.npImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkTexelBufferDescriptorInfoEXT} to the {@code pTexelBuffer} field. */
        public VkResourceDescriptorDataEXT.Buffer pTexelBuffer(@Nullable @NativeType("VkTexelBufferDescriptorInfoEXT const *") VkTexelBufferDescriptorInfoEXT value) { VkResourceDescriptorDataEXT.npTexelBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceAddressRangeEXT} to the {@code pAddressRange} field. */
        public VkResourceDescriptorDataEXT.Buffer pAddressRange(@Nullable @NativeType("VkDeviceAddressRangeEXT const *") VkDeviceAddressRangeEXT value) { VkResourceDescriptorDataEXT.npAddressRange(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorViewCreateInfoARM} to the {@code pTensorARM} field. */
        public VkResourceDescriptorDataEXT.Buffer pTensorARM(@Nullable @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM value) { VkResourceDescriptorDataEXT.npTensorARM(address(), value); return this; }

    }

}