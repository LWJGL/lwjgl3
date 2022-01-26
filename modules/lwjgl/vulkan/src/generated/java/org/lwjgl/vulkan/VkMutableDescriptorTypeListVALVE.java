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
 * Structure describing descriptor types that a given descriptor may mutate to.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code descriptorTypeCount} <b>must</b> not be 0 if the corresponding binding is of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid, unique {@code VkDescriptorType} values if the given binding is of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} type</li>
 * <li>{@code descriptorTypeCount} <b>must</b> be 0 if the corresponding binding is not of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code descriptorTypeCount} is not 0, {@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid {@code VkDescriptorType} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMutableDescriptorTypeCreateInfoVALVE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeListVALVE {
 *     uint32_t {@link #descriptorTypeCount};
 *     VkDescriptorType const * {@link #pDescriptorTypes};
 * }</code></pre>
 */
public class VkMutableDescriptorTypeListVALVE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DESCRIPTORTYPECOUNT,
        PDESCRIPTORTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DESCRIPTORTYPECOUNT = layout.offsetof(0);
        PDESCRIPTORTYPES = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkMutableDescriptorTypeListVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeListVALVE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of elements in {@code pDescriptorTypes}. */
    @NativeType("uint32_t")
    public int descriptorTypeCount() { return ndescriptorTypeCount(address()); }
    /** {@code NULL} or a pointer to an array of {@code descriptorTypeCount} {@code VkDescriptorType} values defining which descriptor types a given binding may mutate to. */
    @Nullable
    @NativeType("VkDescriptorType const *")
    public IntBuffer pDescriptorTypes() { return npDescriptorTypes(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDescriptorTypes} field. */
    public VkMutableDescriptorTypeListVALVE pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { npDescriptorTypes(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMutableDescriptorTypeListVALVE set(VkMutableDescriptorTypeListVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListVALVE malloc() {
        return wrap(VkMutableDescriptorTypeListVALVE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListVALVE calloc() {
        return wrap(VkMutableDescriptorTypeListVALVE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeListVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMutableDescriptorTypeListVALVE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance for the specified memory address. */
    public static VkMutableDescriptorTypeListVALVE create(long address) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListVALVE createSafe(long address) {
        return address == NULL ? null : wrap(VkMutableDescriptorTypeListVALVE.class, address);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeListVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListVALVE malloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListVALVE calloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #descriptorTypeCount}. */
    public static int ndescriptorTypeCount(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeListVALVE.DESCRIPTORTYPECOUNT); }
    /** Unsafe version of {@link #pDescriptorTypes() pDescriptorTypes}. */
    @Nullable public static IntBuffer npDescriptorTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkMutableDescriptorTypeListVALVE.PDESCRIPTORTYPES), ndescriptorTypeCount(struct)); }

    /** Sets the specified value to the {@code descriptorTypeCount} field of the specified {@code struct}. */
    public static void ndescriptorTypeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeListVALVE.DESCRIPTORTYPECOUNT, value); }
    /** Unsafe version of {@link #pDescriptorTypes(IntBuffer) pDescriptorTypes}. */
    public static void npDescriptorTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkMutableDescriptorTypeListVALVE.PDESCRIPTORTYPES, memAddressSafe(value)); ndescriptorTypeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndescriptorTypeCount(struct) != 0) {
            check(memGetAddress(struct + VkMutableDescriptorTypeListVALVE.PDESCRIPTORTYPES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeListVALVE} structs. */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeListVALVE, Buffer> implements NativeResource {

        private static final VkMutableDescriptorTypeListVALVE ELEMENT_FACTORY = VkMutableDescriptorTypeListVALVE.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeListVALVE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeListVALVE#SIZEOF}, and its mark will be undefined.
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
        protected VkMutableDescriptorTypeListVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMutableDescriptorTypeListVALVE#descriptorTypeCount} field. */
        @NativeType("uint32_t")
        public int descriptorTypeCount() { return VkMutableDescriptorTypeListVALVE.ndescriptorTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkMutableDescriptorTypeListVALVE#pDescriptorTypes} field. */
        @Nullable
        @NativeType("VkDescriptorType const *")
        public IntBuffer pDescriptorTypes() { return VkMutableDescriptorTypeListVALVE.npDescriptorTypes(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@link VkMutableDescriptorTypeListVALVE#pDescriptorTypes} field. */
        public VkMutableDescriptorTypeListVALVE.Buffer pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { VkMutableDescriptorTypeListVALVE.npDescriptorTypes(address(), value); return this; }

    }

}